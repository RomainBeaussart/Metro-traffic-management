package main



class Line(val line_name: String) {

  var LineName : String = line_name
  var ListStation = List()
  var NumberOfStation = 0

  def NewStation(Station_A: String, Station_B: String): Unit ={
    val station_C = new Station(Station_A, LineName)
    val station_D = new Station(Station_B, LineName)
    var count = 0
    var memory = 0

    var ListFonction = ListStation

    while (memory == 0){
      if (NumberOfStation == 0){
        ListStation.patch(count, Seq(station_C), 0)
        ListStation.patch(count+1,Seq(station_D), 0)
        memory = 1
      }
      else if (count == NumberOfStation/2){
        ListStation.patch(count, Seq(station_C), 0)
        ListStation.patch(count+1,Seq(station_D), 0)
        memory = 1
      }
      else{
        ListFonction = ListFonction.tail
        count += 1
      }
    }
  }

  def NextStation(ActualStation: String): Station ={
    val memory = 0
    var ListFonction = ListStation
    while (memory == 0){
      if (ListFonction.head != ActualStation){
        ListFonction = ListFonction.tail

      }
      else{
        ListFonction = ListFonction.tail
        if(ListFonction.isEmpty){
            return ListStation.head
        }
        else{
          return ListFonction.head
        }

      }
    }
  }

}