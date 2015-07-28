package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 2015-07-21.
 *
 * This class describes basic flying object
 *
 */

public abstract class FlyingObject implements com.SourceIT.lesson_02.FlyingControl
{
    private short speed;
    private short capacity;
    private double cost;
    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;
    private String name = "имя не задано";

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public short getCapacity()
    {
        return capacity;
    }

    public void setCapacity(short capacity)
    {
        //ограничиваем ввод вместимости
        if (capacity > 0) this.capacity = capacity;
        else System.out.println("Отрицательная вместительность невозможна");
    }

    public short getSpeed()
    {
        return speed;
    }

    public void setSpeed(short speed)
    {
        this.speed = speed;
    }

    public double getCost()
        {
            return cost;
        }

    public void setCost(double cost)
        {
            //ограничиваем ввод цены
            if (cost > 0) this.cost = cost;
            else System.out.println("Отрицательная цена невозможна");
        }

    public void flyingPrinciple()
        {
            System.out.println("Принцип полета не определен");
        }

    public double getxCoordinate()
    {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate)
    {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate()
    {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate)
    {
        this.yCoordinate = yCoordinate;
    }

    public double getzCoordinate()
    {
        return zCoordinate;
    }

    public void setzCoordinate(double zCoordinate)
    {
        this.zCoordinate = zCoordinate;
    }

    @Override
    public String toString()
    {
        return "Неопознанный летающий объект{" +
                "скорость=" + speed +
                ", вместимость=" + capacity +
                ", стоимость=" + cost +
                '}';
    }

    @Override
    public void accelerate(short deltaV)
    {
        this.speed += deltaV;
    }

    @Override
    public void decelerate(short deltaV)
    {
        this.speed -= deltaV;
    }

    protected void takeOff()
    {
        System.out.println("не определенный метод взлета");
    }
}


