package ru.eyelog.dagger2patternkt.component

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*
import ru.eyelog.dagger2patternkt.R
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter
import ru.eyelog.dagger2patternkt.blacksmith.ValuesGenerator

class ActivityComponent: AppCompatActivity() {

    private lateinit var mainCounter: MainCounter
    private lateinit var values: ValuesGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        mainCounter = DaggerCounterComponent.create().getMainCounter()
        values = DaggerCounterComponent.create().getValuesGenerator()

        getValues()

        button.setOnClickListener {

            val a = editText.text.toString().toInt()
            val b = editText2.text.toString().toInt()

            textView.text =  mainCounter.getDecide(a, b)

            getValues()
        }
    }

    private fun getValues(){
        editText.setText(values.getValue().toString())
        editText2.setText(values.getValue().toString())
    }
}