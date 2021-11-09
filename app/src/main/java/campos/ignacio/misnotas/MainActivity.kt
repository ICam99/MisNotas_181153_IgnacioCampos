package campos.ignacio.misnotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private var notas = ArrayList<Nota>()
    private lateinit var adaptador:AdaptadorNotas
    private val lista: ListView = findViewById(R.id.listview)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptador = AdaptadorNotas(this, notas)
        lista.adapter = adaptador
    }
}