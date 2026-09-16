interface Animal {
    var nom: String
    fun makeSound() {
        println("le animale fair un bruit ")
    }
}
class Dog : Animal {
    override var nom: String = ""
    override fun makeSound() {
        println("le dog fairer un bruit ")
    }
}
class Cat : Animal {
    override var nom: String = ""
    override fun makeSound() {
        println("le cat fair un bruit ")
    }
}


