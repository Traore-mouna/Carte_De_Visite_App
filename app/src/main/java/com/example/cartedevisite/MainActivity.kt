package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CartedevisiteApp()
                }
            }
        }
    }
}

@Composable
fun CartedevisiteApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Spacer(modifier = Modifier.height(150.dp))
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Logo Android",
                modifier = Modifier
                    .height(180.dp)
                    .width(180.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Maimouna Traoré",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Developpeuse - Web",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3DDC84),
                textAlign = TextAlign.Center
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(50.dp),

        ) {
            Cordonnees(
                icon = Icons.Default.Call,
                info = "+225 06 01 97 76")
            Cordonnees(
                icon = Icons.Default.Email,
                info = "mouna@gmail.com")
            CordonneesCustomIcon(
                painter = painterResource(id = R.drawable.linkedin),
                info = "@mouna_traore",
                contentDescription = "LinkedIn"
            )
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun Cordonnees(icon: ImageVector, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = info,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.size(30.dp)
        )
            Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = info,
            fontSize = 26.sp,
            color = Color.Black
        )

    }

}
@Composable
fun CordonneesCustomIcon(
    painter: Painter,
    info: String,
    contentDescription: String,
    modifier: Modifier = Modifier.size(24.dp)
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.size(35.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = info,
            fontSize = 26.sp,
            color = Color.Black
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteDeVisiteTheme {
        CartedevisiteApp()
    }
}
