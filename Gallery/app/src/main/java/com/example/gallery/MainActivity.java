package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String[] assets = {"dog", "china", "orzel", "maupa"};

    public float[] scores = {0f, 0f, 0f, 0f};

    public int id = 0;

    public void vote(View v){
        Button voteBut = findViewById(v.getId());
        if(voteBut.getText().equals("^")){
            scores[id] += 0.25f;
        }else if(voteBut.getText().equals("v")){
            scores[id] -= 0.25f;
        }
        RatingBar score = findViewById(R.id.ratingBar);
        score.setRating(scores[id]);
    }

    public void refreshPic(){
        ImageView image = findViewById(R.id.imageView);
        int draw = getResources().getIdentifier("com.example.gallery:drawable/" + assets[id], null, null);
        image.setImageResource(draw);
        RatingBar score = findViewById(R.id.ratingBar);
        score.setRating(scores[id]);
    }

    public void changePic(View v){
        Button button = findViewById(v.getId());
        if(button.getText().equals("next") && id < assets.length - 1) {
            id++;
            refreshPic();
            findViewById(R.id.prev).setEnabled(true);
            if(id == assets.length - 1){
                button.setEnabled(false);
            }
        }else if(button.getText().equals("previous") && id > 0){
            id--;
            refreshPic();
            findViewById(R.id.next).setEnabled(true);
            if(id == 0){
                button.setEnabled(false);
            }
        }
        Toast.makeText(this, assets[id], Toast.LENGTH_SHORT).show();
    }
}