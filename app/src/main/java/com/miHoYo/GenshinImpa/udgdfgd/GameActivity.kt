package com.miHoYo.GenshinImpa.udgdfgd

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.miHoYo.GenshinImpa.R
import com.miHoYo.GenshinImpa.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    private lateinit var twijijisad: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        twijijisad = ActivityGameBinding.inflate(layoutInflater)
        setContentView(twijijisad.root)

        supportActionBar?.hide()
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        var gemsArray = listOf(R.drawable.gem1, R.drawable.gem2, R.drawable.gem3)

        twijijisad.buttonHummer.setOnClickListener {
            twijijisad.buttonHummerWrap.strokeColor = resources.getColor(R.color.primary_dark)

            if (null != twijijisad.gemFirst.drawable) {
                if (null != twijijisad.gemSecond.drawable) {
                    if (null != twijijisad.gemThird.drawable) {
                        twijijisad.gemFirst.setImageDrawable(null)
                        twijijisad.gemSecond.setImageDrawable(null)
                        twijijisad.gemThird.setImageDrawable(null)
                        twijijisad.gemFirstWrap.strokeColor = resources.getColor(R.color.primary_dark)
                        twijijisad.gemSecondWrap.strokeColor = resources.getColor(R.color.primary_dark)
                        twijijisad.gemThirdWrap.strokeColor = resources.getColor(R.color.primary_dark)
                    } else {
                        twijijisad.buttonHummerWrap.strokeColor = resources.getColor(R.color.purple_flash)
                        twijijisad.gemFirstWrap.strokeColor = resources.getColor(R.color.red_flash)
                        twijijisad.gemSecondWrap.strokeColor = resources.getColor(R.color.red_flash)
                        twijijisad.gemThirdWrap.strokeColor = resources.getColor(R.color.red_flash)
                        twijijisad.gemThird.setImageResource(gemsArray.random())
                        twijijisad.textMainWindow.setText("Well, looks like u failed, Traveller. Something went wrong. I told you that no one passed through yet. ")
                    }
                } else {
                    twijijisad.gemSecond.setImageResource(gemsArray.random())
                    twijijisad.gemSecondWrap.strokeColor = resources.getColor(R.color.green_flash)
                    twijijisad.textMainWindow.setText("Both are placed perfect. Smash it one more time. But use that hummer wisely. ")
                }
            } else {
                twijijisad.gemFirst.setImageResource(gemsArray.random())
                twijijisad.gemFirstWrap.strokeColor = resources.getColor(R.color.green_flash)
                twijijisad.textMainWindow.setText("Wow, first one looks great. But what about another one? Trust me you are not the first who trying to enter that ruins.")
            }

        }

        twijijisad.buttonSettings.setOnClickListener {
            Toast.makeText(this, "This feature is not yet implemented.", Toast.LENGTH_SHORT).show()
        }

        twijijisad.buttonGift.setOnClickListener {
            Toast.makeText(this, "This feature is not yet implemented.", Toast.LENGTH_SHORT).show()
        }


    }
}