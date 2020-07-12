package com.example.user.brainchasing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll_sum, ll_word, ll_mind, tic_tac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_sum = (LinearLayout)findViewById(R.id.ll_sum);
        ll_word = (LinearLayout)findViewById(R.id.ll_word);
        ll_mind = (LinearLayout)findViewById(R.id.ll_mind);
        tic_tac = (LinearLayout)findViewById(R.id.tic_tac);

         ll_sum.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,SumUp.class);
             startActivity(intent);
         }
     });

        ll_word.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,MakingWord.class);
             startActivity(intent);
         }
     });


     ll_mind.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,MindGames.class);
             startActivity(intent);
         }
     });

     tic_tac.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,TicTacToe.class);
             startActivity(intent);
         }
     });

    }
}
