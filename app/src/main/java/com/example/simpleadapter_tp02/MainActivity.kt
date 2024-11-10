package com.example.simpleadapter_tp02

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val pays = listOf(
            mapOf(
                "icon" to R.drawable.palestine,
                "nom" to "Palestine",
                "code_iso" to "PP",
                "capitale" to "AL-Quods",
                "monnaie" to "Pound",
                "continent" to "Asie"
            ),
            mapOf(
                "icon" to R.drawable.maroc,
                "nom" to "Maroc",
                "code_iso" to "MAR",
                "capitale" to "Rabat",
                "monnaie" to "Dirham",
                "continent" to "Afrique"
            ),
            mapOf(
                "icon" to R.drawable.algerie,
                "nom" to "Algérie",
                "code_iso" to "DZD",
                "capitale" to "Alger",
                "monnaie" to "Dinar",
                "continent" to "Afrique"
            ),
            mapOf(
                "icon" to R.drawable.allmagne,
                "nom" to "Allemagne",
                "code_iso" to "EUR",
                "capitale" to "Berlin",
                "monnaie" to "Euro",
                "continent" to "Europe"
            ),
            mapOf(
                "icon" to R.drawable.canada,
                "nom" to "Canada",
                "code_iso" to "CAD",
                "capitale" to "Ottawa",
                "monnaie" to "Dollar",
                "continent" to "Amérique"
            ),
            mapOf(
                "icon" to R.drawable.china,
                "nom" to "Chine",
                "code_iso" to "CNY",
                "capitale" to "Pékin",
                "monnaie" to "Yuan",
                "continent" to "Asie"
            ),
            mapOf(
                "icon" to R.drawable.egypte,
                "nom" to "Égypte",
                "code_iso" to "EGP",
                "capitale" to "Le Caire",
                "monnaie" to "Livre",
                "continent" to "Afrique"
            ),
            mapOf(
                "icon" to R.drawable.france,
                "nom" to "France",
                "code_iso" to "EUR",
                "capitale" to "Paris",
                "monnaie" to "Euro",
                "continent" to "Europe"
            ),
            mapOf(
                "icon" to R.drawable.inde,
                "nom" to "Inde",
                "code_iso" to "INR",
                "capitale" to "New Delhi",
                "monnaie" to "Roupie",
                "continent" to "Asie"
            ),
            mapOf(
                "icon" to R.drawable.russie,
                "nom" to "Russie",
                "code_iso" to "RUB",
                "capitale" to "Moscou",
                "monnaie" to "Rouble",
                "continent" to "Europe"
            )
        )

        val listview = findViewById<ListView>(R.id.affichage)

        val adapter = SimpleAdapter(
            this,
            pays,
            R.layout.listview_items,
            arrayOf("icon", "nom", "monnaie", "code_iso", "capitale", "continent"),
            intArrayOf(R.id.icon, R.id.codep, R.id.mo, R.id.codeiso, R.id.capitale, R.id.continent)
        )
        listview.adapter = adapter
    }
}