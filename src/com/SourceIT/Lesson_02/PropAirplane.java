package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 2015-07-21.
 *
 * This class describes Propeller Airplanes, based on Airplane
 *
 */
public class PropAirplane extends Airplane
{
    private byte bladesCount;

    public byte getBladesCount()
    {
        return bladesCount;
    }

    public void setBladesCount(byte bladesCount)
    {
        this.bladesCount = bladesCount;
    }

    @Override
    public String toString()
    {
        return this.getName() + " - пропеллерный самолет." + '\'' +
                "использует топливо" + this.getFuelType();
    }

    public PropAirplane(String fuelType, byte enginesQuantity, short minTakeOffSpeed, byte bladesCount)
    {
        super(fuelType, enginesQuantity, minTakeOffSpeed);
        this.bladesCount = bladesCount;
    }
}
