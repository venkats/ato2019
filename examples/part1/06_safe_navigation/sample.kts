fun nickName(name: String): String? {
  if(name == "Robert") return "Bob"
  
  return null
}
                           
fun print(name: String) {
  val result = nickName(name)
  
  println("The word $result is ${result?.length} letters long")
}

print("Robert")
print("Venkat")