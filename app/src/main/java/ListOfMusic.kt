package com.hastings.musichomepage


data class ListOfMusic(
        var artistName: String,
        var songTitle: String,
        var musicArtwork: Int,
        //var music: Int
    )


fun getAllListOfMusic() : List<ListOfMusic> {
    return listOf(
        ListOfMusic("Dax","Dear alcohol",R.drawable.dear_alcohol_alt),
        ListOfMusic("Dax","Dear mom",R.drawable.music_artwork),
        ListOfMusic("Dax","i need a break",R.drawable.dear_alcohol_alt),
        ListOfMusic("Dax","Calling devil",R.drawable.music_artwork),
        ListOfMusic("Dax","Catch the rain",R.drawable.dear_alcohol_alt),
        ListOfMusic("Dax","Dear alcohol",R.drawable.music_artwork),
        ListOfMusic("Dax","Dear mom",R.drawable.music_artwork),
        ListOfMusic("Dax","i need a break",R.drawable.dear_alcohol_alt),
        ListOfMusic("Dax","Calling devil",R.drawable.music_artwork),
        ListOfMusic("Dax","Catch the rain",R.drawable.dear_alcohol_alt),
        ListOfMusic("Dax","Dear alcohol",R.drawable.music_artwork),
        ListOfMusic("Dax","Dear mom",R.drawable.music_artwork),

        )
}