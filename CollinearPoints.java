import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        // Check if the points are collinear 
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check if the points are collinear 
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Are the points collinear using the slope formula? " + collinearBySlope);
        System.out.println("Are the points collinear using the area of the triangle formula? " + collinearByArea);

        sc.close();
    }

    // Method to check if the points are collinear 
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check if the points are collinear
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}

