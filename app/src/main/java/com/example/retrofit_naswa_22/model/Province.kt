package com.example.retrofit_naswa_22.model

import com.google.gson.annotations.SerializedName

data class Province (
    @SerializedName("kode Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus Posi")
    val positive: Int,
    @SerializedName("Kasus Semb")
    val recover: Int,
    @SerializedName("Kasus Meni")
    val death: Int

    

        )
