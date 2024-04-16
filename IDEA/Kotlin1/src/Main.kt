fun main()
{
    var a: Array<Int> = arrayOf(5, 6, 7, 8, 9, 0)
    var b: Array<String> = arrayOf("aaa", "bbb", "ccc", "ddd", "eee", "fff")
    var c: Array<Boolean> = arrayOf(true, false, true, false, true, false)
    var d: Array<Double> = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
    traverseArray(a)
    traverseArray(b)
    traverseArray(c)
    traverseArray(d)
}

fun <T> traverseArray(array: Array<T>)
{
    var o = array.joinToString("~")
    println(o)
}
