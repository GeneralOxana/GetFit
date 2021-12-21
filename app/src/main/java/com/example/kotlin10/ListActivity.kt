package com.example.kotlin10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    lateinit var listRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val userList: List<User> = listOf(
            User("Разведение ног", R.drawable.exe1),
            User("Сгибание ног", R.drawable.exe2),
            User("Разгибание ног", R.drawable.exe3),
            User("Отжимание",R.drawable.exe4),
            User("Пресс",R.drawable.exe5),
            User("Жим гориз.",R.drawable.exe18),
            User("Становая тяга",R.drawable.exe7),
            User("Жим платформы",R.drawable.exe8),
            User("Гиперэкстензия",R.drawable.exe9),
            User("Тяга блока к животу",R.drawable.exe10),
            User("Подтягивания",R.drawable.exe11),
            User("Отжимания трицепсами",R.drawable.exe12),
            User("Приседание",R.drawable.exe13),
            User("Выпады",R.drawable.exe14),
            User("Румынская тяга",R.drawable.exe15),
            User("Тяга блин к груди",R.drawable.exe16),
            User("Тяга блока к груди",R.drawable.exe17),
            User("Жим под углом",R.drawable.exe18)

        )

        listRV = findViewById(R.id.list_rv)
        listRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        listRV.adapter = ListAdapter(userList)

    }
}