package aKingdomApp;

public class AbstAnimals 
{   
    protected int food;
    // public static int maxId = 0;
	protected int id;
	protected String name;
    protected int dyear;

    public AbstAnimals(String name)
	{
		// maxId++;
		// id = maxId;
		this.name = name;
	}

	public int getId()
    {
    	return id;
    }

    public AbstAnimals()
    {
        food = 1;
    }
    public AbstAnimals(int food)
    {
        this.food = food;
    }

    public String getName()
    {
    	return name;
    }

    public void setName(String name)
    {
    	this.name = name;
    }

    public int getYear()
    {
        return dyear;
    }

    // abstract String getPath();
    // abstract String getName();

    void consume()
    {
        food--;
    }

    void consume(int bites)
    {
        food = food - bites;
    }

    int getFoodAmt()
    {
        return food;
    }

    void addFood(int i)
    {
        food = food + i;
    }
    

}
