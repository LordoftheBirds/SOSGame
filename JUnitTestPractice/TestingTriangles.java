public class TestingTriangles {
    boolean isValidTriangle(int side1, int side2, int side3) {
        boolean validTriangle = false;

        if (side1 < 1 || side2 < 1 || side3 < 1) {
            System.out.println("Invalid sizes.");
        }

        int hypotenuse = 0;
        int shortSide1 = 0;
        int shortSide2 = 0;

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("The sides form a valid triangle.");

            //Checking if the triangle is a right triangle
            if ((side1 > side2) && (side1 > side3)) {
                hypotenuse = side1;
                shortSide1 = side2;
                shortSide2 = side3;
            }
            else if ((side2 > side1) && (side2 > side3)) {
                hypotenuse = side2;
                shortSide1 = side1;
                shortSide2 = side3;
            }
            else {
                hypotenuse = side3;
                shortSide1 = side1;
                shortSide2 = side2;
            }

            if ((shortSide1 * shortSide1) + (shortSide2 * shortSide2) == (hypotenuse * hypotenuse)) {
                System.out.println("Pythagoras says the sides form a right triangle with hypotenuse: ");
                System.out.println(hypotenuse);
            }
            else {
                System.out.println("Pythagoras says the sides do not form a right triangle.");
            }
            validTriangle = true;
        }
        else {
            System.out.println("The sides do not form a valid triangle.");
        }
        return validTriangle;
    }
}
