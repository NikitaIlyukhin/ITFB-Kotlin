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
    fun getAllOrderedProducts(): Set<Product> = TODO()

}