# AreaCalculator
# Challenge from Tim Buchalka's Java Programming Masterclass for Software Developers course.

Write a method named area with on double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters, x and y (both doubles), where 
x and y represent the sides of a rectangle.

The method needs to return an area of a rectangel.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value, please check the tips below.

EXAMPLES OF INPUT/OUTPUT:
  * area(5.0); should return 78.539
  * area(-1); should return -1 since the parameter is negative
  * area(5.0, 4.0); should return 20.0(5 * 4 = 20)
  * area(-1.0, 4.0); should return -1 since the first parameter is negative

TIP: The formula for calculating the area of a rectangle is x * y.

TIP: The formula for calulating a circle area is radius * radius * PI.

TIP: For PI use a constant from Math class e.g. Math.PI.

NOTE: All methods need to be defined as public static.
