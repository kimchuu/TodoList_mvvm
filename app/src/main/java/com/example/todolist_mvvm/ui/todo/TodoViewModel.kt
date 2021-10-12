package com.example.todolist_mvvm.ui.todo

import com.example.todolist_mvvm.base.BaseViewModel
import com.example.todolist_mvvm.data.todo.TodoRepository
import com.example.todolist_mvvm.model.TodoModel

class TodoViewModel(private val todoRepository: TodoRepository) : BaseViewModel() {

    private var mTodoItems = todoRepository.getAll()

    fun insertTodo(todoModel: TodoModel){
        // todo https://developer.android.com/kotlin/coroutines?hl=ko&gclid=Cj0KCQjw5JSLBhCxARIsAHgO2Sc8IrmrrlAhnVGhsLeISyVTVTwiBTCd7bbGX6-vbFbtVcECIgIU1_4aAvYJEALw_wcB&gclsrc=aw.ds
        todoRepository.insert(todoModel)
    }
}