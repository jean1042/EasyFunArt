package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.jy.efun_splash.CommonData.str_genre

/**
 * Created by jean1 on 2018-01-01.
 */


class ResultActivity_genre1 : AppCompatActivity(){

    /*화면 구성 관련 변수*/
    var genreButton_1 : Button? = null //장르 선택 동양화 버튼
    var genreButton_2 : Button? = null //장르 선택 서양화 버튼
    var genreButton_3 : Button?=null //장르 선택 도예 버튼
    var genreButton_4 : Button?=null //장르 선택 금속 버튼
    var genreButton_5 : Button?=null //장르 선택 목공 버튼
    var genreButton_6 : Button?=null //장르 선택 일러스트 버튼
    var genreButton_7 : Button?=null //장르 선택 현대미술 버튼
    var genreButton_8 : Button?=null //장르 선택 팝아트 버튼
    var genreButton_9 : Button?=null//장르 선택 풍경화 버튼
    var genreButton_10 : Button?=null//장르 선택 사진전 버튼
    var genreButton_11 : Button?=null//장르 선택 인물화 버튼

    var nextButton : Button?=null //다음 버튼
    var prevButton : Button?=null //이전 버튼




    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_genre)

        initActivity()

        /*각 버튼을 누르면 정보 저장*/
        genreButton_1!!.setOnClickListener{
        str_genre="동양화"
        }

        genreButton_2!!.setOnClickListener{
            str_genre="서양화"
        }

        genreButton_3!!.setOnClickListener{
            str_genre="도예"
        }

        genreButton_4!!.setOnClickListener{
            str_genre="금속"
        }

        genreButton_5!!.setOnClickListener{
            str_genre="목공"
        }

        genreButton_6!!.setOnClickListener{
            str_genre="일러스트"
        }

        genreButton_7!!.setOnClickListener{
            str_genre="현대미술"
        }

        genreButton_8!!.setOnClickListener{
            str_genre="팝아트"
        }
        genreButton_9!!.setOnClickListener{
            str_genre="풍경화"
        }
        genreButton_10!!.setOnClickListener{
            str_genre="사진전"
        }
        genreButton_11!!.setOnClickListener{
            str_genre="인물화"
        }

        /*이전, 다음 버튼 누르면 화면 전환*/
        prevButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_2::class.java)
            startActivity(intent)
        } //이전 버튼을 누르면 result_info로 가도록 함

        nextButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_place2::class.java)
            startActivity(intent)
        } //다음 버튼을 누르면 result_place로 가도록 함

    }

    fun initActivity(){
        genreButton_1=findViewById(R.id.resultgenre_1_btn) as Button
        genreButton_2=findViewById(R.id.resultgenre_2_btn) as Button
        genreButton_3=findViewById(R.id.resultgenre_3_btn) as Button
        genreButton_4=findViewById(R.id.resultgenre_4_btn) as Button
        genreButton_5=findViewById(R.id.resultgenre_5_btn) as Button
        genreButton_6=findViewById(R.id.resultgenre_6_btn) as Button
        genreButton_7=findViewById(R.id.resultgenre_7_btn) as Button
        genreButton_8=findViewById(R.id.resultgenre_8_btn) as Button
        genreButton_9=findViewById(R.id.resultgenre_9_btn) as Button
        genreButton_10=findViewById(R.id.resultgenre_10_btn) as Button
        genreButton_11=findViewById(R.id.resultgenre_11_btn) as Button

        nextButton = findViewById(R.id.result4_nextButton_btn) as Button
        prevButton = findViewById(R.id.result4_prevButton_btn) as Button
    }

}