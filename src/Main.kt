import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val print = { str: String, count: Int ->
        var i = count
        while (i-- > 0) {
            println(str)
        }
    }
    val text = print("привет", 5)
    println("--------------------------------------")
//2
    val array: Array<Int> = arrayOf(2, 4, 5, 3, 5, 4, 4, 5, 3)
    val average = { massiv: Array<Int> ->
        var sum = 0
        val result: Double
        for (i in array) {
            sum += i
        }
        result = sum / array.size.toDouble()
        result
    }
    val result = average(array)
    println("Среднее арифметическое равно $result")
    println()
//3
    val random = Random
    val massive: MutableList<Int> = MutableList(10) { random.nextInt(-10, 10) }
    val printMassive = { array: MutableList<Int> ->
        for (i in array) {
            print("$i ")
        }
        println()
    }
    printMassive(massive)
    val iterator = massive.iterator()
    while(iterator.hasNext()) {
        val item = iterator.next()
        if (item < 0) {
            iterator.remove()
        }
    }
    printMassive(massive)
//4
    val array2 :Array<Int> = Array(10){random.nextInt(0, 10)}
    val printArray = { array: Array<Int> ->
        for (i in array2){
            print("$i ")

        }
        println()
    }
    printArray(array2)
    val lambda = {array: Array<Int> ->
        for (i in array.indices){
            if (array[i] % 2 == 0) array[i] /= 2
            else array[i] *= 3
        }
    }
    lambda(array2)
    printArray(array2)
}