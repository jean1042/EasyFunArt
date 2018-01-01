package com.jy.efun_splash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.util.Log.d
import android.view.View
import android.widget.Button
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.jy.sixthseminar.ApplicationController
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Response
import java.io.FileNotFoundException
import java.io.InputStream
import java.util.*

/**
 * Created by jean1 on 2017-12-30.
 */
class LoginActivity :AppCompatActivity() {

    var loginBtn: Button? = null
    //로그인 버튼
    private var callbackManager: CallbackManager? = null
    //액티비티에서 멤버변수로 callbackmanager 선언

    var loginResult: LoginResult? = null

    //서버 통신용 변수 선언
    private var data : Uri?=null
    private var networkService : NetworkService?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        FacebookSdk.sdkInitialize(this.applicationContext)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        callbackManager = CallbackManager.Factory.create()
        loginBtn= findViewById(R.id.login_btn) as Button
        loginBtn!!.setOnClickListener(View.OnClickListener {
        facebookLoginOnClick()
        }
        )


    }
    /*페이스북 로그인 연동*/
    fun facebookLoginOnClick(){
        FacebookSdk.sdkInitialize(applicationContext)
        callbackManager = CallbackManager.Factory.create()

        LoginManager.getInstance().logInWithReadPermissions(this@LoginActivity,
        Arrays.asList("profile", "email"))
        LoginManager.getInstance().registerCallback(callbackManager, object : FacebookCallback<LoginResult>{
            override fun onSuccess(result: LoginResult) {

                val request: GraphRequest
                request = GraphRequest.newMeRequest(result.getAccessToken(), object : GraphRequest.GraphJSONObjectCallback {
                    override fun onCompleted(user: JSONObject, response: GraphResponse) {
                        if (response.getError() != null) {
                         d("loginactivity", loginResult!!.accessToken.token)

                        } else {

                        }
                    }
                })


                val parameters = Bundle()
                parameters.putString("fields", "id,name,email,gender,birthday")
                request.setParameters(parameters)
                request.executeAsync()
            }

            override fun onCancel() {
                Log.v("yg", "yg4")

                d("MainActivity", "Facebook cancel")
            }

            override fun onError(error: FacebookException?) {
             d("MainActivity", "Facebook error")
            }

        })


    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        this.data=data!!.data
        callbackManager?.onActivityResult(requestCode, resultCode, data)
        var input : InputStream? = null
        try{
            input = contentResolver.openInputStream(this.data)
        }catch (e:FileNotFoundException){
            e.printStackTrace()
        } //정보 입력

        /*통신용 함수 login 호출*/
        login()

        /*화면 전환*/
        val intent = Intent(applicationContext, ResultActivity_select::class.java )
        startActivity(intent)
    }



    /*통신용 함수*/
    fun login(){
        val profile = RequestBody.create(MediaType.parse("text/plain"), profile.text!!.toString())
        val email = RequestBody.create(MediaType.parse("text / plain"), email.text!!.toString())

        //요청
        val loginResponse=networkService!!.login(LoginPost(R.id.profile.text.toString(), R.id.email.text.toString())

        //응답
       request.enqueue(object : Callback<SignResponse> {
            //응답 성공
           override fun onResponse(call: retrofit2.Call<SignResponse>?, response: Response<SignResponse>?) {
                if(response!!.isSuccessful) {
                    ApplicationController.instance!!.makeToast("로그인 완료")
                }
            }
            //응답 실패
            override fun onFailure(call: retrofit2.Call<SignResponse>?, t: Throwable?) {
                ApplicationController.instance!!.makeToast("통신 상태를 확인해주세요")

            }
        })
    }

}


/*페이스북 로그인 연동용 해시키 가져오기*/
//               try {
//            val info = packageManager.getPackageInfo("com.jy.efun_splash", PackageManager.GET_SIGNATURES)
//            for (signature in info.signatures) {
//                val md = MessageDigest.getInstance("SHA")
//                md.update(signature.toByteArray())
//                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
//            }
//        } catch (e: PackageManager.NameNotFoundException) {
//            e.printStackTrace()
//        } catch (e: NoSuchAlgorithmException) {
//            e.printStackTrace()
//        }






