import java.awt.Color;

public class TurlteDropTest
{
  public static void main(String[] args)
  {
    FileChooser.setMediaPath("mediasources/");
    World world = new World(800,800);
    Picture back = new Picture(800,800);
    back.setAllPixelsToAColor(Color.GREEN);
    world.setPicture(back);
    Turtle turtle = new Turtle(world);
    turtle.setColor(new Color(255, 0, 255));
    turtle.setPenWidth(2);
    Picture p = 
      new Picture(FileChooser.getMediaPath("chisum.jpg"));
    p=p.scale(.5,.5);
    //turtle.penUp();
    for (int i = 0; i < 360; i=i+45)
    {
      turtle.forward(200);
      turtle.drop(p);
      turtle.backward(200);
      turtle.turn(45);
    }
  }
}