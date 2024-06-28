package com.example.streamerapp.data.firebase

import androidx.room.Entity
import androidx.room.PrimaryKey
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject

@Entity(tableName = "cards")
data class CardEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val pseudo: String,
    val letterRange: String,
    val viewersRange: String,
    val imageURL: String,
    val views: String,
    val category: String,
    val languages: String,
    val text: String,
    val links: String,
    val video: String,
)

object StreamerApi {
    private val client = OkHttpClient()

    fun fetchStreamerDetails(pseudo: String): CardEntity? {
        val url = "https://twitchtracker.com/channels/ranking/french/$pseudo" // Remplacez par l'URL de votre API
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) return null

            val responseBody = response.body?.string()
            val json = JSONObject(responseBody)

            return CardEntity(
                pseudo = json.getString("pseudo"),
                letterRange = json.getString("letterRange"),
                viewersRange = json.getString("viewersRange"),
                imageURL = json.getString("imageURL"),
                views = json.getString("views"),
                category = json.getString("category"),
                languages = json.getString("languages"),
                text = json.getString("text"),
                links = json.getString("links"),
                video = json.getString("video")
            )
        }
    }
}

// Exemple d'utilisation :
fun main() {
    val pseudo = "example_streamer"
    val cardEntity = StreamerApi.fetchStreamerDetails(pseudo)

    if (cardEntity != null) {
        println("Streamer Card created: $cardEntity")
        // Utilisez cardEntity pour afficher ou sauvegarder les détails du streameur
    } else {
        println("Failed to fetch streamer details for pseudo: $pseudo")
    }
}
