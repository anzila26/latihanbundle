package anzila.binar.latihanbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import anzila.binar.latihanbundle.databinding.ActivityRegisterSatuBinding

class RegisterSatuActivity : AppCompatActivity() {
    lateinit var binding :ActivityRegisterSatuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReg.setOnClickListener{
            val dataStudent = MyDataSatu()
            val data = Intent(this, PrintSatuActivity::class.java)
            data.putExtra("DATASTUDENT", dataStudent)
            startActivity(data)
        }
    }
}