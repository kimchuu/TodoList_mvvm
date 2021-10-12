package com.example.todolist_mvvm.model

import androidx.room.Entity
import java.util.*

@Entity
class TodoModel (
    var title : String,
    var description : String,
    var createdDate : Date
)