class Customers(val city: City,val orders: List<Order>) {
    //4
    fun getOrderedProducts(): Set<Product> = this.orders.flatMap { it->it.products }.toSet()
    //5
    fun getMostExpensiveOrderedProduct(): Product? = this.orders.flatMap { it.products }.maxBy { it.price }
    //7
    fun getMaxOrderPrice(): Double{
        val price:Double= this.orders.flatMap { it.products }.maxBy { it.price }!!.price
        return price
    }
    fun getTotalOrderPrice(): Double{
        return this.orders.flatMap { it.products }.sumByDouble { it.price }
    }
    fun getMostExpensiveDeliveredProduct(): Product? {
        val products:Set<Product> = this.orders.flatMap { it.products }.toSet()
        val res = products.maxBy { it.price }
        return res;
    }

}