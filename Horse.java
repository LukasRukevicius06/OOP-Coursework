
/**
 * Write a description of class Horse here.
 * 
 * @Lukas Rukevicius 
 * @version 1.0
 */
public class Horse
{
    //Fields of class Horse
    private char horseSymbol;
    private String horseName;
    private double horseConfidence;
    private int distance;
    private boolean horseFall;
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
       self.horseSymbol = horseSymbol;
       self.horseName = horseName;
       self.horseConfidence = horseConfidence;
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        horseFall = true;
    }
    
    public double getConfidence()
    {
       return horseConfidence;
    }
    
    public int getDistanceTravelled()
    {
        return distance;
    }
    
    public String getName()
    {
        return horseName;
    }
    
    public char getSymbol()
    {
        return horseSymbol;
    }
    
    public void goBackToStart()
    {
        
    }
    
    public boolean hasFallen()
    {
        if(horseFall == true)
        {

        }
    }

    public void moveForward()
    {
        
    }

    public void setConfidence(double newConfidence)
    {
        
    }
    
    public void setSymbol(char newSymbol)
    {
        
    }
    
}
