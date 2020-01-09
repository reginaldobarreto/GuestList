package br.com.barrsoft.guestlist.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import br.com.barrsoft.guestlist.utils.GuestListConstants;

public class GuestListDataBaseOpenHelper extends SQLiteOpenHelper {

    private  static final String NAME = "GuestList.db";
    private  static final Integer VERSION = 1;
    private  static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS " + GuestListConstants.TABLE_NAME.TABLE_NAME + " ("
            + GuestListConstants.COLLUMN_NAME.ID + " integer primary key autoincrement "
            + GuestListConstants.COLLUMN_NAME.NAME + " text, "
            + GuestListConstants.COLLUMN_NAME.PRESENCE + " integer );";

    private  static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + GuestListConstants.TABLE_NAME.TABLE_NAME;



    public GuestListDataBaseOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_TABLE);
        db.execSQL(SQL_CREATE_TABLE);
    }

}
