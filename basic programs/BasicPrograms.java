import java.util.*;


public class BasicPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Welcome message
        System.out.println("Welcome to Bridgelabz!");

        
        
        
        // 2. Add Two Numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        
        
        // 3. Celsius to Fahrenheit Conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        
        
        
        // 4. Area of a Circle
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);

        
        
        
        
        // 5. Volume of a Cylinder
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);

        
        
        
        
        // Self Problems
        // 1. Simple Interest Calculation
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        
        
        
        
        // 2. Perimeter of a Rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        
        
        
        
        // 3. Power Calculation (without loops or conditionals)
        System.out.print("Enter base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println("Power result: " + power);

        
        
        
        
        // 4. Calculate Average of Three Numbers
        System.out.print("Enter first number: ");
        double numA = sc.nextDouble();
        System.out.print("Enter second number: ");
        double numB = sc.nextDouble();
        System.out.print("Enter third number: ");
        double numC = sc.nextDouble();
        double average = (numA + numB + numC) / 3;
        System.out.println("Average: " + average);

        
        
        
        
        // 5. Convert Kilometers to Miles
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in Miles: " + miles);

    }
}

