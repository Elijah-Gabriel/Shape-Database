public class ShapeCollection implements Shape
{
public static final int MAX_ACTIVITIES = 3;
private Shape[] ShapeArr; 

public ShapeCollection()
{
	super();
	this.ShapeArr = new Shape[MAX_ACTIVITIES];
}
public Shape[] getShapeArr()
{
	return this.ShapeArr;
}
public void setShapeArr(Shape[] ShapeArr)
{
	this.ShapeArr = ShapeArr;
}

public void addShapes(Shape aA)
{
	for(int i=0;i<ShapeArr.length;i++)
		  {
		   if(ShapeArr[i] == null)
		   {
			  ShapeArr[i] = aA;
			  return;
		   }
		  }
}
private void sortShapes()
{
	Boolean hasSwapped = true;
	while(hasSwapped == true)
	{
		hasSwapped=false;
		for(int i =0; i<ShapeArr.length-1;i++)
		{
			if(ShapeArr[i] > ShapeArr[i+1])
			{
				Shape temp = ShapeArr[i]; 
				ShapeArr[i] = ShapeArr[i+1];
				ShapeArr[i+1] = temp;
				hasSwapped=true;
			}
		}
	}
}
public void removeShapes(Shape aA)
{
	for(int i=0;i<ShapeArr.length;i++)
	{
		if(ShapeArr[i] != null && ShapeArr[i].equals(aA))
		{
			ShapeArr[i] = null;
			return;
		}
	}
}
public void printShapes()
{
	for(int i=0;i<ShapeArr.length;i++)
	{
		if(ShapeArr[i] == null)
		{
		continue;
		}
	}
}
@Override
public double getArea() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public String getShapeType() {
	// TODO Auto-generated method stub
	return null;
}
}
