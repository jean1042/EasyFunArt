package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * Created by jean1 on 2017-12-30.
 */
class ResultActivity_mood3 : AppCompatActivity(){

    var moodButton_1 : Button? = null //분위기 선택 1버튼
    var moodButton_2 : Button? = null //분위기 선택 2버튼
    var moodButton_3 : Button? = null //분위기 선택 3버튼
    var moodButton_4 : Button? = null //분위기 선택 4버튼
    var moodButton_5 : Button? = null //분위기 선택 5버튼
    var moodButton_6 : Button? = null //분위기 선택 6버튼
    var moodButton_7 : Button? = null //분위기 선택 7버튼
    var moodButton_8 : Button? = null //분위기 선택 8버튼
    var moodButton_9 : Button? = null //분위기 선택 9버튼
    var moodButton_10 : Button? = null //분위기 선택 10버튼
    var moodButton_11 : Button? = null //분위기 선택 11버튼

    var nextButton : Button?=null //다음 버튼
    var prevButton : Button?=null //이전 버튼

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_mood)

        initActivity()

    /*각 버튼을 누르면 CommonData 에 정보 저장*/
        moodButton_1!!.setOnClickListener{
            CommonData.str_mood ="적막감"
        }

        moodButton_2!!.setOnClickListener{
            CommonData.str_mood ="환상적인"
        }
        moodButton_3!!.setOnClickListener{
            CommonData.str_mood ="세련된"
        }

        moodButton_4!!.setOnClickListener{
            CommonData.str_mood ="편안한"
        }

        moodButton_5!!.setOnClickListener{
            CommonData.str_mood ="강렬한"
        }

        moodButton_6!!.setOnClickListener{
            CommonData.str_mood ="따뜻한"
        }

        moodButton_7!!.setOnClickListener{
            CommonData.str_mood ="슬픈"
        }

        moodButton_8!!.setOnClickListener{
            CommonData.str_mood ="유유자적한"
        }

        moodButton_9!!.setOnClickListener{
            CommonData.str_mood ="우아한"
        }

        moodButton_10!!.setOnClickListener{
            CommonData.str_mood ="시원한"
        }

        moodButton_11!!.setOnClickListener{
            CommonData.str_mood ="사실적인"
        }


        /*이전, 다음 버튼 누르면 화면 전환*/
        prevButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_place2::class.java)
            startActivity(intent)
        } //이전 버튼을 누르면 result_3로 가도록 함

        nextButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_title4::class.java)
            startActivity(intent)
        } //다음 버튼을 누르면 result_4로 가도록 함

    }

    fun initActivity(){
        moodButton_1=findViewById(R.id.resultmood_1_btn) as Button
        moodButton_2=findViewById(R.id.resultmood_2_btn) as Button
        moodButton_3=findViewById(R.id.resultmood_3_btn) as Button
        moodButton_4=findViewById(R.id.resultmood_4_btn) as Button
        moodButton_5=findViewById(R.id.resultmood_5_btn) as Button
        moodButton_6=findViewById(R.id.resultmood_6_btn) as Button
        moodButton_7=findViewById(R.id.resultmood_7_btn) as Button
        moodButton_8=findViewById(R.id.resultmood_8_btn) as Button
        moodButton_9=findViewById(R.id.resultmood_9_btn) as Button
        moodButton_10=findViewById(R.id.resultmood_10_btn) as Button
        moodButton_11=findViewById(R.id.resultmood_11_btn) as Button

        nextButton = findViewById(R.id.result4_nextButton_btn) as Button
        prevButton = findViewById(R.id.result4_prevButton_btn) as Button
    }
}