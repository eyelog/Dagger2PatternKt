package ru.eyelog.dagger2patternkt

import android.app.ActionBar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.eyelog.dagger2patternkt.component.ActivityComponent
import ru.eyelog.dagger2patternkt.module.ActivityModule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btComponent.setOnClickListener {
            val intent = Intent(this, ActivityComponent::class.java)
            startActivity(intent)
        }

        btModule.setOnClickListener {
            val intent = Intent(this, ActivityModule::class.java)
            startActivity(intent)
        }
    }
}
