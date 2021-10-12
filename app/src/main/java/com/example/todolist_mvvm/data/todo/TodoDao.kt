package com.example.todolist_mvvm.data.todo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.todolist_mvvm.model.TodoModel
import java.util.concurrent.Flow

@Dao
interface TodoDao {

    @Insert(onConflict = REPLACE)
    suspend fun insert(todo : TodoModel)

    @Query("SELECT * FROM todo ORDER BY createdDate DESC")
    fun getAll() : LiveData<List<TodoModel>>

    @Delete
    suspend fun delete(todo : TodoModel)

    @Query("SELECT Count(*) FROM todo")
    fun getCount() : Int

}