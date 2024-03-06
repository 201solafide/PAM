import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val resultFragment = ResultFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, resultFragment)
            .commit()

        val intent = intent
        resultFragment.displayResult(
            intent.getStringExtra("nama"),
            intent.getStringExtra("email"),
            intent.getStringExtra("nomor"),
            intent.getStringExtra("jenisKelamin")
        )
    }
}
