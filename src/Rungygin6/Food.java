package Rungygin6;

public abstract class Food implements Consumable, Nutritous
{
    /* класс абстрактный, т.е. нельзя создать объект
   implements - для использования интерфейсоф
   */
    String name = null;
    Double calories = null;
    String par1 = null;
    String par2 = null;

    public Food(String name)   // конструктор инициализации
    {
        this.name = name;
    }
    public Food(String par1,String par2)
    {                                        //конструктор с 2 параметрами
        this.par1 = par1;
        this.par2 = par2;
    }
    public boolean equals(Object arg0)         // перегружен метод сравнения
    {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food) arg0).name == null) return false;
        return name.equals(((Food) arg0).name);
    }

    public String toString()        // перегружен метод преобразования в строку
    {
        return name;
    }

    public String getName()        // возвращает имя
    {
        return name;
    }

    public void setName(String name)        // для изменения имени
    {
        this.name = name;
    }

}