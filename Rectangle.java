public class Rectangle implements Shape
{
private double length;
private double width;

public Rectangle()
{
	this.length = 1.0;
	this.width = 1.0;
}
public Rectangle(double alength, double awidth)
{
	this.length = alength;
	this.width = awidth;
}
public double getlength()
{
	return this.length;
}
public double getwidth()
{
	return this.width;
}
public void setlength(double alength)
{
	if(alength >= 1.0)
	{
		this.length = alength;
	}
}
public void setwidth(double awidth)
{
	if(awidth >= 1.0)
	{
		this.width = awidth;
	}
}
@Override
public double getArea() 
{
	return length*width;
}
@Override
public String getShapeType() 
{
	// TODO Auto-generated method stub
	return null;
}
}

