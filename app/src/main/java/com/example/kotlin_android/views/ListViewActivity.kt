package com.example.kotlin_android.views

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.kotlin_android.R

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listview = findViewById<ListView>(R.id.basic_list_view)
        val adapter = MyCustomAdapter(this)
        listview.adapter = adapter
    }

    private class MyCustomAdapter(context: Context) : BaseAdapter() {
        private val mContext: Context

        init {
            mContext = context
        }

        override fun getCount(): Int {
            return 5
        }

        override fun getItem(position: Int): Any {
            return "test"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val tv= TextView(mContext)
            tv.text="Kotlin attempts via list view item $position"
            return tv
        }
    }
}

