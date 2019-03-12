package com.example.testmatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { randomJodoh() }
    }
    fun randomJodoh() {
        val randomCewek = java.util.Random().nextInt(4)+1
        val randomCowok = java.util.Random().nextInt(4)+1
        val drawableResCewek = when(randomCewek){
            1 ->R.drawable.cewek1
            2 ->R.drawable.cewek2
            3 ->R.drawable.cewek3
            else ->R.drawable.cewek4
        }
        val drawableResCowok = when(randomCowok){
            1 ->R.drawable.cowok1
            2 ->R.drawable.cowok2
            3 ->R.drawable.cowok3
            else ->R.drawable.cowok4

        }

        ivDadu1.setImageResource(drawableResCewek)
        ivDadu2.setImageResource(drawableResCowok)
    }
}
