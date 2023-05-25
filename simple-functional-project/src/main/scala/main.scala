@main
def main(): Unit = {
  println("Hello world!")

  //RunCodes.runCodes()

  val cachorro = new Cachorro()
  cachorro.makeSound()

  val gato = new Gato()
  gato.makeSound()

  val pato = new Pato()
  pato.voar()
  pato.nadar()

}