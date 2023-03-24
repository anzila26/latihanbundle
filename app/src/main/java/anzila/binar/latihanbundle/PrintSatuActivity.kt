package anzila.binar.latihanbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import anzila.binar.latihanbundle.databinding.ActivityPrintSatuBinding
import anzila.binar.latihanbundle.databinding.ActivityRegisterSatuBinding

@Suppress("DEPRECATION")
class PrintSatuActivity : AppCompatActivity() {
    lateinit var binding: ActivityPrintSatuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrintSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDataStudent = intent.getSerializableExtra("DATASTUDENT") as MyDataSatu
        val nama = getDataStudent.name
        val email = getDataStudent.email
        val nomor = getDataStudent.phone
        val alamat = getDataStudent.address
        val umur = getDataStudent.age

        binding.txtName.text = getDataStudent.name
        binding.txtMail.text = getDataStudent.email
        binding.txtPhone.text = getDataStudent.phone
        binding.txtDress.text = getDataStudent.address
        binding.txtAge.text= getDataStudent.age
    }
}