public class Main
{
    
    public static void main(String[] args)
    {
        //Student Ion = new Student(25);
        
        Object caine = new Dog();
        Dog caine2 = new Labrador();
        Labrador lab = new Labrador();
        ((Dog)caine).Bark(7);
        caine2.Bark();
        lab.Bark(5);
        System.out.println(((Dog) caine).colour);
        System.out.println(((Labrador)caine2).colour);
        System.out.println(lab.colour);
        
        //solveMatrix(3, 7);
    }
    
    private static void solveMatrix(int n, int m)
    {
        int i = 0;
        int j = 0;
        int k = 1;
        int starti = 0;
        int startj = 0;
        int limit = n * m;
        
        int[][] matrix = new int[n][m];
        
        while (starti < n && startj < m)
        {
            for (j = startj; j < m && k <= limit; j++)
            {
                matrix[i][j] = k++;
            }
            j--;
            starti++;
            
            for (i = starti; i < n && k <= limit; i++)
            {
                matrix[i][j] = k++;
            }
            i--;
            m--;
            
            for (j = m - 1; j >= startj && k <= limit; j--)
            {
                matrix[i][j] = k++;
            }
            j++;
            n--;
            
            for (i = n - 1; i >= starti && k <= limit; i--)
            {
                matrix[i][j] = k++;
            }
            i++;
            startj++;
        }
        
        for (i = 0; i < matrix.length; i++)
        {
            for (j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
