package walden.com.javadesignmode.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class utils {
    public static void log(String str) {
        Log.d(S.TAG, str);
    }

    public static void toast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
