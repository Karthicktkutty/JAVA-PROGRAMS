class Person { 
    private int age; 
    public void setAge(int a) { 
        if (a > 0) { age = a; 
        System.out.println("Age i greater " + a); 
        } else { 
            System.out.println("Age i less than"); 
        }
    }
    public int getAge() { 
         System.out.println(age);
        return age; 
    } 
} 
class Main { public static void main(String[] args) { 
    System.out.println("Try programiz.pro"); 
    Person p = new Person(); 
       p.setAge(40); 
    p.getAge(); 
  //  System.out.println(p.getAge());
  //  p.setAge(40); 
} 
}