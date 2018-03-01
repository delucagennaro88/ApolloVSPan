package com.example.utente.counterapp_definitive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreApollo = 0;
    int intensityApollo =0;
    int melodyApollo =0;
    int harmonyApollo = 0;
    int rhythmApollo = 0;
    int scorePan = 0;
    int intensityPan =0;
    int melodyPan =0;
    int harmonyPan = 0;
    int rhythmPan= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void givePraiseToApollo (View v){
        scoreApollo = scoreApollo + 1;
        displayPraiseforApollo(scoreApollo);
    }

    private void displayPraiseforApollo (int score){
        TextView scoreView = findViewById(R.id.apollo_music);
        scoreView.setText(String.valueOf(score));
    }

    public void addIntensePraiseToA (View v){
        intensityApollo = intensityApollo + 1;
        displayIntensityforA(intensityApollo);
    }

    private void displayIntensityforA (int score){
        TextView scoreView = findViewById(R.id.apollo_i_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addMelodicPraiseToA (View v){
        melodyApollo = melodyApollo + 2;
        displayMelodyforA(melodyApollo);
    }

    private void displayMelodyforA (int score){
        TextView scoreView = findViewById(R.id.apollo_m_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addHarmonicPraiseToA (View v){
        harmonyApollo = harmonyApollo + 2;
        displayHarmonyforA(harmonyApollo);
    }

    private void displayHarmonyforA (int score){
        TextView scoreView = findViewById(R.id.apollo_h_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addRythmicPraiseToA (View v){
        rhythmApollo = rhythmApollo + 3;
        displayRhythmforA(rhythmApollo);
    }

    private void displayRhythmforA (int score) {
        TextView scoreView = findViewById(R.id.apollo_r_score);
        scoreView.setText(String.valueOf(score));
    }

    public void givePraiseToPan (View v){
        scorePan = scorePan + 1;
        displayPraiseforPan(scorePan);
    }

    private void displayPraiseforPan (int score){
        TextView scoreView = findViewById(R.id.pan_music);
        scoreView.setText(String.valueOf(score));
    }

    public void addIntensePraiseToP (View v){
        intensityPan = intensityPan + 1;
        displayIntensityforP(intensityPan);
    }

    private void displayIntensityforP (int score){
        TextView scoreView = findViewById(R.id.pan_i_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addMelodicPraiseToP (View v){
        melodyPan = melodyPan + 2;
        displayMelodyforP(melodyPan);
    }

    private void displayMelodyforP (int score){
        TextView scoreView = findViewById(R.id.pan_m_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addHarmonicPraiseToP (View v){
        harmonyPan = harmonyPan + 2;
        displayHarmonyforP(harmonyPan);
    }

    private void displayHarmonyforP (int score){
        TextView scoreView = findViewById(R.id.pan_h_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addRhytmicPraiseToP (View v){
        rhythmPan = rhythmPan + 3;
        displayRhythmforP(rhythmPan);
    }

    private void displayRhythmforP (int score) {
        TextView scoreView = findViewById(R.id.pan_r_score);
        scoreView.setText(String.valueOf(score));
    }

    public void ReturnDuel (View v) {
        scoreApollo = 0;
        intensityApollo =0;
        melodyApollo =0;
        harmonyApollo = 0;
        rhythmApollo = 0;
        scorePan = 0;
        intensityPan =0;
        melodyPan =0;
        harmonyPan = 0;
        rhythmPan= 0;
        displayPraiseforApollo(scoreApollo);
        displayPraiseforPan(scorePan);
        displayIntensityforA(intensityApollo);
        displayIntensityforP(intensityPan);
        displayMelodyforA(melodyApollo);
        displayMelodyforP(melodyPan);
        displayHarmonyforA(harmonyApollo);
        displayHarmonyforP(harmonyPan);
        displayRhythmforA(rhythmApollo);
        displayRhythmforP(rhythmPan);
    }

}