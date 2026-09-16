interface Vehicle{
    fun start()
    fun stop()
}
class Car : Vehicle {
    override fun start(){}
    override fun stop(){}

    class Bike : Vehicle{
        override fun start() {}
        override fun stop() {}
    }
}