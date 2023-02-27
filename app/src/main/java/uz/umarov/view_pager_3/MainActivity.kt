package uz.umarov.view_pager_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import uz.umarov.view_pager_3.adapters.MyFragmentAdapter
import uz.umarov.view_pager_3.databinding.ActivityMainBinding
import uz.umarov.view_pager_3.fragments.FirstFragment
import uz.umarov.view_pager_3.fragments.FourthFragment
import uz.umarov.view_pager_3.fragments.SecondFragment
import uz.umarov.view_pager_3.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var list: ArrayList<Fragment>
    private lateinit var myFragment: MyFragmentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        loadData()
        myFragment = MyFragmentAdapter(list, supportFragmentManager)
        binding.viewPager.adapter = myFragment
        binding.dotsIndicator.setViewPager(binding.viewPager)

        binding.otkazish1.setOnClickListener {
            if (binding.viewPager.currentItem == 3) {
                binding.viewPager.currentItem = 0
            } else
                binding.viewPager.currentItem = binding.viewPager.currentItem + 1

        }


    }

    private fun loadData() {
        list = ArrayList()

        list.add(FirstFragment())
        list.add(SecondFragment())
        list.add(ThirdFragment())
        list.add(FourthFragment())
    }
}