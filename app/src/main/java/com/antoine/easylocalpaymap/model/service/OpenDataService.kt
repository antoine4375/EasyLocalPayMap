package com.antoine.easylocalpaymap.model.service

import com.antoine.easylocalpaymap.model.LocalPayPlace
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface OpenDataService {
    @GET("RegionMnyFacltStus")
    @Headers("Content-type: application/json")
    fun getPlaceList(
        @Query("KEY") key: String,  // 인증키
        @Query("Type") type: String,    // 호출 문서
        @Query("pIndex") index: String, // 페이지 위치
        @Query("pSize") size: String,   // 페이지당 요청 숫자
        @Query("SIGUN_NM") sigun: String,    // 시군명
        @Query("REFINE_ROADNM_ADDR") newAddr: String,   // 소재지도로명주소
        @Query("REFINE_LOTNO_ADDR") oldAddr: String     // 소재지지번주소
    ) : Call<LocalPayPlace>
}