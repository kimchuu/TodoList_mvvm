package com.example.todolist_mvvm.data

import androidx.lifecycle.LiveData

interface Repository<T> {
    suspend fun insert(data : T)
    suspend fun delete(data : T)
    fun getAll() : LiveData<List<T>>
}