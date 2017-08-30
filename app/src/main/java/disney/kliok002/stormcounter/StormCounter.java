package disney.kliok002.stormcounter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;

/**
 * To be the main activity screen for the application, only counts red and blue mana
 * as well as storm count
 * @author Kevin Klions
 */

public class StormCounter extends Activity {

    private Space stormMinus;
    private Space stormPlus;
    private Space blueMinus;
    private Space bluePlus;
    private Space redMinus;
    private Space redPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mana_counter_screen);

        stormMinus = findViewById(R.id.storm_minus);
        stormPlus = findViewById(R.id.storm_plus);
        blueMinus = findViewById(R.id.blue_minus);
        bluePlus = findViewById(R.id.blue_plus);
        redMinus = findViewById(R.id.red_minus);
        redPlus = findViewById(R.id.red_plus);


        stormMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementValue(R.id.storm_count)
            }
        });

        stormPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementValue(R.id.);
            }
        });
        blueMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementValue(R.id.)
            }
        });
        bluePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementValue(R.id.);
            }
        });
        redMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementValue(R.id.)
            }
        });
        redPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementValue(R.id.);
            }
        });
    }

    private void incrementValue(@IdRes int resId) {
        TextView currentCountTextView = findViewById(resId);
        String currentValueString = currentCountTextView.getText().toString();
        int currentValue = Integer.parseInt(currentValueString);

        currentValue++;
        currentCountTextView.setText(String.valueOf(currentValue));

    }

    private void decrementValue(@IdRes int resId) {
        TextView currentCountTextView = findViewById(resId);
        String currentValueString = currentCountTextView.getText().toString();
        int currentValue = Integer.parseInt(currentValueString);

        currentValue--;
        currentCountTextView.setText(String.valueOf(currentValue));
    }
}