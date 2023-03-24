package anzila.binar.latihanbundle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import anzila.binar.latihanbundle.databinding.ActivityPrintDuaBinding

@Suppress("DEPRECATION", "CAST_NEVER_SUCCEEDS")
class PrintDuaActivity : AppCompatActivity() {
    lateinit var binding: ActivityPrintDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrintDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataperson = intent.getParcelableArrayExtra("dataperson") as MyDataDua
        dataperson.name
        dataperson.email
        dataperson.phone
        dataperson.address
        dataperson.age

        binding.txtNameDua.text= dataperson.name
        binding.txtMailDua.text= dataperson.email
        binding.txtPhoneDua.text= dataperson.phone
        binding.txtDressDua.text= dataperson.address
        binding.txtAgeDua.text= dataperson.age
    }
}