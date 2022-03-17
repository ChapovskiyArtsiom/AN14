data class Rectangle(private var width: Int,private var height: Int):Shape {
    override fun area(): Int {
        return width*height
    }
}
