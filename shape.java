interface Shape
{
    double area();
    double perimeter();
}

class Rectangle implements Shape
{
    double length = 10;
    double breadth = 5;

    public double area()
    {
        return length * breadth;
    }

    public double perimeter()
    {
        return 2 * (length + breadth);
    }

    public static void main(String args[])
    {
        Rectangle r = new Rectangle();

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
