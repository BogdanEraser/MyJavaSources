package com.SourceIT.Lesson_03;

/**
 * Created by Bogdan Kukharskiy on 27.07.15.
 * РЎС‡РёС‚Р°РµРј СЃСѓРјРјСѓ СЂСЏРґР° 1! - 2! + 3! вЂ“ 4! + 5! - вЂ¦ + n! РґР»СЏ Р·Р°РґР°РЅРЅРѕРіРѕ С‡РёСЃР»Р° n > 0. 
 * Р§РёСЃР»Рѕ n Р·Р°РґР°РµС‚СЃСЏ РІ РєРѕРґРµ РїСЂРѕРіСЂР°РјРјС‹.
 */
public class task_04
{
    static int calc(int n){
        int sum = 0;
        int sign = 1;
        int mult = 1;
        for (int i = 1; i <= n; i++)
        {
            sum=sum+sign*mult*i;
            mult=mult*i;
            sign=sign*-1;
        }
        return sum;
    }
    
    
    public static void main(String[] args)
    {
        int n1 = 19;
        System.out.println("РЎСѓРјРјР° СЂСЏРґР° РґРѕ " + n1 + " = " + calc(n1));

    }
}
