package com.example.tabletopcombatmanagement

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        goToAddCharacter.setOnClickListener {
            startActivity(Intent(this, AddCharacterActivity::class.java))
        }

        goToViewNPCS.setOnClickListener {
            startActivity(Intent(this, NPCList::class.java))
        }
    }
}