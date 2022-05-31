fun main() {
    println("Привет, мир!")
    val testClass = JavaCode()
    //1
    println(testClass.start())
    //2
    println(testClass.toJSON(listOf(1,2,3,4)))
    //3
    println(testClass.foo("Nikita",20,true))
    println(testClass.foo("Nikita",20))
    println(testClass.foo("Nikita"))
    println(testClass.foo("Nikita",toUpperCase = true))
    //4
    println(testClass.iscontainsEven(listOf(1,23,3,41)))
    //5
    println(testClass.getDate("25.05.2022"))
    println(testClass.getPattern())
    //6
    val nikita:Person = Person("Nikita",28)
    println(nikita.name+" "+nikita.age)
    //7

    //9
    println(testClass.getList9())
    //10
    println(testClass.getList10())
}


