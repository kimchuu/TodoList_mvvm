package com.example.todolist_mvvm.data.todo

import androidx.lifecycle.LiveData
import com.example.todolist_mvvm.data.Repository
import com.example.todolist_mvvm.model.TodoModel

class TodoRepository(private val todoDao: TodoDao) : Repository<TodoModel> {

    override suspend fun insert(data: TodoModel) {
        todoDao.insert(data)
    }

    override suspend fun delete(data: TodoModel) {
        todoDao.delete(data)
    }

    override fun getAll(): LiveData<List<TodoModel>> {
        return todoDao.getAll()
    }
}