package com.minervamendoza.quidditchscoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import static com.minervamendoza.quidditchscoreboard.R.menu.menu_main;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Dropdown menu for Team A
         */

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        // ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.houses_array, android.R.layout.simple_spinner_item);
        // The layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Applies the adapter to the spinner
        spinner1.setAdapter(adapter1);

        /**
         * Dropdown menu for Team B
         */
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        // ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.houses_array, android.R.layout.simple_spinner_item);
        // The layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Applies the adapter to the spinner
        spinner2.setAdapter(adapter2);
    }

    /**
     * Increase the score for Team A by 10 points.
     */
    public void addTenForTeamA(View v) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 150 points.
     */
    public void addOneFiftyForTeamA(View v) {
        scoreTeamA = scoreTeamA + 150;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 10 points.
     */
    public void addTenForTeamB(View v) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 150 points.
     */
    public void addOneFiftyForTeamB(View v) {
        scoreTeamB = scoreTeamB + 150;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
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