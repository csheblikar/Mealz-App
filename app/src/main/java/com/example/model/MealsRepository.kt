package com.example.model

import com.example.model.response.MealsCategoriesResponse

// this class is responsible for getting the api response
class MealsRepository {
    fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf()) // will make get request here
}