import java.text.DecimalFormat

fun main()
{
    // 定义一个字符串
    val sorigin: String = "abc.def.ghi.jkl,opq,201410598210"
    println(sorigin)

    // 如果sorigin中包含小数点
    if (sorigin.indexOf('.') >= 0)
    {
        // 截取sorigin中从0到小数点前的字符串
        println(sorigin.substring(0, sorigin.indexOf('.')))
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
        print(result+"+")
    }
    println()

    // 获取字符串中的第五个字符
    var five = sorigin.get(4)
    println(five)

    // 获取字符串的长度
    var len = sorigin.length
    println(len)

    // 将字符串中的数字转换为美元符号
    val number = sorigin.extractNumber()

    val formattedNumber = number.formatAsCurrencyWithoutSeparator()
    println(formattedNumber)
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

/**
 * 从字符串中提取数字
 * @return 提取到的数字，如果没有提取到则返回0
 */
fun String.extractNumber(): Long
{
    val pattern = Regex("-?\\d+")
    val match = pattern.find(this)
    return match?.let { it.value.toLong() } ?: 0L
}

/**
 * 将Long类型的数字格式化为货币格式（无分隔符）
 * @return 格式化后的货币字符串
 */
fun Long.formatAsCurrencyWithoutSeparator(): String
{
    val formatter = DecimalFormat("0")
    val formatted = formatter.format(this)
    return "$" + formatted
}