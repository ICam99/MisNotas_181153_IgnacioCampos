package campos.ignacio.misnotas

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class AgregarNotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_nota)

        val button: Button= findViewById(R.id.btn_guardar)

        button.setOnClickListener {
            guardar_nota()
        }
    }

    fun guardar_nota() {
        if (ContextCompat.checkSelfPermission(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)!=
                PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE), 235)
        } else{

        }
    }
}