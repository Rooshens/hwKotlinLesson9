package qr.a.rooshen.hwkotlinlesson9


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import qr.a.rooshen.hwkotlinlesson9.databinding.FragmentAuthorizationBinding

class AuthorizationFragment : Fragment() {

    private lateinit var binding: FragmentAuthorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.swNotHide.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val notShowItAnymore = requireContext().getSharedPreferences(
                    "settingsHWKotlinlesson9",
                    Context.MODE_PRIVATE
                )
                notShowItAnymore.edit().remove("notShowItAnymore").apply()
            }
        }

        binding.buttonBegin.setOnClickListener {
            (activity as? MainNavigation)?.openMenu()
        }
    }
}