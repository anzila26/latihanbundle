package anzila.binar.latihanbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import anzila.binar.latihanbundle.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getbundle = intent.extras
        val name = getbundle?.getString("nama")
        val age = getbundle?.getInt("tahun")
        binding.nameText.text =  "halo, " + name
        binding.ageText.text = "umur kamu, " + age
    }
}