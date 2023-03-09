public class Rectangle {
  private double length, breadth;

  Rectangle() {

  }

  Rectangle(double l, double b) {
    if (l < 0 || b < 0) {
      System.err.println("Unable to create rectangle");
      return;
    }

    this.length = l;
    this.breadth = b;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("Rectangle: %.2fx%.2f", this.length, this.breadth);
  }

  public static void main(String[] args) {
    Rectangle r;

    r = new Rectangle(-10, 12);

    System.out.println(r);
  }
}
