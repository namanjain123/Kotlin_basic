/*class operators() {

    fun sum(n1: Int, n2: Int): Int {

        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {

        return n1 / n2
    }
}

class MultiOperations(){
    fun sum(n1:Int,n2:Int):Int{

        return n1+n2
    }
    fun sub(n1:Int,n2:Int):Int{

        return n1-n2
    }fun mul(n1:Int,n2:Int):Int{

        return n1*n2
    }
    fun div(n1:Int,n2:Int):Int{

        return n1/n2
    }


}
//this is without inheritance */
open class Operations() {

    fun sum(n1: Int, n2: Int): Int {

        return n1 + n2
    }

    fun mul(n1: Int, n2: Int): Int {

        return n1 * n2
    }
}

class MultiOperations():Operations(){

    fun sub(n1:Int,n2:Int):Int{

        return n1-n2}

    fun div(n1:Int,n2:Int):Int{

        return n1/n2
    }


}



