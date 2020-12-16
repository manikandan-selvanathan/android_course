package com.saimobileapps.learning.SQL;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class SQLHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "employeedb";

    //ActionLog Table
    private static final String KEY_ID = "id";
    private static final String TABLE_EMPLOYEE_LOGS = "employeetablet";
    private static final String KEY_EMPLOYEE_ID = "EmployeeId";
    private static final String KEY_EMP_NAME = "KEY_EMP_NAME";
    private static final String KEY_EMP_AGE = "KEY_EMP_AGE";
    private static final String KEY_EMP_ADDRESS = "KEY_EMP_ADDRESS";


    String CREATE_EMPLOYEE_TABLE = "CREATE TABLE " + TABLE_EMPLOYEE_LOGS + "("
            + KEY_EMPLOYEE_ID + " TEXT PRIMARY KEY,"
            + KEY_EMP_NAME + " TEXT,"
            + KEY_EMP_AGE + " TEXT,"
            + KEY_EMP_ADDRESS + " TEXT)";

    private static SQLHelper mInstance;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    public SQLHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized SQLHelper getInstance(Activity context) {
        if (mInstance == null) {
            mInstance = new SQLHelper(context);
        }
        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_EMPLOYEE_TABLE); //Table Creation
        //db.execSQL(CREATE_SLOGAMS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEE_LOGS);
        onCreate(db);
    }
    private String getDateTime(Date datTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getDateTimeString(Date dateTime) {
        return dateFormat.format(dateTime);
    }

    private Date getDateTime(String dateTime) {
        try {
            return dateFormat.parse(dateTime);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean addNewEmployee(EmployeeViewModel employeeViewModel) {
        SQLiteDatabase sqlite = null;
        boolean isSuccess=false;
        try {
            sqlite = this.getWritableDatabase();
            synchronized (sqlite) {
                SQLiteDatabase db = this.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put(KEY_EMPLOYEE_ID, employeeViewModel._id);
                values.put(KEY_EMP_NAME, employeeViewModel.Name);
                values.put(KEY_EMP_AGE, employeeViewModel.Age);
                values.put(KEY_EMP_ADDRESS,employeeViewModel.Addres);
                long isSucess=db.insert(TABLE_EMPLOYEE_LOGS, null, values);
                if (isSucess!= -1) {
                    isSuccess=true;
                }
                else
                {
                }
            }
        }
        catch (Exception e) {
           // Log.e(Logger.LOG_TAG,e.getMessage());
        }
        finally
        {
            if (sqlite != null && sqlite.isOpen()) {
                sqlite.close();
            }
         }
        return isSuccess;
    }

    public ArrayList<EmployeeViewModel> getAllEmployees() {
        SQLiteDatabase sqlite = null;
        ArrayList<EmployeeViewModel> networkBackLogList = new ArrayList<EmployeeViewModel>();
        String selectQuery = "SELECT  * FROM " + TABLE_EMPLOYEE_LOGS;
        try {
            sqlite = this.getWritableDatabase();
            synchronized (sqlite) {
                Cursor cursor = sqlite.rawQuery(selectQuery, null);
                if(cursor!=null)
                {
                    networkBackLogList=ConvertToActionLogsToModel(cursor);
                }
            }
        } finally {
            if (sqlite != null && sqlite.isOpen()) {
                sqlite.close();
            }
        }
        return networkBackLogList;
    }



    ArrayList<EmployeeViewModel> ConvertToActionLogsToModel(Cursor cursor)
    {
        ArrayList<EmployeeViewModel> listOfBackLogs=new ArrayList<>();
        try {
            if (cursor.moveToFirst()) {
                do {
                    EmployeeViewModel networkBackLog = new EmployeeViewModel();
                    networkBackLog._id=cursor.getString(0);
                    networkBackLog.Name=cursor.getString(1);
                    networkBackLog.Age=cursor.getString(2);
                    networkBackLog.Addres=cursor.getString(3);
                    listOfBackLogs.add(networkBackLog);
                } while (cursor.moveToNext());
            }
        }
        catch (Exception e)
        {
            //Log.e(Logger.LOG_TAG,e.getMessage()==null? "Empty Message":e.getMessage());
        }
        return listOfBackLogs;
    }

    public int getActionLogsCount() {
        SQLiteDatabase sqlite = null;
        int count=0;
        try {
            sqlite = this.getWritableDatabase();
            synchronized (sqlite) {
                String countQuery = "SELECT  Count(*) FROM " + TABLE_EMPLOYEE_LOGS;
                SQLiteDatabase db = this.getReadableDatabase();
                Cursor cursor = db.rawQuery(countQuery, null);
                cursor.moveToFirst();
                count = cursor.getInt(0);
                cursor.close();
            }
        }
        catch (Exception e)
        {
           // Log.e(Logger.LOG_TAG,e.getMessage());
        }
        finally {
            if (sqlite != null && sqlite.isOpen()) {
                sqlite.close();
            }
        }
        return count;
    }


}

