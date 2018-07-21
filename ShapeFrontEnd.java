import java.util.Scanner;
public class ShapeFrontEnd extends ShapeCollection
{
public static void main(String[] args)
{
	Scanner keyboard = new Scanner(System.in);//Construct the keyboard
	  System.out.println("Welcome to the Shape Adder");
	  boolean quit = false;
	  while(!quit)//Runs until the user quits
	  {
	   System.out.println("Enter 1: to add a Shape, Enter 2: to remove a Shape, Enter 9 to quit");
	   int pick = keyboard.nextInt();
	   keyboard.nextLine();
	   
	   switch(pick)
	   {
	   case 1: //Add Activity
		   int choice = keyboard.nextInt();
		   	System.out.println("Enter 3: Rectangle, Enter 4: Triangle, Enter 5: Circle, Enter 9 to quit");
		   switch(choice)
		   {
		   case 3:
			   System.out.println("Enter the length and the width");
			   double length = keyboard.nextDouble();
			   double width = keyboard.nextDouble();
			   Rectangle Rectangle01 = new Rectangle(); 
			   double area = Rectangle01.getArea();
			   System.out.println(Rectangle01);
		   case 4:
			   System.out.println("Enter the base and the height");
			   double base = keyboard.nextDouble();
			   double height = keyboard.nextDouble();
			   Circle Triangle01 = new Circle(); 
			   double area1 = Triangle01.getArea();
			   System.out.println(Triangle01);
		   case 5:
			   System.out.println("Enter the radius");
			   double radius = keyboard.nextDouble();
			   Circle Circle01 = new Circle(); 
			   double area2 = Circle01.getArea();
			   System.out.println(Circle01);
		   }
	    	break;
	   case 2: //Remove Activity 
	    System.out.println("Enter the name of the shape to be removed");
	    String name1 = keyboard.nextLine();
	    for(int i=0; i<ShapeArr.length;i++)
	    {
	    	if(name1.equalsIgnoreCase(Shape.class.getTypeName()))
	    			{
	    				ShapeArr[i] = null;
	    			}
	    }
	    break;
	   case 9:
		System.out.println("Goodbye");
	    quit = true;
	    break;
	   }
printShape(ShapeArr);
}
}
}