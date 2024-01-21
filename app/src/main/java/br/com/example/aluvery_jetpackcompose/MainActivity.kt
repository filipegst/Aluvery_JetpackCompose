package br.com.example.aluvery_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.example.aluvery_jetpackcompose.ui.theme.Aluvery_JetpackComposeTheme

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
                    TextoColuna()
                    TextoLinha()
                    TextoCaixa()
                }
            }
        }
    }
}

    @Composable
    fun TextoColuna() {
        Column {
            Text(text = "Hello")
            Text(text = "Moda")
            Text(text = "Foca")

            }
        }

    @Composable
    fun TextoLinha() {
        Row{
            Text(text = "Hello")
            Text(text = "Moda")
            Text(text = "Foca")

        }
    }

    @Composable
    fun TextoCaixa() {
        Box{
            Text(text = "Hello")
            Text(text = "Moda")
            Text(text = "Foca")

        }
    }


@Preview(showBackground = true)
@Composable
fun CustomLayoutPreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box {
            Row {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}

    @Preview(name = "TextoPreview",showBackground = true)
    @Composable
    fun TextoPreview() {
            TextoColuna()
    }
    @Preview(name = "TextoLinhaPreview",showBackground = true)
    @Composable
    fun TextoLinhaPreview() {
            TextoLinha()
    }
    @Preview(name = "TextoCaixaPreview",showBackground = true)
    @Composable
    fun TextoCaixaPreview() {
            TextoCaixa()
    }