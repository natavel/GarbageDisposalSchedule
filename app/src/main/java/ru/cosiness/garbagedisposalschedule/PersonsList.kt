package ru.cosiness.garbagedisposalschedule

import android.app.Activity
import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.persons_list.*

/**
 * Created by Natasha on 17.11.2020.
 * tg: natavel
 */
class PersonsList : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.persons_list)

        rv_persons_list.layoutManager = LinearLayoutManager(this)
        rv_persons_list.adapter = CustomRecyclerAdapter(getPersonsList())
    }


     open fun getPersonsList(): List<String> {
        return this.resources.getStringArray(R.array.persons_names).toList()
        val adapter = CustomRecyclerAdapter(getPersonsList())
    }



}
