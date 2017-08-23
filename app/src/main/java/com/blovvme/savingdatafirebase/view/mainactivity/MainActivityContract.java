package com.blovvme.savingdatafirebase.view.mainactivity;

import android.view.View;

import com.blovvme.savingdatafirebase.BasePresenter;
import com.blovvme.savingdatafirebase.BaseView;

/**
 * Created by Blovvme on 8/22/17.
 */

public interface MainActivityContract {

    interface View extends BaseView {
        void onDataSaved(boolean isSaved);
        void sendToView(String s );
    }

    interface Presenter extends BasePresenter<View> {
        void saveDataToCloud(String s);
        void getDataToCloud();
    }
}
