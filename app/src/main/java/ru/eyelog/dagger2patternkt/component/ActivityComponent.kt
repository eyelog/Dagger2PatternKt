package ru.eyelog.dagger2patternkt.component

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*
import ru.eyelog.dagger2patternkt.R
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter

class ActivityComponent: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        button.setOnClickListener {
            val mainCounter: MainCounter = DaggerCounterComponent.create().getMainCounter()

            val a = editText.text.toString().toInt()
            val b = editText2.text.toString().toInt()

            textView.text =  mainCounter.getDecide(a, b)
        }
    }
}