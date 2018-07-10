package com.example.mypc.glowingblubanimation;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn;
    boolean turnedOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(!turnedOn)
                {
                    imageView.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnedOn = true;
                }
                else
                {
                    imageView.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnedOn = false;
                }

            }
        });
    }
}
