 class Main {
public static void main(String[] args)
{
   Student s1 = new Student();
   s1.name = "Karthick";
   s1.rollno = 26;
   s1.marks = 77;

   System.out.println(s1.name);
   System.out.println(s1.rollno);
   System.out.println(s1.marks);

   s1.run();
   s1.rollno();
   s1.marks();
}

}