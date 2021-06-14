package com.galaxe.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button countButton;
    private Button zeroButton;
    final int grayColor = Color.parseColor("#aaaaaa");
    final int evenBackgroundColor = Color.parseColor("#6200ee");
    final int oddBackgroundColor = Color.parseColor("#03DAC6");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        countButton = (Button) findViewById(R.id.button_count);
        zeroButton = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        zeroButton.setBackgroundColor(evenBackgroundColor);
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            if(mCount % 2 == 0){
                countButton.setBackgroundColor(evenBackgroundColor);
            }
            else{
                countButton.setBackgroundColor(oddBackgroundColor);
            }
        }
    }

    public void resetToZero(View view) {
        mShowCount.setText(Integer.toString(0));
        view.setBackgroundColor(grayColor);
        mCount = 0;
    }
}