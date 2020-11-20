package ru.cosiness.garbagedisposalschedule

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.buffer_day.*
import kotlinx.android.synthetic.main.buffer_day.tv_date
import kotlinx.android.synthetic.main.garbage_person.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/**
 * Created by Natasha on 17.11.2020.
 * tg: natavel
 */
class BufferDay : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buffer_day)
        getCurrentTimestamp()
        btn_random.setOnClickListener {
            val persons = resources.getStringArray(R.array.persons_names)
            val randomName = persons.random()
            tv_name.text = randomName
        }

    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentTimestamp() {
        val date = LocalDateTime.now()
        tv_date.text = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))

    }


}