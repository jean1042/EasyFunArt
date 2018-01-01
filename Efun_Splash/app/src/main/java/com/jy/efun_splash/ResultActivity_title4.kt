package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.jy.sixthseminar.ApplicationController
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by jean1 on 2017-12-30.
 */
class ResultActivity_title4 : AppCompatActivity(){

    var titleButton_1 : Button?=null
    var titleButton_2 : Button?=null
    var titleButton_3 : Button?=null
    var titleButton_4 : Button?=null
    var titleButton_5 : Button?=null
    var titleButton_6 : Button?=null
    var titleButton_7 : Button?=null
    var titleButton_8 : Button?=null
    var titleButton_9 : Button?=null
    var titleButton_10 : Button?=null
    var titleButton_11 : Button?=null
    var titleButton_12 : Button?=null


    var nextButton : Button?=null //다음 버튼
    var prevButton : Button?=null //이전 버튼



    /*서버 관련 변수*/
    private var networkService : NetworkService?=null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_title)

        networkService= ApplicationController.instance!!.networkService
        initActivity()

        /*각 버튼을 누르면 CommonData 에 정보 저장*/
        titleButton_1!!.setOnClickListener{
            CommonData.str_title ="모험"
        }
        titleButton_2!!.setOnClickListener{
            CommonData.str_title ="코믹"
        }
        titleButton_3!!.setOnClickListener{
            CommonData.str_title ="범죄"
        }
        titleButton_4!!.setOnClickListener{
            CommonData.str_title ="판타지"
        }
        titleButton_5!!.setOnClickListener{
            CommonData.str_title ="픽션"
        }
        titleButton_6!!.setOnClickListener{
            CommonData.str_title ="공포"
        }
        titleButton_7!!.setOnClickListener{
            CommonData.str_title ="미스터리"
        }
        titleButton_8!!.setOnClickListener{
            CommonData.str_title ="철학"
        }
        titleButton_9!!.setOnClickListener{
            CommonData.str_title ="정치"
        }
        titleButton_10!!.setOnClickListener{
            CommonData.str_title ="사랑"
        }
        titleButton_11!!.setOnClickListener{
            CommonData.str_title ="풍자"
        }
        titleButton_12!!.setOnClickListener{
            CommonData.str_title ="과학"
        }


        prevButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_mood3::class.java)
            startActivity(intent)
        } //이전 버튼을 누르면 result_4로 가도록 함


        nextButton!!.setOnClickListener{
            send()

            val intent= Intent(applicationContext, ResultActivity_last::class.java)
            startActivity(intent)
        } //다음 버튼을 누르면 result_last로 가도록 함

    }

    fun initActivity(){
        titleButton_1 = findViewById(R.id.resulttitle_btn_1) as Button
        titleButton_2 = findViewById(R.id.resulttitle_btn_2) as Button
        titleButton_3 = findViewById(R.id.resulttitle_btn_3) as Button
        titleButton_4 = findViewById(R.id.resulttitle_btn_4) as Button
        titleButton_5 = findViewById(R.id.resulttitle_btn_5) as Button
        titleButton_6 = findViewById(R.id.resulttitle_btn_6) as Button
        titleButton_7 = findViewById(R.id.resulttitle_btn_7) as Button
        titleButton_8 = findViewById(R.id.resulttitle_btn_8) as Button
        titleButton_9 = findViewById(R.id.resulttitle_btn_9) as Button
        titleButton_10 = findViewById(R.id.resulttitle_btn_10) as Button
        titleButton_11 = findViewById(R.id.resulttitle_btn_11) as Button
        titleButton_12 = findViewById(R.id.resulttitle_btn_12) as Button


        nextButton = findViewById(R.id.result5_nextButton_btn) as Button
        prevButton = findViewById(R.id.result5_prevButton_btn) as Button
    }


    fun send(){

        /*서버에게 전송*/
        val sendResponse = networkService!!.send(Sendpost(CommonData.str_sex.toString(),CommonData.str_age.toString(),
                CommonData.str_genre.toString(), CommonData.str_place.toString(),CommonData.str_mood.toString(), CommonData.str_title.toString()))

        sendResponse.enqueue(object : Callback<SendResponse> {
            override fun onResponse(call: Call<SendResponse>?, response: Response<SendResponse>?) {
                if(response!!.isSuccessful){
                    if(response.body().status.equals("success")){


                    }
                }else{
                    Log.d("e","정보가 정확")
                }
            }

            override fun onFailure(call: Call<SendResponse>?, t: Throwable?) {
                Log.d("e","연결에 실패했습니다")
            }
        })


    }
}