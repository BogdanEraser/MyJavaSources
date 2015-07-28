package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 2015-07-21.
 *
 * This class describes Jet Airplanes, based on Airplane
 *
 */
public class JetAirplane extends Airplane
{
    private boolean forsage;
    public boolean isForsageEnabled()
    {
        return forsage;
    }

    public void setForsageEnable(boolean forsage)
    {
        this.forsage = forsage;
    }

    @Override
    public String toString()
    {
        return this.getName() + " - реактивный самолет." + '\'' +
                "использует топливо" + this.getFuelType();
    }

    public JetAirplane(String fuelType, byte enginesQuantity, short minTakeOffSpeed)
    {
        super(fuelType, enginesQuantity, minTakeOffSpeed);
    }

}
