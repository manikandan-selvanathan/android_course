package com.facebook.www.LaunchMode;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.www.R;

import java.util.List;

public class LauncheModeBaseActivity extends AppCompatActivity {

    protected static ActivityManager activityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(activityManager==null){
            activityManager=(ActivityManager)getSystemService(ACTIVITY_SERVICE);
        }
    }

    void setTextView()
    {
        TextView textView=findViewById(R.id.textview);
        textView.setText(getAppTaskState());
    }

    public void LaunchNewActivity(View view) {
        Intent intent = null;
        if (view.getId() == R.id.button1) {
            intent = new Intent(this, LaunchModeActivity1.class);
        } else if (view.getId() == R.id.button2) {
            intent = new Intent(this, LaunchModeActivity2.class);
        } else if (view.getId() == R.id.button3) {
            intent = new Intent(this, LaunchModeActivity3.class);
        } else if (view.getId() == R.id.button4) {
            intent = new Intent(this, LaunchModeActivity4.class);
        }
        startActivity(intent);
    }


    protected static String getAppTaskState(){

        StringBuilder stringBuilder=new StringBuilder();
        int totalNumberOfTasks=activityManager.getRunningTasks(10).size();//Returns total number of tasks - stacks
        stringBuilder.append("\nTotal Number of Tasks: "+totalNumberOfTasks+"\n\n");

        List<ActivityManager.RunningTaskInfo> taskInfo =activityManager.getRunningTasks(10);//returns List of RunningTaskInfo - corresponding to tasks - stacks

        for(ActivityManager.RunningTaskInfo info:taskInfo){
            stringBuilder.append("Task Id: "+info.id+", Number of Activities : "+info.numActivities+"\n");//Number of Activities in task - stack

            // Display the root Activity of task-stack
            stringBuilder.append("TopActivity: "+info.topActivity.getClassName().
                    toString().replace("com.facebook.www.LaunchMode.","")+"\n");

            // Display the top Activity of task-stack
            stringBuilder.append("BaseActivity:"+info.baseActivity.getClassName().
                    toString().replace("com.facebook.www.LaunchMode.","")+"\n");
            stringBuilder.append("\n\n");
        }
        return stringBuilder.toString();
    }
}
