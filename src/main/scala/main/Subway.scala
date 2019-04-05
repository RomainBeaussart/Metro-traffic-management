package main

class Subway(val SubwayNumber: Int, val CurrentStation: Station, NameLine : String) extends Line(NameLine) {

    var full : Boolean = false
    var used : Boolean = false

    var subwayNumber : Int = SubwayNumber
    var currentStation : Station = CurrentStation
   
    /* Permet d'informer les autres metro que la rame est à l'arret à une station X */
    def stationStop(): Unit ={
        currentStation.StationBlock = true
   }

    def SubwayCome(): Unit ={
      var FuturStation = NextStation(currentStation.StationName)
      if (FuturStation.StationBlock){
        return false
      }
      else {
        currentStation = FuturStation
        return true
      }
    }


   def emergencyStop() {
       //TODO retourner variable arret d'urgence avec nom de la station en cours
   } 

    
}