class Kelvin (Temp: Double) : Temperature(Temperature.Unit.K, Temp){


    override fun getTemp() : Double{
        return super.getTemp(Unit.K);
     }


    override fun getTempIn(unit: Temperature.Unit) : Double{
        return super.getTemp(unit);
    }
 }
