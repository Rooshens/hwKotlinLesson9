package qr.a.rooshen.hwkotlinlesson9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import qr.a.rooshen.hwkotlinlesson9.R
import qr.a.rooshen.hwkotlinlesson9.databinding.FragmentDessertsBinding


class DessertsFragment : Fragment() {

    lateinit var binding: FragmentDessertsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDessertsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDishesDesserts.adapter = DishAdapter(generateDishes())
        binding.rvDishesDesserts.layoutManager = LinearLayoutManager(requireContext())
    }

    fun generateDishes(): List<Dish> {
        return listOf(
            Dish(
                "Десерт круассан \n с грецкими орехами",
                "Бульон из пряного говяжьего мясного супа с кокосовым молок...",
                115,
                R.drawable.img_desertcroissant
            )
        )
    }
}