package aKingdomApp;

public class Birds implements Animal 
{
    //move - fly, breath - lungs, reproduce - eggs
    private String move;
	private String breath;
    private String reproduce;


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
