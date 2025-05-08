package br.edu.utfpr.trocatela_pm45s_2025_1

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListarActivity : AppCompatActivity() {

    private lateinit var lista : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        lista = findViewById( R.id.lista )

        lista.setOnItemClickListener { parent, view, position, id ->

            val codItem = position + 1 //recupera o código do item selecionado
            intent.putExtra( "codItem", codItem.toString() ) //envia o código do item selecionado para a tela de lancamento
            setResult( RESULT_OK, intent )//retorna o código do item selecionado para a tela de lancamento
            finish()//encerra a tela de listar

        }
    }
}