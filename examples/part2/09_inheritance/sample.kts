open class Person(val firstName: String, val lastName: String)

class CoolPerson(firstName: String, lastName: String, 
    val coolnessIndex: Int) : Person(firstName, lastName)
    
val coolPerson = CoolPerson("Alan", "Turing", 10)

println(coolPerson.firstName)