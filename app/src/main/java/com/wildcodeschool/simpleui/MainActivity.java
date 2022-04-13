package com.wildcodeschool.simpleui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // First step, create 3 variables (text, input field (edittext) and button)
    EditText editFirstName;
    EditText editLastName;
    Button button;
    TextView textView;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstName = findViewById(R.id.firstName);
        editLastName = findViewById(R.id.lastName);
        button = findViewById(R.id.mybutton);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = editFirstName.getText().toString();
                String lastName = editLastName.getText().toString();
                String fullText = "Congratulations " + firstName + " " + lastName + " !";

                textView.setText(fullText);

            }
        });






    }
}