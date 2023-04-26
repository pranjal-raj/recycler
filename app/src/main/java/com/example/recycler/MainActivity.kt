package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names  = arrayOf("Liam","Olivia","Noah","Emma","Oliver","Charlotte","Elijah","Amelia","James","Ava")
        val personlist = ArrayList<Person>()
        for(i in 0..9)
        {
            val person : Person = Person(R.drawable.ic_launcher_background, names[i])
            personlist.add(person)
        }


        val myfkinAdapter = myAdapter(personlist)
        val rv = findViewById<RecyclerView>(R.id.recycler)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter=myfkinAdapter

    }
}