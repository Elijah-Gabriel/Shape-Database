public class Triangle implements Shape
{
private double base;
private double height;

public Triangle()
{
	this.base = 1.0;
	this.height = 1.0;
}
public Triangle(double abase, double aheight)
{
	this.base = abase;
	this.height = aheight;
}
public double getBase()
{
	return this.base;
}
public double getHeight()
{
	return this.height;
}
public void setBase(double abase)
{
	if(abase >= 1.0)
	{
		this.base=abase;
	}
}
public void setHeight(double aheight)
{
	if(aheight >= 1.0)
	{
		this.height=aheight;
	}
}
@Override
public double getArea() 
{
	return base*height;
}
@Override
public String getShapeType() 
{
	// TODO Auto-generated method stub
	return null;
}
}
