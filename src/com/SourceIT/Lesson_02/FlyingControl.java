package com.SourceIT.Lesson_02;

/**
 * @author Bogdan Kukharskiy
 * created on 21.07.2015.
 *
 * Describes some flying control methods
 */
public interface FlyingControl
{
    void accelerate(short deltaV);
    void decelerate(short deltaV);

}
