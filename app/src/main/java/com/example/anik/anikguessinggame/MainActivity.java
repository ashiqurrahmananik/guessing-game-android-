package com.example.anik.anikguessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edittext;
    private TextView textview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext= (EditText) findViewById(R.id.edittextid);
        button= (Button) findViewById(R.id.buttonid);
        textview= (TextView) findViewById(R.id.textviewid);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String guessString=edittext.getText().toString();

        int guess = Integer.parseInt(guessString);

        Random random= new Random();
        int random_number=random.nextInt(5)+1;

        if(random_number==guess)
        {
            textview.setText("Congrats ! ! ! You Have Won");
        }
        else
        {
            textview.setText(" Sorry ! You Have Loss.Random Number Was "+random_number);
        }

    }
}
