public class TurlteDropTest
{
  public static void main(String[] args)
  {
    FileChooser.setMediaPath("mediasources/");
    World world = new World();
    Turtle turtle = new Turtle(world);
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