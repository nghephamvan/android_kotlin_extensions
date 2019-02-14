package aki.pvnghe.kotlinext.test

import aki.pvnghe.extensions.toStringKey
import aki.pvnghe.extensions.toStringNumber
import android.util.Log

object KotlinDummyTest {
    private val TAG = KotlinDummyTest.javaClass.simpleName
    fun booleanExtension() {
        Log.d(TAG, "Test kotlin toStringKey " + false.toStringKey())
        Log.d(TAG, "Test kotlin toStringNumber " + false.toStringNumber())
    }
}