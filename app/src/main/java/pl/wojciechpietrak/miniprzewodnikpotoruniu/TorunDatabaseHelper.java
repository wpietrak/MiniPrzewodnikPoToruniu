package pl.wojciechpietrak.miniprzewodnikpotoruniu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TorunDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "torun_mini_przewodnik";
    private static final int DB_VERSION = 1;

    public TorunDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE MONUMENTS (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"MON_NAME TEXT, MON_DESCRIPTION TEXT, MON_IMAGE_RESOURCE_ID INTEGER, MON_INFO TEXT, MON_LONG INTEGER, MON_LAT INTEGER)");

        insertMonument(db, "Ratusz", "Gotycki ratusz z kalendarzem", R.drawable.ratusz, "więcej info o ratuszu z db", 100 , 100);
        insertMonument(db,"Krzywa wieża", "gotycka wieża prawie jak ta w Pisie", R.drawable.krzywa_wieza, "więcej info o krzywaej wieży z db", 100 , 100);
        insertMonument(db," Kościół św. ducha", "kosciół na rynku obok ratusza", R.drawable.kosciol_ducha, "więcej info o kościele ducha z db", 100 , 100);
        insertMonument(db,"Bazylika Janów", "Bazylika miejsza w stylu gotycki  z dzwonem", R.drawable.bazylika_janow, "więcej info o bazylice z db", 100 , 100);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertMonument(SQLiteDatabase db, String name, String description, int resourceId, String info, int Long, int Lat) {
        ContentValues monumentValues = new ContentValues();
        monumentValues.put("MON_NAME", name);
        monumentValues.put("MON_DESCRIPTION", description);
        monumentValues.put("MON_IMAGE_RESOURCE_ID", resourceId);
        monumentValues.put("MON_INFO", info);
        monumentValues.put("MON_LONGLAT", Long);
        monumentValues.put("MON_LAT", Lat);
    }
}
