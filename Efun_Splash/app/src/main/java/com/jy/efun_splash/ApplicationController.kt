
package com.jy.sixthseminar


import android.app.Application
import android.content.Context
import android.widget.Toast
import com.jy.efun_splash.NetworkService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by 2yg on 2017. 11. 20..
 */
class ApplicationController : Application() {

    var networkService: NetworkService? = null
    val baseUrl = "http://52.79.136.159:3000/" //baseUrl : http:// ~3000 은 어느 url이던 같음
    var appContext: Context? = null
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext

        instance = this

        buildNetwork()
    }


    fun buildNetwork() {
        val builder = Retrofit.Builder()
        val retrofit = builder
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create()) //gsonconverter를 통해서 데이터를 쓸 수 있게끔 하는
                .build()
        networkService = retrofit.create(NetworkService::class.java)

    }

    fun makeToast(message: String) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show()
    }

    companion object {
        var instance: ApplicationController? = null

    }
}
