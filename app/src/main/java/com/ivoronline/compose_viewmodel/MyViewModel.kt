package com.ivoronline.compose_viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MyViewModel {

  //STATE VARIABLES (Business Data)
  var count by mutableStateOf(0)

  //FUNCTIONS       (Business Logic)
  fun increase() {
    count++
  }

}
