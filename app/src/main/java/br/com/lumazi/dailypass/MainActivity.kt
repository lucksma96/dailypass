package br.com.lumazi.dailypass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.lumazi.dailypass.ui.password.PasswordFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PasswordFragment.newInstance())
                .commitNow()
        }
    }

}
