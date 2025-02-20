package org.example;

public class Wall {
    public static void main(String[] args) {
        // Wall instance creation
        Wall wall = new Wall(5, 4);

        // Output area
        System.out.println("area= " + wall.getArea());

        // Set height to a negative value
        wall.setHeight(-1.5);

        // Output width, height, and area
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
    // Instance variables
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to get width
    public double getWidth() {
        return width;
    }

    // Method to get height
    public double getHeight() {
        return height;
    }

    // Method to set width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to set height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get area
    public double getArea() {
        return width * height;
    }
}

