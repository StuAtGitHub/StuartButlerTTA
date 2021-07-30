
public class Rectangle 

{
    double  width;
    double  height;
    
    public Rectangle ( double initw, double inith)
    {
	
	width = initw;
	height = inith;
    }

  
    
    public double draw ()
    {
	return width * height;
    }

   
    public void setWidth (double newWidth)
    {
	width = newWidth;
    }

    public void setHeight (double newHeight)
    {
	height = newHeight;
    }

   

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
   
}
