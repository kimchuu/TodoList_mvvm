package com.example.todolist_mvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class MemoModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "memoId") var id:Long?,
    var memo:String =""
)