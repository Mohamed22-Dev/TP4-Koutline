interface Animale {
    var nom: String
    fun parler()
    fun seDeplacer()
}
interface Volant {
    fun voler()
}
class Oiseau() : Animale , Volant {
    override var nom: String = ""
    override fun parler() {
        println("L'oiseau chante")
    }

    override fun seDeplacer() {
    }

    override fun voler() {
    }
}
class Chien(override var nom: String) : Animale {
    override fun parler() {
        println("le chien estr aboie")
    }

    override fun seDeplacer() {

    }
}
class Poisson(override var nom: String) : Animale {
    override fun parler() {
        println("Le poisson ne fait pas de bruit")
    }

    override fun seDeplacer() {

    }

}

