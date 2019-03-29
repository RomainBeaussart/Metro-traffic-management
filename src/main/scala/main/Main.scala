package main

import Subway
import Station

object main {

    /*
    **
    **
    */

    def main (args: Array[String] ){
        init();
    }

    def init(){

        /* --- Stations initialisation --- */

        Station A = new Station()
        Station B = new Station() 
        Station C = new Station()
        Station D = new Station()
        Station E = new Station()


        /* --- Subways initialisation --- */

        Subway S1 = new Subway(1)
        Subway S2 = new Subway(2)
        Subway S3 = new Subway(3)
        Subway S4 = new Subway(4)
        Subway S5 = new Subway(5)
        Subway S6 = new Subway(6)
        Subway S7 = new Subway(7)

    }
}