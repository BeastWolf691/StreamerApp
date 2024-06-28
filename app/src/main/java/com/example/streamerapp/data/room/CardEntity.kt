package com.example.streamerapp.data.room

import android.view.textclassifier.TextLanguage
import android.view.textclassifier.TextLinks
import android.widget.RemoteViews
import androidx.activity.result.contract.ActivityResultContracts
import androidx.room.Entity
import org.w3c.dom.Text
import java.net.URL
import java.util.Locale.Category

@Entity(tableName = "cards")
data class CardEntity(
   val id: Long = 0,
   val pseudo : String,
   val letterRange : String,
   val viewersRange: String,
   val imageURL: URL,
   val views: RemoteViews,
   val category: Category,
   val languages: TextLanguage,
   val text: Text,
   val links: TextLinks,
   val video: ActivityResultContracts.CaptureVideo

)