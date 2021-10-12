package com.example.todolist_mvvm.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist_mvvm.R
import com.example.todolist_mvvm.databinding.ItemTodoBinding
import com.example.todolist_mvvm.model.TodoModel


class TodoListAdapter(val todoItems : ArrayList<TodoModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class TodoViewHolder(private val binding: ItemTodoBinding, val context: Context) : RecyclerView.ViewHolder(binding.root){
        fun bind(TodoItem : TodoModel){
            binding.apply {
                tvTodoTitle.text = TodoItem.title
                tvTodoDescription.text = TodoItem.description
                tvTodoCreatedDate.text = TodoItem.createdDate.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = DataBindingUtil.inflate<ItemTodoBinding>(LayoutInflater.from(parent.context), R.layout.item_todo, parent, false)
        return TodoViewHolder(view, parent.context)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val todoViewHolder = holder as TodoViewHolder
        todoViewHolder.itemView.requestLayout()
        todoViewHolder.bind(todoItems[position])
    }

    override fun getItemCount(): Int {
        return todoItems.count()
    }
}