package com.example.saftfs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SensorActivity extends AppCompatActivity {

    private ToggleButton toggleSensorOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        toggleSensorOnOff  = findViewById(R.id.TB);



    }

    public void toggleSensor(View view) {
        if (toggleSensorOnOff.isChecked()) {
                Toast.makeText(SensorActivity.this, "Нажатие зафиксированно", Toast.LENGTH_SHORT).show();
            }
         else {
                Toast.makeText(SensorActivity.this, "Нажатие зафиксированно", Toast.LENGTH_SHORT).show();
        }
    }

}
