//1)Write a function that removes the first occurrence of a given integer from a list of integers ( fun removeOne(item : Int, list: List<Int): List<Int>
//2)Write a function that removes all occurrences of a given integer from a list of integers. ( signature of function : fun remove(item : Int, list:List<Int> ) : List<Int >
//3)write a function that removes all accurrences of a given integer from a list of integers.
//4) Arrays and lists have a reverse() method that reverses all the element in place , that is, within the original array or list. write function that does a similar thing, without using  reverse(), and returns a new array with the elements of  the original array in reverse order
//5) Write  a funtion that calculates the min and max value in array of integers. calculate these values yourself don't use the methods min and max . return null if the given array is empty ( function signature : fun minMax(
// numbers: Array<Int> ) : Pair<Int, Int>
//6) Write a function that returns true if all of the values of a map are unique. Use a set to test uniqueness . ( function signature : fun isInvertible( map : Map<String, Int>):Boolean
//7) write a function that combines two maps into one . if a certain key appears in both maps, ignore the pair from the first maps. ( function signature : fun mergeMaps( map1 : Map<String, String >, map2 : Map<String, String>) : Map<String, String>

//1) create a constant list called nameList which contains some names as Strings. Any names will do  make sure there is more than three. Now use fold to create a String which is concatenation of each name in the list
//2)Create a constant map called namesAndAges which contains some names as strings mappped to ages as integers. Now use filter to create a map containing only people under the age of 18
//3)using the same namesAndAges map, filter out the adults ( those 18 or older ) and then use map to convert to a list containing just the maes (i.e , drop the ages )

fun removeOne(item: Int, list: List<Int>): List<Int> {
    return list.minus(item)
}

fun remove(item: Int, list: List<Int>): List<Int> {
    return list.filter{ it != item }
}

fun reverse(list: List<Int>): MutableList<Int> {
    var r_list = mutableListOf<Int>()

    for (i in (list.size - 1) downTo 0) {
        r_list.add(list[i])
    }

    return r_list

}

fun minMax(numbers: Array<Int>) : Pair<Int, Int> {
    var min = numbers.first()
    for (n in numbers) min = if(n < min) n else min

    var max = numbers.first()
    for (n in numbers) max = if(n > max) n else max

    return Pair(min, max)
}
fun isInvertible(map : Map<String, Int>) : Boolean {
    return map.values.size == map.values.toSet().size
}
fun mergeMaps(map1: Map <String, String>, map2: Map<String, String>) : Map<String, String> {
    return map1 + map2
}

fun lambdaPractice() {
    val nameList = listOf("Ronnie","Tim","Jane","Tom")
    println(nameList.fold("", {total, name -> total + name}))
    val namesAndAges = mapOf("Ronnie" to 60, "Tim" to 50, "Jane" to 40, "Tom" to 5)
    println(namesAndAges.filter{it.value < 18})
    println(namesAndAges.filter{it.value > 18}.keys.toList())
}
fun main(args: Array<String>) {
    val l = listOf(1,2,3,3,4)
    val f1 : Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)
    val f2 = mapOf("one" to 1, "two" to 1, "three" to 3)
    val m1 = mapOf("1" to "2", "3" to "4", "5" to "6")
    val m2 = mapOf("1" to "11", "2" to "22", "3" to "33", "7" to "77")
    println(removeOne(3, l))
    println(remove(3, l))
    println(reverse(l))
    println(minMax(l.toTypedArray()))
    println("Map: f1 is ${if(isInvertible(f1)) "is" else "not"} invertible")
    println("Map: f1 is ${if(isInvertible(f2)) "is" else "not"} invertible")
    println(mergeMaps(m1, m2))
    lambdaPractice()
}