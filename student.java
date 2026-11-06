class Student
{
    String name;
    int marks;
    int rollNo;

    public static void main(String args[])
    {
        Student s = new Student();

        s.name = "Rahul";
        s.marks = 85;
        s.rollNo = 101;

        System.out.println("Student Details:");
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
        System.out.println("Roll Number: " + s.rollNo);
    }
}
