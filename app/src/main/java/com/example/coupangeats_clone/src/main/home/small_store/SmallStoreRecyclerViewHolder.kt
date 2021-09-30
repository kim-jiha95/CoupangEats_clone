package com.example.coupangeats_clone.src.main.home.small_store

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coupangeats_clone.R
import com.example.coupangeats_clone.src.models.Model.StoreModel
import com.example.coupangeats_clone.util.MyContext.Companion.context

class SmallStoreRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    // 뷰 가져오기
    private val image = itemView.findViewById<ImageView>(R.id.recycler_item_store_small_image)
    private val title = itemView.findViewById<TextView>(R.id.recycler_item_store_small_title)
    private val star = itemView.findViewById<TextView>(R.id.recycler_item_store_small_info_star)
    private val review = itemView.findViewById<TextView>(R.id.recycler_item_store_small_info_review)
    private val dist = itemView.findViewById<TextView>(R.id.recycler_item_store_small_info_distance)
    private val delivery_fee = itemView.findViewById<TextView>(R.id.recycler_item_store_small_delivery_fee)

    // 데이터와 뷰 묶기
    fun bindWithView(categoryItem: StoreModel){
        // 이미지 설정
        Glide.with(context)
            .load(categoryItem.image)
            .placeholder(R.drawable.app_icon)
            .into(image)
        title.text = categoryItem.title
        star.text =categoryItem.star
        review.text = categoryItem.review
        dist.text = categoryItem.distance
        delivery_fee.text = categoryItem.delivery_fee
    }


}