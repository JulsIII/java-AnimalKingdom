package aKingdomApp;

public class Fish extends AbstAnimals
{
    //move - swim, breath - gills, reproduce - eggs
    // private String move;
	// private String breath;
    // private String reproduce;


    public Fish(String name, int dyear)
    {
        // this.id = id;
        // this.dyear = dyear;
        // this.name = name;
        super(name, dyear);
    }

    @Override
    public String move()
    {
    	return "swim";
    }

    // public void setMove(String move)
    // {
    // 	this.move = move;
    // }

    @Override
    public String breath()
    {
    	return "gills";
    }

    // public void setBreath(String breath)
    // {
    // 	this.breath = breath;
    // }

    public String reproduce()
    {
    	return "eggs";
    }

    // public void setReproduce(String reproduce)
    // {
    // 	this.reproduce = reproduce;
    // }

    // @Override
    // public String toString()
    // {
    //     return "Id=" + id + ", name=" + name + " yearNamed=" + dyear;
    // }

}
