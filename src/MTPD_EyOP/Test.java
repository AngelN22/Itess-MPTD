package MTPD_EyOP;

import test.Triangle;

/**
 *
 * @author angel
 */
public class Test {
    public Test(){
    
}
    public static void main(String[] args) {
        Triangle triDefault = new Triangle();
        
        System.out.println(triDefault);
        System.out.println("Area: " + triDefault.computeArea());
        
        Triangle triParams = new Triangle(5.0, 4.0);
        System.out.println(triParams);
        System.out.println("Area: " + triParams.computeArea());
    }
    
}
