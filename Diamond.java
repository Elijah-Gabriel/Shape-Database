public class Diamond extends ShapeBasics implements DiamondInterface
{
private int width;
public Diamond()
  {
    super();
    this.width = 0;
  }
public Diamond( int awidth, int anOffset)
  {
    super(anOffset);
    this.width = awidth;
  }
public int getwidth()
  {
    return this.width;
  }
public void setWidth(int aWidth)
  {
    if(width >= 0)
    {
       this.width = aWidth;
    }
  }

public void drawHere()
  {
     drawTopV();
     drawBottomV();
}

 private void drawTopV()
   {
   int count = (this.width+1)/2-this.getOffset();
      for(int i=0; i<(this.width+1)/2;i++)
          {
             for(int j=0; j<count;j++)
                {
               System.out.print(" ");
             }
             count--;
                System.out.print("*");
                  for(int j=0; j<2*i-1;j++)
                  {
                    System.out.print(" ");
                  }
                  if( i!= 0)
                  {
                    System.out.print("*");
                  }
                  System.out.println();
    }
}
 private void drawBottomV()
  {
   int count = this.getOffset()+1;
      for(int i=0; i<(this.width+1)/2-1;i++)
          {
             for(int j=0; j<i+1;j++)
                {
               System.out.print(" ");
             }
             count--;
                System.out.print("*");
                  for(int j=0; j<this.width-4-2*i;j++)
                  {
                    System.out.print(" ");
                  }
                  if(i!= (this.width-1)/2-1)
                  {
                    System.out.print("*");
                  }
                  System.out.println();
    }
}
}

  