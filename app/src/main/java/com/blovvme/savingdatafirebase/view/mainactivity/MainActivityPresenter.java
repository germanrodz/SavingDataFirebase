package com.blovvme.savingdatafirebase.view.mainactivity;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Blovvme on 8/22/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    @Override
    public void attachView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    DatabaseReference myRef;

    //TODO: 8/22/17 implement firebase logic to save data
    @Override
    public void saveDataToCloud(String s) {
        //save data
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
         myRef = database.getReference("message");
        myRef.setValue(s);
        //if saved to cloud
        view.onDataSaved(true);

    }

    @Override
    public void getDataToCloud() {
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value );
                view.sendToView(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }
}
