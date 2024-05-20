private var goodsMutSet: MutableSet<String> = mutableSetOf<String>()

private val goodsA:String = "惠普"

private val goodsB:String = "联想"

private val goodsC:String = "戴尔"

private val goodsD:String = "IBM"

private val goodsE:String = "长城"

private val goodsF:String = "方正"


fun main(args: Array<String>) {

    //Set没有add(添加)、remove(删除)、clear(清空)等导致集合变更的相关方法

    //goodsSet = setOf(goodsA, goodsB, goodsC, goodsD, goodsE, goodsF)
    var a=10
    print("${a+1+1+1}")
    goodsMutSet.add(goodsA)

    goodsMutSet.add(goodsB)

    goodsMutSet.add(goodsC)

    goodsMutSet.add(goodsD)

    goodsMutSet.add(goodsE)

    goodsMutSet.add(goodsF)

    goodsMutSet.remove(goodsA)



    var desc = ""

    desc = "iterator测试\n"

    val iterator1 = goodsMutSet.iterator()

    //如果迭代器还存在下一个节点，则继续取出下一个节点的记录

    while (iterator1.hasNext()) {

        val item = goodsMutSet.iterator().next()

        desc =desc + item +"\n"

        //desc = "${desc}名称：${item}\n"

        //println("temp：\n$item ,")

    }

    println("iterator1 while电脑畅销榜包含以下${goodsMutSet.size}款电脑：\n$desc")

}