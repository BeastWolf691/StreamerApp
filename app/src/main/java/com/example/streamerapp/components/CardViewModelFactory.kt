package com.example.streamerapp.components//package com.example.streamerapp.viewmodel
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.streamerapp.data.firebase.FirebaseService
//
//class CardViewModelFactory(private val firebaseService: FirebaseService) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(CardViewModel::class.java)) {
//            @Suppress("UNCHECKED_CAST")
//            return CardViewModel(firebaseService) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}
