class Dog extends Animal
{
    String colour = "Hwite";
    
    private void Bark()
    {
        System.out.println("Ham Ham");
    }
    
    public void Bark(int times)
    {
        while(times-- > 0)
        {
            Bark();
        }
    }
}
