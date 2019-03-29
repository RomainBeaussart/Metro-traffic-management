package main

import Station

class Subway(val SubwayNumber: Int) {

    var full : Boolean = false
    var subwayNumber : Int = SubwayNumber
    var currentStation : String = null
   
    /* Permet d'informer les autres metro que la rame est à l'arret à une station X */
    def stationStop(){
        // TODO Envoie de la station à la ligne de metro
   }
}