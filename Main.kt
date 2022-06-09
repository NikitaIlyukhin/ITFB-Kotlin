fun main() {
    /*------------
    25.05.2022
    ------------*/

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

    val numbers = listOf(0, 1, 2, 3, 4, 5)
    println(numbers.scan(1){acc, i -> i+acc  })
    println(numbers.fold(1){acc, i -> i+acc  })

    /*------------
    01.06.2022
    ------------*/
    val moscow:City = City("Moscow")
    val kostroma:City = City("Kostroma")
    val list: MutableList<Customers> = mutableListOf(Customers(moscow),Customers(moscow), Customers(kostroma))
    val shop:Shop = Shop("Reserved",list)
    //1
    println("#1 "+shop.getSetOfCustomers())
    //2
    println("#2 "+shop.getCitiesCustomersAreFrom())
    println("#2 "+shop.getCustomersFrom(moscow))
    //3
    println("#3 "+shop.checkAllCustomersAreFrom(moscow))
    println("#3 "+shop.countCustomersFrom(moscow))
    println("#3 "+shop.hasCustomerFrom(moscow))
    println("#3 "+shop.findAnyCustomerFrom(kostroma))
    //4

}


