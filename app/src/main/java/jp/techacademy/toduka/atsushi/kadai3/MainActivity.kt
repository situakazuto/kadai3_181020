package jp.techacademy.toduka.atsushi.kadai3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         Human(say)
        Human(think)


    }


}

