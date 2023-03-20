import java.util.Scanner;

interface Resume
    {
    void biodata();
    }

    class Teacher implements Resume
    {
    Scanner scan;
    String name,qualification,achievements;
    int experience;
    public void biodata()
    {
    scan=new Scanner(System.in);
    System.out.println("Enter the name");
    name=scan.nextLine();
    System.out.println("Enter the qualification");
    qualification=scan.nextLine();
    System.out.println("Enter the achievements");
    achievements=scan.nextLine();
    System.out.println("Enter the experience");
    experience=scan.nextInt();
    }

    void resume()
    {
    System.out.println("Teacher resume");
    System.out.println("______________");
    System.out.println("Name is "+name);
    System.out.println("Qualfication is "+qualification);
    System.out.println("Achievements is "+achievements);
    System.out.println("Experience is "+experience);
    }
    }

    public class Student implements Resume
    {
    String dept,name;
    String result;

    public void biodata()
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the name");
    name=scan.nextLine();
    System.out.println("Enter the department");
    dept=scan.nextLine();
    System.out.println("Enter the result");
    result=scan.nextLine();
    }

    void resume()
    {
    System.out.println("Student Resume");
    System.out.println("______________");
    System.out.println("Name is "+name);
    System.out.println("Department is "+dept);
    System.out.println("Result is"+result);
    }



    public static void main(String[] args)
    {
    //TODO Auto-generated method stub
    Teacher t=new Teacher();
    t.biodata();
    t.resume();
    Student s=new Student();
    s.biodata();
    s.resume();
    }
    }
