package jp.techacademy.yuuta.yoshitomi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        double a = Double.parseDouble(editText1.getText().toString());
        double b = Double.parseDouble(editText2.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);

        if (id == R.id.button1) {
           intent.putExtra("button", 1);
        } else if (id == R.id.button2) {
            intent.putExtra("button", 2);
        } else if (id == R.id.button3) {
            intent.putExtra("button", 3);
        } else  {
            intent.putExtra("button", 4);
        }

        intent.putExtra("VALUE1", a);
        intent.putExtra("VALUE2", b);
        startActivity(intent);
    }
}