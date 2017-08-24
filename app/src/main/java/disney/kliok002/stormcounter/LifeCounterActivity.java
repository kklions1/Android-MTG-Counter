package disney.kliok002.stormcounter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kliok002 on 8/1/17.
 */

public class LifeCounterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter);


        Button playerIncrementLifeTotalButton = (Button) findViewById(R.id.player_life_increment);
        Button playerDecrementLifeTotalButton = (Button) findViewById(R.id.player_life_decrement);

        Button opponentIncrementLifeTotalButton = (Button) findViewById(R.id.opponent_life_increment);
        Button opponentDecrementLifeTotalButton = (Button) findViewById(R.id.opponent_life_decrement);

        playerIncrementLifeTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementLifeTotal(R.id.player_life_total);
            }
        });

        playerDecrementLifeTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementLifeTotal(R.id.player_life_total);
            }
        });

        opponentIncrementLifeTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementLifeTotal(R.id.opponent_life_total);
            }
        });

        opponentDecrementLifeTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementLifeTotal(R.id.opponent_life_total);
            }
        });
    }

    private void incrementLifeTotal(@IdRes int player) {
            TextView currentCountTextView = (TextView) findViewById(player);
            String currentValueString = currentCountTextView.getText().toString();
            int currentValue = Integer.parseInt(currentValueString);

            currentValue++;
            currentCountTextView.setText(String.valueOf(currentValue));
        }


    private void decrementLifeTotal(@IdRes int player) {
        TextView currentCountTextView = (TextView) findViewById(player);
        String currentValueString = currentCountTextView.getText().toString();
        int currentValue = Integer.parseInt(currentValueString);

        currentValue--;
        currentCountTextView.setText(String.valueOf(currentValue));
    }



}

