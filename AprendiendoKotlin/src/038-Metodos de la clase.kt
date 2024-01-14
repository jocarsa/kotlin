fun main(){
    val persona_1 = Persona4("Jose Vicente","Carratala",45)
    val persona_2 = Persona4("Juan","Garcia Martinez",46)
    println(persona_1.saluda())
}

class Persona4(nombre:String,apellidos:String,edad:Int){
    fun saluda():String{
        return "Hola que tal"
    }
}