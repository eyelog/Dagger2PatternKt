package ru.eyelog.dagger2patternkt.module

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*
import ru.eyelog.dagger2patternkt.R
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter
import javax.inject.Inject

class ActivityModule: AppCompatActivity() {

    @Inject
    lateinit var mainCounter: MainCounter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        DaggerComponentModuleCounter.builder()
            .build().inject(this)

        button.setOnClickListener {
            val a = editText.text.toString().toInt()
            val b = editText2.text.toString().toInt()

            textView.text =  mainCounter.getDecide(a, b)
        }
    }
}