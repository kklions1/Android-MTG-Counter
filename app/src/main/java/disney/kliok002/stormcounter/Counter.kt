package disney.kliok002.stormcounter

import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.util.Log
import android.view.View
import android.widget.Space
import android.widget.TextView

/**
 * To be the main activity screen for the application, only counts red and blue mana
 * as well as storm count
 * @author Kevin Klions
 */

class Counter : Activity() {

    private var stormMinus: Space? = null
    private var stormPlus: Space? = null
    private var blueMinus: Space? = null
    private var bluePlus: Space? = null
    private var redMinus: Space? = null
    private var redPlus: Space? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        stormMinus = findViewById(R.id.storm_minus)
        stormPlus = findViewById(R.id.storm_plus)
        blueMinus = findViewById(R.id.blue_minus)
        bluePlus = findViewById(R.id.blue_plus)
        redMinus = findViewById(R.id.red_minus)
        redPlus = findViewById(R.id.red_plus)


        stormMinus!!.setOnClickListener { decrementValue(R.id.storm_count) }

        stormPlus!!.setOnClickListener { incrementValue(R.id.storm_count) }
        blueMinus!!.setOnClickListener { decrementValue(R.id.blue_mana) }
        bluePlus!!.setOnClickListener { incrementValue(R.id.blue_mana) }
        redMinus!!.setOnClickListener { decrementValue(R.id.red_mana) }
        redPlus!!.setOnClickListener { incrementValue(R.id.red_mana) }
    }

    private fun incrementValue(@IdRes resId: Int) {
        val currentCountTextView = findViewById<TextView>(resId)
        val currentValueString = currentCountTextView.text.toString()
        var currentValue = Integer.parseInt(currentValueString)

        currentValue++
        currentCountTextView.text = currentValue.toString()

    }

    private fun decrementValue(@IdRes resId: Int) {
        val currentCountTextView = findViewById<TextView>(resId)
        val currentValueString = currentCountTextView.text.toString()
        var currentValue = Integer.parseInt(currentValueString)

        currentValue--
        currentCountTextView.text = currentValue.toString()
    }
}