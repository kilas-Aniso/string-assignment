fun main() {
var word = "Akiracix"
    println(word[0]+""+word[2]+""+word[3] )

   aboutMe("Aisha", 23)
 val girl = "Aniso"
    girl.length
    println(girl.length)

var myname = "Aniso Moha"
    if (myname.equals("Aniso Moha"))
        println("that is me")

    else{
        println("I dont know who that is")
    }

}

fun aboutMe(name:String, age: Int):String {
    var result = ("Hi my name is $name and I am $age years old")
    println(result)
    return result
}



