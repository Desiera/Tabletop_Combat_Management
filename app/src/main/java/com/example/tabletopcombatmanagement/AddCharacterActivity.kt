package com.example.tabletopcombatmanagement

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_npc.*

class AddCharacterActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_npc)

        addNPCToDatabase.setOnClickListener {
            val NPCDatabase = getSharedPreferences("NPCDatabase", Context.MODE_PRIVATE)
            NPCDatabase.edit().apply {
                putString("savedNPCName", editNPCName.text.toString())
                putString("savedNPCLevel", editNPCLevel.text.toString())
                putString("savedNPCStrength", editNPCStrength.text.toString())
                putString("savedNPCDexterity", editNPCDexterity.text.toString())
                putString("savedNPCConstitution", editNPCConstitution.text.toString())
                putString("savedNPCIntelligence", editNPCIntelligence.text.toString())
                putString("savedNPCWisdom", editNPCWisdom.text.toString())
                putString("savedNPCCharisma", editNPCCharisma.text.toString())

            }.apply()

        }
    }
}