fun main(args: Array<String>) {
  println("Qual seu nome:")
  val nome = readLine()!!
  println("Olá "+nome )
  println("Qual sua idade:")
  //
  print("Qual sua idade:")
  var idade = readLine()!!
  println("Sua idade é: "+idade)

  val num = idade.toInt(
    
  )

  if (num >=18) {
    println("Você é maior de idade")
  }else{
    println("Você é menor de idade")
  }
  
}
