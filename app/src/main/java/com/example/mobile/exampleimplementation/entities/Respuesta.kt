package com.example.mobile.exampleimplementation.entities

interface Respuesta {

}

class exito<T>: Respuesta {
    var datos : T? = null
}

class error(title: String, message: String): Respuesta{

}