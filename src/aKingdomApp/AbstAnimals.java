package aKingdomApp;

public abstract class AbstAnimals 
{   
    // protected int food;
    private static int maxId = 0;
	protected int id;
	protected String name;
    protected int dyear;

    public AbstAnimals(String name, int dyear)
	{
		maxId++;
		id = maxId;
		this.name = name;
        this.dyear = dyear;
	}

    public String consume()
    {
        return "Food";
    }

	public int getId()
    {
    	return id;
    }

    // public AbstAnimals()
    // {
    //     food = 1;
    // }
    // public AbstAnimals(int food)
    // {
    //     this.food = food;
    // }

    public String getName()
    {
    	return name;
    }

    // public void setName(String name)
    // {
    // 	this.name = name;
    // }

    public int getYear()
    {
        return dyear;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    //  abstract String getPath();
    //  abstract String getYear();

    // void consume()
    // {
    //     food--;
    // }

    // void consume(int bites)
    // {
    //     food = food - bites;
    // }

    // int getFoodAmt()
    // {
    //     return food;
    // }

    // void addFood(int i)
    // {
    //     food = food + i;
    // }
    
    @Override
    public String toString()
    {
        return "Animals{" + "Id=" + id + ", name=" + name +  '\'' + ", yearNamed=" + dyear + '}' + '\n';
    }

}
