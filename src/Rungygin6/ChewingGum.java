package Rungygin6;

public class ChewingGum extends Food
{
    /* extends - значит класс является наследником
           другого класса */


    public ChewingGum(String flavour)     // конструктор инициализации
    {
        super("Жевательная резинка");               // вызывает конструктор базового класса
        par1 = flavour;
    }
    public boolean equals(Object arg0)  // переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof ChewingGum)) return false;
            return par1.equals(((ChewingGum)arg0).par1);
        } else
            return false;
    }
    public Double calculateCalories()       // реализация метода подсчета калорий
    {
        if(par1.equals("mint"))
        {
            calories = 15.0;
        }
        else if(par1.equals("watermelon"))
        {
            calories = 20.0;
        }
        else if(par1.equals("Cherry"))
        {
            calories = 25.0;
        }
        else return 0.0;
        return calories;
    }
    public String getFlavour()   // возвращает вкус
    {
        return par1;
    }

    public void setFlavour(String flavour)  // изменение вкуса
    {
        this.par1 = flavour;
    }

    public void consume()           // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " съедено");
    }

    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString() + " вкуса '" + par1.toUpperCase() + "'";
    }

}