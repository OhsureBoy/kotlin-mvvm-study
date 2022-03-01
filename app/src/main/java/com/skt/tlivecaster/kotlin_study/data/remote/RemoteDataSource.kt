package com.skt.tlivecaster.kotlin_study.data.remote

import com.skt.tlivecaster.kotlin_study.data.Resource
import com.skt.tlivecaster.kotlin_study.data.dto.recipes.Recipes

/**
 * Created by AhmedEltaher
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
}
