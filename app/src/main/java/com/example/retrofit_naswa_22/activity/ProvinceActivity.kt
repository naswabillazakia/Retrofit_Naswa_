package com.example.retrofit_naswa_22.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit_naswa_22.R
import com.example.retrofit_naswa_22.adapter.Provinceadapter
import com.example.retrofit_naswa_22.api.RetrofitClient
import com.example.retrofit_naswa_22.model.provincerespon
import kotlinx.android.synthetic.main.activity_province.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProvinceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_province)
        showProvince()
    }

    private fun showProvince() {
        rvProvince.setHasFixedSize(true)
        rvProvince.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getProvince().enqueue(object : Callback<ArrayList<provincerespon>> {
            override fun onResponse(
                call: Call<ArrayList<provincerespon>>,
                response: Response<ArrayList<provincerespon>>
            ) {
                val list = response.body()
                val adapter = list?.let { Provinceadapter(it) }
                rvProvince.adapter = adapter

            }

            override fun onFailure(call: Call<ArrayList<provincerespon>>, t: Throwable) {
                Toast.makeText(this@ProvinceActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}



