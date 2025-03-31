package swa.pin.whatsappclone.presentation.splashscreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.contentValuesOf
import swa.pin.whatsappclone.R
import kotlin.contracts.contract

@Preview(showBackground = true)
@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Box(modifier= Modifier.fillMaxSize().padding(20.dp)){
        Image(painter = painterResource(
            R.drawable.whatsapp_icon),
            contentDescription = null,
            modifier= Modifier.size(100.dp)
                .align(Alignment.Center)
        )
        Column (
            Modifier.align(Alignment.BottomCenter).padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    ) {
                        append("From")
                    }
                }
            )
            Row {
                Icon(
                    painter = painterResource(R.drawable.meta),
                    contentDescription = null,
                    tint = colorResource(R.color.light_green),
                    modifier= Modifier.size(24.dp)
                )
                Spacer(modifier= Modifier.width(4.dp))
                Text(
                    text="Dev",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

            }
        }

    }
}