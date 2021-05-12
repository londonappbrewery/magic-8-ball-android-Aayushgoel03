package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
        ask=(Button) findViewById(R.id.button);

        final ImageView Roll = (ImageView) findViewById(R.id.imageView2);

        final int AnswerArray[]={R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random nogen= new Random();
                int number = nogen.nextInt(5);

                Roll.setImageResource(AnswerArray[number]);
                Log.d("Magic Eight Ball","Ze the button has been pressed!"+number);


            }
        });

    }
}
