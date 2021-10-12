package com.example.todolist_mvvm.ui.todo

import android.os.Bundle
import android.os.PersistableBundle
import com.example.todolist_mvvm.R
import com.example.todolist_mvvm.base.BaseActivity
import com.example.todolist_mvvm.databinding.ActivityMainBinding

class MainActivity: BaseActivity() {
    val binding by binding<ActivityMainBinding>(R.layout.activity_main)
    //val viewModel : TodoViewModel
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }
}