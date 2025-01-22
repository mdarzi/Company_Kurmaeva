fun main() {
    //динамический массив
    val companies = mutableListOf<Company>()

    // Метод для добавления компании в коллекцию
    fun addCompany(company: Company) {
        companies.add(company)
    }

    // Метод для удаления компании из коллекции
    fun removeCompany(companyName: String) {
        val iterator = companies.iterator()
        while (iterator.hasNext()) {
            val company = iterator.next()
            if (company.name == companyName) {
                iterator.remove()
                println("Удалена компания: $companyName")
                return
            }
        }
        println("Коспания с именем $companyName не найдена.")
    }

    // Добавляем компании в коллекцию
    addCompany(Company("gleb", 2007, 217000,  20))
    addCompany(Company("Asya", 2007, 2142000,  2034))
    addCompany(Company("Nadya", 2015, 23, 1))
    addCompany(Company("Ulyana", 2009, 658493, 1))

    println("List of companies:")
    for (company in companies) {
        company.info()
    }

    // Удаляем компанию
    removeCompany("Nadya")

    // Выводим оставшиеся компании
    println("Updated list of companies:")
    for (company in companies) {
        company.info()
    }
}