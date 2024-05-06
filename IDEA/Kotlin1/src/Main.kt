import java.text.DecimalFormat
import java.util.Locale
import java.util.Locale.*


fun main()
{
    // 定义一个字符串
    val sorigin: String = "abc.def.ghi.jkl,opq,201410598210"
    println(sorigin)
    // 如果字符串中包含小数点，则从字符串中删除小数点
    if (sorigin.indexOf('.') >= 0)
    {
        sorigin.substring(0, sorigin.indexOf('.'))
    }

    // 将字符串转换为字符数组
    var corigin: CharArray = stringToCharArray(sorigin)
    println(corigin)

    // 将字符串中的逗号替换为分号
    var forigin = sorigin.replace(',', ';')
    println(forigin)

    // 将字符串拆分为数组
    var result0 = sorigin.split(',')
    for (result in result0)
    {
        println(result)
    }

    // 获取字符串中的第五个字符
    var five = sorigin.get(4)
    println(five)

    // 获取字符串的长度
    var len = sorigin.length
    println(len)

    // 将字符串转换为美元符号
    println(dollar(sorigin))
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
