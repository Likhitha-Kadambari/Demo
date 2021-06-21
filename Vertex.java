
import java.util.Scanner;
import java.lang.Math;



class Vertex {
    public static void main(String args[]){

        /* given -16x^2 + 32x + 128
        it is in the from of  ax^2 + bx + c
        so the values of a,b,c are -16,32,128
        */
        double a,b,c;
        a=-16;
        b=32;
        c=128;
        finding_vertex(a,b,c);
    }

    public static void finding_vertex(double a,double b,double c){
        /* for x_vertex = (-b)/(2*a) */
       
        double x_vertex= (-b)/(2*a);
        
        double y_vertex = (-16*(Math.pow(x_vertex, 2)))+(32*(x_vertex))+128;

        
        System.out.println("Vertex for quadratic equation: "+a+"x^2 + "+b+"x + "+c);
        System.out.println("("+x_vertex+","+y_vertex+")");
    }    
}
