package com.antoine.easylocalpaymap.model.service

import com.antoine.easylocalpaymap.model.data.LocalPayPlace
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Query

class LocalPlaceRepository(private val service: OpenDataService) {
    fun getOlaceList(index: String, size: String, sigun: String, newAddr: String, oldAddr: String) : Call<LocalPayPlace> {
        return service.getPlaceList(AuthKey.KEY, "json", index, size, sigun, newAddr, oldAddr)
    }
}