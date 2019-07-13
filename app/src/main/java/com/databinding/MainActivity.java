package com.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.databinding.databinding.ActivityMainBinding;
import com.databinding.eventhandling.LogingEventHandling;
import com.databinding.modelclass.StudentModel;
import com.databinding.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        StudentModel studentModel = new StudentModel();
        studentModel.setAddress("#52 Radha enclave");
        studentModel.setName("Krishan Mohan verma");
        LoginViewModel loginViewModel = new LoginViewModel(studentModel);
        activityMainBinding.setLoginViewModel(loginViewModel);

        activityMainBinding.setLoginEvent(new LogingEventHandling() {
            @Override
            public void onClickHandling() {
                Toast.makeText(MainActivity.this, "" + activityMainBinding.getLoginViewModel().getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
