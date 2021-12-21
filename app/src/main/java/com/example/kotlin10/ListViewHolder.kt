package com.example.kotlin10

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListViewHolder(itemView: View): RecyclerView.ViewHolder (itemView){

    private val nameTV:TextView = itemView.findViewById(R.id.name_tv)
    //private val ageTV:TextView = itemView.findViewById(R.id.age_tv)

    fun bind(list: User){
        nameTV.text = "${list.name}"
        //ageTV.text = "${list.age}"

    }
}