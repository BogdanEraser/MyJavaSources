package com.SourceIT.Lesson_04;

/**
 * Created by Bogdan Kukharskiy on 31.07.15.
 * Создать класс "Окружность". Класс должен иметь следующие поля:
 * 1) x, y - координаты центра окружности;
 * 2) radius - радиус окружности.
 * Класс должен иметь следующие методы:
 * 1) передвинуть окружность на dx и dy;
 * 2) проверить попадание заданной точки внутрь данной окружности;
 * 3) проверить попадание другой окружности внутрь данной;
 * 4) вывести на экран параметры окружности
 */
public class Circle
{
    private int x;
    private int y;
    private int radius;

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getRadius()
    {
        return radius;
    }

    //конструктор
    public Circle (int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.radius = r;
    }


    public void move (int dx, int dy)
    {
        this.x = x+dx;
        this.y = y+dy;
    }

    public boolean isPointInCircle(int px, int py)
    {
        if ((px-this.x)*(px-this.x)+(py-this.y)*(py-this.y) <= this.radius*this.radius) {
            System.out.println("Точка с координатами "+px +","+ py+" принадлежит кругу");
            return true;
        }
        else {
            System.out.println("Точка с координатами "+px +","+ py+" НЕ принадлежит кругу");
            return false;
        }
    }

    public boolean isCircleInCircle(Circle C)
    {
        if (Math.sqrt((C.getX()-this.x)*(C.getX()-this.x)+(C.getY()-this.y)*(C.getY()-this.y)) <= this.radius) {
            System.out.println("Круг с параметрамии "+C+" принадлежит кругу "+ this);
            return true;
        }
        else {
            System.out.println("Круг с параметрамии "+C+" НЕ принадлежит кругу "+ this);
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "x = "+ this.x+", y = "+ this.y+", радиус = "+ this.radius;
    }

}
