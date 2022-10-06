package espasa.mario.aboutactivity

import android.app.Presentation
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import espasa.mario.aboutactivity.ui.theme.AboutActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AboutActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                )

                {
                    Hello("Mario")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Composable
fun Hello(name: String) {

    Column {

        Text(text = "I'm $name! an Student from IES Pere Maria")
    }

    Row{
        Image(
            painter = painterResource(R.drawable.mario),
            contentDescription = "image",
            modifier = Modifier.padding(20.dp)
        )
    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AboutActivityTheme {
        Hello("Mario")
    }
}