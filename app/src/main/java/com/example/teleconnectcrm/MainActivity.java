package com.example.teleconnectcrm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Handling login button click
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate email and password (Add your authentication logic here)
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform authentication or navigate to next screen upon successful login
                    // For example:
                    // if (isValidCredentials(email, password)) {
                    //    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                    //    finish();
                    // } else {
                    //    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    // }
                }
            }
        });

        // Handling registration text click (Navigate to registration activity/fragment)
        TextView textViewRegister = findViewById(R.id.textViewRegister);
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle registration link click (e.g., Start registration activity)
                // startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
            }
        });
    }

    // Add your authentication logic here
    private boolean isValidCredentials(String email, String password) {
        // Perform validation against your authentication system or dummy credentials
        // Return true if the credentials are valid, otherwise false
        return email.equals("test@example.com") && password.equals("password");
    }
}
