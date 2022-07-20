
import java.util.Scanner;

    public class LineComparision {

        public static void main(String[] args) {
            Line line1 = new Line();
            double l1 = calculatelength(line1);
            System.out.println(l1);
            Line line2 = new Line();
            double l2 = calculatelength(line2);
            System.out.println(l2);
        }

        public static double calculatelength(Line line) {
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter value of x1");
            line.setX1(scan.nextDouble());
            System.out.println("please enter value of x2");
            line.setX2(scan.nextDouble());
            System.out.println("please enter value of y1");
            line.setY1(scan.nextDouble());
            System.out.println("please enter value of y2");
            line.setY2(scan.nextDouble());
            double xCord= line.getX2()-line.getX1();
            double xCordSquare=xCord*xCord;
            double yCord= line.getY2()-line.getY1();
            double yCordSquare=yCord*yCord;
            double lengthofline=Math.sqrt(xCordSquare+yCordSquare);

            System.out.println(line.toString());
            return lengthofline;
        }

}
