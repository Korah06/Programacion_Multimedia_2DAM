package espasa.mario.monkeyapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import espasa.mario.monkeyapp.model.Routes
import espasa.mario.monkeyapp.ui.screens.ScreenFour
import espasa.mario.monkeyapp.ui.screens.ScreenOne
import espasa.mario.monkeyapp.ui.screens.ScreenThree
import espasa.mario.monkeyapp.ui.screens.ScreenTwo

@Composable
fun MyNavigator(){
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = Routes.ScreenOne.route){
        composable(route=Routes.ScreenOne.route){
            ScreenOne(navigationController = navigationController)
        }
        composable(route=Routes.ScreenTwo.route){
            ScreenTwo(navigationController = navigationController)
        }
        composable(route=Routes.ScreenThree.route, arguments = listOf(navArgument("score"){
            type = NavType.IntType
        })){navBackStackEntry ->
            ScreenThree(navigationController = navigationController, score = navBackStackEntry.arguments?.getInt("score"))
        }
        composable(route=Routes.ScreenFour.route, arguments = listOf(navArgument("title"){
            defaultValue = "Hola mundo"
        })){
            ScreenFour(navigationController = navigationController, title = it.arguments?.getString("title"))
        }
    }
}