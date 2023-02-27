package uz.umarov.view_pager_3.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import uz.umarov.view_pager_3.fragments.FirstFragment
import uz.umarov.view_pager_3.fragments.FourthFragment
import uz.umarov.view_pager_3.fragments.SecondFragment
import uz.umarov.view_pager_3.fragments.ThirdFragment

class MyFragmentAdapter(var list: ArrayList<Fragment>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 4


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            3 -> FourthFragment()
            else -> FirstFragment()
        }
    }

}