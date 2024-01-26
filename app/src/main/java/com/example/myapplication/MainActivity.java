package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    public void  onPlaceOrderBtnClick(View view){
        TextView textView = findViewById(R.id.txtMessage);
        textView.setText("KV....");

    }

    public void onShowBtnClick(View view){
       EditText firstName = findViewById(R.id.firstName);
       TextView firstNameTxt = findViewById(R.id.txtFirstName);
       firstNameTxt.setText("Entered firstName: " +firstName.getText().toString());

        EditText lastName = findViewById(R.id.lastName);
        TextView lastNameTxt = findViewById(R.id.txtLastName);
        lastNameTxt.setText("Entered lastName: " +lastName.getText().toString());


        EditText email = findViewById(R.id.email);
        TextView emailTxt = findViewById(R.id.txtEmail);
        emailTxt.setText("Entered email: " +email.getText().toString());
    }

}