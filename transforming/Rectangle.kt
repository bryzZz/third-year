class Rectangle(var a: Float, var b: Float, x: Int, y: Int): Figure(0, x, y) {
    init {
        sides = FloatArray(2)
        sides[0] = a
        sides[1] = b
    }

    override fun area(): Float {
        return sides[0] * sides[1]
    }

    override val figureName: String
        get() = "Rectangle"

}