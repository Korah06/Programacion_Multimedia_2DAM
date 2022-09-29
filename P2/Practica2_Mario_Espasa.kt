import kotlin.random.Random

fun main(args: Array<String>) {
    /*
    ex1();


    ex2();
    ex2();

    ex3();

    ex4();

    var clave1 :String = readln();
    var clave2 :String = readln();
    ex5(clave1, clave2)

    var valor1 :Int = readln().toInt();
    var valor2 :Int = readln().toInt();
    var valor3 :Int = readln().toInt();

    ex6(valor1,valor2,valor3);


    var palabra :String = readln();
    var palabra2 :String = readln();

    var lPal = ex7(palabra);
    var lPal2 =  ex7(palabra2);

    if(lPal>lPal2){
        println("La primera es mas larga");
    }else if(lPal==lPal2){
        println("Son del mismo tamanyo");
    }else{
        println("La segunda es mas larga");
    }

    ex10(2,10);

    */
    /*
    val emp1 : Empleado = Empleado();
    emp1.nombre = "Mario";
    emp1.sueldo = 1200.0;

    val emp2 : Empleado = Empleado();
    emp2.nombre = "Juan Alberto";
    emp2.sueldo = 1500.0;


    val emp3 : Empleado = Empleado();
    emp3.nombre = "Miguel";
    emp3.sueldo = 1998.0;

    var empleados = mutableListOf<Empleado>()
    empleados.add(emp1);
    empleados.add(emp2);
    empleados.add(emp3);

    var totSueldos = 0.0;
    for (i in 0..empleados.size){
        println("El nombre es: ${empleados[i].nombre} y tiene un sueldo de : ${empleados[i].sueldo}");
        totSueldos += empleados[i].sueldo;
    }

    val emp4 : Empleado = Empleado();
    emp3.nombre = "Ana";
    emp3.sueldo = 1781.0;
    empleados.add(emp4);

    totSueldos = 0.0;
    for (i in 0..empleados.size){
        println("El nombre es: ${empleados[i].nombre} y tiene un sueldo de : ${empleados[i].sueldo}");
        totSueldos += empleados[i].sueldo;
    }

    println("El total de sueldos es $totSueldos");
    */







}


//Confeccionar una aplicación que muestre una presentación en pantalla del programa.
// Solicite la carga de dos valores y nos muestre la suma.
// Mostrar finalmente un mensaje de despedida del programa. Implementar estos servicios en tres funciones.

fun ex1(){
    ex1a();
    ex1b();
    ex1c();
}

fun ex1a(){
    println("Bienvenido al programa inserte dos valores");
}

fun ex1b(){
    println("Primer valor:");

    var dato1 :Int = readln().toInt();

    println("Segundo valor");

    var dato2 :Int = readln().toInt();

    var suma:Int = dato1 + dato2;

    println("La suma es: $suma");
}

fun ex1c(){
    println("Que tenga un buen dia");
}

//Desarrollar una función que solicite la carga de tres valores y muestre el menor.
// Desde la función main del programa llamar 2 veces a dicha función
fun ex2(){

    val nums = arrayOf(1,2,3);
    for (i in 0..2){
        println("Introduzca un valor")
        var x : Int = readln().toInt();
        nums[i]=x;
    }

    var menor : Int = 999;
    for (i in 0..2){
        if(nums[i]<menor)
            menor=nums[i];
    }

    println("El numero menor es: $menor");
}

//Confeccionar una aplicación que muestre una presentación en pantalla del programa.
// Solicite la carga de dos valores y nos muestre la suma. Mostrar finalmente un mensaje de despedida del programa.

fun ex3(){
    println("Bienvenido al programa inserte dos valores");
    println("Primer valor:");

    var dato1 :Int = readln().toInt();

    println("Segundo valor");

    var dato2 :Int = readln().toInt();

    var suma:Int = dato1 + dato2;

    println("La suma es: $suma");

    println("Que tenga un buen dia");
}


//Desarrollar un programa que permita ingresar el lado de un cuadrado.
// Luego preguntar si quiere calcular y mostrar su perímetro o su superficie. (2 funciones)

fun ex4(){
    calcular(insertarLado());
}

fun insertarLado(): Int {
    println("Inserte el lado de un cuadrado:")

    var lado :Int = readln().toInt();
    return lado;
}

fun calcular(lado : Int){
    println("¿Quiere calcular su perimetro(1) o su superficie?(2)")

    var opc :Int = readln().toInt();
    if(opc==1){
        println("Su perimetro es: ${lado*4}");
    }else if(opc==2){
        println("Su superficie es: ${lado*lado}");
    }else{
        println("No ha querido calcular nada");
    }
}

//En la función main solicitar que se ingrese una clave dos veces por teclado.
// Desarrollar una función que reciba dos String como parámetros y muestre un
// mensaje si las dos claves ingresadas son iguales o distintas
fun ex5(clave1 : String, clave2 : String){

    if (clave1.equals(clave2)){
        println("Las dos claves son iguales");
    }else{
        println("Las dos claves son distintas");
    }

}

//Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
// En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar a la primera función definida.

fun ex6(val1:Int,val2:Int,val3:Int){
    val nums = arrayOf(val1,val2,val3);

    var menor : Int = 999;
    for (i in 0..2){
        if(nums[i]<menor)
            menor=nums[i];
    }
    println("El numero menor es: $menor");
}

//Confeccionar una función que le enviemos como parámetro un String y nos retorne la cantidad de caracteres que tiene.
// En la función main solicitar la carga de dos nombres por teclado y llamar a la función dos veces.
// Imprimir en la main cuál de las dos palabras tiene más caracteres.

fun ex7(cadena:String):Int{
    return cadena.length;
}

//Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los mismos
fun ex8(ent1:Int,ent2:Int,ent3:Int):Double{

    return ((ent1+ent2+ent3)/3).toDouble();
}

//Elaborar una función que nos retorne el perímetro de un cuadrado pasando como parámetros el valor del lado.
fun ex9(lado : Int):Int{
    return lado*4;
}

//Elaborar una función que muestre la tabla de multiplicar del valor que le enviemos como parámetro.
// Definir un segundo parámetro llamado termino que por defecto almacene el valor 10.
// Se deben mostrar tantos términos de la tabla de multiplicar como lo indica el segundo parámetro.
// Llamar a la función desde la main con argumentos nombrados.

fun ex10(valor: Int, termino:Int){
    for (i in 1..termino){
        println("$valor X $i = ${valor*i}")
    }
}
//Modificar la función del ejercicio 7 para que sea una función en línea
fun ex11(cadena:String):Int =cadena.length;

//Definir un arreglo de 8 componentes de tipo Float que representen las alturas de 5 personas.
// Obtener el promedio de estas y contar cuántas personas son más altas que el promedio y cuántas más bajas.
fun ex12(al1:Float,al2:Float,al3:Float,al4:Float,al5:Float){

    var promedio = (al1+al2+al3+al4+al5)/5;

    val alturas = arrayOf(al1,al2,al3,al4,al5);

    var mayor = 0;
    var menor = 0;

    for (i in 0..4){
        if(alturas[i]>promedio){
            mayor++;
        }else{
            menor++;
        }
    }

    println("El promedio es: $promedio y hay $mayor que superan el promedio y $menor que no lo superan");

}

//Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
//El valor acumulado de todos los elementos.
//El valor acumulado de los elementos que sean mayores a 36.
//Cantidad de valores mayores a 50.

fun ex13(in1:Int,in2:Int,in3:Int,in4:Int,in5:Int){

    val alturas = arrayOf(in1,in2,in3,in4,in5);


}

//Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
// Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo en un tercer arreglo del mismo tamaño.
fun ex14(){
    var arr1 = arrayOf(1,2,3,4)
    var arr2 = arrayOf(8,6,7,8)
    var arr3 = arrayOf(0,0,0,0)

    for(i in 0..arr1.size-1){
        arr3[i] = arr1[i] + arr2[i]
        println("${arr3[i]}");
    }


}
//Desarrollar un programa que permita ingresar un arreglo de n elementos,
// ingresar n por teclado. Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume
// todos sus elementos y retorne dicho valor a la main donde se lo imprima.
fun ex15(){
    println("¿Cuantos elementos quiere añadir?");
    var num = readln().toInt();
    sumArr(arreglo(num));

}
fun arreglo(pos:Int):List<Int>{

    var arr = arrayListOf<Int>();

    for (i in 0..pos-1){
        println("Inserte un valor");
        arr.add(readln().toInt());
    }

    return arr;

}

fun sumArr(arr:List<Int>):Int{
    var sum :Int = 0;
    for (i in arr.indices){
        sum += arr[i];
    }

    return sum;
}

//Cargar un arreglo de n elementos. Imprimir el menor elemento y un mensaje si se repite dentro del arreglo.
fun ex16(){
    println("¿Cuantos elementos quiere añadir?");
    var num = readln().toInt();

    println(menArr(arreglo(num)));
}

fun menArr(arr:List<Int>):Int{
    var menor :Int = 9999999;
    for (i in arr.indices){
        if(menor>arr[i]){
            menor = arr[i];
        }
    }
    return menor;
}

//Crear una lista mutable con las edades de varias personas.
//Probar las propiedades y métodos principales para administrar la lista mutable.

//SIN ACABAR
fun ex17(){

    adminLista(cLista());
}

fun cLista():List<Int>{
    var arr = mutableListOf<Int>();
    for (i in arr.listIterator()){
        println("Inserte una edad");
        arr.add(readln().toInt());
    }
    return arr;
}

fun adminLista(arr: List<Int>){



}

//Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos entre 0 y 20.
// Contar cuantos hay comprendidos entre 1 y 4, 5 y 8 y cuantos entre 10 y 13 e Imprimir si el valor 20 está presente en la lista.
fun ex18(){

    val randomValues = Array(100) { Random.nextInt(0, 20) }
    var men = 0;
    var mid = 0;
    var max = 0;

    for(i in randomValues.iterator()){
        if (randomValues[i] in 1..4){
            men++;
        }else if(randomValues[i] in 5..8){
            mid++;
        }else if(randomValues[i] in 10..13){
            max++;
        }else if(randomValues[i] == 20){
            println("Hay un 20");
        }
    }

}

//Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.
//Definir una lista mutable con tres empleados.
//Imprimir los datos de los empleados.
//Calcular cuánto gasta la empresa en sueldos.
//Agregar un nuevo empleado a la lista y calcular nuevamente el gasto en sueldos.

public class Empleado(){

    var nombre : String = "Default"
    var sueldo : Double = 500.0

        get() = field;
        set(value) {
            field = value;
        }
}


//Crear un mapa que permita almacenar 5 artículos, utilizar como clave el nombre de productos y como valor el precio de este. Desarrollar además las funciones de:
//Imprimir en forma completa el diccionario
//Mostrar la cantidad de artículos con precio superior a 20.

//NO ACABADO
fun ex20(){
    val articulos : MutableMap<String, Int> = mutableMapOf();
    for (i in 0..5){
        println("Inserte el nombre del producto:")
        var nom =  readln();
        println("Inserte el precio del producto:")
        var pre = readln().toInt();
        articulos.put(nom,pre);
    }

    println("$articulos");


}

//Definir un MutableSet y almacenar 6 valores aleatorios comprendidos entre 1 y 50.
// El objeto de tipo MutableSet representa un cartón de lotería.
// Comenzar a generar valores aleatorios (comprendidos entre 1 y 5) todos distintos y detenerse cuando salgan
// todos los que contiene el cartón de lotería. Mostrar cuantos números tuvieron que sortearse hasta que se completó el cartón.

fun ex21(){
    val loteria :MutableSet<Int> = mutableSetOf(
        Random.nextInt(1,50),
        Random.nextInt(1, 50),
        Random.nextInt(1, 50),
        Random.nextInt(1,50),
        Random.nextInt(1,50),
        Random.nextInt(1,50)
    )

    var count = 0;

    while (loteria.size != 0){
        var x = Random.nextInt(1,50)
        if (loteria.contains(x)){
            loteria.remove(x);
        }
        count++;
    }

    println("Ha tardado $count intentos");
}
