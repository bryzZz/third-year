# transforming

```kotlin
fun main() {
    val square = Square(2.5F, 1, 5) // square figure
    square.printCenter() // 1 5
    square.rotate(RotateDirection.CounterClockwise, 2, 3) // rotate
    square.printCenter() // 0 1
    println(square.area()) // square area 6.25
    square.resize(5) // zoom in 5 times
    println(square.area()) // square area 156.25

    val rectangle = Rectangle(2.5F, 5.0F, 1, 5) // rectangle figure
    rectangle.printCenter() // 1 5
    rectangle.rotate(RotateDirection.Clockwise, 2, 3) // rotate
    rectangle.printCenter() // 4 1
    println(rectangle.area()) // rectangle area 12.5
    rectangle.resize(5) // zoom in 5 times
    println(rectangle.area()) // rectangle area 312.5

    val circle = Circle(5.0F, 3, -1) // circle figure
    circle.printCenter() // 3 -1
    circle.rotate(RotateDirection.CounterClockwise, 2, 3) // rotate
    circle.printCenter() // 6 7
    println(circle.area()) // circle area 78.53982
    circle.resize(5) // zoom in 5 times
    println(circle.area()) // 1963.4955
}
```
