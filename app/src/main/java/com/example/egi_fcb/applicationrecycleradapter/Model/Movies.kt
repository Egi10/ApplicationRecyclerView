package com.example.egi_fcb.applicationrecycleradapter.Model

/**
 * Created by egi_fcb on 8/10/17.
 */
class Movies {
    var title : String = ""
    var genre : String = ""
    var year : String = ""

    constructor(){}

    constructor(title : String, genre : String, year : String){
        this.title = title
        this.genre = genre
        this.year = year
    }
}