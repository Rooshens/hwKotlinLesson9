package qr.a.rooshen.hwkotlinlesson9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import qr.a.rooshen.hwkotlinlesson9.R
import qr.a.rooshen.hwkotlinlesson9.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as? MainNavigation)?.openMenuListContainerMenu()

        binding.bhvMain.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.favorits -> {
                    (activity as? MainNavigation)?.openMenuListContainerMenu()
                }
                R.id.menu -> {
                    (activity as? MainNavigation)?.openMenuListContainerMenu()
                }
            }
            true

        }
    }
}