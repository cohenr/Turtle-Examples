import java.awt.Color;

public class DropAPictureWithLoops
{
  public static void main(String[] args)
  {
    FileChooser.setMediaPath("mediasources/");   // where to find the picture
    World world = new World(800,800);  // (width, height)
    Turtle turtle = new Turtle(world);  //
    turtle.setColor(new Color(255, 0, 255));  // 
    turtle.setPenWidth(2);
    Picture p = 
      new Picture(FileChooser.getMediaPath("chisum.jpg"));
    p=p.scale(.5,.5);
    
    // Here is where the turtle does stuff
    // Do the following 12 times.  (Why 12?)
    for(int i=0; i<12; i++) {
      turtle.forward(200);
      turtle.drop(p);
      turtle.backward(200);
      turtle.turn(30);
    } // end for
  } // end main
} // end class
