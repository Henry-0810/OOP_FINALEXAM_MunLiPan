package finalexam.shapeapp2022;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestShape {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,19,17,8, Color.RED,false);
        Rectangle r2 = new Rectangle(21,22,5,-5, Color.ORANGE,true);
        Rectangle r3 = new Rectangle(45,20,64,10, Color.GREEN,false);

        Oval o1 = new Oval(27,12,43,-2, Color.BLACK,true);
        Oval o2 = new Oval(32,65,12,33, Color.PINK,false);
        Oval o3 = new Oval(8,30,22,20, Color.MAGENTA,true);

        ArrayList<AbstractShape> shapes = new ArrayList<>(Arrays.asList(r1,r2,r3,o1,o2,o3));

        System.out.println("Displaying the state of all the shape objects within the array-list\n\n");

        int i = 1;
        for (AbstractShape shape: shapes) {
            System.out.println("Shape " + i + " Details\n\n" + shape + "\n\n");
            i++;
        }

        Iterator<AbstractShape> shapeIterator = shapes.iterator();
        while(shapeIterator.hasNext()){
            AbstractShape shape = shapeIterator.next();
            if(shape.getWidth()>17){
                shapeIterator.remove();
            }
        }

        System.out.println("Displaying the updated state of all the shape objects within the array-list\n\n");

        int j = 1;
        for (AbstractShape shape: shapes) {
            System.out.println("Shape " + j + " Details\n\n" + shape + "\n\n");
            j++;
        }
    }
}
