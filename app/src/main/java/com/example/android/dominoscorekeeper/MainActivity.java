package com.example.android.dominoscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.dominoscorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int roundScoreTeamA = 0;
    int roundScoreTeamB = 0;

    int totalScoreTeamA = 0;
    int totalScoreTeamB = 0;

    Button handEndedForTeamA;
    LinearLayout whenGameEndsTeamAWins;
    LinearLayout whenGameEndsTeamALost;
    LinearLayout dominoPilesSelectionTeamA;
    LinearLayout dominoPilesSelectionTeamB;

    Button handEndedForTeamB;
    LinearLayout whenGameEndsTeamBWins;
    LinearLayout whenGameEndsTeamBLost;

    Button nextRoundButton;

    ImageView dominoTile00 = findViewById( R.id.tile00 );
    ImageView dominoTile01 = findViewById( R.id.tile01 );
    ImageView dominoTile02 = findViewById( R.id.tile02 );
    ImageView dominoTile03 = findViewById( R.id.tile03 );
    ImageView dominoTile04 = findViewById( R.id.tile04 );
    ImageView dominoTile05 = findViewById( R.id.tile05 );
    ImageView dominoTile06 = findViewById( R.id.tile06 );
    ImageView dominoTile11 = findViewById( R.id.tile11 );
    ImageView dominoTile12 = findViewById( R.id.tile12 );
    ImageView dominoTile13 = findViewById( R.id.tile13 );
    ImageView dominoTile14 = findViewById( R.id.tile14 );
    ImageView dominoTile15 = findViewById( R.id.tile15 );
    ImageView dominoTile16 = findViewById( R.id.tile16 );
    ImageView dominoTile22 = findViewById( R.id.tile22 );
    ImageView dominoTile23 = findViewById( R.id.tile23 );
    ImageView dominoTile24 = findViewById( R.id.tile24 );
    ImageView dominoTile25 = findViewById( R.id.tile25 );
    ImageView dominoTile26 = findViewById( R.id.tile26 );
    ImageView dominoTile33 = findViewById( R.id.tile33 );
    ImageView dominoTile34 = findViewById( R.id.tile34 );
    ImageView dominoTile35 = findViewById( R.id.tile35 );
    ImageView dominoTile36 = findViewById( R.id.tile36 );
    ImageView dominoTile44 = findViewById( R.id.tile44 );
    ImageView dominoTile45 = findViewById( R.id.tile45 );
    ImageView dominoTile46 = findViewById( R.id.tile46 );
    ImageView dominoTile55 = findViewById( R.id.tile55 );
    ImageView dominoTile56 = findViewById( R.id.tile56 );
    ImageView dominoTile66 = findViewById( R.id.tile66 );

    View.OnClickListener dominoTileListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.tile00) {
                Toast.makeText(MainActivity.this, "00 is pressed", Toast.LENGTH_SHORT).show();
            }

            if(v.getId() == R.id.tile01) {
                Toast.makeText(MainActivity.this, "01 is pressed", Toast.LENGTH_SHORT).show();
            }

            if(v.getId() == R.id.tile02) {
                Toast.makeText(MainActivity.this, "02 is pressed", Toast.LENGTH_SHORT).show();
            }

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayRoundScoreForTeamA(0);

        nextRoundButton = findViewById(R.id.next_round_button);
        nextRoundButton.setVisibility(View.GONE);

        // This if statement check win team is winning the game.
        if(roundScoreTeamA > roundScoreTeamB){
            Toast.makeText(this, "Team A wins!", Toast.LENGTH_SHORT).show();
        } else if(roundScoreTeamA < roundScoreTeamB) {
            Toast.makeText(this, "Team B wins!", Toast.LENGTH_SHORT).show();
        }

        // Team A staffs
        handEndedForTeamA = findViewById(R.id.hand_ended_for_teamA);

        whenGameEndsTeamAWins = findViewById(R.id.when_round_ends_teamA_wins);
        whenGameEndsTeamAWins.setVisibility(View.GONE);


        whenGameEndsTeamALost = findViewById(R.id.when_round_ends_teamA_lost);
        whenGameEndsTeamALost.setVisibility(View.GONE);

        dominoPilesSelectionTeamA = findViewById(R.id.domino_piles_selection_teamA);
        dominoPilesSelectionTeamA.setVisibility(View.GONE);

        handEndedForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("Hand Ended TeamA ", "Appearance changes to ties layout for A");
                Toast.makeText(MainActivity.this, "Hand ended for Team A", Toast.LENGTH_SHORT).show();

                whenGameEndsTeamAWins.setVisibility(View.VISIBLE);
                whenGameEndsTeamBLost.setVisibility(View.VISIBLE);

                handEndedForTeamA.setVisibility(View.GONE);
                handEndedForTeamB.setVisibility(View.GONE);

                dominoPilesSelectionTeamA.setVisibility(View.VISIBLE);

            }
        });


        //Team B staffs
        handEndedForTeamB = findViewById(R.id.hand_ended_for_teamB);

        whenGameEndsTeamBWins = findViewById(R.id.when_round_ends_teamB_wins);
        whenGameEndsTeamBWins.setVisibility(View.GONE);

        whenGameEndsTeamBLost = findViewById(R.id.when_round_ends_teamB_lost);
        whenGameEndsTeamBLost.setVisibility(View.GONE);

        dominoPilesSelectionTeamB = findViewById(R.id.domino_piles_selection_teamB);
        dominoPilesSelectionTeamB.setVisibility(View.GONE);

        handEndedForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("Hand Ended TeamB ", "Appearance changes to ties layout for B");
                Toast.makeText(MainActivity.this, "Hand ended for Team B", Toast.LENGTH_SHORT).show();

                whenGameEndsTeamBWins.setVisibility(View.VISIBLE);
                whenGameEndsTeamALost.setVisibility(View.VISIBLE);

                handEndedForTeamA.setVisibility(View.GONE);
                handEndedForTeamB.setVisibility(View.GONE);

                dominoPilesSelectionTeamB.setVisibility(View.VISIBLE);

            }
        });

        dominoTile00.setOnClickListener( dominoTileListener);
        dominoTile01.setOnClickListener( dominoTileListener);
        dominoTile02.setOnClickListener( dominoTileListener);
        dominoTile03.setOnClickListener( dominoTileListener);
        dominoTile04.setOnClickListener( dominoTileListener);
        dominoTile05.setOnClickListener( dominoTileListener);
        dominoTile06.setOnClickListener( dominoTileListener);
        dominoTile11.setOnClickListener( dominoTileListener);
        dominoTile12.setOnClickListener( dominoTileListener);
        dominoTile13.setOnClickListener( dominoTileListener);
        dominoTile14.setOnClickListener( dominoTileListener);
        dominoTile15.setOnClickListener( dominoTileListener);
        dominoTile16.setOnClickListener( dominoTileListener);
        dominoTile22.setOnClickListener( dominoTileListener);
        dominoTile23.setOnClickListener( dominoTileListener);
        dominoTile24.setOnClickListener( dominoTileListener);
        dominoTile25.setOnClickListener( dominoTileListener);
        dominoTile26.setOnClickListener( dominoTileListener);
        dominoTile33.setOnClickListener( dominoTileListener);
        dominoTile34.setOnClickListener( dominoTileListener);
        dominoTile35.setOnClickListener( dominoTileListener);
        dominoTile36.setOnClickListener( dominoTileListener);
        dominoTile44.setOnClickListener( dominoTileListener);
        dominoTile45.setOnClickListener( dominoTileListener);
        dominoTile46.setOnClickListener( dominoTileListener);
        dominoTile55.setOnClickListener( dominoTileListener);
        dominoTile56.setOnClickListener( dominoTileListener);
        dominoTile66.setOnClickListener( dominoTileListener);

    }

    // calculation and display for team A

    public void addFiveForTeamA(View v){
        roundScoreTeamA +=5;
        totalScoreTeamA +=5;
        displayRoundScoreForTeamA(roundScoreTeamA);
        displayTotalScoreForTeamA(totalScoreTeamA);
    }

    public void addTenForTeamA(View v){
        roundScoreTeamA +=10;
        totalScoreTeamA +=10;
        displayRoundScoreForTeamA(roundScoreTeamA);
        displayTotalScoreForTeamA(totalScoreTeamA);
    }

    public void addFifteenForTeamA(View v){
        roundScoreTeamA +=15;
        totalScoreTeamA +=15;
        displayRoundScoreForTeamA(roundScoreTeamA);
        displayTotalScoreForTeamA(totalScoreTeamA);
    }

    public void addTwentyForTeamA(View v){
        roundScoreTeamA +=20;
        totalScoreTeamA +=20;
        displayRoundScoreForTeamA(roundScoreTeamA);
        displayTotalScoreForTeamA(totalScoreTeamA);
    }
    // calculation and display for team B

    public void addFiveForTeamB(View v){
        roundScoreTeamB +=5;
        totalScoreTeamB +=5;
        displayRoundScoreForTeamB(roundScoreTeamB);
        displayTotalScoreForTeamB(totalScoreTeamB);
    }

    public void addTenForTeamB(View v){
        roundScoreTeamB +=10;
        totalScoreTeamB +=10;
        displayRoundScoreForTeamB(roundScoreTeamB);
        displayTotalScoreForTeamB(totalScoreTeamB);
    }

    public void addFifteenForTeamB(View v){
        roundScoreTeamB +=15;
        totalScoreTeamB +=15;
        displayRoundScoreForTeamB(roundScoreTeamB);
        displayTotalScoreForTeamB(totalScoreTeamB);
    }

    public void addTwentyForTeamB(View v){
        roundScoreTeamB +=20;
        totalScoreTeamB +=20;
        displayRoundScoreForTeamB(roundScoreTeamB);
        displayTotalScoreForTeamB(totalScoreTeamB);
    }

    // reset function
    public void resetAll( View v){
        roundScoreTeamA = 0;
        roundScoreTeamB = 0;
        displayRoundScoreForTeamA(roundScoreTeamA);
        displayRoundScoreForTeamB(roundScoreTeamB);
        handEndedForTeamA.setVisibility(View.VISIBLE);
        handEndedForTeamB.setVisibility(View.VISIBLE);
        whenGameEndsTeamAWins.setVisibility(View.GONE);
        whenGameEndsTeamALost.setVisibility(View.GONE);
        whenGameEndsTeamBWins.setVisibility(View.GONE);
        whenGameEndsTeamBLost.setVisibility(View.GONE);
        dominoPilesSelectionTeamA.setVisibility(View.GONE);
        dominoPilesSelectionTeamB.setVisibility(View.GONE);
    }


    /**
     * Displays the given round score for Team A.
     */
    public void displayRoundScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given round score for Team B.
     */
    public void displayRoundScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given the total score for Team A.
     */
    public void displayTotalScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_total_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given the total score for Team B.
     */
    public void displayTotalScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_total_score);
        scoreView.setText(String.valueOf(score));
    }

    public void winnerTeamACollectsOpponentsHand(){

    }
}
