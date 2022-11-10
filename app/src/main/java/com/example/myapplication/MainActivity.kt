import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView=findViewById<R.id.bottom>()
        val berandaFragment=BerandaFragment()
        val materiFragment=MateriFragment()
        val identifikasiFragment=IdentifikasiFragment()
        val videoFragment=VideoFragment
        val testFragment=TestFragment

        setCurrentFragment(berandaFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.beranda->setCurrentFragment(berandaFragment)
                R.id.materi->setCurrentFragment(materiFragment)
                R.id.identifikasi->setCurrentFragment(identifikasiFragment)
                R.id.video->setCurrentFragment(videoFragment)
                R.id.test->setCurrentFragment(testFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}
