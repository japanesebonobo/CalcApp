package jp.techacademy.yuuta.yoshitomi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int button = intent.getIntExtra("button", 0);
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);

        if (button == 1) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(String.valueOf(value1 + value2));
        } else if (button == 2) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(String.valueOf(value1 - value2));
        } else if (button == 3) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(String.valueOf(value1 * value2));
        } else {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}