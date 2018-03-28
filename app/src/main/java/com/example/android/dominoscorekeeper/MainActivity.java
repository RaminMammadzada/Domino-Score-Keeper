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

    ImageView tile00;
    ImageView tile01;
    ImageView tile02;
    ImageView tile03;
    ImageView tile04;
    ImageView tile05;
    ImageView tile06;
    ImageView tile11;
    ImageView tile12;
    ImageView tile13;
    ImageView tile14;
    ImageView tile15;
    ImageView tile16;
    ImageView tile22;
    ImageView tile23;
    ImageView tile24;
    ImageView tile25;
    ImageView tile26;
    ImageView tile33;
    ImageView tile34;
    ImageView tile35;
    ImageView tile36;
    ImageView tile44;
    ImageView tile45;
    ImageView tile46;
    ImageView tile55;
    ImageView tile56;
    ImageView tile66;




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
