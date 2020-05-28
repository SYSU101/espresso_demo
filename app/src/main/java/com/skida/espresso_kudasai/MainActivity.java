package com.skida.espresso_kudasai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick();
            }
        });
    }

    private void onButtonClick() {
        final String name = ((EditText)findViewById(R.id.editText)).getText().toString();
        final String greetTemplate = getResources().getString(R.string.greet).toString();
        final String greet = String.format(greetTemplate, name);
        ((TextView)findViewById(R.id.greetText)).setText(greet);
    }
}
