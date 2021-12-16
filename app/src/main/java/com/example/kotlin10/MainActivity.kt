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
    var counterExe = 0
    var counterSet = 0
    val calendar: Calendar = Calendar.getInstance()
    val day: Int = calendar.get(Calendar.DAY_OF_WEEK)


    override fun onCreate(first: Bundle?) {
        super.onCreate(first)
        setContentView(R.layout.activity_main)

       val end_button: Button = findViewById(R.id.fin_end)
        end_button.setOnClickListener {
            Toast.makeText(this, "Домой?", Toast.LENGTH_LONG).show()
            super.onDestroy()
        }


        val cameraButton: Button = findViewById(R.id.btn_camera)
        cameraButton.setOnClickListener {
           val intent: Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

        }


        when (day) {

            2 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Понедельник"
                onListExe(counterExe, day)
            }
            4 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Среда"
                onListExe(counterExe, day)
            }
            6 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Пятница"
                onListExe(counterExe, day)
            }
            1 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Воскресенье - выходной день"
            }
            7 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Суббота - выходной день"
            }
            3 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Вторник. \n"
            }
            5 -> {
                val tvDay = findViewById<TextView>(R.id.tv_day)
                tvDay.text = "Четверг - выходной день"
            }
        }
    }


    fun onListExe(i: Int, day1: Int) {
        when {
            day1 == 2 -> {
                val myList = resources.getStringArray(R.array.myMonday)
                val arraySize = myList.size
                var name = myList[i]
                var tvMyExe = findViewById<TextView>(R.id.tv_exe)
                tvMyExe.text = name
            }
            day1 == 4 -> {
                val myList = resources.getStringArray(R.array.myWednesday)
                val arraySize = myList.size
                var name = myList[i]
                var tvMyExe = findViewById<TextView>(R.id.tv_exe)
                tvMyExe.text = name
            }
            day1 == 6 -> {
                val myList = resources.getStringArray(R.array.myFriday)
                val arraySize = myList.size
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