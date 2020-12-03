fun metodoVariables(){

    /*
    Long: 64 Bit
    Int: 32 Bit
    Short: 16 Bit
    Byte: 8 Bit
    Double: 64 Bit
    Float: 32 Bit
    Los números de coma flotante de Double y Float se comportan de forma distinta
    a los números de coma fija en cálculos complejos.
    Como los tipos, puedes especificar los números en tu código.
    */
    val myNumber: Long = 40

    val myInt = 600
    val myLong= myInt.toLong()

    val myString = "Esto es un string de una sola línea."
    val myLongString = """Esto es un string,
de más de una línea."""

    /*
        \t: tabulador
    \b: retroceso
    \n: nueva línea
    \r: salto de línea
    \': comilla simple
    \": comilla doble
    \\: barra invertida
    \$: símbolo del dólar

     */

    val author = "Sandra"
    val myString2 = "El autor de este texto es $author"

    var model22 = 'A'

    // arrayOf() o Array()
    // Alternatively, the arrayOfNulls() library function can be used to create an
    // array of a given size filled with null elements.
    val myArray1 = arrayOf(0, 1, 2, 3, 4, 5)

    val myArray2 = intArrayOf(10, 20, 30)
    val myArray3 = booleanArrayOf(true, true, false)

    val myArray5 = arrayOf("Jan", "Maria", "Samuel")
    println(myArray5[2])

    /*
    Equality checks: a == b and a != b
    Comparison operators: a < b, a > b, a <= b, a >= b
    */




}