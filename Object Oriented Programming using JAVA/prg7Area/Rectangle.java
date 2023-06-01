public class Rectangle extends Shape{
    @Override
    public void ComputeArea(){
        double a =getVar1();
        double b =getVar2();

        System.out.println("Area of Rectangle :"+(a*b));
    }
}
