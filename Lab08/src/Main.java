import java.util.*;

public class Main
{
    
    public static void main(String[] args)
    {
        Person[] p1 = new Person[5];
        p1[0] = new Person(2);
        p1[1] = new Person(3);
        p1[2] = new Person(4);
        p1[3] = new Person(1);
        p1[4] = new Person(5);
        
        Arrays.sort(p1, new PersonComparator());
        
        for (Person i : p1)
        {
            System.out.println(i.getAge());
        }
        
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        printArray(p1);
        printArray(arr);
        
        List<Person> pers = new ArrayList<>();
        pers.add(p1[0]);
        pers.add(p1[1]);
        pers.add(p1[2]);
        pers.add(p1[3]);
    
        pers.sort(new PersonComparator());
        
        Map<String, Person> myMap = new HashMap<>();
        myMap.put("John", new Person(123));
        
        Person john = myMap.get("John");
        System.out.println(john.getAge());
    }
    
    private static <T> void printArray(T[] values)
    {
        for (T i : values)
        {
            System.out.println(i);
        }
    }
}
