package com.example.kotlin10
 data class Exercises(val name: String, val day: String, val pic: String) {

    val userList: List<User> = listOf(
        User("Разведение ног", Days.ПОНЕДЕЛЬНИК, R.drawable.exe1),
        User("Сгибание ног", Days.ПОНЕДЕЛЬНИК, R.drawable.exe2),
        User("Разгибание ног", Days.ПОНЕДЕЛЬНИК, R.drawable.exe3),
        User("Отжимание", Days.ПОНЕДЕЛЬНИК, R.drawable.exe4),
        User("Пресс", Days.ПОНЕДЕЛЬНИК, R.drawable.exe5),
        User("Жим гориз.", Days.ПОНЕДЕЛЬНИК, R.drawable.exe18),
        User("Становая тяга", Days.СРЕДА, R.drawable.exe7),
        User("Жим платформы", Days.СРЕДА, R.drawable.exe8),
        User("Гиперэкстензия", Days.СРЕДА, R.drawable.exe9),
        User("Тяга блока к животу", Days.СРЕДА, R.drawable.exe10),
        User("Подтягивания", Days.СРЕДА, R.drawable.exe11),
        User("Отжимания трицепсами", Days.СРЕДА, R.drawable.exe12),
        User("Приседание", Days.ПЯТНИЦА, R.drawable.exe13),
        User("Выпады", Days.ПЯТНИЦА, R.drawable.exe14),
        User("Румынская тяга", Days.ПЯТНИЦА, R.drawable.exe15),
        User("Тяга блин к груди", Days.ПЯТНИЦА, R.drawable.exe16),
        User("Тяга блока к груди", Days.ПЯТНИЦА, R.drawable.exe17),
        User("Жим под углом", Days.ПЯТНИЦА, R.drawable.exe18)
    )
}