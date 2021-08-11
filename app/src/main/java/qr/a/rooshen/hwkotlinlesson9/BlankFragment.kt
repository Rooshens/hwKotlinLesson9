package qr.a.rooshen.hwkotlinlesson9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import qr.a.rooshen.hwkotlinlesson9.R
import qr.a.rooshen.hwkotlinlesson9.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDishes.adapter = DishAdapter(generateDishes())
        binding.rvDishes.layoutManager = LinearLayoutManager(requireContext())
    }

    fun generateDishes(): List<Dish> {
        return listOf(
            Dish(
                "Том Ям суп \n с морепродуктами",
                "Бульон из пряного говяжьего  мясного супа с кокосовым молок...",
                235,
                R.drawable.img_tomyam
            ),
            Dish(
                "Сет Филадельфия \n Party De Luxe",
                "Лосось, огурец, авокадо, кунжут, сыр, зеленый лук, 6 шт",
                210,
                R.drawable.img_setfiladelphia
            ),
            Dish(
                "Десерт круассан \n с грецкими орехами",
                "Бульон из пряного говяжьего мясного супа с кокосовым молок...",
                115,
                R.drawable.img_desertcroissant
            )
        )
    }

}