data class Shop(val name:String, val customers:List<Customers>){
    //1
    fun getSetOfCustomers():Set<Customers> = this.customers.toSet()

    //2
    fun getCitiesCustomersAreFrom(): Set<City> = this.customers.map { it.city }.toSet()
    fun getCustomersFrom(city: City): List<Customers> = this.customers.filter{ it.city==city }

    //3
    fun checkAllCustomersAreFrom(city: City): Boolean = this.customers.all{ it->it.city==city }
    fun hasCustomerFrom(city: City): Boolean = this.customers.any{ it.city==city }
    fun countCustomersFrom(city: City): Int = this.customers.count { it.city==city }
    fun findAnyCustomerFrom(city: City): Customers? = this.customers.find { it.city==city }

    //4
    fun getAllOrderedProducts(): Set<Product> = this.customers.flatMap { it->it.getOrderedProducts() }.toSet()

    //5
    fun getCustomerWithMaximumNumberOfOrders(): Customers? = this.customers.maxBy { it->it.orders.size }

    //6
    fun getCustomersSortedByNumberOfOrders(): List<Customers> = this.customers.sortedBy { it.orders.size }

    //8
    fun groupCustomersByCity(): Map<City, List<Customers>> {
        return this.customers.groupBy { it.city }
    }

    //9
    fun getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customers> {
        val orders = this.customers.flatMap { it.orders }.filter { it.isDelivered }
        val (d,u) = this.customers.partition { it.orders==orders }
        return d.toSet()
    }

    //10
    fun getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
        val orders = this.customers.flatMap { it.orders }
        val product = orders.flatMap { it.products }
        val res:Set<Product> = this.customers.fold(product){
            acc, customers -> customers.orders.flatMap { it.products }.intersect(product).toList()
        }.toSet()

        return res
    }
    //11
    fun getNumberOfTimesProductWasOrdered(product: Product): Int {
        val countProducts = this.customers.flatMap { it.orders }.flatMap { it.products }.filter { it == product }
                .count()
        return countProducts;
    }
}