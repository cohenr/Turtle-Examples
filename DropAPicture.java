import java.awt.Color;

public class DropAPicture
{
  public static void main(String[] args)
  {
    FileChooser.setMediaPath("mediasources/");
    World world = new World(800,800);
    Turtle turtle = new Turtle(world);
    turtle.setColor(new Color(255, 0, 255));
    turtle.setPenWidth(2);
    Picture p = 
      new Picture(FileChooser.getMediaPath("chisum.jpg"));
    p=p.scale(.5,.5);
    // This is a single line comment
    // Here is where the turtle does stuff
    turtle.forward(200);
    turtle.drop(p);
    turtle.backward(200);
    turtle.turn(180);
    turtle.forward(200);
    turtle.drop(p);
    turtle.backward(200);
  }
}
