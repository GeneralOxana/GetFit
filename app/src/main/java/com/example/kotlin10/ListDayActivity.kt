package com.example.kotlin10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin10.databinding.ActivityListDayBinding

class ListDayActivity : AppCompatActivity() {

    lateinit var binding: ActivityListDayBinding

    override fun onCreate(t: Bundle?) {
        super.onCreate(t)
        binding = ActivityListDayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var day = intent.getIntExtra("day", 1)
        //listDay(day)
    }

    private fun listDay(day: Int) {

    }

    fun onClickSet(view: View) {


    }

    fun onClickGet(view: View) {

    }

}