package com.jy.efun_splash

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

/**
 * Created by jean1 on 2018-01-01.
 */




/**
 * Created by jean1 on 2017-11-25.
 */

//통신에 쓸 메소드들만 작성, 필요한 정보만 액티비티로 가져옴
/*서버로 가입할 수 있는 */
interface NetworkService {

    @Multipart
    @POST("appUser/signUp") /*포스트 방식으로 보내면 우리가 넣은 정보로 서버*/
    fun login(@Part("profile") profile : RequestBody, /*request body 형식으로 보내줌*/
             @Part("email") email : RequestBody
            )
            : retrofit2.Call<SignResponse>


    @POST("appUser/login")
    fun login(@Body loginPost : LoginPost) : Call<LoginPost>



    @POST("appUser / send")
    fun send(@Body sendpost: Sendpost) : Call<SendResponse>



}