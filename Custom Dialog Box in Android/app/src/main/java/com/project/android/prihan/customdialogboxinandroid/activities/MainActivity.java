package com.project.android.prihan.customdialogboxinandroid.activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.project.android.prihan.customdialogboxinandroid.R;
import com.project.android.prihan.customdialogboxinandroid.helpers.ViewDialog;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup();
            }
        });
    }

    private void popup() {
        ViewDialog alert = new ViewDialog();
        alert.showDialog(this, "This is a error dialog box");
    }
}
