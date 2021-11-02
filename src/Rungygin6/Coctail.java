package Rungygin6;

public class Coctail extends Food
{
    /* extends - значит класс является наследником
           другого класса */


    public Coctail(String drink, String fruit)                 // конструктор инициализации
    {
        super("Коктейль");
        par1 = drink;
        par2 = fruit;
    }
    public boolean equals(Object arg0)  // переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Coctail)) return false;
            if (!(par1.equals(((Coctail)arg0).par1))) return false;
            return par2.equals(((Coctail)arg0).par2);
        } else
            return false;
    }
    public Double calculateCalories()       // реализация метода подсчета калорий
    {
        calories=0.0;
        if(!par1.equals("cola") && !par1.equals("sprite") && !par2.equals("apple") && !par2.equals("orange"))
            return calories;
        if(par1.equals("cola"))
        {
            calories += 40.0;
        }
        if(par1.equals("sprite"))
        {
            calories += 30.0;
        }
        if(par2.equals("apple"))
        {
            calories += 20.0;
        }
        if(par2.equals("orange"))
        {
            calories += 10.0;
        }
        return calories;
    }
    public String getDrink()         // возвращает напиток
    {
        return par1;
    }
    public String getFruit()           // возвращает фрукт
    {
        return par2;
    }
    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString() + " c напитком: " + par1 + " и с фруктом" + par2;
    }
    public void consume()            // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " выпит");
    }

}