fun main(){
//constructors
    //function
    val person = Person("car", "275")
    println(person.userName)
    println(person.number)

    println(person.data) // classes and objects in a block

    var school = Students(5,5)
    println(school.addNumbers())




}
class Person(name:String, num: String){
    var userName: String = name
    var number: String = num
    var data: String = ""

    init {
        data = ("$name $num")
    }


    fun addNumbers(a: Int, b:Int): Int
    {
        return a +b
    }}

class Students(var numOne: Int, var numTwo: Int) {
    fun addNumbers(): Int {
        return numOne + numTwo
    }
}