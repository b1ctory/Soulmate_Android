package com.androidstudy.soulmate


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join)

        var personalBtn : Button = this.findViewById(R.id.personal)
        var companyBtn : Button = this.findViewById(R.id.company)

        personalBtn.setOnClickListener{
            val personalActivity : Intent = Intent(this,PersonalActivity::class.java)
            startActivity(personalActivity)
        }

        companyBtn.setOnClickListener{
            val companyActivity : Intent = Intent(this,CompanyActivity::class.java)
            startActivity(companyActivity)
        }

    }
}