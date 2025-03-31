package swa.pin.whatsappclone.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import swa.pin.whatsappclone.R
import java.nio.file.WatchEvent

@Preview(showSystemUi = true)
@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column (modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = painterResource(R.drawable.whatsapp_sticker),
            contentDescription = null,
            modifier= Modifier.size(300.dp)
            )
        Text("Welcome to WhatsApp",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier= Modifier.height(8.dp))
        Text(
            fontSize = 16.sp,
            modifier= Modifier.fillMaxWidth().padding(8.dp),
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
            withStyle(style = SpanStyle(
                color = Color.DarkGray
            )) {
                append("Read our")
            }
            withStyle(style = SpanStyle(
                color = colorResource(R.color.light_green)
            )) {
                append(" Privacy Policy")
            }
            withStyle(style = SpanStyle(
                color = Color.DarkGray
            )) {
                append(" Tap \"Agree and continue\" to accept the ")
            }
            withStyle(style = SpanStyle(
                color = colorResource(R.color.light_green)
            )) {
                append(" Terms of Service")
            }
        })
        Spacer(modifier= Modifier.height(16.dp))
        Button(onClick = {

        },
            modifier= Modifier.size(280.dp,43.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_green))) {
            Text("Agree and Continue", fontSize = 16.sp)
        }
    }



}