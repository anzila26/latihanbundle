package anzila.binar.latihanbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import anzila.binar.latihanbundle.databinding.ActivityRegisterDuaBinding

class RegisterDuaActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegdua.setOnClickListener{
            val dataperson = MyDataDua()
            val dataDua = Intent(this, PrintDuaActivity::class.java)
            dataDua.putExtra("dataperson", dataperson)
            startActivity(dataDua)
        }
    }
}