package com.blovvme.savingdatafirebase.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.blovvme.savingdatafirebase.R;
import com.blovvme.savingdatafirebase.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    TextView tvData;
    Button btnData;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = (TextView)findViewById(R.id.tvData);
        btnData = (Button)findViewById(R.id.btnData);

        DaggerMainActivityComponent.create().inject(this);
        presenter.attachView(this);
        presenter.saveDataToCloud("German Rodriguez");
    }




    @Override
    public void showError(String e) {

    }

    @Override
    public void onDataSaved(boolean isSaved) {

    }


    public void onCLick(View view) {
    presenter.getDataToCloud();
    }

    @Override
    public void sendToView(String s) {
        tvData.setText(s);
    }
}
