import java.io.*;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Sheep[] turma = new Sheep[5];
        turma[0] = new Sheep(1);
        turma[1] = new Sheep(2);
        turma[2] = new Sheep(5);
        turma[3] = new Sheep(3);
        turma[4] = new Sheep(4);
    
        Arrays.sort(turma);
        
        for(Sheep i : turma)
        {
            System.out.println(i.getWeight());
        }
    }
}