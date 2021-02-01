package com.google.hacktrial;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

    private DatabaseAccess(Context context){

        this.openHelper = new DatabaseOpenHelper(context);

    }
    public static DatabaseAccess getInstance(Context context){
        if(instance==null){
            instance=new DatabaseAccess(context);
        }
        return instance;
    }
    public void open(){
        this.db = openHelper.getWritableDatabase();

    }

    public void close(){
        if(db!=null){
            this.db.close();
        }
    }
    public String getAddress(String name){
        String s = null;
        c = db.rawQuery("select * from HospitalMS where name = '"+name+"'",null);
        if (c!=null){
            c.moveToFirst();
            do{
                int a = c.getColumnIndex("name");
                int b = c.getColumnIndex("address");
                int d = c.getColumnIndex("phone");
                int e = c.getColumnIndex("rating");

                String n1 = c.getString(a);
                String n2 = c.getString(b);
                String n3 = c.getString(d);
                String n4 = c.getString(e);

                s = n1+"\n\n"+n2+"\n\n"+n3+"\n\n"+n4;

            }while(c.moveToNext());
        }
        return s;
    }
}
