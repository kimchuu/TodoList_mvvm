package com.example.todolist_mvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "todo")
class TodoModel (
    @PrimaryKey
    @ColumnInfo(name="todoId") val id:Int,
    var title : String,
    var description : String,
    var createdDate : Date
)