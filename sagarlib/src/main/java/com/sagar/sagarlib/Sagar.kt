package com.sagar.sagarlib

import android.content.Context
import android.widget.Toast

class Sagar {
    fun helloSagar(context: Context, msg:String="Hello Sagar")= Toast.makeText(context,msg, Toast.LENGTH_SHORT).show()
}