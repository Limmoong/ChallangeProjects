package com.moong.programers.main.adapter

import androidx.recyclerview.widget.DiffUtil
import com.moong.programers.data.ItemData

class ItemDiffCallback(
    private val oldList: List<ItemData>,
    private val newList: List<ItemData>
) : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) = oldList[oldItemPosition].docUrl == newList[newItemPosition].docUrl

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = oldList[oldItemPosition].thumbnailUrl == newList[newItemPosition].thumbnailUrl

}