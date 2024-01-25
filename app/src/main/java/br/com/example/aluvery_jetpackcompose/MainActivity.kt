package br.com.example.aluvery_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.example.aluvery_jetpackcompose.ui.theme.Aluvery_JetpackComposeTheme
import br.com.example.aluvery_jetpackcompose.ui.theme.Roxo
import br.com.example.aluvery_jetpackcompose.ui.theme.Teal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aluvery_JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductItem() {

    Surface(
        Modifier.padding(8.dp),
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {

        Column(
            Modifier
                .heightIn(250.dp, 310.dp)
                .width(200.dp)
        )

        {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(imageSize)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(colors = listOf(Roxo, Teal))
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(imageSize)
                        .offset(y = imageSize/2)
                        .clip(shape = CircleShape)
                        .align(BottomCenter)
                )

            }
            Spacer(modifier = Modifier.height(imageSize/2))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = LoremIpsum(10).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
                Text(
                    text = "TEXTO 2",
                    modifier = Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DesafioUm() {
    Row {
        Box(
            modifier = Modifier
                .height(160.dp)
                .background(Color.Blue)
                .width(100.dp)
        )
        Column() {
            Text(
                text = "TEXTO 1",
                Modifier
                    .background(Color.Gray)
                    .padding(16.dp)
            )
            Text(text = "TEXTO 2", Modifier.padding(16.dp))

        }
    }
}
