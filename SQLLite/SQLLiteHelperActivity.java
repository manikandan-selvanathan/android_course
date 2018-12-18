package com.facebook.www.SQL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.www.R;

import java.util.ArrayList;

public class SQLLiteHelperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqllite_helper);

        EmployeeViewModel employeeViewModel=new EmployeeViewModel();
        employeeViewModel.Name="Mani";
        employeeViewModel.Age="25";
        employeeViewModel.Addres="Address";


        EmployeeViewModel employeeViewMode2=new EmployeeViewModel();
        employeeViewMode2.Name="David";
        employeeViewMode2.Age="25";
        employeeViewMode2.Addres="Address";

        EmployeeViewModel employeeViewMode3=new EmployeeViewModel();
        employeeViewMode3.Name="Sungu";
        employeeViewMode3.Age="25";
        employeeViewMode3.Addres="Address";

        EmployeeViewModel employeeViewMode4=new EmployeeViewModel();
        employeeViewMode4.Name="Raja Durai";
        employeeViewMode4.Age="25";
        employeeViewMode4.Addres="Address";


        SQLHelper.getInstance(this).addNewEmployee(employeeViewModel);
        SQLHelper.getInstance(this).addNewEmployee(employeeViewMode2);
        SQLHelper.getInstance(this).addNewEmployee(employeeViewMode3);
        SQLHelper.getInstance(this).addNewEmployee(employeeViewMode4);
        ArrayList<EmployeeViewModel> allEmployees=SQLHelper.getInstance(this).getAllEmployees();
        Log.d("No Of Employees","Count "+allEmployees.size());
    }
}
