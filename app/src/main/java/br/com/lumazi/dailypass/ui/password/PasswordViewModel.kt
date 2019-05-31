package br.com.lumazi.dailypass.ui.password

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class PasswordViewModel : ViewModel() {

    var password = MutableLiveData<String>()

    init {
        getPassword()
    }

    fun getPassword() {
        password.value = buildPassword()
    }

    private fun buildPassword(): String {
        val date = Date()
        val formatter = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        val pwd = formatter.format(date).toCharArray().filterNot { c -> c == '0' }.sorted()

        return pwd.joinToString("")
    }
}
