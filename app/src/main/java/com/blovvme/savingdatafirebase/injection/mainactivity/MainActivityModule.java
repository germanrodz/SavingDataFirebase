package com.blovvme.savingdatafirebase.injection.mainactivity;

import com.blovvme.savingdatafirebase.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Blovvme on 8/22/17.
 */
@Module
public class MainActivityModule {


    @Provides
    MainActivityPresenter providesMainActivityPresenter(){

        return new MainActivityPresenter();
    }
}
