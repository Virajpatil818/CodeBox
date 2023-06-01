public class Triangle extends Shape{
    @Override
    public void ComputeArea(){
        double a =getVar1();
        double b =getVar2();

        System.out.println("Area of Triangle :"+(0.5*a*b));
    }
}
