package disney.kliok002.stormcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kliok002 on 8/1/17.
 */

public class LifeCounterActivity extends AppCompatActivity {

    private TextView playerLifeTotalTextView;
    private Button playerIncrementLifeTotalButton;
    private Button playerDecrementLifeTotalButton;
    private Button opponentIncrementLifeTotalButton;
    private Button opponentDecrementLifeTotalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter);

        playerLifeTotalTextView = (TextView) findViewById(R.id.player_life_total);

        playerIncrementLifeTotalButton = (Button) findViewById(R.id.player_life_increment);
        playerDecrementLifeTotalButton = (Button) findViewById(R.id.player_life_decrement);

        opponentIncrementLifeTotalButton = (Button) findViewById(R.id.player_life_increment);
        opponentDecrementLifeTotalButton = (Button) findViewById(R.id.opponent_life_decrement);

    }
}
