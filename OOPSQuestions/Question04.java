package OOPSQuestions;

//04.Create a class shape with a method draw(). create two subclass circle and
// square that override the draw() method.in the main method,
// use a shape reference to call the method.[Using Ploymorphism]



class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
//sub 01 class circle
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");

    }
}
//sub 02 class square
class Square extends Shape{
    void draw(){
        System.out.println("Drawing a Square");

    }
}
public class Question04 {
    public static void main(String[] args) {
        //Parent reference child object
        Shape s1 = new Circle();
        Shape s2 = new Shape();

        //call overridden methods(runtime ploymorphism)
        s1.draw(); //Output Drawing circle
        s2.draw(); //Output Drawing shape

    }
}





//Hierarchical Inheritance : only one base class and multiple subclass.
//Ploymorphism - we can do overriding - same method name diff in parameter