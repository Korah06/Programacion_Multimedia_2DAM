package espasa.mario.examen_mario_espasa.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import espasa.mario.examen_mario_espasa.navigation.AppScreens

@Composable
fun Login(navController: NavController){
Scaffold {
    Content(navController)
}
}

@Composable
fun Content(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ejemplo")
        Button(onClick = {navController.navigate(route = AppScreens.RegisterScreen.route)}) {
            Text(text = "Navegar")
        }
    }

}