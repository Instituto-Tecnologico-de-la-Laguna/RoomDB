package com.example.roomdb.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomdb.views.HomeView


@Composable
fun NavManager(){
    val navController= rememberNavController()navController=
    NavHost(navController = navController,
        startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }

    }

}