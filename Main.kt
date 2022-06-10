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
    val milk = Product("milk",76.0)
    val drug = Product("drug",5000.0)
    val orderDrug = Order(listOf(milk,drug),true)
    val orderMilk = Order(listOf(milk),false)
    val customer:Customers = Customers(moscow, listOf(orderMilk))
    val list: MutableList<Customers> = mutableListOf(customer,Customers(moscow,listOf(orderDrug)), Customers(kostroma,listOf(orderMilk)))
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
    //val result = listOf("abc", "12").flatMap { it.toCharArray() }
    //println("#4")
    //println(result)
    //println(result == listOf('a', 'b', 'c', '1', '2'))
    println("#4 "+customer.getOrderedProducts())
    println("#4 "+shop.getAllOrderedProducts())
    //5
    println("#5 "+customer.getMostExpensiveOrderedProduct())
    println("#5 "+shop.getCustomerWithMaximumNumberOfOrders())
    //6
    println("#6 "+shop.getCustomersSortedByNumberOfOrders())
    //7
    println("#7 Самая дорогой продукт в "+customer.city.name+": "+customer.getMaxOrderPrice())
    println("#7 Самая дорогая покупка в "+customer.city.name+": "+customer.getTotalOrderPrice())
    //8
    println("#8 "+shop.groupCustomersByCity())
    //9
    println("#9 "+shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    //10
    println("#10 "+shop.getSetOfProductsOrderedByEveryCustomer())
    //11
    println("#11 Больше всего заказывали"+customer.getMostExpensiveDeliveredProduct()?.name)
    println("#11 "+milk.name+" заказали: "+shop.getNumberOfTimesProductWasOrdered(milk))
    println("#11 "+drug.name+" заказали: "+shop.getNumberOfTimesProductWasOrdered(drug))
}


