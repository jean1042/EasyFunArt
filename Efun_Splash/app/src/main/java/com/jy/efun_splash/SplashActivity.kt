package com.jy.efun_splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity


/**
 * Created by jean1 on 2017-12-30.
 */
class SplashActivity :AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //핸들러작성_백그라운드에서 돌아갈때 조정해주는 역할
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(applicationContext, LoginActivity::class.java))
            finish()
        }, 3000) //3초 후에 login액티비티로 넘어감


    }
}
