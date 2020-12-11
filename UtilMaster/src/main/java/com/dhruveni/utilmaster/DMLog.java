package com.dhruveni.utilmaster;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class DMLog {

    public static String TAG = "dhruveni-Log";
    public static void DmLogMsg(String msg)
    {
        Log.d(TAG,msg);
    }

    public static void ShowToast(Context context,String Msg)
    {
        Toast.makeText(context, Msg, Toast.LENGTH_SHORT).show();
    }
}
