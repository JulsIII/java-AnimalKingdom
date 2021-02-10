package aKingdomApp;

public class Birds extends AbstAnimals
{
    //move - fly, breath - lungs, reproduce - eggs
    // private String move;
	// private String breath;
    // private String reproduce;


    public Birds(String name, int dyear)
    {
        super(name, dyear);
        // this.id = id;
        // this.dyear = dyear;
        // this.name = name;
    }

    @Override
    public String move()
    {
    	return "fly";
    }

    // public void setMove(String move)
    // {
    // 	this.move = move;
    // }

    @Override
    public String breath()
    {
    	return "lungs";
    }

    // public void setBreath(String breath)
    // {
    // 	this.breath = breath;
    // }

    @Override
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
