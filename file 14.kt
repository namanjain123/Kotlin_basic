import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args:Array<String>){
    writetofile("nj1")


}
fun writetofile(str:String){
    try {
        var fo = FileWriter("test.txt",true)
        fo.write(str)
        fo.close()
    }
    catch(ex:Exception){
        print(ex.message)
    }
}
fun read(){
    try{
        var fin =FileReader("test.txt")
        var c:Int?
        do{
            c=fin.read()
            println(c.toChar())
        }while(c!=-1)
    }
    catch (ex:Exception){
        println(ex.message)}
}