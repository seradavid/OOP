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
    
    void tryToParty()
    {
        if(age < 9000)
        {
            throw new UnderageException();
        }
    
        System.out.println("Party on!");
    }
}
