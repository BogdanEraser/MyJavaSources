package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 2015-07-21.
 *
 * This class describes Balloon, based on flying object
 *
 */
public class Balloon extends FlyingObject
{
    private int balloonVolume;
    public int getBalloonVolume()
    {
        return balloonVolume;
    }

    public void setBalloonVolume(int balloonVolume)
    {
        this.balloonVolume = balloonVolume;
    }

    @Override
    public void flyingPrinciple()
    {
        System.out.println("Принцип полета - подъемная сила от нагретого воздуха в баллоне");
    }

    public Balloon()
    {
        this.balloonVolume = 250;   //задаем объем шара по умолчанию
    }
    public Balloon(int balloonVolume)
    {
        this.balloonVolume = balloonVolume;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Balloon))
            return false;
        Balloon b = (Balloon)obj;
        return b.balloonVolume == balloonVolume;
    }

    @Override
    public int hashCode()
    {
        int res;
        res = 143*this.balloonVolume;
        return res;
    }
}


