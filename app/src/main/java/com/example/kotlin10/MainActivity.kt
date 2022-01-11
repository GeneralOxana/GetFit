package com.example.kotlin10

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var counterSet = 0
    var counterExe = 0

    val Days = listOf(
        "Null",
        "Воскресенье",
        "Понедельник",
        "Вторник",
        "Среда",
        "Четверг",
        "Пятница",
        "Суббота"
    )

    val calendar: Calendar = Calendar.getInstance()
    val day: Int = calendar.get(Calendar.DAY_OF_WEEK)

    override fun onCreate(first: Bundle?) {
        super.onCreate(first)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_day).text = Days[day]

        findViewById<Button>(R.id.btn_end).setOnClickListener {
            Toast.makeText(this, "Домой? Нажми еще раз", Toast.LENGTH_LONG).show()
            super.onDestroy()
        }

        findViewById<ImageButton>(R.id.btn_camera).setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.btn_list).setOnClickListener {
            val listIntent = Intent(this, ListDayActivity::class.java)
            listIntent.putExtra("day", day)
            startActivity(listIntent)
        }
        when (day) {
            2 -> findViewById<TextView>(R.id.exe).text = resources.getString(R.string.myMonday)
            4 -> findViewById<TextView>(R.id.exe).text = resources.getString(R.string.myWednesday)
            6 -> findViewById<TextView>(R.id.exe).text = resources.getString(R.string.myFriday)
            else -> findViewById<TextView>(R.id.tv_plan).text = getString(R.string.day_off)
        }
    }

    fun onClickSet(view: View) {
        counterSet++
        findViewById<TextView>(R.id.tv_set).text = counterSet.toString()
    }

    fun onClickExe(view: View) {
        if (counterExe in 0..5) {
            counterExe++
            counterSet = 0
            findViewById<TextView>(R.id.tv_exe).text = counterExe.toString()
            findViewById<TextView>(R.id.tv_set).text = counterSet.toString()
        } else counterSet = 0
    }
}
