import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

private val client = OkHttpClient()

fun executeRequest() {
    val request = Request.Builder()
        .url("https://gamingcampus.fr/boite-a-outils/les-principaux-streamers-francais.html")
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("Unexpected code $response")

        for ((name, value) in response.headers) {
            println("$name: $value")
        }

        println(response.body!!.string())
    }

}