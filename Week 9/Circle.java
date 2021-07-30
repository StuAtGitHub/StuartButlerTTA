

public class Circle
{
  
    private double radius;

    public Circle ( double initradius)
    {
	
	radius = initradius;
    }
    
    public double draw ()
    {
	return Math.PI * radius * radius;
    }

     public void setRadius (double newRadius)
    {
	radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }
}
