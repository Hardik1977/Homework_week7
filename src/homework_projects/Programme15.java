package homework_projects;

/**
 * 15. Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double
 */
public class Programme15 {
    //instance variable
    double width, height;

    //default constructor
    public Programme15() {

    }

    //Parameterised Constructor
    public Programme15(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // get width method
    public double getWidth() {
        return width;
    }

    // get height method
    public double getHeight() {
        return height;
    }

    //set width method with 1 operator
    public void setWidth(Double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //set height method with one parameter
    public void setHight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // get area method
    public double getArea() {
        return (getHeight() * getWidth());
    }

    // main method
    public static void main(String[] args) {

        Programme15 wall = new Programme15(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }

}


