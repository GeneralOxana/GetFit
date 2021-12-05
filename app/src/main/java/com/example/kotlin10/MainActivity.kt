package com.example.kotlin10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity()
{
    var counterExe = 0
    var counterSet = 0


    override fun onCreate(first: Bundle?)
    {
        super.onCreate(first)
        setContentView(R.layout.activity_main)
    }

    fun onClickUpper(view: View)
    {
        val myUpper = resources.getStringArray(R.array.myUpper)
        val arraySize = myUpper.size
        val rand = Random.nextInt(arraySize)
        val name = myUpper[rand]
        var tvMyExe = findViewById<TextView>(R.id.tv_exe)
        tvMyExe.text = name

    }

    fun onClickLower(view: View)
    {
        val myLower = resources.getStringArray(R.array.myLower)
        val arraySize = myLower.size
        val rand = Random.nextInt(arraySize)
        //for (i in myLower.indices){
        val name = myLower[rand]
        var tvMyExe = findViewById<TextView>(R.id.tv_exe)
        tvMyExe.text = name
        //}

    }


    fun onClickSet(view: View)
    {
        var countSet = findViewById<TextView>(R.id.set)
        counterSet++
        countSet.text = counterSet.toString()
    }

    fun onClickExe(view: View)
    {
        var countExe = findViewById<TextView>(R.id.exe)
        counterExe++
        counterSet = 0
        countExe.text = counterExe.toString()

        var countSet = findViewById<TextView>(R.id.set)
        countSet.text = counterSet.toString()


    }

    fun onClickEnd(view: View)
    {
        val myQuote = resources.getStringArray(R.array.myQuote)
        val arraySize = myQuote.size
        val rand = Random.nextInt(arraySize)
        val name = myQuote[rand]
        var tvQuote = findViewById<TextView>(R.id.tv_quote)
        tvQuote.text = name
    }

    fun onClickClose(view: View) {
        super.onDestroy()
    }

}





