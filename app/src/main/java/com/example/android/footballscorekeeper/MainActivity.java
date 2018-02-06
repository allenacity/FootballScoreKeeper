package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore;
    int awayScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu; this adds imtems to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button, so long
        //as you specify a parent activity in AndroidManifest.xml
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id== R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 6 points
     */
    public void addTDForTeamA(View v){
        homeScore += 6;
        displayForTeamA(homeScore);
    }

    /**
     * Increase the score for Team A by 1 points
     */
    public void addPATForTeamA(View v){
        homeScore += 1;
        displayForTeamA(homeScore);
    }

    /**
     * Increase the score for Team A by 2 points
     */
    public void add2ptForTeamA(View v){
        homeScore +=2;
        displayForTeamA(homeScore);
    }

    /**
     * Increase the score for Team A by 2 points
     */
    public void addFieldGoalForTeamA(View v){
        homeScore += 3;
        displayForTeamA(homeScore);
    }

    private void displayForTeamA(int homeScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(homeScore));
    }

    /**
     * Increase the score for Team B by 6 points
     */
    public void addTDForTeamB(View v){
        awayScore += 6;
        displayForTeamB(awayScore);
    }

    /**
     * Increase the score for Team B by 1 points
     */
    public void addPATForTeamB(View v){
        awayScore += 1;
        displayForTeamB(awayScore);
    }

    /**
     * Increase the score for Team B by 2 points
     */
    public void add2ptForTeamB(View v){
        awayScore +=2;
        displayForTeamB(awayScore);
    }

    /**
     * Increase the score for Team B by 2 points
     */
    public void addFieldGoalForTeamB(View v){
        awayScore += 3;
        displayForTeamB(awayScore);
    }

    private void displayForTeamB(int awayScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(awayScore));
    }

    /**
     * Resets the score to zero.
     */
    public void scoreReset (View v){
        homeScore = 0;
        awayScore = 0;
        displayForTeamA(homeScore);
        displayForTeamB(awayScore);
    }
}
