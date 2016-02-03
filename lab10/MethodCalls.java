public class MethodCalls
{
    public static int addDigit(int number, int digit)
    {
        if (((number/100) < 10 && ((number/100) > 0 )))
        {
            digit = digit*1000;
        }
        if (((number/100) > 10) && ((number/100) < 100))
        {
            digit = digit*10000;
        }
        if (((number/100) > 100) && ((number/100) < 1000))
        {
            digit = digit*100000;
        }
        if (number < 0)
        {
            digit = (digit * 100);
            number = number - digit;
            return number;
        }
        number = number + digit;
        System.out.println(number);
        return number;
    }
    public static int join(int number2, int addon2)
    {
        if(addon2 < 100 && addon2 > 0)
        {
            addon2 = (number2*100) + (addon2);
            return addon2;
        }
        if (addon2 > 1000 && addon2 < 10000)
        {
            addon2 = (number2*10000) + (addon2);
            return addon2;
        }
        if (addon2 < 0)
        {
            addon2 = (number2*100) + (addon2);
            return (addon2*-1);
        }
        return addon2;
    }
    public static void main(String []  arg)
    {
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}
