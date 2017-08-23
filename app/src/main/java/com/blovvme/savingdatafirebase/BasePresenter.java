package com.blovvme.savingdatafirebase;

/**
 * Created by Blovvme on 8/22/17.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V View);
    void detachView();
}
