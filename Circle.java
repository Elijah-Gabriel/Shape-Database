public class Circle implements Shape
{
private double radius;

public Circle()
{
	this.radius = 1.0;
}
public Circle(double aradius)
{
	this.radius = aradius;
}
public double getRadius()
{
	return this.radius;
}
public void setRadius(double aradius)
{
	if(aradius >= 1.0)
	{
		this.radius = aradius;
	}
}
@Override
public double getArea() {
	return Math.PI*(radius*radius);
}
@Override
public String getShapeType() {
	// TODO Auto-generated method stub
	return null;
}
}

