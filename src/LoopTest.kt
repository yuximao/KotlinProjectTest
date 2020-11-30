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