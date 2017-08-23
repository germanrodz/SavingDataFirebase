package com.blovvme.savingdatafirebase.injection.mainactivity;

import com.blovvme.savingdatafirebase.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by Blovvme on 8/22/17.
 */


@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
