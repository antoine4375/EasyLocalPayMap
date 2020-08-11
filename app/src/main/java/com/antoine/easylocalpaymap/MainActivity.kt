package com.antoine.easylocalpaymap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.antoine.easylocalpaymap.model.AuthKey
import com.antoine.easylocalpaymap.model.LocalPayPlace
import com.antoine.easylocalpaymap.model.service.OpenDataService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var retrofit: Retrofit
    private lateinit var service: OpenDataService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit = Retrofit.Builder()
            .baseUrl("https://openapi.gg.go.kr/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(OpenDataService::class.java)

        service.getPlaceList(AuthKey.KEY, "json","1","1","용인시","기흥구 죽전로","").enqueue(object : Callback<LocalPayPlace>{
            override fun onFailure(call: Call<LocalPayPlace>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<LocalPayPlace>, response: Response<LocalPayPlace>) {
                TODO("Not yet implemented")
            }
        })
    }
}