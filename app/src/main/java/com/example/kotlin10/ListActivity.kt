package com.example.kotlin10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    lateinit var listRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val userList: List<User> = listOf(
            User("Разведение ног"),
            User("Сгибание ног"),
            User("Разгибание ног"),
            User("Отжимание"),
            User("Пресс"),
            User("Жим гориз."),
            User("Становая тяга"),
            User("Жим платформы"),
            User("Гиперэкстензия"),
            User("Тяга блока к животу"),
            User("Подтягивания"),
            User("Отжимания трицепсами"),
            User("Приседание"),
            User("Выпады"),
            User("Румынская тяга"),
            User("Тяга блин к груди"),
            User("Тяга блока к груди"),
            User("Жим под углом")

        )

        listRV = findViewById(R.id.list_rv)
        listRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        listRV.adapter = ListAdapter(userList)

    }
}