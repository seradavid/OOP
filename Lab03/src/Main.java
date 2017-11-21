import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args)
    {
        System.out.println(fact(49) * fact(6) / fact(30));
    }
    
    private static int fact(int i)
    {
        if(i > 0)
            return i * fact(i-1);
        return 1;
    }
}
