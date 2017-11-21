import java.util.Comparator;

class PersonComparator implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        return Integer.compare(p1.age, p2.age);
    }
}
