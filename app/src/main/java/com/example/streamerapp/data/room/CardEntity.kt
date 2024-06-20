package com.example.streamerapp.data.room

import android.view.textclassifier.TextLanguage
import android.view.textclassifier.TextLinks
import android.widget.RemoteViews
import androidx.activity.result.contract.ActivityResultContracts
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.w3c.dom.Text
import java.net.URL
import java.util.Locale.Category

@Entity(tableName = "cards")
data class CardEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "pseudo") val pseudo : String,
    @ColumnInfo(name = "imageUrl")val imageURL: URL,
    @ColumnInfo(name = "views") val views: RemoteViews,
    @ColumnInfo(name = "category") val category: Category,
    @ColumnInfo(name = "languages") val languages: TextLanguage,
    @ColumnInfo(name = "text") val text: Text,
    @ColumnInfo(name = "links") val links: TextLinks,
    @ColumnInfo(name = "video") val video: ActivityResultContracts.CaptureVideo

)

