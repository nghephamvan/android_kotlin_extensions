package aki.pvnghe.kotlinext.test;

import android.util.Log;

import aki.pvnghe.extensions.BooleanExtKt;

public class JavaDummyTest {
    private static String TAG = JavaDummyTest.class.getSimpleName();

    public static void booleanExtension() {
        boolean test = false;
        Log.d(TAG, "Test java toStringKey" + BooleanExtKt.toStringKey(test));
        Log.d(TAG, "Test java toStringNumber " + BooleanExtKt.toStringNumber(test));
    }
}
