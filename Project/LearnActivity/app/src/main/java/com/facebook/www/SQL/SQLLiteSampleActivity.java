package com.facebook.www.SQL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.www.R;

import java.util.ArrayList;

public class SQLLiteSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqllite_sample);


//        EmployeeViewModel employeeViewModel=new EmployeeViewModel();
//        employeeViewModel._id="0";
//        employeeViewModel.Name="Mani";
//        employeeViewModel.Addres="Triplicane";
//        employeeViewModel.Age="24";
//
//        SQLHelper.getInstance(this).addNewEmployee(employeeViewModel);


        ArrayList<EmployeeViewModel> listOfEmployees=SQLHelper.getInstance(this).getAllEmployees();
        Log.d("SQLLiteSampleActivity","No Of Employees"+listOfEmployees.size());
   }
}
