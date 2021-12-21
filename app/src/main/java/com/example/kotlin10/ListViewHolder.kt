package com.example.kotlin10

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameTV: TextView = itemView.findViewById(R.id.exe_TV)
    private val imgIV: ImageView = itemView.findViewById(R.id.exe_IV)

    fun bind(user: User) {
        nameTV.text = user.name
        imgIV.setImageResource(user.image)

    }
}