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

    int opponentsHandForTeamA = 0;
    int opponentsHandForTeamB = 0;

    Button handEndedForTeamA;
    LinearLayout whenGameEndsTeamAWins;
    LinearLayout whenGameEndsTeamALost;
    LinearLayout dominoPilesSelectionTeamA;
    LinearLayout dominoPilesSelectionTeamB;

    Button handEndedForTeamB;
    LinearLayout whenGameEndsTeamBWins;
    LinearLayout whenGameEndsTeamBLost;

    Button nextRoundButton;

    // Image view declaration for Team A domino Tiles
    ImageView teamADominoTile00;
    ImageView teamADominoTile01;
    ImageView teamADominoTile02;
    ImageView teamADominoTile03;
    ImageView teamADominoTile04;
    ImageView teamADominoTile05;
    ImageView teamADominoTile06;
    ImageView teamADominoTile11;
    ImageView teamADominoTile12;
    ImageView teamADominoTile13;
    ImageView teamADominoTile14;
    ImageView teamADominoTile15;
    ImageView teamADominoTile16;
    ImageView teamADominoTile22;
    ImageView teamADominoTile23;
    ImageView teamADominoTile24;
    ImageView teamADominoTile25;
    ImageView teamADominoTile26;
    ImageView teamADominoTile33;
    ImageView teamADominoTile34;
    ImageView teamADominoTile35;
    ImageView teamADominoTile36;
    ImageView teamADominoTile44;
    ImageView teamADominoTile45;
    ImageView teamADominoTile46;
    ImageView teamADominoTile55;
    ImageView teamADominoTile56;
    ImageView teamADominoTile66;


    // OnclickListener for Team A domino tiles after the hand is finished and the time collectiong opponent's hand comes.
    View.OnClickListener teamADominoTileListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.team_a_tile_00) {
                Toast.makeText(MainActivity.this, "00 is pressed", Toast.LENGTH_SHORT).show();
            }

            switch(v.getId()) {
                case R.id.team_a_tile_00:
                    Log.e("Tiles ", "00 is pressed");
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 00 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_01:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 01 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_02:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 02 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_03:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 03 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_04:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 04 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_05:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 05 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_06:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 06 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_11:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 11 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_12:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 12 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_13:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 13 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_14:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 14 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_15:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 15 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_16:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 16 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_22:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 22 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_23:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 23 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_24:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 24 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_25:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 25 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_26:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 26 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_33:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 33 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_34:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 34 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_35:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 35 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_36:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 36 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_44:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 44 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_45:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 45 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_46:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 46 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_55:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 55 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_a_tile_56:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 56 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_a_tile_66:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_a_tile_ 66 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
            }

        }
    };


    // Image view declaration for Team B domino Tiles
    ImageView teamBDominoTile00;
    ImageView teamBDominoTile01;
    ImageView teamBDominoTile02;
    ImageView teamBDominoTile03;
    ImageView teamBDominoTile04;
    ImageView teamBDominoTile05;
    ImageView teamBDominoTile06;
    ImageView teamBDominoTile11;
    ImageView teamBDominoTile12;
    ImageView teamBDominoTile13;
    ImageView teamBDominoTile14;
    ImageView teamBDominoTile15;
    ImageView teamBDominoTile16;
    ImageView teamBDominoTile22;
    ImageView teamBDominoTile23;
    ImageView teamBDominoTile24;
    ImageView teamBDominoTile25;
    ImageView teamBDominoTile26;
    ImageView teamBDominoTile33;
    ImageView teamBDominoTile34;
    ImageView teamBDominoTile35;
    ImageView teamBDominoTile36;
    ImageView teamBDominoTile44;
    ImageView teamBDominoTile45;
    ImageView teamBDominoTile46;
    ImageView teamBDominoTile55;
    ImageView teamBDominoTile56;
    ImageView teamBDominoTile66;

    // OnclickListener for Team B domino tiles after the hand is finished and the time collectiong opponent's hand comes.
    View.OnClickListener teamBDominoTileListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.team_b_tile_00) {
                Toast.makeText(MainActivity.this, "00 is pressed", Toast.LENGTH_SHORT).show();
            }

            switch(v.getId()) {
                case R.id.team_b_tile_00:
                    Log.e("Tiles ", "00 is pressed");
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 00 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_01:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 01 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_02:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 02 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_03:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 03 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_04:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 04 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_05:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 05 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_06:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 06 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_11:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 11 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_12:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 12 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_13:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 13 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_14:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 14 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_15:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 15 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_16:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 16 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_22:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 22 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_23:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 23 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_24:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 24 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_25:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 25 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_26:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 26 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_33:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 33 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_34:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 34 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_35:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 35 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_36:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 36 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_44:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 44 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_45:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 45 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_46:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 46 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_55:
                    //Inform the user the button1 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 55 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
                case R.id.team_b_tile_56:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 56 is clicker", Toast.LENGTH_SHORT ).show();                    break;
                case R.id.team_b_tile_66:
                    //Inform the user the button2 has been clicked
                    Toast.makeText( MainActivity.this, "team_b_tile_ 66 is clicker", Toast.LENGTH_SHORT ).show();
                    break;
            }

        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayRoundScoreForTeamA(0);

        // It will be used to go to the next round
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
                winnerTeamACollectsOpponentsHand();

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
                winnerTeamBCollectsOpponentsHand();

            }
        });



        // Team A views, objects, listeners

        // Assigning the view ids of the domino tile images of Team A to view objects.
        teamADominoTile00 = findViewById( R.id.team_a_tile_00 );
        teamADominoTile01 = findViewById( R.id.team_a_tile_01 );
        teamADominoTile02 = findViewById( R.id.team_a_tile_02 );
        teamADominoTile03 = findViewById( R.id.team_a_tile_03 );
        teamADominoTile04 = findViewById( R.id.team_a_tile_04 );
        teamADominoTile05 = findViewById( R.id.team_a_tile_05 );
        teamADominoTile06 = findViewById( R.id.team_a_tile_06 );
        teamADominoTile11 = findViewById( R.id.team_a_tile_11 );
        teamADominoTile12 = findViewById( R.id.team_a_tile_12 );
        teamADominoTile13 = findViewById( R.id.team_a_tile_13 );
        teamADominoTile14 = findViewById( R.id.team_a_tile_14 );
        teamADominoTile15 = findViewById( R.id.team_a_tile_15 );
        teamADominoTile16 = findViewById( R.id.team_a_tile_16 );
        teamADominoTile22 = findViewById( R.id.team_a_tile_22 );
        teamADominoTile23 = findViewById( R.id.team_a_tile_23 );
        teamADominoTile24 = findViewById( R.id.team_a_tile_24 );
        teamADominoTile25 = findViewById( R.id.team_a_tile_25 );
        teamADominoTile26 = findViewById( R.id.team_a_tile_26 );
        teamADominoTile33 = findViewById( R.id.team_a_tile_33 );
        teamADominoTile34 = findViewById( R.id.team_a_tile_34 );
        teamADominoTile35 = findViewById( R.id.team_a_tile_35 );
        teamADominoTile36 = findViewById( R.id.team_a_tile_36 );
        teamADominoTile44 = findViewById( R.id.team_a_tile_44 );
        teamADominoTile45 = findViewById( R.id.team_a_tile_45 );
        teamADominoTile46 = findViewById( R.id.team_a_tile_46 );
        teamADominoTile55 = findViewById( R.id.team_a_tile_55 );
        teamADominoTile56 = findViewById( R.id.team_a_tile_56 );
        teamADominoTile66 = findViewById( R.id.team_a_tile_66 );

        // Assigning teamADominoTileListener to domino tile image view of the Team A
        teamADominoTile00.setOnClickListener( teamADominoTileListener);
        teamADominoTile01.setOnClickListener( teamADominoTileListener);
        teamADominoTile02.setOnClickListener( teamADominoTileListener);
        teamADominoTile03.setOnClickListener( teamADominoTileListener);
        teamADominoTile04.setOnClickListener( teamADominoTileListener);
        teamADominoTile05.setOnClickListener( teamADominoTileListener);
        teamADominoTile06.setOnClickListener( teamADominoTileListener);
        teamADominoTile11.setOnClickListener( teamADominoTileListener);
        teamADominoTile12.setOnClickListener( teamADominoTileListener);
        teamADominoTile13.setOnClickListener( teamADominoTileListener);
        teamADominoTile14.setOnClickListener( teamADominoTileListener);
        teamADominoTile15.setOnClickListener( teamADominoTileListener);
        teamADominoTile16.setOnClickListener( teamADominoTileListener);
        teamADominoTile22.setOnClickListener( teamADominoTileListener);
        teamADominoTile23.setOnClickListener( teamADominoTileListener);
        teamADominoTile24.setOnClickListener( teamADominoTileListener);
        teamADominoTile25.setOnClickListener( teamADominoTileListener);
        teamADominoTile26.setOnClickListener( teamADominoTileListener);
        teamADominoTile33.setOnClickListener( teamADominoTileListener);
        teamADominoTile34.setOnClickListener( teamADominoTileListener);
        teamADominoTile35.setOnClickListener( teamADominoTileListener);
        teamADominoTile36.setOnClickListener( teamADominoTileListener);
        teamADominoTile44.setOnClickListener( teamADominoTileListener);
        teamADominoTile45.setOnClickListener( teamADominoTileListener);
        teamADominoTile46.setOnClickListener( teamADominoTileListener);
        teamADominoTile55.setOnClickListener( teamADominoTileListener);
        teamADominoTile56.setOnClickListener( teamADominoTileListener);
        teamADominoTile66.setOnClickListener( teamADominoTileListener);


        // Team B view, objects, listeners

        // Assigning the view ids of the domino tile images of Team B to view objects.
        teamBDominoTile00 = findViewById( R.id.team_b_tile_00 );
        teamBDominoTile01 = findViewById( R.id.team_b_tile_01 );
        teamBDominoTile02 = findViewById( R.id.team_b_tile_02 );
        teamBDominoTile03 = findViewById( R.id.team_b_tile_03 );
        teamBDominoTile04 = findViewById( R.id.team_b_tile_04 );
        teamBDominoTile05 = findViewById( R.id.team_b_tile_05 );
        teamBDominoTile06 = findViewById( R.id.team_b_tile_06 );
        teamBDominoTile11 = findViewById( R.id.team_b_tile_11 );
        teamBDominoTile12 = findViewById( R.id.team_b_tile_12 );
        teamBDominoTile13 = findViewById( R.id.team_b_tile_13 );
        teamBDominoTile14 = findViewById( R.id.team_b_tile_14 );
        teamBDominoTile15 = findViewById( R.id.team_b_tile_15 );
        teamBDominoTile16 = findViewById( R.id.team_b_tile_16 );
        teamBDominoTile22 = findViewById( R.id.team_b_tile_22 );
        teamBDominoTile23 = findViewById( R.id.team_b_tile_23 );
        teamBDominoTile24 = findViewById( R.id.team_b_tile_24 );
        teamBDominoTile25 = findViewById( R.id.team_b_tile_25 );
        teamBDominoTile26 = findViewById( R.id.team_b_tile_26 );
        teamBDominoTile33 = findViewById( R.id.team_b_tile_33 );
        teamBDominoTile34 = findViewById( R.id.team_b_tile_34 );
        teamBDominoTile35 = findViewById( R.id.team_b_tile_35 );
        teamBDominoTile36 = findViewById( R.id.team_b_tile_36 );
        teamBDominoTile44 = findViewById( R.id.team_b_tile_44 );
        teamBDominoTile45 = findViewById( R.id.team_b_tile_45 );
        teamBDominoTile46 = findViewById( R.id.team_b_tile_46 );
        teamBDominoTile55 = findViewById( R.id.team_b_tile_55 );
        teamBDominoTile56 = findViewById( R.id.team_b_tile_56 );
        teamBDominoTile66 = findViewById( R.id.team_b_tile_66 );

        // Assigning teamBDominoTileListener to domino tile image view of the Team A
        teamBDominoTile00.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile01.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile02.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile03.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile04.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile05.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile06.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile11.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile12.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile13.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile14.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile15.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile16.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile22.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile23.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile24.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile25.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile26.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile33.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile34.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile35.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile36.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile44.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile45.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile46.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile55.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile56.setOnClickListener( teamBDominoTileListener);
        teamBDominoTile66.setOnClickListener( teamBDominoTileListener);

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
        TextView scoreView = (TextView) findViewById(R.id.team_a_round_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given round score for Team B.
     */
    public void displayRoundScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_round_score);
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
        nextRoundButton.setVisibility( View.VISIBLE );
    }

    public void winnerTeamBCollectsOpponentsHand(){
        nextRoundButton.setVisibility( View.VISIBLE );
    }
}
