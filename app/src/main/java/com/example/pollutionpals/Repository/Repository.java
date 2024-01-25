package com.example.pollutionpals.Repository;

import android.content.Context;

import com.example.pollutionpals.DB.MyDatabaseHelper;

public class Repository {
    MyDatabaseHelper db;
    Context context ;
    ModelUser user;
    public boolean CheckCitizen(ModelUser user ){
        db = new MyDatabaseHelper(this.context);
        db.



    }

}
