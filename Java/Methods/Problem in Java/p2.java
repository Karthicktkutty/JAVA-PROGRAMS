class Person { 
    private int age; 
    public void setAge(int a) { 
        if (a > 0) { 
            age = a; 
        System.out.println("Age i greater " + a); 
        } else { 
            System.out.println("Age i less than"); 
        }
    }
    public int getAge(int a) { 
        age = a; 
        return a; 
    } 
} 
class Main { public static void main(String[] args) { 
    System.out.println("Try programiz.pro"); 
    Person p = new Person(); 
    int x = p.getAge(20); 
    System.out.println(x);
    p.setAge(40); 
} 
}