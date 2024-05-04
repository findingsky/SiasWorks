fun main()
{
    println("Hello, World!")
    println("输入0或1")
    var a: Int


    a = readLine()?.toInt() ?: -1
    /*       println(if (a == 0 || a == 1) a else "输入只能是0或1")*/
    println(
        when (a)
        {
            0, 1 -> a
            else -> "输入只能是0或1"
        }
    )
//        if (a == 0 || a == 1)
//        {
//            println(a)
//            break
//        }
//        else
//        {
//            println("输入只能是0或1")
//            continue
//        }
}