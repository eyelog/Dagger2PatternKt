package ru.eyelog.dagger2patternkt.singleton

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*
import ru.eyelog.dagger2patternkt.R
import ru.eyelog.dagger2patternkt.blacksmith.MainCounter
import ru.eyelog.dagger2patternkt.blacksmith.ValuesGenerator
import javax.inject.Inject

class ActivitySingleton : AppCompatActivity() {

    @Inject
    lateinit var mainCounter: MainCounter

    @Inject
    lateinit var values: ValuesGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        DaggerComponentSingletonCounter.builder()
            .build().inject(this)

        getValues()

        button.setOnClickListener {
            val a = editText.text.toString().toInt()
            val b = editText2.text.toString().toInt()

            textView.text =  mainCounter.getDecide(a, b)

            getValues()
        }

        Log.i("Logcat",  "hash of obj: ${mainCounter.hashCode()}")
    }

    private fun getValues(){
        editText.setText(values.getValue().toString())
        editText2.setText(values.getValue().toString())
    }
}