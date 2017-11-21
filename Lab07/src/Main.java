public class Main
{
    
    public static void main(String[] args)
    {
        Person p = new Person(21);
        try
        {
            p.tryToParty();
        } catch (UnderageException e)
        {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally
        {
            System.out.println("Henlo");
        }
        
        //p.tryToParty();
        
        try
        {
            doIt();
        } catch (StackOverflowError e)
        {
            System.out.println("asdf ");
        }
    }
    
    static private void doIt()
    {
        doIt();
    }
}
