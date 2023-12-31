package kz.kcell.kcellbootcamp.utils

import androidx.room.TypeConverter

class Converters {

    @TypeConverter
    fun fromIntList(list: List<Int>?): String {
        return list.toString()
    }

    @TypeConverter
    fun toIntList(string: String): List<Int> {
        return string.map { it.code }.toList()
    }
}