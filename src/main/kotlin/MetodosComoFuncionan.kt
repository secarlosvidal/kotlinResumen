/*
Funciones (Functions)

Las funciones en Kotlin se crean siempre con el comando fun.
A continuación, se define el nombre de la función,
los argumentos que contiene y finalmente, lo que hace.
 */

fun div(a: Int, b: Int): Int {
    return a/b
}
//    println(div(100, 2))


// Funcion escrita abreviada en una sola linea
fun division(a: Int, b: Int): Int = a/b
// fun main() = println(div(100, 2))

// definir la funcion con valores estandar por si falta alguno por meter
fun divi(a: Int = 10, b: Int = 5): Int = a/b
//fun main() = println(div())

// Lambdas

// Una función lambda (o función anónima) es una función que no pertenece
// ni a una clase ni a un objeto.
// Las lambdas se colocan directamente en otras funciones o variables.
// Se llaman sin utilizar la keyword fun.
// Las lambdas en principio se pueden introducir como variables del tipo val
// y también se crean así.

fun main4() {
    val myMessage = { println("¡Hola mundo!") }
    myMessage()
}

// Las expresiones lambda en Kotlin siempre deben introducirse entre llaves.
// Las lambdas también pueden procesar argumentos de funciones.
// Se representan mediante una flecha que separa los parámetros del núcleo de la expresión.

fun main2() {
    val div = {a: Int, b: Int -> a/b}
    println(div(6,2))
}


