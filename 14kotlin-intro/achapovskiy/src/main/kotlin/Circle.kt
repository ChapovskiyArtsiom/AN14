data class Circle(private var radius: Int):Shape {
    override fun area(): Int {
        val PI = 3.14
        return PI.toInt()*radius*radius
    }

}