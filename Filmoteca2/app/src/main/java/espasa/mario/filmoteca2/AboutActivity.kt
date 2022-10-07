package espasa.mario.filmoteca2

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
import espasa.mario.filmoteca2.ui.theme.Filmoteca2Theme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Filmoteca2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun Welcome(name: String) {
    Text(text = "Welcome to my new app I'm $name! An student from IES Pere Maria Orts i Bosch", style = MaterialTheme.typography.body1)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Filmoteca2Theme {
        Welcome("Mario")
    }
}