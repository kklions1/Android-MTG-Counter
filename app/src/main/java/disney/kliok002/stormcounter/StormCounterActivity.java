package disney.kliok002.stormcounter;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StormCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storm_counter);

        Button incrementStorm = (Button)findViewById(R.id.storm_count_increment_button);
        incrementStorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            incrementValue(R.id.storm_count_current);
            }
        });


        Button incrementBlue = (Button) findViewById(R.id.blue_mana_increment);
        incrementBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementValue(R.id.blue_mana_current);
            }
        });

        Button decrementBlue = (Button) findViewById(R.id.blue_mana_decrement);
        decrementBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementValue(R.id.blue_mana_current);
            }
        });

        Button incrementRed = (Button) findViewById(R.id.red_mana_increment);
        incrementRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementValue(R.id.red_mana_current);
            }
        });

        Button decrementRed = (Button) findViewById(R.id.red_mana_decrement);
        decrementRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementValue(R.id.red_mana_current);
            }
        });

    }

    private void incrementValue(@IdRes int resId) {
        TextView currentCountTextView = (TextView) findViewById(resId);
        String currentValueString = currentCountTextView.getText().toString();
        int currentValue = Integer.parseInt(currentValueString);

        currentValue++;
        currentCountTextView.setText(String.valueOf(currentValue));

    }

    private void decrementValue(@IdRes int resId) {
        TextView currentCountTextView = (TextView) findViewById(resId);
        String currentValueString = currentCountTextView.getText().toString();
        int currentValue = Integer.parseInt(currentValueString);

        currentValue--;
        currentCountTextView.setText(String.valueOf(currentValue));
    }


}
