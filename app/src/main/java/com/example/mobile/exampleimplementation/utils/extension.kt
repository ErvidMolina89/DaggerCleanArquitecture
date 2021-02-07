package com.example.mobile.exampleimplementation.utils

import android.util.Log

fun String.mostrarEnconsola(e : Exception? = null ) : String {
    Log.e("Err", this, e);
    return this;
}