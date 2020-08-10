package com.antoine.easylocalpaymap.model


import com.google.gson.annotations.SerializedName

data class Row(
    @SerializedName("BIZCOND_NM")
    val bIZCONDNM: Any,
    @SerializedName("BRNHSTRM_MNY_USE_POSBL_YN")
    val bRNHSTRMMNYUSEPOSBLYN: Any,
    @SerializedName("CARD_MNY_USE_POSBL_YN")
    val cARDMNYUSEPOSBLYN: Any,
    @SerializedName("CMPNM_NM")
    val cMPNMNM: String,
    @SerializedName("DATA_STD_DE")
    val dATASTDDE: String,
    @SerializedName("INDUTYPE_CD")
    val iNDUTYPECD: Any,
    @SerializedName("INDUTYPE_NM")
    val iNDUTYPENM: String,
    @SerializedName("MOBILE_MNY_USE_POSBL_YN")
    val mOBILEMNYUSEPOSBLYN: Any,
    @SerializedName("REFINE_LOTNO_ADDR")
    val rEFINELOTNOADDR: String,
    @SerializedName("REFINE_ROADNM_ADDR")
    val rEFINEROADNMADDR: String,
    @SerializedName("REFINE_WGS84_LAT")
    val rEFINEWGS84LAT: String,
    @SerializedName("REFINE_WGS84_LOGT")
    val rEFINEWGS84LOGT: String,
    @SerializedName("REFINE_ZIP_CD")
    val rEFINEZIPCD: String,
    @SerializedName("REGION_MNY_NM")
    val rEGIONMNYNM: Any,
    @SerializedName("SIGUN_CD")
    val sIGUNCD: String,
    @SerializedName("SIGUN_NM")
    val sIGUNNM: String,
    @SerializedName("TELNO")
    val tELNO: Any
)