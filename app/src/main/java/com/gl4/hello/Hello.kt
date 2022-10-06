package com.gl4.hello

import kotlin.math.abs

fun main(argv: Array<String>) {
    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    var toto: String = "Toto"

    println(toto)

    var message: String? = "Kotlin is nice!"
    message = null
    println(message.toString())
    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()
    println(op('/', 35.0, 6.0))

    val rectangles = arrayOf(
        Rectangle(), Rectangle(
            Point(-10, -10),
            Point(5, 5)
        ), Rectangle(p = Point(-1, -1)),
        Rectangle(q = Point(5, 5))
    )
    println("rectangles surfaces are :")
    for (rectangle in rectangles)
        println(rectangle.surface())

}

fun somme(a: Int, b: Int): Int {
    return a + b
}

//activité 2
fun sayMyName(name: String) {
    println(" $name ")
}

fun sayHello(): String = "Hello"
fun showList(list: List<String>) {
    for (i in list) {
        println(i)
    }
}

fun oddNumbersTo10() {
    
    for (i in 0..10) {
        if (i % 2 == 1)
            println(i)
    }
}

private val languages = listOf(
    "JAVA",
    "Python",
    "kotlin"
)  

fun op(param: Char, a: Double, b: Double): Double? {
    when (param) {
        '+' -> return a + b;
        '-' -> return a - b;
        '*' -> return a * b;
        '/' -> return a / b;
        else -> return null
    }
}

data class Point(public var x: Int, public var y: Int)

fun distance(pt1: Point, pt2: Point) = abs(pt1.x - pt2.x) + abs(pt1.y - pt2.y)

open class Rectangle(public val p: Point = Point(0, 0), public val q: Point = Point(1, 1)) {
    override fun toString(): String {
        return "p= $p and q=$q"
    }

    fun surface(): Int {
        return ((q.x - p.x) * (q.y - p.y))
    }
}