package qr.a.rooshen.hwkotlinlesson9

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import qr.a.rooshen.hwkotlinlesson9.databinding.FragmentGreetingBinding

class GreetingFragment : Fragment() {

    private lateinit var binding: FragmentGreetingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreetingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val notShowItAnymore = requireContext().getSharedPreferences("settingsHWKotlinlesson9", Context.MODE_PRIVATE)
        binding.tvBeginGreeting.setOnClickListener {
            notShowItAnymore.edit().putBoolean("notShowItAnymore", true).apply()
        }

        binding.cbBeginGreeting.setOnClickListener {
            (activity as? MainNavigation)?.openAuthorizationFragment()
        }
    }
}