import java.text.DecimalFormat
import java.util.Locale
import java.util.Locale.*


fun main()
{
    val sorigin: String = "abc.def.ghi.jkl,opq,201410598210"
    var origin = sorigin
    println(origin)
    if (origin.indexOf('.') >= 0)
    {
        origin.substring(0, origin.indexOf('.'))
    }

    var corigin: CharArray = stringToCharArray(origin)
    println(corigin)

    var forigin = origin.replace(',', ';')
    println(forigin)

    var result0 = origin.split(',')
    for (result in result0)
    {
        println(result)
    }

    var five = origin.get(4)
    println(five)

    var len = origin.length
    println(len)

    println(dollar(origin))
}

fun stringToCharArray(s: String): CharArray
{
    val charArray = s.toCharArray()
    val result = mutableListOf<Char>()
    for (i in charArray.indices)
    {
        result.add(charArray[i])
        if (i < charArray.size - 1)
        {
            result.add('-')
        }
    }

    return result.toCharArray()
}

fun dollar(s: String): String
{

    var n= Regex("\\d").findAll(s).toString()
    return n
}
