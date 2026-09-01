class Celsius (Temp: Double) : Temperature(Temperature.Unit.C, Temp){


    override fun getTemp() : Double{
        return super.getTemp(Unit.C);
    }

    override fun getTempIn(unit: Temperature.Unit) : Double{
        return super.getTemp(unit);
    }
}