package br.com.barrsoft.guestlist.repository;

import android.content.Context;

class GuestListRepository {


    private static GuestListRepository instance;
    private GuestListDataBaseOpenHelper guestListDataBaseOpenHelper;

    private GuestListRepository(Context context) {
        this.guestListDataBaseOpenHelper = new GuestListDataBaseOpenHelper(context);
    }

    public static GuestListRepository getInstance(Context context) {
        if (instance == null){
            instance = new GuestListRepository(context);
        }
        return instance;
    }
}