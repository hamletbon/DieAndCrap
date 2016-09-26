public class Die
{
    private int numDots = 1; //number of dots on the die facing top.


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void roll()
    {
       numDots=(int)((Math.random()*6)+1);
    }    
    
    public int getNumDots()
    {
        return numDots;
    }
    

}
