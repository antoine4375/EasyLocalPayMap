package com.antoine.easylocalpaymap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.antoine.easylocalpaymap.model.data.LocalPayPlace
import com.antoine.easylocalpaymap.model.service.LocalPlaceRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<LocalPayPlace> {

    private val model: LocalPlaceRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTest.setOnClickListener {
            model.getOlaceList("1","1","용인시","기흥구 죽전로","").enqueue(this)
//            GlobalScope.launch(Dispatchers.Main){
//                val response = model.getOlaceList("1","1","용인시","기흥구 죽전로","")
//                TODO("Not yet implemented")
//            }
        }
    }

    override fun onFailure(call: Call<LocalPayPlace>, t: Throwable) {
        TODO("Not yet implemented")
    }

    override fun onResponse(call: Call<LocalPayPlace>, response: Response<LocalPayPlace>) {
        TODO("Not yet implemented")
    }
}