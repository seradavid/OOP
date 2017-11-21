class Person
{
    int age;
    
    Person()
    {
        age = 0;
    }
    
    Person(int age)
    {
        this.age = age;
    }
    
    int getAge()
    {
        return age;
    }
    
    public String toString()
    {
        return "Person[" + age + "]";
    }
}
