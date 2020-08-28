package com.antoine.easylocalpaymap.model.data


import com.google.gson.annotations.SerializedName

data class LocalPayPlace(
    @SerializedName("RegionMnyFacltStus")
    val regionMnyFacltStus: List<RegionMnyFacltStu>
)