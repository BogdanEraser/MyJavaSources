package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 2015-07-21.
 *
 * This class describes Airplane, based on flying object
 *
 */
public class Airplane extends FlyingObject
{
    private String fuelType;
    private byte enginesQuantity;
    private short minTakeOffSpeed;

    public short getMinTakeOffSpeed()
    {
        return minTakeOffSpeed;
    }

    public void setMinTakeOffSpeed(short minTakeOffSpeed)
    {
        this.minTakeOffSpeed = minTakeOffSpeed;
    }

    public byte getEnginesQuantity()
    {
        return enginesQuantity;
    }

    public void setEnginesQuantity(byte enginesQuantity)
    {
        this.enginesQuantity = enginesQuantity;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    @Override
    public void flyingPrinciple()
    {
        System.out.println("Принцип полета - подъемная сила крыльев");
    }

    @Override
    protected void takeOff()
    {
        if (this.getSpeed()<minTakeOffSpeed) System.out.println("Взлет невозможен. Недостаточная скорость");
        else this.setzCoordinate(getzCoordinate()+10);  //увеличиваем высоту на 10
    }

    public Airplane(String fuelType, byte enginesQuantity, short minTakeOffSpeed)
    {
        this.fuelType = fuelType;
        this.enginesQuantity = enginesQuantity;
        this.minTakeOffSpeed = minTakeOffSpeed;
    }
}
