package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * Created by jean1 on 2017-12-30.
 */
class ResultActivity_place2 : AppCompatActivity() {
    var placeButton_seochon : Button? = null //장소 선택 서촌 버튼
    var placeButton_gangnam : Button? = null //장소 선택 강남 버튼
    var placeButton_hongdae : Button? = null //장소 선택 홍대 버튼
    var placeButton_insadong : Button? = null//장소 선택 인사동 버튼
    var placeButton_itaewon : Button? = null//장소 선택 이태원 버튼
    var placeButton_chungmuro : Button? = null//장소 선택 충무로 버튼
    var placeButton_daehakro : Button? = null//장소 선택 대학로 버튼
    var placeButton_bukchon : Button? = null//장소 선택 북촌 버튼
var placeButton_jonggak : Button?=null //장소 선택 종각 버튼

    var nextButton : Button?=null //다음 버튼
    var prevButton : Button?=null //이전 버튼

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_place)

        initActivity()

        /*각 버튼을 누르면 정보 저장*/
        placeButton_seochon!!.setOnClickListener{
            CommonData.str_place ="서촌"
        }

        placeButton_gangnam!!.setOnClickListener{
            CommonData.str_place ="강남"
        }

        placeButton_hongdae!!.setOnClickListener{
            CommonData.str_place ="홍대"
        }

        placeButton_insadong!!.setOnClickListener{
            CommonData.str_place ="인사동"
        }

        placeButton_itaewon!!.setOnClickListener{
            CommonData.str_place ="이태원"
        }

        placeButton_chungmuro!!.setOnClickListener{
            CommonData.str_place ="충무로"
        }

        placeButton_daehakro!!.setOnClickListener{
            CommonData.str_place="대학로"
        }

        placeButton_jonggak!!.setOnClickListener{
            CommonData.str_place ="종각"
        }

        placeButton_bukchon!!.setOnClickListener{
            CommonData.str_place ="북촌"
        }




        /*이전, 다음 버튼 누르면 화면 전환*/
        prevButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_genre1::class.java)
            startActivity(intent)
        } //이전 버튼을 누르면 result_4로 가도록 함

        nextButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_mood3::class.java)
            startActivity(intent)
        } //다음 버튼을 누르면 result_mood로 가도록 함

    }

    fun initActivity(){
        placeButton_seochon = findViewById(R.id.resultplace_seochonButton_btn) as Button
        placeButton_gangnam= findViewById(R.id.resultplace_gangnamButton_btn) as Button
        placeButton_hongdae= findViewById(R.id.resultplace_hongdaeButton_btn) as Button
        placeButton_insadong=findViewById(R.id.resultplace_insadongButton_btn) as Button
        placeButton_itaewon= findViewById(R.id.resultplace_itaewonButton_btn) as Button
        placeButton_chungmuro= findViewById(R.id.resultplace_chungmuroButton_btn) as Button
        placeButton_daehakro= findViewById(R.id.resultplace_daehakroButton_btn) as Button
       placeButton_jonggak=findViewById(R.id.resultplace_jonggak_btn) as Button
       placeButton_bukchon= findViewById(R.id.resultplace_bukchonButton_btn) as Button

        nextButton = findViewById(R.id.resultplace_nextButton_btn) as Button
        prevButton = findViewById(R.id.resultplace_prevButton_btn) as Button
        //액티비티에서 사용할 뷰들을 연결
    }
}