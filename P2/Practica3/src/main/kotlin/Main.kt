import kotlin.random.Random

fun main(args: Array<String>) {
/*
    var pers1 = Persona("David",19)
    pers1.datos()
    pers1.mayEdad()

    var al1 = Alumno();
    al1.imprimir()

    var op = Operaciones()
    op.ejecutar()

    var h1 = Hijos()

    h1.almacenarEdades()
    h1.cargar()
/*
    var p1 = Punto(2,3)
    var p2 = Punto(-1,3)
    var p3 = Punto(6,-5)
    var p4 = Punto(0,1)
    var p5 = Punto(-3,-2)
    p1.cuadrante();
    p2.cuadrante();
    p3.cuadrante();
    p4.cuadrante();
    p5.cuadrante();*/

 */

    var play = Jugar();

    play.partida()
}

//Implementaremos una clase llamada Persona que tendrá como propiedades (variables) su nombre y edad,
// y tres métodos (funciones), uno de dichos métodos inicializará las propiedades del nombre y la edad,
// otro método mostrará en la pantalla el contenido de las propiedades y por último uno que imprima si es mayor de edad.
//Definir dos objetos de la clase Persona y muestra los datos de ellas.


//3) A la clase Persona del ejercicio A añadirle un constructor donde debe llegar como parámetros el nombre y la edad.

public class Persona(var nombre : String = "Default", var edad : Int = 0){
    //lateinit var nombre : String
    //var edad : Int = 0

    fun inicializador(nombre: String,edad:Int){
        this.nombre = nombre;
        this.edad = edad;

    }

    fun datos(){
        println("$nombre tiene $edad anyos");
    }

    fun mayEdad(){
        if (edad >=18){
            println("$nombre es mayor de edad")
        }else{
            println("$nombre no es mayor de edad")
        }
    }

}

//Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota.
// Definir los métodos para inicializar sus propiedades por teclado, imprimirlos y mostrar un mensaje si está
// regular (nota mayor o igual a 4) Definir dos objetos de la clase Alumno.

public class Alumno(var nombre : String = readln(), var nota : Int = readln().toInt()){


    fun imprimir(){
        if (nota >=4){
            println("$nombre tiene $nota y es Regular")
        }else{
            println("$nombre tiene $nota y es Insuficiente")
        }
    }

}

//Diseñar una clase que represente un punto en el plano, la coordenada de un punto en el plano está dada por dos valores enteros x e y.
//Tiene un constructor que recibe la ubicación del punto en x e y.
//Implementar un método que retorne un String que indique en que cuadrante se ubica dicho punto.
//1º Cuadrante si x > 0 e y > 0
//2º Cuadrante: x < 0 e y > 0
//3º Cuadrante: x < 0 e y < 0
//4º Cuadrante: x > 0 e y < 0
//Si alguno o los dos valores son cero luego el punto se encuentra en un eje.
//Definir luego 5 objetos de la clase Punto en cada uno de los cuadrantes y uno en un eje.


public class Punto(var x : Int = 0, var y : Int = 0){

    fun cuadrante() : String{

        if(x>0 && y>0){
            return "El punto se encuentra en el primer cuadrante"
        }else if(x<0 && y>0){
            return "El punto se encuentra en el segundo cuadrante"
        }else if(x<0 && y<0){
            return "El punto se encuentra en el tercer cuadrante"
        }else if (x>0 && y >0){
            return "El punto se encuentra en el cuarto cuadrante"
        }else{
            return "El punto se encuentra en un eje"
        }

    }

}

//Plantear una clase Operaciones que en un método solicite la carga de 2 enteros y posteriormente llame a otros dos métodos
// que calculen su suma y producto.

public class Operaciones(){
    fun ejecutar() : String{

        println("Inserte un numero")
        var x = readln().toInt();

        println("Inserte un numero")
        var y = readln().toInt()
        return "La suma de estos numeros es = ${suma(x,y)} La multiplicacion de estos numeros es = ${mult(x,y)}"

    }
    private fun suma(x : Int, y : Int):Int{
        return x+y
    }
    private fun mult(x : Int, y : Int):Int{
        return x*y
    }
}


//Diseñar una clase llamada Hijos.
//Definir dentro de la misma un arreglo para almacenar las edades de 5 personas.
//Definir un método cargar donde se ingrese por teclado el arreglo de las edades y
// llame a otros dos métodos que impriman la mayor edad y el promedio de edades.

public class Hijos(){
    var edades = arrayOf(0,1,2,3,4)

    fun almacenarEdades(){
        for (i in edades.indices){
            println("Inserte la edad de un hijo")
            edades[i] = readln().toInt()
        }
    }

    fun cargar(){

        println("la mayor edad es: ${mayor(edades)} el promedio es: ${promedio(edades)}")

    }

    private fun mayor(arr: Array<Int>) : Int{
        var may = -999999
        for (i in arr.indices){
            if (arr[i]>may){
                may = arr[i]
            }
        }

        return may;
    }

    private fun promedio(arr: Array<Int>) : Double{
        var sum = 0
        for (i in arr.indices){
                sum += arr[i];
        }

        return (sum/arr.size).toDouble()
    }

}


//Desarrollar un programa que permita jugar a los dados. El funcionamiento del juego es se tiran tres dados
// si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".
//Este programa tendrá dos clases una Dado que poseerá un atributo que será el valor del dado y como métodos
// uno tirar y otro imprimir y otra clase Juego que su propiedad será una lista de 3 objetos Dado y el método jugar.

public class Dado(){

    var num : Int = 0

    fun tirarDado(): Int{
        num = Random.nextInt(1,6)
        return num
    }


}

public class Jugar(){
    var dado1 = Dado()
    var dado2 = Dado()
    var dado3 = Dado()

    fun partida(){
        var num1 = dado1.tirarDado()
        var num2 = dado2.tirarDado()
        var num3 = dado3.tirarDado()

        if(num1 == num2 && num1 == num3 && num2 == num3){

            println("Has ganado")

        }else{
            println("Has perdido")
        }

    }
}

//Diseñar una clase Club y otra clase Socio.
//La clase Socio debe tener las siguientes propiedades: nombre y la antigüedad en el club (en años).
// Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
//La clase Club debe tener como propiedades 3 objetos de la clase Socio. Y tendrá un método en la clase
// Club para imprimir el nombre del socio con mayor antigüedad en el club.


public class Socio(var ant : Int, var nombre : String){

}


public class Club(){

    var s1 = Socio(5,"Alex");
    var s2 = Socio(2,"Miguel");
    var s3 = Socio(1,"Maria");
    var socios = arrayOf(s1,s2,s3);

    fun mayAntiguedad(){
        var may :Int= -99999
        var mayN :String = ""
        for (i in 0..socios.size-1){
            if(may < socios[i].ant){
                may = socios[i].ant
                mayN = socios[i].nombre
            }
        }

        println("$mayN")
    }

}






