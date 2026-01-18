fun main(){
    println("Hello World")

    //variables
    val name = "Denis"
    val age = 21

    println("$name is $age years old")

    println(10 <= 15)

    var time = 20

    if(time < 18){
        println("Good day")
    }else{
        println("Good evening")
    }

    val day = 4

    var result = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(result)

    var i = 1

    println("While loop")
    while(i < 5){
        println(i)
        i++
    }

    println("Do while loop")
    do{
        println(i)
        i++
    }while (i<5)

    println("break")
    var j = 0

    while(j < 10){
        println(j)
        j++
        if (j == 4){
            break
        }
    }

    println("continue")

    while (j < 10){
        if (j == 4){
            j++
            continue
        }
        println(j)
        j++
    }

    println("Arrays")

    val cars = arrayOf("Mazda", "Ford", "Benze", "Tesla")
    cars[0] = "Opel"
    for (c in cars){
        println(c)
    }
    println(cars.size)
    if ("Opel" in cars){
        println("It exist")
    }else{
        println("It does not exist")
    }

    println("Functions")
    myFunction()
    val z = Calculate(3, 4)
    println(z)

    val m = FindArea(7)
    println(m)


    println("Classes and objects")

    println("using a constructor")

    val c1 = Car("Ford", "Black", "Mustang", 2020)
    println(c1.brand)
    println(c1.model)
    println(c1.color)

    c1.drive()
    c1.speed(200)

    println("Inheritance")
    val dog = Dog()
    dog.sound()

    val sq = SquareAnimal()
    sq.color()
}

fun myFunction(){
    println("I am a function")
}

fun Calculate(x: Int, y: Int): Int {
    return x + y
}

fun FindArea(r: Int) = r*r

class Car(var brand: String, var color: String, var model: String, var year: Int){
    //class function
    fun drive(){
        println("brooom!")
    }

    //class function with parameters
    fun speed(maxSpeed:Int){
        println("maximum speed = " + maxSpeed)
    }
}

open class Animal{
    open fun sound(){
        println("sound")
    }
}

open class Dog : Animal(){
    final override fun sound() {
        println("woow!")
    }
    open fun color(){
        println("color")
    }
}

class SquareAnimal : Dog(){
    override fun color() {
        println("black")
    }
}