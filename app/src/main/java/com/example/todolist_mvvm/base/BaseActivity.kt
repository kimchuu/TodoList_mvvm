package com.example.todolist_mvvm.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


abstract class BaseActivity : AppCompatActivity() {
    /**
     * DataBinding
     */
    protected inline fun <reified T : ViewDataBinding> binding(resId: Int): Lazy<T> =
        lazy { DataBindingUtil.setContentView<T>(this, resId) }

    /**
     * 토스트
     */
    fun String.showLongToast() = Toast.makeText(applicationContext, this, Toast.LENGTH_LONG).show()
    fun String.showShortToast() = Toast.makeText(applicationContext, this, Toast.LENGTH_SHORT).show()
}