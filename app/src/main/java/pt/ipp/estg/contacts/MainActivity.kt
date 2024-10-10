package pt.ipp.estg.contacts

import android.os.Bundle
import android.text.Layout
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendModeColorFilter
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.ipp.estg.contacts.ui.theme.ContactsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ContactScreen()
                }
            }
        }
    }
}

@Composable
fun ContactScreen () {
    Box (
        modifier = Modifier
            .background(color = Color.White)
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.catpic),
                    contentDescription = "a coding cat",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .aspectRatio(4f / 3f)
                        .padding(bottom = 30.dp)
                )
                Text(
                    text = "Kitty Meow",
                    color = Color.White,
                    fontSize = 38.sp,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 60.dp, start = 60.dp)
                        .align(Alignment.BottomStart)
                )
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(end = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .size(60.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(
                            text = "★",
                            fontSize = 24.sp,
                            color = Color.White,
                            modifier = Modifier
                                .padding(vertical = 10.dp)
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .padding(start = 14.dp, end = 20.dp)
            ) {
                Column {
                    Box {
                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            //with phone icon
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.phone),
                                    contentDescription = "phone icon",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(20.dp)
                                        .align(Alignment.CenterStart)
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text( //phone number
                                    text = "(650) 555-1234",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                )
                                Text( //type of phone
                                    text = "Mobile",
                                    color = Color.Gray,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.message),
                                    contentDescription = "message icon",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .align(Alignment.Center)
                                )
                            }
                        }
                    }
                    Box {
                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            //without phone icon
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {}
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text( //phone number
                                    text = "(323) 987-6543",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                )
                                Text( //type of phone
                                    text = "Work",
                                    color = Color.Gray,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.message),
                                    contentDescription = "message icon",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .align(Alignment.Center)
                                )
                            }
                        }
                    }
                    Spacer(
                        modifier = Modifier
                            .height(8.dp)
                    )
                    HorizontalDivider(
                        color = Color.Gray,
                        thickness = 1.dp,
                        modifier = Modifier
                            .padding(start = 60.dp)
                    )
                    Box {
                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            //with email icon
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.email),
                                    contentDescription = "phone icon",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .size(20.dp)
                                        .align(Alignment.CenterStart)
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text( //phone number
                                    text = "miau@gmail.com",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                )
                                Text( //type of phone
                                    text = "Personal",
                                    color = Color.Gray,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {}
                        }
                    }
                    Box {
                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            //without email icon
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {}
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text( //phone number
                                    text = "meow@estg.ipp.pt",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                )
                                Text( //type of phone
                                    text = "Work",
                                    color = Color.Gray,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                            ) {}
                        }
                    }
                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun ContactScreenPreview() {
    ContactsTheme {
        ContactScreen()
    }
}