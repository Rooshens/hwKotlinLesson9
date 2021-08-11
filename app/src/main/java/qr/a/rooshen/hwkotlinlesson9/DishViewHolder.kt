package qr.a.rooshen.hwkotlinlesson9

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import qr.a.rooshen.hwkotlinlesson9.R

class DishViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val ivPhoto: ImageView = view.findViewById(R.id.ivFoodFoto)
    val tvName: TextView = view.findViewById(R.id.tvFoodName)
    val tvDescription: TextView = view.findViewById(R.id.tvFoodDescription)
    val tvPrice: TextView = view.findViewById(R.id.tvPrice)
}