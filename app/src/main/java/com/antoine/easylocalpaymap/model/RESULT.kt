package com.antoine.easylocalpaymap.model


import com.google.gson.annotations.SerializedName

data class RESULT(
    @SerializedName("CODE")
    val cODE: String,
    @SerializedName("MESSAGE")
    val mESSAGE: String
)