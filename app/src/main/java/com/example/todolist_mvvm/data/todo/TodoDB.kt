package com.example.todolist_mvvm.data.todo

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todolist_mvvm.model.TodoModel

@Database(entities = arrayOf(TodoModel::class), version = 1)
@TypeConverters(Converters::class)
abstract class TodoDB : RoomDatabase(){
    abstract fun todoDAO(): TodoDao
    object Factory{
        private const val dbName = "todo.db"
        fun create(context: Context) : TodoDB{
            return Room.databaseBuilder(
                context.applicationContext,
                TodoDB::class.java,
                dbName
            ).build()
        }
    }


}