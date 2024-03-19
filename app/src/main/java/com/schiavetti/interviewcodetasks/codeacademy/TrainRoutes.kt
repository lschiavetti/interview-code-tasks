package com.schiavetti.interviewcodetasks.codeacademy

/**
 *  Create a function that lists the stations on a train route based on an input of stations.
 *  For example, an input of (“NY Penn”) should output “Train is stopping at NY Penn.”
 *  For an input of (“NY Penn,” “Woodside,” “Forest Hills”), the output should be “Train is
 *  stopping at NY Penn, Woodside, and Forest Hills.”
 *
 * If you want to challenge yourself a bit more, add a second input that includes train
 * departure time, train number, and destination station.
 * So, with the inputs (234, “10:00”, “Montauk”) and (“NY Penn,” “Babylon,” “Sayville”),
 * the output should be “10:00 train number 234 to Montauk is stopping at NY Penn,
 * Babylon and Sayville.”
 *
 * Remember that the train number should be input as an integer but output as part of a string.
 *
 *  Source: https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
 */
object TrainRoutes {

    fun getTrainRoutes(stations: List<String>): String {
        val stationList = stations.toMutableList()
        val lastStation = stationList.removeLast()

        return "Train stopped at ${stationList.joinToString(" ")} and $lastStation"
    }
}
