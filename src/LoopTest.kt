//1) Create a constant named readerBeforeAuthor which uses string comparison to determine if reader comes before auther
//
//2)Create constant named reader and set it to your name as a string. Create a constant named author and set it to my name, Abc.
// Create constant named authorIsReader that uses string equality to determine if reader and author are equal
//
//do this exercise using if/else control flow and boolean data type in kotlin
//3) Create a constant named myAge and initialize it with your age .
// write and if expression to print out Teenager if your age is between 13 and 19 and not a teenager if your age is not between 13 and 19

val readerBeforeAuthor=true
val reader="ronnie"
val author="John"
var authorIsReader=false


fun readerAndAuthor(){
    if(reader==author){
        authorIsReader=true
    }
}

val myAges = 25
var isTeenager=false
fun isTeenager(){
    if (myAge<19&&myAge>12){
        isTeenager=true
    }
}



//1) print a table of the first 10 powers of 2
//
//2)Given a month ( represented with a string  in all lowercase ) and the current year ( represented in Int ) ,
//calcualte the number of days in month. Remember that because of leap year,
//feb has 29 days when the year is multiply of 4 but not multiply of 100. feb also has 29 days when the year is multiply of 400
//
//3) Given a number n , calculate the factorial of n ( example: 4 Factorial is equal to 1*2*3*4 )
var i =1.0
fun printTwoPower(){
    while(i<10){
        println(Math.pow(2.0,i))
        i++
    }
}

fun calDays(months:String, year:Int){
    if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)&&months=="Feb"){
        print(29)
    }else{
        when(months){
            "jan" -> print(31)
            "Feb" ->print(28)
            "Mar" ->print(31)
            //.....
        }
    }
}

fun factorial(n:Int){
    var res=1
    for (i in 1..n){
        res*=i
    }
    print(res)
}

fun range(){
    // range
    for(i in 1..9){
        print("$i")
    }
// half range
    for(i in 1 until 9){
        print("$i")
    }
}

//write a for loop to iterate over the range (1 to 1000) and print the square roo of each number

fun loopSquare(){
    for(i in 1..1000){
        println(Math.sqrt(i.toDouble()))
    }


}
///1) use repeat statement and print 1 to 100 numbers
fun repeat(){
    var i=1
    repeat(100){
        println(i)
        i++
    }
}

//write a when expression that takes an age as an integer and prints out the life stage related to that age. you can use categorization as  follows: 0to 2 years,
// Infant: 3 to 12 ,Child:13 to 19 , Teenager 20 to 39 , Adult 40 to 60 Middle aged : 61+ , Elderly
///2) write a when expression that destructures a pair containing a string and an integer.  the string is a name ,
// and the integer is an age. use the use the same cases that you used in the previous exercise to print out the name followed by the life stage. e.g for Dick it would print out "Dick is an adult."
fun whenFunction(age:Int,name:String){
    when(age){
        in 3..12 -> println("$name is and Infant")
        in 13..19 -> println("$name is a child")
        in 20..39 -> println("$name is a Teenager")
        in 40..59 -> println("$name is Middle")
        else-> print("$name is old")
    }
}


//1) write function named PrintFullName that takes two strings called firstname and lastname.
//the function should print out the full name definded as firstname+lastname
//2) call printFull Name using maned arguments.
//3) write a function named calculateFullname that returns the full name as a string use it to store your own full name in a constant.
//4)change calculateFullName to return a Pair containing both the full name and the length of the name . you can find a string's lenth by using the length property.
//5) write a function that computes a value from the Fibonacci sequence.

fun printFullName(firstName:String="ronnie", lastName:String="mao") {
    print(firstName+lastName)
}
fun  printFullName2(firstName:String, lastName:String) {
    print(firstName+lastName)
}

class Name(name: String, length: Int) {
    var name:String =""
    var size:Int = 0

}

fun calculateFullname(firstName:String, lastName:String):Name{
    val name=firstName+lastName
    val people = Name(name,name.length)
    return people
}

fun Fibonacci(){
    var a1 = 1
    var a2 = 1
    print("$a1 $a2 ")
    for (i in 3..100) {
        val a3 = a1 + a2
        print("$a3 ")
        a1 = a2
        a2 = a3
    }
}

//Make a nullable String called myFavoriteSong. if you have a favorite song, set it to a string representing that song. if you have more than one favorite song or no favorite, set the nullable to null
// 1) Not-null assertion operator
//!!
//2)Safe calls operator( ?. )
//3)Elvis operator ( ?: )

