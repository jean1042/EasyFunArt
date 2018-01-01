package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * Created by jean1 on 2017-12-30.
 */
class ResultActivity_select :AppCompatActivity() {
    var likeButton : Button? = null //좋아요! 버튼


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_select)

        initActivity()

        //좋아요 버튼을 누르면 ResultActivity_2 페이지로 넘어가도록 함
        likeButton!!.setOnClickListener{
            val intent= Intent(applicationContext, ResultActivity_2::class.java)
            startActivity(intent)
        }

    }
fun initActivity(){
    likeButton = findViewById(R.id.result1_likeButton_btn) as Button

    //액티비티에서 사용할 뷰들을 연결
}
}