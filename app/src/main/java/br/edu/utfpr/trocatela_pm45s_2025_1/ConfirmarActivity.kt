package br.edu.utfpr.trocatela_pm45s_2025_1

import android.content.Intent
import android.net.Uri
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
        val sms_body = "Cod: ${tvCod.text} Qtd: ${tvQtd.text} Valor: ${tvValor.text}"
        val sms_phone = "+554699887766"

        val intent = Intent( Intent.ACTION_VIEW )

        intent.data = Uri.parse( "sms:$sms_phone" )
        intent.putExtra( "sms_body", sms_body )
        startActivity( intent )

    }
}