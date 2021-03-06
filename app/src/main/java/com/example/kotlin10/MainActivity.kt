package com.example.kotlin10

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var counterExe = 0 //упражнения
    var counterSet = 0 //подходы
    val calendar: Calendar = Calendar.getInstance()
    val day: Int = calendar.get(Calendar.DAY_OF_WEEK)

    override fun onCreate(first: Bundle?) {
        super.onCreate(first)
        setContentView(R.layout.activity_main)

        val endButton: Button = findViewById(R.id.fin_end)
        endButton.setOnClickListener {
            Toast.makeText(this, "Домой?", Toast.LENGTH_LONG).show()
            super.onDestroy()
        }


        val cameraButton: Button = findViewById(R.id.btn_camera)
        cameraButton.setOnClickListener {
            val intent: Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

        }

        val listButton: Button = findViewById(R.id.btn_list)
        listButton.setOnClickListener {
            val listIntent = Intent(this, ListActivity::class.java)
            startActivity(listIntent)
        }


        when (day) {

            2 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Понедельник.toString()
                onListExe(counterExe, day)
            }
            4 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Среда.toString()
                onListExe(counterExe, day)
            }
            6 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Пятница.toString()
                onListExe(counterExe, day)
            }
            1 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Воскресенье.toString() + "\n" + getString(R.string.day_off)
            }
            7 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Суббота.toString() + "\n" + getString(R.string.day_off)
            }
            3 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Вторник.toString() + "\n" + getString(R.string.day_off)
            }
            5 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = Days.Четверг.toString() + "\n" + getString(R.string.day_off)
            }
        }
    }


    fun onListExe(i: Int, day1: Int) {
        when {
            day1 == 2 -> {
                val myList = resources.getStringArray(R.array.myMonday)
                var name = myList[i]
                var tvMyExe = findViewById<TextView>(R.id.tv_exe)
                tvMyExe.text = name
            }
            day1 == 4 -> {
                val myList = resources.getStringArray(R.array.myWednesday)
                var name = myList[i]
                var tvMyExe = findViewById<TextView>(R.id.tv_exe)
                tvMyExe.text = name
            }
            day1 == 6 -> {
                val myList = resources.getStringArray(R.array.myFriday)
                var name = myList[i]
                var tvMyExe = findViewById<TextView>(R.id.tv_exe)
                tvMyExe.text = name
            }
        }
    }


    fun onClickSet(view: View) {
        var countSet = findViewById<TextView>(R.id.set)
        counterSet++
        countSet.text = counterSet.toString()
    }

    fun onClickExe(view: View) {
        when {
            counterExe in 0..4 -> {
                var countExe = findViewById<TextView>(R.id.exe)
                counterExe++
                counterSet = 0
                countExe.text = counterExe.toString()

                var countSet = findViewById<TextView>(R.id.set)
                countSet.text = counterSet.toString()

                onListExe(counterExe, day)

            }
            counterExe > 4 -> {
                onClickEnd(view)
            }
        }
    }

    fun onClickEnd(view: View) {
        val myQuote = resources.getStringArray(R.array.myQuote)
        val arraySize = myQuote.size
        val rand = Random.nextInt(arraySize)
        val name = myQuote[rand]
        var tvQuote = findViewById<TextView>(R.id.tv_quote)
        tvQuote.text = "Пора домой!!!  " + name
    }

}