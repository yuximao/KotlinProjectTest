/*
1) create a constant called coordinates and assign a pair containing two and three to it

2) extract a values 2, and 3 from coordinates into two variables callled row and column

3) Declare a constant Triple that contains three Int values . Use this to represent a date(month , day , year)

4)Extract the values in the triple into three constants named month , day and year

5)using string templates , create a string constant called myDetails that uses the fullName constant to create a string introducing yourself.
*/

const val compileTimeConstant : Int = 20;
const val testNumber = 2
const val evenOdd = testNumber
const val myAge=25

fun main(args: Array<String>){
    println("hello world!")
    val number = 10
    println(number)
    var variableNumber : Int = 10;
    variableNumber = 1000_100
    println(variableNumber)
    var personAge = myAge
    var avgAge: Double = 30.0;
    println(personAge)

    var answer =0
    answer ++
    answer +=10
    answer *= 10
    println(answer)

    answer =answer.shr(3)

    println(answer)

    var test = 1.2.toInt()
    var string1="123"
    var string2 ="321"+ string1
    var bigString ="""""
        |hello
        |world
        |!
    """""

    val pair : Pair<Int,Int> = Pair(2,3)
    val triple = Triple(1,2,3)
    val anyThing: Any = "3"

    fun add():Unit {
        println("hi, no return")
    }

    fun doNothing(): Nothing{
        while(true){}
    }



}
class Example{

    fun showCompileTimeConst(){
        println(compileTimeConstant);
    }
}