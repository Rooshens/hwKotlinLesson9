package qr.a.rooshen.hwkotlinlesson9

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import qr.a.rooshen.hwkotlinlesson9.R

class DishAdapter(val dishes: List<Dish>) : RecyclerView.Adapter<DishViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_dish, parent, false)
        return DishViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.tvName.text = dishes[position].name
        holder.tvDescription.text = dishes[position].descriprion
        holder.tvPrice.text = dishes[position].price.toString() + " ₽"
        holder.ivPhoto.setImageDrawable(
            ContextCompat.getDrawable(
                holder.itemView.context,
                dishes[position].image
            )
        )
    }

    override fun getItemCount(): Int {
        return dishes.size
    }
}