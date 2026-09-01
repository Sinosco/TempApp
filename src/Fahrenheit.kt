class Fahrenheit (Temp: Double) : Temperature(Temperature.Unit.F, Temp){


    override fun getTemp() : Double{
        return super.getTemp(Unit.F);
    }

    override fun getTempIn(unit: Temperature.Unit) : Double{
        return super.getTemp(unit);
    }
}