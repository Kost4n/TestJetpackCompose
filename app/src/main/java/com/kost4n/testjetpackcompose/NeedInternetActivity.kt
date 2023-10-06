package com.kost4n.testjetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kost4n.testjetpackcompose.ui.theme.TestJetpackComposeTheme

class NeedInternetActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestJetpackComposeTheme {
                NeedInetPreview()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun NeedInetPreview() {
        val textNeed = "Подключитесь к интернету и нажмите кнопку"
        val textButton = "Перезапустить"
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = textNeed,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 150.dp)
            )
            Button(
                shape = RoundedCornerShape(40),
                modifier = Modifier
                    .padding(top = 400.dp),
                onClick = {
                    startActivity(Intent(this@NeedInternetActivity, LoadingActivity::class.java))
                }
            ) {
                Text(text = textButton, fontSize = 22.sp)
            }
        }
    }
}