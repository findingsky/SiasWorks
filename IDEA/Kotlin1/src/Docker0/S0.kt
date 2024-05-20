package Docker0

private val goodsA: String = "惠普"
private val goodsB: String = "联想"
private val goodsC: String = "戴尔"
private val goodsD: String = "IBM"
private val goodsE: String = "长城"
private val goodsF: String = "方正"

fun main()
{
    val goodsSet: MutableSet<String> = mutableSetOf(goodsA, goodsB, goodsC, goodsD, goodsE, goodsF)
    goodsSet.remove(goodsA)
    println("电脑畅销榜已添加,并且已经remove goodsA商品惠普，当前共有5款电脑")
    fi(goodsSet)
    iw(goodsSet)
    fe(goodsSet)

}

fun fi(mutableSet: MutableSet<String>)
{
    println("for in电脑畅销榜包含以下5款电脑：")
    for (goods in mutableSet)
    {
        println(goods)
    }
}

fun iw(mutableSet: MutableSet<String>)
{
    println("迭代器电脑畅销榜包含以下5款电脑：")
    val iterator = mutableSet.iterator()
    while (iterator.hasNext())
    {
        println(iterator.next())
    }
}

fun fe(mutableSet: MutableSet<String>)
{
    println("foreach电脑畅销榜包含以下5款电脑：")
    mutableSet.forEach { println("名称：" + it) }
}