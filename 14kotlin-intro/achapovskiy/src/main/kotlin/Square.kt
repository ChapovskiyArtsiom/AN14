data class Square(private var height: Int):Shape {

    override fun area(): Int {
        return height*height
    }
}