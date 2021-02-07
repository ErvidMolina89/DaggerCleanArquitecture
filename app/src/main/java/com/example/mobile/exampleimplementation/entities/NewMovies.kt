package com.example.mobile.exampleimplementation.entities

class NewMovies(){
    var limit                   : Int? = null
    var number_of_page_results  : Int? = null
    var number_of_total_results : Int? = null
    var status_code             : Int? = null
    var results                 : MutableList<NewMovie>? = null
    var version                 : String? = null
}