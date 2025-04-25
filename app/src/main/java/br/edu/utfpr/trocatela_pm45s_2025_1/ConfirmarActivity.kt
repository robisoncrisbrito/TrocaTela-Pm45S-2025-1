package br.edu.utfpr.trocatela_pm45s_2025_1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var tvCod : TextView
    private lateinit var tvQtd : TextView
    private lateinit var tvValor : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        tvCod = findViewById( R.id.tvCod )
        tvQtd = findViewById( R.id.tvQtd )
        tvValor = findViewById( R.id.tvValor )

        tvCod.text = intent.getStringExtra( "cod" )
        tvQtd.text = intent.getStringExtra( "qtd" )
        tvValor.text = intent.getStringExtra( "valor" )

    }

    fun btConfirmarOnClick(view: View) {

    }
}