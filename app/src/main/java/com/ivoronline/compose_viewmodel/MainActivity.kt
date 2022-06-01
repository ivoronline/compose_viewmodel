package com.ivoronline.compose_viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val myViewModel = MyViewModel()                                            //Create Model Instance

    setContent {
      Button({myViewModel.increase()}) { Text("Count = " + myViewModel.count) }//Call Function & Display Data
    }

  }
}
