package aKingdomApp;

public class Birds extends AbstAnimals
{
    //move - fly, breath - lungs, reproduce - eggs
    private String move;
	private String breath;
    private String reproduce;


    public Birds(String name, int dyear)
    {
        super(dyear);
        this.name = name;
    }


    public String getMove()
    {
    	return move;
    }

    public void setMove(String move)
    {
    	this.move = move;
    }

    public String getBreath()
    {
    	return breath;
    }

    public void setBreath(String breath)
    {
    	this.breath = breath;
    }

    public String getReproduce()
    {
    	return reproduce;
    }

    public void setReproduce(String reproduce)
    {
    	this.reproduce = reproduce;
    }

}
