package disney.kliok002.stormcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kliok002 on 8/1/17.
 */

public class CounterAppLandingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_screen);


        Button launchLifeCounter = (Button) findViewById(R.id.launch_life_counter);
        launchLifeCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CounterAppLandingActivity.this, LifeCounterActivity.class);
                startActivity(intent);
            }
        });

        Button launchStormCounter = (Button) findViewById(R.id.launch_storm_counter);
        launchStormCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CounterAppLandingActivity.this, StormCounterActivity.class);
                startActivity(intent);
            }
        });
    }



}

