package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.jy.efun_splash.CommonData.str_age
import com.jy.efun_splash.CommonData.str_sex

/**
 * Created by jean1 on 2017-12-30.
 */
class ResultActivity_2  :AppCompatActivity() {

    /*화면 구성 관련 변수*/
    var sexButton_woman : Button? = null //성별 선택 여성 버튼
    var sexButton_man : Button? = null //성별 선택 남성 버튼

    var ageButton_10 : Button?=null //연령대 선택 10대 버튼
    var ageButton_20 : Button?=null //연령대 선택 20대 버튼
    var ageButton_30 : Button?=null //연령대 선택 30대 버튼
    var ageButton_40 : Button?=null //연령대 선택 40대 버튼
    var ageButton_50 : Button?=null //연령대 선택 50대 버튼
    var ageButton_60 : Button?=null //연령대 선택 60대 버튼

    var nextButton : Button?=null // 다음 버튼





    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_info)

        initActivity()

        /*각 버튼을 누르면 정보 저장*/
        sexButton_man!!.setOnClickListener{
        str_sex="man"
            Log.d("man", "man")
        } //남성

        sexButton_woman!!.setOnClickListener{
            str_sex="woman"
            Log.d("woman", "woman")
        }//여성


        ageButton_10!!.setOnClickListener{
            str_age = "10"
            Log.d("10", "10")
        } //10대


        ageButton_10!!.setOnClickListener{
            str_age = "20"
            Log.d("20", "20")
        } //20대


        ageButton_30!!.setOnClickListener{
            str_age = "30"
            Log.d("30", "30")
        } //30대



        ageButton_40!!.setOnClickListener{
            str_age = "40"
            Log.d("40", "40")
        } //40대

        ageButton_50!!.setOnClickListener{
            str_age = "50"
            Log.d("50", "50")
        } //50대

        ageButton_60!!.setOnClickListener{
            str_age = "60"
            Log.d("60", "60")
        } //60대


        nextButton!!.setOnClickListener{


            val intent= Intent(applicationContext, ResultActivity_place2::class.java)
            startActivity(intent)
        } //다음 버튼을 누르면 result_3으로 가도록 함

    }

    fun initActivity(){
        sexButton_man = findViewById(R.id.result2_manButton_btn) as Button
        sexButton_woman=findViewById(R.id.result2_womanButton_btn) as Button

        ageButton_10=findViewById(R.id.result2_ageButton10_btn) as Button
        ageButton_20=findViewById(R.id.result2_ageButton20_btn) as Button
        ageButton_30=findViewById(R.id.result2_ageButton30_btn) as Button
        ageButton_40=findViewById(R.id.result2_ageButton40_btn) as Button
        ageButton_50=findViewById(R.id.result2_ageButton50_btn) as Button
        ageButton_60=findViewById(R.id.result2_ageButton60_btn) as Button

        nextButton = findViewById(R.id.result2_nextButton_btn) as Button
        //액티비티에서 사용할 뷰들을 연결


    }

}