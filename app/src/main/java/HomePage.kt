package com.hastings.musichomepage


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun MusicHomePage(){
    AppTitle()
}

@Composable
fun AppTitle(){
 Column (modifier = Modifier.padding(15.dp), horizontalAlignment = Alignment.CenterHorizontally){
     Row(modifier = Modifier.fillMaxWidth().padding(10.dp)){
         Image(
             painter = painterResource(R.drawable.images__3_),
             contentDescription = "",
             contentScale = ContentScale.Fit,
             modifier = Modifier.size(100.dp)
         )
         Text(
             text = "Sound\nWave",
             fontSize = 30.sp,
             modifier = Modifier.padding(5.dp),
             fontWeight = FontWeight.Bold
         )
         Spacer(
             modifier = Modifier.width(15.dp)
         )

         IconButton(onClick = {}) {
             Icon (painter = painterResource(R.drawable.search_icon), "Search Button")

         }
         IconButton(onClick = {}) {
             Icon(painter = painterResource(R.drawable.replay),"Replay")

         }
         IconButton(onClick = {}) {
             Icon(painter = painterResource(R.drawable.verti_dots), "Setting")
         }
     }
     Row(modifier = Modifier.padding(7.dp), Arrangement.Start){
         Button(onClick = {}){
             Text(
                 text = "ARTIST"
             )
         }
         Button(onClick = {}){
             Text(
                 text = "ALBUM"
             )
         }
         Button(onClick = {}){
             Text(
                 text = "SONGS"
             )
         }
         Button(onClick = {}){
             Text(
                 text = "GENRE"
             )
         }
     }
     ListOfSongs()
     BottonIcons()

 }
}
@Composable
fun ListOfSongs() {
    val checkedItem = remember { mutableStateListOf(false) }
    var myList = getAllListOfMusic()
    LazyColumn(content = {
        itemsIndexed(myList, itemContent = {index, item ->
           ListOfMusicItems(item)
        })
    })
}
@Composable
fun ListOfMusicItems(item: ListOfMusic){
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp)){
        Image(
            painter = painterResource(item.musicArtwork),
            contentDescription = item.artistName,
            modifier = Modifier.clip(CircleShape).size(50.dp)
        )
        Column(modifier = Modifier.fillMaxWidth()
            .padding(8.dp),
            horizontalAlignment = Alignment.Start){
            Text(
                text = item.artistName,
            )
            Text(
                text = item.songTitle,
            )
        }
    }
}
@Composable
fun BottonIcons(){
    Column(modifier = Modifier.padding(20.dp).fillMaxSize(), horizontalAlignment = Alignment.Bottom as Alignment.Horizontal) {
        Row(modifier = Modifier.padding(20.dp),) {
            Image(
                painter = painterResource(R.drawable.video_artwork),
                contentDescription = "audio",
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.width(50.dp))
            IconButton(onClick = {}) {
                Icon(painter = painterResource(R.drawable.playlist_icon),"Play List")

            }
            Spacer(modifier = Modifier.width(50.dp))
            Image(
                painter = painterResource(R.drawable.three_dots_icon),
                contentDescription = "more",
                modifier = Modifier.size(60.dp).clip(CircleShape)
            )
        }
    }
}
@Preview (showBackground = true)
@Composable
fun Home(){
    MusicHomePage()
}
