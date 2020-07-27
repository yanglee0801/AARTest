package com.lion.aartest.mylibrary;

import android.content.Context;
import android.util.Log;

public class Test {

    public static void showLog (Context context){
        Log.e("Test",context.getResources().getString(R.string.log));
    }
}
