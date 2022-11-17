package espasa.mario.examen_mario_espasa.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import espasa.mario.examen_mario_espasa.screens.Login
import espasa.mario.examen_mario_espasa.screens.Register

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.LoginScreen.route) {
        composable(route = AppScreens.LoginScreen.route){ Login(navController)}
        composable(route = AppScreens.RegisterScreen.route){ Register(navController)}
    }
}