package com.example.retrofit_naswa_22.api

import com.example.retrofit_naswa_22.model.indonesiaresponse
import com.example.retrofit_naswa_22.model.provincerespon
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<indonesiaresponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<provincerespon>>
}



