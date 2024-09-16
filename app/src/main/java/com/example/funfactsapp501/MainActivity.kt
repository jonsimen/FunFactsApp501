package com.example.funfactsapp501

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.funfactsapp501.ui.theme.FunFactsApp501Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FunFactsApp501Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    FunFactButton()
                }
            }
        }
    }
}

@Composable
fun FunFactButton() {
    val quoteList = arrayOf(
        "1. The 'Prince Rupert's Drop' is a glass object created by dripping molten glass into cold water. It's incredibly strong at the bulbous end but shatters completely if the thin tail is broken.",
        "2. In 1838, a Welsh town named Llanwrtyd Wells became a popular destination for 'bog snorkeling,' a sport in which participants swim through water-filled trenches in a peat bog.",
        "3. The first recorded instance of a person riding a bicycle in public was in 1817, by Baron Karl von Drais, who invented the 'Laufmaschine', or running machine, a precursor to the bicycle.",
        "4. 'Loxodromes' are curves on the surface of a sphere that cross all meridians at a constant angle. They're often used in navigation as they provide a steady compass direction.",
        "5. In the 1950s, Denmark briefly experimented with a new calendar that proposed a 13-month year, with the 13th month called 'Sol.' It never gained widespread adoption.",
        "6. The world's oldest operational lighthouse is the Tower of Hercules in Spain, built by the Romans in the 2nd century and still in use today.",
        "7. The term 'Pantograph' refers to a mechanical linkage connected in a way that allows copying a geometric shape to a different size while maintaining proportions.",
        "8. The city of Kummersdorf, Germany, was the site of an early rocket testing facility during the 1930s, where the first large-scale liquid-propellant rockets were launched.",
        "9. The 'Antikythera mechanism' is an ancient Greek analog computer used to predict astronomical positions and eclipses, discovered in a shipwreck in 1901.",
        "10. The word 'triskaidekaphobia' refers to the fear of the number 13. Despite its common use, it has its origins in relatively recent linguistics and didn't appear in popular texts until the early 20th century."
    )
    var index by remember {
        mutableIntStateOf((0..9).random())
    }
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(100.dp)) // So button doesn't go off the top of the screen
        Button (
            onClick = {
                index = (0..9).random()
            },
        ) {
            Text(text = "Next Quote")
        }
        Text(
            text = quoteList[index],
            fontSize = 32.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
    }
}

