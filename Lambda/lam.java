//


class lambda {
public static void main(String[] args) {

A obj = (a, b) -> {

System.out.println(a + b);

};
obj.show(5, 10);
}

}
interface A {
public void show(int a, int b);

}