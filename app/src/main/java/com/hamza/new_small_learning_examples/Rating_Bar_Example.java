package com.hamza.new_small_learning_examples;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rating_Bar_Example extends AppCompatActivity {
TextView textView;
RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating__bar__example);
        ratingBar=(RatingBar)findViewById(R.id.rb1);
        textView=(TextView)findViewById(R.id.tvRating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText(String.valueOf(rating));
            }
        });
    }

    public void submit_btn(View view) {
        ratingBar=(RatingBar)findViewById(R.id.rb1);
        Toast.makeText(this, String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
    }
}
