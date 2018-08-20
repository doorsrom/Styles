package com.doors.styles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ExampleDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DoorsTheme.checkDialogTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_dialog);

        findViewById(R.id.yes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleDialog.this, "User clicked yes!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        findViewById(R.id.no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleDialog.this, "User clicked no!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
