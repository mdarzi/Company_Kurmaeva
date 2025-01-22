// Company.kt
class Company(val name: String, val yearFounded: Int, val money: Int = 0, val persons: Int = 0) {


    fun info() {
        println("Company Name: $name, Founded: $yearFounded, Money: $money, Persons: $persons")
    }
}