class Sheep implements Cloneable, Comparable<Sheep>
{
    private int weight;
    
    Sheep()
    {
        weight = 0;
    }
    
    Sheep(int weight)
    {
        this.weight = weight;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    @Override
    public int compareTo(Sheep o)
    {
        return Integer.compare(this.weight, o.weight);
    }
}
