fun main()
{
    var i: Int = 1
    var f: Float = 1.0F
    var c: Char = '0'
    var b: Boolean = true
    var s: String = "1"
    intToOthers(i)
    floatToOthers(f)
    charToOthers(c)
    boolToOthers(b)
    stringToOthers(s)
}

fun intToOthers(i: Int)
{
    var f: Float = i.toFloat()
    var c: Char = i.toString()[0]
    var s: String = i.toString()
    var b: Boolean = intToBoolean(i)
    println("原整数$i 浮点型$f 字符型$c 逻辑值$b 字符串$s")
}

fun intToBoolean(i: Int): Boolean
{
    val booleanValue: Boolean = (i == 1)
    return booleanValue
}

fun floatToOthers(f: Float)
{
    var i: Int = f.toInt()
    var c: Char = f.toString()[0]
    var s: String = f.toString()
    var b: Boolean = intToBoolean(i)
    println("原浮点数$f 整型$i 字符型$c 逻辑值$b 字符串$s")
}

fun charToOthers(c: Char)
{
    var i: Int = c.toInt()
    var f: Float = c.toFloat()
    var s: String = c.toString()
    var b: Boolean = intToBoolean(i)
    println("原字符$c 整型$i 浮点型$f 逻辑值$b 字符串$s")
}

fun boolToOthers(b: Boolean)
{
    var i: Int = booleanToInt(b)
    var f: Float = booleanToInt(b).toFloat()
    var c: Char = booleanToInt(b).toString()[0]
    var s: String = b.toString()
    println("原逻辑值$b 整型$i 浮点型$f 字符型$c 字符串$s")
}

fun booleanToInt(b: Boolean): Int
{
    var i: Int
    if (b)
    {
        i = 1
    }
    else
    {
        i = 0
    }
    return i
}

fun stringToOthers(s: String)
{
    var i: Int = s.toInt()
    var f: Float = s.toFloat()
    var c: Char = s.toCharArray()[0]
    var b: Boolean = intToBoolean(i)
    println("原字符串$s 整型$i 浮点型$f 字符型$c 逻辑值$b")
}
