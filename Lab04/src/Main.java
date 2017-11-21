public class Main
{
    
    public static void main(String[] args)
    {
        Point pt = new Point(1, 1);
        
        d(pt.x);
        
        System.out.println(pt.x);
    }
    
    static private void d(int k)
    {
        k ^= k;
        System.out.println(k);
    }
    
}

class Point
{
    int x;
    int y;
    
    Point()
    {
        this(0,0);
    }
    
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    Point(int x)
    {
        this.x = x;
    }
}