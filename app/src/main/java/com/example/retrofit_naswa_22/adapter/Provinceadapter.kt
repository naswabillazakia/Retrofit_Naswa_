package com.example.retrofit_naswa_22.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_naswa_22.R
import com.example.retrofit_naswa_22.model.provincerespon
import kotlinx.android.synthetic.main.item_province.view.*

class Provinceadapter(private var list: ArrayList<provincerespon>): RecyclerView.Adapter<Provinceadapter.ProvinceViewHolder>(){
    inner class ProvinceViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(province: provincerespon){
            with(itemView){
                 tvName.text = province.attributs.province
                tvPositive.text = province.attributs.positive.toString()
                tvRecover.text = province.attributs.recover.toString()
                tvDeath.text = province.attributs.death.toString()

            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_province,parent,false)
        return ProvinceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProvinceViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    }


