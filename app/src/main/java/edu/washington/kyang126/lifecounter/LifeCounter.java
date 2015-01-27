package edu.washington.kyang126.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.util.Log;

public class LifeCounter extends ActionBarActivity implements OnClickListener{


static final String STATE_P1 = "player1";
static final String STATE_P2 = "player2";
static final String STATE_P3 = "player3";
static final String STATE_P4 = "player4";
private int life1;
private int life2;
private int life3;
private int life4;
private EditText player1Life;
private EditText player2Life;
private EditText player3Life;
private EditText player4Life;
private EditText loserMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter);


        if (savedInstanceState != null) {
            // Restore value of members from saved state
            life1 = savedInstanceState.getInt(STATE_P1);
            life2 = savedInstanceState.getInt(STATE_P2);
            life3 = savedInstanceState.getInt(STATE_P3);
            life4 = savedInstanceState.getInt(STATE_P4);
        } else {
            // Probably initialize members with default values for a new instance
            life1 = 20;
            life2 = 20;
            life3 = 20;
            life4 = 20;
        }


        player1Life = (EditText) findViewById(R.id.p1Life);
        player2Life = (EditText) findViewById(R.id.p2Life);
        player3Life = (EditText) findViewById(R.id.p3Life);
        player4Life = (EditText) findViewById(R.id.p4Life);
        loserMessage = (EditText) findViewById(R.id.loserText);

        final Button p1AddOne = (Button) findViewById(R.id.add1);
        final Button p1MinusOne = (Button) findViewById(R.id.minus1);
        final Button p1PlusFive = (Button) findViewById(R.id.p1plus5);
        final Button p1MinusFive = (Button) findViewById(R.id.p1minus5);

        p1AddOne.setOnClickListener(this);
        p1MinusOne.setOnClickListener(this);
        p1PlusFive.setOnClickListener(this);
        p1MinusFive.setOnClickListener(this);

        final Button p2AddOne = (Button) findViewById(R.id.add2);
        final Button p2MinusOne = (Button) findViewById(R.id.minus2);
        final Button p2PlusFive = (Button) findViewById(R.id.p2plus5);
        final Button p2MinusFive = (Button) findViewById(R.id.p2minus5);

        p2AddOne.setOnClickListener(this);
        p2MinusOne.setOnClickListener(this);
        p2PlusFive.setOnClickListener(this);
        p2MinusFive.setOnClickListener(this);

        final Button p3AddOne = (Button) findViewById(R.id.add3);
        final Button p3MinusOne = (Button) findViewById(R.id.minus3);
        final Button p3PlusFive = (Button) findViewById(R.id.p3plus5);
        final Button p3MinusFive = (Button) findViewById(R.id.p3minus5);

        p3AddOne.setOnClickListener(this);
        p3MinusOne.setOnClickListener(this);
        p3PlusFive.setOnClickListener(this);
        p3MinusFive.setOnClickListener(this);

        final Button p4AddOne = (Button) findViewById(R.id.add4);
        final Button p4MinusOne = (Button) findViewById(R.id.minus4);
        final Button p4PlusFive = (Button) findViewById(R.id.p4plus5);
        final Button p4MinusFive = (Button) findViewById(R.id.p4minus5);

        p4AddOne.setOnClickListener(this);
        p4MinusOne.setOnClickListener(this);
        p4PlusFive.setOnClickListener(this);
        p4MinusFive.setOnClickListener(this);

    
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.add1){
            life1++;
            player1Life.setText(Integer.toString(life1));
        }
        if (v.getId() == R.id.minus1){
            life1--;
            player1Life.setText(Integer.toString(life1));
        }
        if (v.getId() == R.id.p1plus5){
            life1+=5;
            player1Life.setText(Integer.toString(life1));
        }
        if (v.getId() == R.id.p1minus5){
            life1-=5;
            player1Life.setText(Integer.toString(life1));
        }
        if (v.getId() == R.id.add2){
            life2++;
            player2Life.setText(Integer.toString(life2));
        }
        if (v.getId() == R.id.minus2){
            life2--;
            player2Life.setText(Integer.toString(life2));
        }
        if (v.getId() == R.id.p2plus5){
            life2+=5;
            player2Life.setText(Integer.toString(life2));
        }
        if (v.getId() == R.id.p2minus5){
            life2-=5;
            player2Life.setText(Integer.toString(life2));
        }
        if (v.getId() == R.id.add3){
            life3++;
            player3Life.setText(Integer.toString(life3));
        }
        if (v.getId() == R.id.minus3){
            life3--;
            player3Life.setText(Integer.toString(life3));
        }
        if (v.getId() == R.id.p3plus5){
            life3+=5;
            player3Life.setText(Integer.toString(life3));
        }
        if (v.getId() == R.id.p3minus5){
            life3-=5;
            player3Life.setText(Integer.toString(life3));
        }
        if (v.getId() == R.id.add4){
            life4++;
            player4Life.setText(Integer.toString(life4));
        }
        if (v.getId() == R.id.minus4){
            life4--;
            player4Life.setText(Integer.toString(life4));
        }
        if (v.getId() == R.id.p4plus5){
            life4+=5;
            player4Life.setText(Integer.toString(life4));
        }
        if (v.getId() == R.id.p4minus5){
            life4-=5;
            player4Life.setText(Integer.toString(life4));
        }
        if (life1 <= 0){
            loserMessage.setText("Player 1 LOSES!");
        }
        if (life2 <= 0){
            loserMessage.setText("Player 2 LOSES!");
        }
        if (life3 <= 0){
            loserMessage.setText("Player 3 LOSES!");
        }
        if (life4 <= 0){
            loserMessage.setText("Player 4 LOSES!");
        }

    }



    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(STATE_P1, life1);
        savedInstanceState.putInt(STATE_P2, life2);
        savedInstanceState.putInt(STATE_P3, life3);
        savedInstanceState.putInt(STATE_P4, life4);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_life_counter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
