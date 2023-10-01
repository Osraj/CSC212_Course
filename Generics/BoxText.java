package Generics;

public class BoxText 
{
    public static void main(String[] args)
    {
        Box<Integer> integerBox = new Box<Integer>(new Integer(10));
        
        // can be used as class Integer
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
        
        // can be used as type int
        int num = integerBox.get();
        System.out.println(num);

        
        Box<String> stringBox = new Box<String>("ABC");
        String someString = stringBox.get();
        System.out.println(someString);
    }    
}
