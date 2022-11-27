package espasa.mario.monkeyapp.ui.composable

import android.media.browse.MediaBrowser
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import espasa.mario.monkeyapp.R
import espasa.mario.monkeyapp.model.MediaModel
import kotlinx.coroutines.launch

@Composable
fun MediaListView(){

    val context = LocalContext.current

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(vertical = 1.dp)
    ){
        items(getListOfMedia()){mediaModel ->
            MediaItem(mediaModel){
                Toast.makeText(context,it.title, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MediaGridView(){

    val context = LocalContext.current

    LazyVerticalGrid(
        cells = GridCells.Fixed(2)
    ){
        items(getListOfMedia()){mediaModel ->
            MediaItem(mediaModel){
                Toast.makeText(context,it.title, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

@Composable
fun MediaListViewWidthCustomControl(){

    val context = LocalContext.current
    val listState = rememberLazyListState()
    val showbackButton by remember { derivedStateOf { listState.firstVisibleItemIndex >0}}
    val showforwardButton by remember { derivedStateOf { listState.firstVisibleItemIndex < listState.layoutInfo.totalItemsCount-1 }}
    val coroutineScope = rememberCoroutineScope()

    Column() {
        LazyRow(
            state = listState,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 1.dp),
            modifier = Modifier.weight(1f)
        ){
            items(getListOfMedia()){mediaModel ->
                MediaItem(mediaModel){
                    Toast.makeText(context,it.title, Toast.LENGTH_SHORT).show()
                }
            }
        }
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            if(showbackButton){
                IconButton(onClick = {
                    coroutineScope.launch {
                        listState.animateScrollToItem(listState.firstVisibleItemIndex-1)
                    }

                }
                ) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
                }
            }
            if(showforwardButton){
                IconButton(onClick = {
                    coroutineScope.launch {
                        listState.animateScrollToItem(listState.firstVisibleItemIndex+1)
                    }

                }
                ) {
                    Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "")
                }
            }
        }
    }
}


@Composable fun MediaItem(mediaModel: MediaModel, onItemPress: (MediaModel) -> Unit){

    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    Card(
        border = BorderStroke(2.dp, color = Color.LightGray),
        modifier = Modifier
            .width(screenWidth)
            .clickable { onItemPress(mediaModel) }
    ) {
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            
            Image(
                painter = painterResource(id = mediaModel.cartel),
                contentDescription = mediaModel.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.7f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = mediaModel.title,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(4.dp)
            )

            Text(
                text = mediaModel.description,
                modifier = Modifier
                    .requiredHeight(100.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 8.dp, bottom = 4.dp, end = 8.dp)
                    .verticalScroll(rememberScrollState()),
                fontSize = 10.sp
            )

            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                mediaModel.genre.forEach{genre ->
                    Text(text = genre)
                    Spacer(modifier = Modifier.width(10.dp))
                }

            }


        }

    }

}

fun getListOfMedia(): List<MediaModel> {
    return listOf(
        MediaModel(
            id = 1,
            title = "Peaky Blinders",
            description = "Una familia de pandilleros asentada en " +
                    "Birmingham, Reino Unido, tras la Primera Guerra Mundial (1914-1918), dirige un " +
                    "local de apuestas hípicas. Las actividades del ambicioso jefe de la banda " +
                    "llaman la atención del Inspector jefe Chester Campbell, un detective de la Real " +
                    "Policía Irlandesa que es enviado desde Belfast para limpiar la ciudad y acabar " +
                    "con la banda.",
            cartel = R.drawable.c1,
            score = 86,
            genre = listOf("Drama", "Crimen")
        ),
        MediaModel(
            id = 2,
            title = "Pinocho",
            description = "Versión en acción real del aclamado cuento sobre una marioneta que se " +
                    "embarca en una trepidante aventura para convertirse en un niño de verdad. " +
                    "La historia también presenta a otros personajes, como Gepetto, el carpintero " +
                    "que fabrica a Pinocho y lo trata como a su propio hijo; Pepito Grillo, que " +
                    "hace las veces de guía y “conciencia” de Pinocho; el Hada Azul; el Honrado " +
                    "Juan; la gaviota Sofía, y el cochero.",
            cartel = R.drawable.c2,
            score = 67,
            genre = listOf("Fantasía", "Aventura", "Familia")
        ),
        MediaModel(
            id = 3,
            title = "The Walking Dead",
            description = "\"The Walking Dead\" está ambientada en un futuro apocalíptico con " +
                    "la Tierra devastada por el efecto de un cataclismo, que ha provocado la " +
                    "mutación en zombies de la mayor parte de los habitantes del planeta. La " +
                    "serie, explora las dificultades de los protagonistas para sobrevivir en un " +
                    "mundo poblado por el horror, así como las relaciones personales que se " +
                    "establecen entre ellos, en ocasiones también una amenaza para su " +
                    "supervivencia.",
            cartel = R.drawable.c3,
            score = 81,
            genre = listOf("Acción", "Drama", "Ciencia ficción", "Fantasía", "Aventura")
        ),
        MediaModel(
            id = 4,
            title = "Star Wars: Andor",
            description = "Las aventuras del espía rebelde Cassian Andor durante los años de " +
                    "formación de la Rebelión antes de los eventos de Rogue One: A Star Wars " +
                    "Story. La serie explora historias llenas de espionaje y atrevidas misiones " +
                    "para devolver la esperanza a una galaxia dominada por un imperio despiadado.",
            cartel = R.drawable.c4,
            score = 81,
            genre = listOf(
                "Acción",
                "Guerra",
                "Politica",
                "Ciencia ficción",
                "Fantasía",
                "Aventura"
            )
        ),
        MediaModel(
            id = 5,
            title = "Los Simpson",
            description = "Comedia americana de animación creada por Matt Groening para la " +
                    "compañía Fox. La serie es una parodia satírica del estilo de la clase media " +
                    "americana encarnada por una familia con ese mismo nombre, compuesta por " +
                    "Homer, Marge, Bart, Lisa, y Maggie Simpson. La trama se desarrolla en la " +
                    "ciudad ficticia de Springfield y parodia la cultura, la sociedad, la " +
                    "televisión estadounidense y muchos otros aspectos de la condición humana.",
            cartel = R.drawable.c5,
            score = 81,
            genre = listOf("Familia", "Animación", "Comedia")
        ),
        MediaModel(
            id = 6,
            title = "Doctor Who: el día del Doctor",
            description = "Episodio especial de \"Doctor Who\" realizado con motivo de la " +
                    "celebración del 50º aniversario de la serie. En la Tierra, el Undécimo Doctor " +
                    "y Clara descubren una peligrosa conspiración en una galería de arte. En 1562, " +
                    "el Décimo Doctor caza Zygons con la ayuda de la Reina Isabel. El último día " +
                    "de la Guerra del Tiempo, un hombre que ya no quiere llamarse \"El Doctor\" " +
                    "toma una terrible decisión: debe cometer un genocidio contra su propia raza " +
                    "para impedir la destrucción del Universo. Todos estos sucesos resultan estar " +
                    "conectados cuando tres encarnaciones del mismo Doctor deben enfrentarse al " +
                    "momento más terrible de sus vidas.",
            cartel = R.drawable.c6,
            score = 82,
            genre = listOf("Ciencia ficción", "Aventura")
        ),
        MediaModel(
            id = 7,
            title = "SPY×FAMILY",
            description = "Todo el mundo tiene una parte de sí mismos que no puede mostrar a los " +
                    "demás. En una era en la que las naciones de todo el mundo se encuentran " +
                    "involucradas en una feroz guerra de información a puerta cerrada, Ostania " +
                    "y Westalis llevan décadas en guerra fría. La División de Inteligencia de " +
                    "Westalis (WISE) envía a su mejor espía, \"Twilight\", en una misión " +
                    "ultrasecreta para vigilar los movimientos de Donovan Desmond, quien dirige " +
                    "el Partido Nacional por la Unidad de Ostania, responsable de bombardear los " +
                    "esfuerzos de paz entre ambos países.",
            cartel = R.drawable.c7,
            score = 87,
            genre = listOf("Animación", "Aventura", "Acción", "Comedia")
        ),
        MediaModel(
            id = 8,
            title = "Jurassic World: Dominion",
            description = "Cuatro años después de la destrucción de Isla Nublar, los dinosaurios " +
                    "conviven – y cazan – con los seres humanos en todo el mundo. Este frágil " +
                    "equilibrio cambiará el futuro y decidirá, de una vez por todas, si los seres " +
                    "humanos seguirán en la cúspide de los depredadores en un planeta que comparten " +
                    "con los animales más temibles de la creación.",
            cartel = R.drawable.c8,
            score = 70,
            genre = listOf("Ciencia ficción", "Aventura", "Acción")
        ),
        MediaModel(
            id = 9,
            title = "Fullmetal Alchemist: La alquimia final",
            description = "El largo y tortuoso viaje de los hermanos Elric llega a su épico " +
                    "final, en el que deben enfrentar una amenaza de otro mundo que afecta a " +
                    "todo el país.",
            cartel = R.drawable.c9,
            score = 63,
            genre = listOf("Fantasía", "Aventura", "Acción")
        ),
        MediaModel(
            id = 10,
            title = "Top Gun: Maverick",
            description = "Después de más de 30 años de servicio como uno de los mejores " +
                    "aviadores de la Armada, Pete \"Maverick\" Mitchell se encuentra dónde siempre " +
                    "quiso estar, empujando los límites como un valiente piloto de prueba y " +
                    "esquivando el alcance en su rango, que no le dejaría volar emplazándolo en " +
                    "tierra. Cuando se encuentra entrenando a un destacamento de graduados de Top " +
                    "Gun para una misión especializada, Maverick se encuentra allí con el teniente " +
                    "Bradley Bradshaw, el hijo de su difunto amigo \"Goose\".",
            cartel = R.drawable.c10,
            score = 83,
            genre = listOf("Drama", "Acción")
        ),
    )
}