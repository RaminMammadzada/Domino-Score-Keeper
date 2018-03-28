package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.dominoscorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    Button handEndedForTeamA;
    LinearLayout whenGameEndsTeamAWins;
    LinearLayout whenGameEndsTeamALost;
    LinearLayout dominoPilesSelectionTeamA;
    LinearLayout dominoPilesSelectionTeamB;

    Button handEndedForTeamB;
    LinearLayout whenGameEndsTeamBWins;
    LinearLayout whenGameEndsTeamBLost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);

        // This if statement check win team is winning the game.
        if(scoreTeamA > scoreTeamB){
            Toast.makeText(this, "Team A wins!", Toast.LENGTH_SHORT).show();
        } else if(scoreTeamA < scoreTeamB) {
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
        scoreTeamA +=5;
        displayForTeamA(scoreTeamA);
    }

    public void addTenForTeamA(View v){
        scoreTeamA +=10;
        displayForTeamA(scoreTeamA);
    }

    public void addFifteenForTeamA(View v){
        scoreTeamA +=15;
        displayForTeamA(scoreTeamA);
    }

    public void addTwentyForTeamA(View v){
        scoreTeamA +=20;
        displayForTeamA(scoreTeamA);
    }
    // calculation and display for team B

    public void addFiveForTeamB(View v){
        scoreTeamB +=5;
        displayForTeamB(scoreTeamB);
    }

    public void addTenForTeamB(View v){
        scoreTeamB +=10;
        displayForTeamB(scoreTeamB);
    }

    public void addFifteenForTeamB(View v){
        scoreTeamB +=15;
        displayForTeamB(scoreTeamB);
    }

    public void addTwentyForTeamB(View v){
        scoreTeamB +=20;
        displayForTeamB(scoreTeamB);
    }

    // reset function
    public void resetAll( View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
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
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
