import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    fun displayResult(nama: String?, email: String?, nomor: String?, jenisKelamin: String?) {
        val resultText = "$nama\n$email\n$nomor\n$jenisKelamin"

        view?.findViewById<TextView>(R.id.tvResult)?.text = resultText
    }
}
