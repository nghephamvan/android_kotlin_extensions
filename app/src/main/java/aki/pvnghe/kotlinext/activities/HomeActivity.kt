package aki.pvnghe.kotlinext.activities

import aki.pvnghe.kotlinext.R
import aki.pvnghe.kotlinext.test.JavaDummyTest
import aki.pvnghe.kotlinext.test.KotlinDummyTest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Test
        JavaDummyTest.booleanExtension()
        KotlinDummyTest.booleanExtension()
    }
}
