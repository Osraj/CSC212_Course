package Generics;

public class Box<T> 
{
    private T t; // T stands for Type
    public Box(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return t;
    }
}
