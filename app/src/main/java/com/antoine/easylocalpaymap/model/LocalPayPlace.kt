package com.antoine.easylocalpaymap.model


import com.google.gson.annotations.SerializedName

data class LocalPayPlace(
    @SerializedName("RegionMnyFacltStus")
    val regionMnyFacltStus: List<RegionMnyFacltStu>
)