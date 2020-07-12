package com.example.user.brainchasing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {

    int activePlayer = 0; //0 for zero
    int[] gameState = {2,2,2,2,2,2,2,2,2};//2 means unplayed
    int[][] winningLocation = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    boolean gameOver = false;

     public void gameLogic(View view){

        ImageView tappedView = (ImageView) view;

        int tappedLocation = Integer.parseInt(view.getTag().toString());

        if(gameState[tappedLocation]== 2 && !gameOver){

            gameState[tappedLocation]=activePlayer;
            tappedView.setTranslationY(-3000f);

        if(activePlayer == 0){
            tappedView.setImageResource(R.drawable.zero);
            activePlayer = 1;
        } else if(activePlayer == 1){
            tappedView.setImageResource(R.drawable.cross);
            activePlayer = 0;
         }

        tappedView.animate().translationYBy(3000f).setDuration(500);
        }

        for(int[] winningPosition: winningLocation){

            if(gameState[winningPosition[0]]== gameState[winningPosition[1]]
            && gameState[winningPosition[1]]== gameState[winningPosition[2]]
            && gameState[winningPosition[0]]!=2){

                if(activePlayer == 0)

                   Toast.makeText(getApplicationContext(),"Cross is winner",Toast.LENGTH_LONG).show();

                if(activePlayer == 1)

                   Toast.makeText(getApplicationContext(),"Zero is winner",Toast.LENGTH_LONG).show();
                gameOver =true;
          }

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
    }

}
