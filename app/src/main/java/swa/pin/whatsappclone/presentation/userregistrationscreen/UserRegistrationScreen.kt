package swa.pin.whatsappclone.presentation.userregistrationscreen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import swa.pin.whatsappclone.R


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UserRegistrationScreen() {
    val countryCodeMap=mapOf(
        "India" to "+91",
        "China" to "+86",
        "Japan" to "+81",
        "USA" to "+1",
        "UK" to "+44",
        "Australia" to "+61"
    )
    var expanded by remember {
        mutableStateOf(false)
    }
    var selectedCountry by remember {
        mutableStateOf("India")
    }
    val countryCode by remember {
        derivedStateOf { countryCodeMap[selectedCountry] ?: "" }
    }

    var phoneNumber by remember {
        mutableStateOf("")
    }
    Column (modifier= Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text="Enter Your Phone Number",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.dark_green)
        )
        Spacer(modifier= Modifier.height(24.dp))
        Row {
            Text(text="Whatsapp will need to verify your phone number ")
            Text(text = "What's", color =colorResource(R.color.dark_green) )
        }
        Text("my number ?", color = colorResource(R.color.dark_green))

        Spacer(modifier= Modifier.height(16.dp))

        ExposedDropdownMenuBox(
            expanded=expanded,
            onExpandedChange = {expanded=!expanded}
        ) {

            TextField(
                value = selectedCountry,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier.menuAnchor(),
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp
                ),
                colors = TextFieldDefaults.colors().copy(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = colorResource(R.color.dark_green),
                    unfocusedIndicatorColor = colorResource(R.color.dark_green),
                    focusedTrailingIconColor = colorResource(R.color.dark_green),
                    unfocusedTrailingIconColor = colorResource(R.color.dark_green),


                ),
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded)}
            )
            ExposedDropdownMenu(

                modifier = Modifier.background(Color.White),
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                listOf("India","China","Japan","USA","UK","Australia")
                    .forEach {country->
                        DropdownMenuItem(
                            text = { Text(text = country) },
                            onClick = {
                                selectedCountry = country
                                expanded = false
                            }
                        )
                    }

            }

        }
        Spacer(modifier= Modifier.height(24.dp))
        Row (modifier= Modifier.padding(horizontal = 32.dp)){
            TextField(
                singleLine = true,
                 readOnly = true,
                value = countryCode,
                onValueChange = {},
                modifier= Modifier.weight(1f),
                colors = TextFieldDefaults.colors().copy(
                    focusedIndicatorColor = colorResource(R.color.dark_green),
                    unfocusedIndicatorColor = colorResource(R.color.dark_green),
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,

                )

            )
            Spacer(modifier= Modifier.width(8.dp))
            TextField(
                value = phoneNumber,
                onValueChange = {phoneNumber=it},
                singleLine = true,
                placeholder = {Text("Phone Number")},
                modifier= Modifier.weight(4f),
                colors = TextFieldDefaults.colors().copy(
                    focusedIndicatorColor = colorResource(R.color.dark_green),
                    unfocusedIndicatorColor = colorResource(R.color.dark_green),
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    )

            )

        }
        Spacer(modifier= Modifier.height(16.dp))
        Text("Carrier charges may apply", color = Color.DarkGray, fontSize = 12.sp)
        Spacer(modifier= Modifier.height(24.dp))
        Button(onClick = {

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_green))
        ) {
            Text("Next",fontSize = 16.sp)

        }

        




    }

    
}