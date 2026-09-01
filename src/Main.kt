fun main() {
    val myKTemp: Temperature = Kelvin(200.0)
    val myFTemp: Temperature = Fahrenheit(300.0)
    val myCTemp: Temperature = Celsius(400.0)

    println("The temperature is ${myKTemp.getTemp()}")
    println("The temperature is ${myFTemp.getTemp()}")
    println("The temperature is ${myCTemp.getTemp()}")

    myKTemp.setTemp(210.0)
    myFTemp.setTemp(310.0)
    myCTemp.setTemp(410.0)

    println("The temperature is ${myKTemp.getTemp()}")
    println("The temperature is ${myFTemp.getTemp()}")
    println("The temperature is ${myCTemp.getTemp()}")

    println("The temperature is ${myKTemp.getTempIn(Temperature.Unit.F)}")
    println("The temperature is ${myFTemp.getTempIn(Temperature.Unit.C)}")
    println("The temperature is ${myCTemp.getTempIn(Temperature.Unit.K)}")

}