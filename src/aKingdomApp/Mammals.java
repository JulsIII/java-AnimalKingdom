package aKingdomApp;

public class Mammals extends AbstAnimals
{
    //move - walk, breath - lungs, reproduce - live births

	// private String move;
	// private String breath;
    // private String reproduce;

    public Mammals(String name, int dyear)
    {
        super(name, dyear);
        // this.id = id;
        // this.dyear = dyear;
        // this.name = name;
    }

    @Override
    public String move()
    {
    	return "walk";
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
    	return "live births";
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
