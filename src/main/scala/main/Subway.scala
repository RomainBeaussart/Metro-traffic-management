package main

import Station

class Subway(val SubwayNumber: Int, val CurrentStation: String) {

    var full : Boolean = false
    var used : Boolean = false

    var subwayNumber : Int = SubwayNumber
    var currentStation : String = CurrentStation
   
    /* Permet d'informer les autres metro que la rame est à l'arret à une station X */
    def stationStop(){
        // TODO Envoie de la station à la ligne de metro
   }

   def use():Boolean {
       this.use = true
   }

   def getCurrentStation():String {
       return this.currentStation
   }

   def emergencyStop() {
       //TODO retourner variable arret d'urgence avec nom de la station en cours
   } 

    
}