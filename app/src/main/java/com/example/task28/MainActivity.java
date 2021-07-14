package com.example.task28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView infoText;
    Galaxy s9;
    IPhone iphoneTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoText = findViewById(R.id.infoText);
        s9 = new Galaxy("s9", 99, "finger print ", "Ring Ring Ring ");
        iphoneTen = new IPhone("X", 100, "face ID ", "Zing");
        s9.displayInfo();
        iphoneTen.displayInfo();
        infoText.setText("ring Tone :  " + s9.ring() + " unlock " + s9.unlock() + " iphone ring " + iphoneTen.ring() + "  unlock by : " + iphoneTen.unlock());

    }
}