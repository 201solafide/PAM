import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton: Button = findViewById(R.id.submitButton)
        submitButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            intent.putExtra("nama", "Nama: " + etNama.text.toString())
            intent.putExtra("email", "Email: " + etEmail.text.toString())
            intent.putExtra("nomor", "Nomor HP: " + etNomor.text.toString())
            intent.putExtra("jenisKelamin", "Jenis Kelamin: " + jenisKelamin)

            startActivity(intent)
        }
    }
}
