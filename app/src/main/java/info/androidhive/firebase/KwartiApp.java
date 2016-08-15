package info.androidhive.firebase;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by yassi on 15/08/2016.
 */
public class KwartiApp extends Application {

    @Override
    public void onCreate()
    {
        super.onCreate();

        // Initialize the singletons so their instances
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        System.out.println("******************ya  7anenea  w5ay  ya 7anena  rahi tlanceeet zaghrti ya mra *********************** ");
        DatabaseReference db= FirebaseDatabase.getInstance().getReference();
        db.keepSynced(true);
        // are bound to the application process.

    }




}
