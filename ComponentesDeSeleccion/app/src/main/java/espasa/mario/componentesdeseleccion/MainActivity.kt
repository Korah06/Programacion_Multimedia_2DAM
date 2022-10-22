package espasa.mario.componentesdeseleccion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import espasa.mario.componentesdeseleccion.ui.theme.ComponentesDeSeleccionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentesDeSeleccionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun View(){

    var nombre by rememberSaveable{ mutableStateOf("") }
    var descripcion by rememberSaveable{ mutableStateOf("") }

    var name by rememberSaveable{ mutableStateOf("Mono") }
    var description by rememberSaveable{ mutableStateOf("Hola Mundo") }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Box(modifier = Modifier.padding(200.dp,10.dp,0.dp,0.dp)){
                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    backgroundColor = Color.Blue
                )
                {
                    Icon(Icons.Default.Edit, contentDescription = null)
                }
            }
        }
        Row() {
            Image(
                painter = painterResource(id = R.drawable.fondo) ,
                contentDescription = "Fondo",
                modifier = Modifier.size(270.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Box(modifier = Modifier.padding(40.dp,0.dp,0.dp,0.dp)){
                Image(
                    painter = painterResource(id = R.drawable.mono),
                    contentDescription = "mono",
                    contentScale = ContentScale.Crop,
                    modifier =
                    Modifier
                        .clip(CircleShape)
                        .size(80.dp)
                )
            }

            Column(modifier = Modifier.padding(5.dp,0.dp,0.dp,0.dp)) {
                Text(text = name)
                Text(text = description)
            }


        }

        Row() {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = nombre,
                    onValueChange = {
                        nombre = it
                    },
                    label = { Text(text = "Introduce nombre")},
                    textStyle = StyleTextBasic,
                    singleLine = true

                )

                OutlinedTextField(value = descripcion,
                    onValueChange = {
                        descripcion = it
                    },
                    label = { Text(text = "Introduce descripcion")},
                    maxLines = 3
                )
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(modifier = Modifier.padding(210.dp,0.dp,0.dp,0.dp)){
                        Button(
                            onClick = {
                                name = nombre
                                description = descripcion
                            },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color.Green,
                                contentColor = Color.White
                            )
                        ) {
                            Text(
                                text = "Actualizar"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentesDeSeleccionTheme {
        Greeting("Android")
    }
}