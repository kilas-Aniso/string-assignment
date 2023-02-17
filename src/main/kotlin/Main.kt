fun main() {

    text("Cathy")
   aboutMe("Aisha", 23)
girl("Abdi")
clarification("Anisa moha")

    }


fun text(word:String) {

    println(word[0] + "" + word[2] + "" + word[3])


}
fun aboutMe(name:String, age: Int):String {
    var result = ("Hi my name is $name and I am $age years old")
    println(result)
    return result
}

fun girl(x:String){
    x.length
    println(x.length)

}
fun clarification(myname:String){
if (myname.equals("Aniso Moha"))
println("that is me")

else {
    println("I dont know who that is")
}}