package com.example.kotlin10

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(user: User) {
        itemView.findViewById<TextView>(R.id.exe_TV).text = user.name + user.days
        itemView.findViewById<ImageView>(R.id.exe_IV).setImageResource(user.image)

    }
}