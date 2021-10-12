package com.example.todolist_mvvm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class MemoModel(
    @PrimaryKey(autoGenerate = true)
    var id:Long?,
    var memo:String =""
)