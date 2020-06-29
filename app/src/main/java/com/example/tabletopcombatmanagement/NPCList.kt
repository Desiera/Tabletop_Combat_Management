package com.example.tabletopcombatmanagement

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.list_npc.*

class NPCList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_npc)


        val preferences = getSharedPreferences("NPCDatabase", Context.MODE_PRIVATE)
        val savedNPCName = preferences.getString("savedNPCName", "This value doesn't exist.")
        val savedNPCLevel = preferences.getString("savedNPCLevel", "This value doesn't exist.")
        val savedNPCStrength = preferences.getString("savedNPCStrength", "This value doesn't exist.")
        val savedNPCDexterity = preferences.getString("savedNPCDexterity", "This value doesn't exist.")
        val savedNPCConstitution = preferences.getString("savedNPCConstitution", "This value doesn't exist.")
        val savedNPCIntelligence = preferences.getString("savedNPCIntelligence", "This value doesn't exist.")
        val savedNPCWisdom = preferences.getString("savedNPCWisdom", "This value doesn't exist.")
        val savedNPCCharisma = preferences.getString("savedNPCCharisma", "This value doesn't exist.")

        NPCName.text = savedNPCName
        NPCLevel.text = savedNPCLevel
        NPCStrength.text = savedNPCStrength
        NPCDexterity.text = savedNPCDexterity
        NPCConstitution.text = savedNPCConstitution
        NPCIntelligence.text = savedNPCIntelligence
        NPCWisdom.text = savedNPCWisdom
        NPCCharisma.text = savedNPCCharisma

    }
}