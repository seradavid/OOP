class Student extends Person
{
    Student()
    {
        System.out.println("Student");
    }
    
    Student(int age)
    {
        super(age);
    }
    
    int getAge2()
    {
        return super.getAge();
    }
}
