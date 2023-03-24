package anzila.binar.latihanbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import anzila.binar.latihanbundle.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLog.setOnClickListener {
            val namaStudent = binding.logText.text.toString()
            val thnStudent = binding.thnText.text.toString().trim().toIntOrNull() ?: 0
            val bundle = Bundle()
            val log = Intent(this, HomeActivity::class.java)
            bundle.putString("nama", namaStudent)
            bundle.putInt("tahun", thnStudent)
            log.putExtras(bundle)
            startActivity(log)
        }
    }
}
