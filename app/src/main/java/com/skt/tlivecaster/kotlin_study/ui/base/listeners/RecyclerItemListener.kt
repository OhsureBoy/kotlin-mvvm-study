package com.task.ui.base.listeners

import com.skt.tlivecaster.kotlin_study.data.dto.recipes.RecipesItem

/**
 * Created by AhmedEltaher
 */

interface RecyclerItemListener {
    fun onItemSelected(recipe : RecipesItem)
}
