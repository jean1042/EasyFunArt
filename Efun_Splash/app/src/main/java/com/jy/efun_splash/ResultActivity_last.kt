package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * Created by jean1 on 2017-12-31.
 */
class ResultActivity_last : AppCompatActivity(){
    var yesButton: Button?=null //알았어요 버튼

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_last)


        initActivity()

        yesButton!!.setOnClickListener{
            val intent= Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        } //yes 버튼을 누르면 mainActivity로 가도록 함

    }

    fun initActivity(){
        yesButton = findViewById(R.id.result6_yesButton_btn) as Button
    }



}