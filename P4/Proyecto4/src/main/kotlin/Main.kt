fun main(args: Array<String>) {
    println("Hello World!")

    var pers:Persona = Persona("Mario",18);
    pers.edad
    pers.nombre
    pers.imprimir()

    var emp:Empleado = Empleado("Marco",20, 4000.0);
    emp.imprimir()
    emp.impuestos()
}



//Diseñar una clase Persona con las propiedades nombre y edad. El constructor debe recibir estas propiedades.
// La clase Persona tendrá sus get y set (privados) y un método imprimir donde saludará y dirá sus datos.
//En la función main del programa definir un objeto de la clase Persona y llamar a sus métodos.
//Añadir una segunda clase llamada Empleado que herede de la clase Persona y agregue una propiedad sueldo y
// muestre si debe pagar impuestos (sueldo superior a 3000)
//Desde el main crear un objeto de la clase Empleado y llamar a sus métodos

open public class Persona(n:String,e:Int){
    var nombre:String
    var edad:Int

    init {
        nombre = n;
        edad = e
    }

    fun imprimir(){
        println("Hola me llamo $nombre y tengo $edad anyos")
    }


}

public class Empleado(n: String, e: Int, s:Double) : Persona(n,e) {

    var sueldo:Double;
    init {
        sueldo=s;
    }

    fun impuestos(){
        if(sueldo>3000){
            println("Debe pagar impuestos")
        }else{
            println("No debe pagar impuestos")
        }
    }

}
//Diseñar una clase abstracta Cuenta y dos subclases CajaAhorro y PlazoFijo.
//Definir las propiedades y métodos comunes entre una caja de ahorro y un plazo fijo y agruparlos en la clase Cuenta
// (por ejemplo, tienen un nombre de titular y un monto).
//Al plazo fijo añádele un plazo de días y una tasa de interés.
//La caja de ahorro no genera intereses.
//En la función main del programa definir un objeto de la clase CajaAhorro y otro de la clase PlazoFijo.


open public class Cuenta(n:String,m:Double){
    var nombre:String
    var monto:Double

    init {
        nombre=n
        monto=m
    }

}

public class CajaAhorro(n:String,m:Double):Cuenta(n,m){

}

public class PlazoFijo(n:String,m:Double):Cuenta(n,m){
    var p_dias:Int = 0
        get() = field
        set(value) {
            p_dias=value
        }
    var interes:Double = 0.0
        get() = field
        set(value) {
            interes=value
        }


}

