data class Triangle(private var firstSide: Int, private var secondSide: Int, private var thirtSide : Int): Shape {
    override fun area(): Int {

            return firstSide*secondSide*thirtSide/4
      /*  }
        catch (e: Exception){
            println("Не достаточно данных для вычисления")
            println(e.message)
        }
        finally {
            println("")
        }
    }*/
}}