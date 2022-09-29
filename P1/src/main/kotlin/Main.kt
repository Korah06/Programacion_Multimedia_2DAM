fun main(args: Array<String>) {


//1.Crear un programa que defina dos variables inmutables de tipoInt. Luego definir una tercera variable mutable que
// almacene la suma de las dos primeras variables y las muestre. Seguidamente almacenar en la variable el producto
// de las dos primeras variables y mostrar el resultado.

    /*
    val x : Int = 5;
    val y : Int = 7;

    var z = x+y;

    println("La suma es: " + z);

    z = x*y;

    println("El producto es: " + z);

    */
//2.Definir una variable inmutable con el valor 75 que representa el lado de un cuadrado,
// en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
//Mostrar la superficie y el perímetro por la Consola.

    /*
    val lado : Int = 75;

    val perimetro : Int = lado*4;
    val superficie : Int = lado*lado;

    println("El perimetro es: $perimetro La superficie es: $superficie");
*/


//3.Definir tres variables inmutables y cargar por asignación los pesos de tres personas con valores Float.
// Calcular el promedio de pesos de las personas y mostrarlo.

    /*
    val peso1 : Float = 55.3F;
    val peso2 : Float = 78.4F;
    val peso3 : Float = 89.1F;

    var promedio : Float = peso1+peso2+peso3/3

    println("El promedio es: $promedio");

    */
//4.Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
/*
    var valor1 : Int = readln().toInt();
    var valor2 : Int = readln().toInt();

    var suma : Int = valor1+valor2;
    var producto : Int = valor1*valor2;

    println("La suma es: $suma Y el producto es: $producto");
*/
//5.Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro de este.

    /*
    var ladoC : Int = readln().toInt();

    var perimetroC : Int = ladoC*4;

    println("El perimetro es: $perimetroC");
*/
//6.Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar
// la suma de los dos primeros y el producto del tercero y el cuarto.
/*
    var entero1 : Int = readln().toInt();
    var entero2 : Int = readln().toInt();
    var entero3 : Int = readln().toInt();
    var entero4 : Int = readln().toInt();

    var sumaEnt = entero1+entero2;
    var productoEnt = entero3 * entero4;

    println("La suma es: $sumaEnt El producto es: $productoEnt");
*/
//7.Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.

/*
    var entero1 : Int = readln().toInt();
    var entero2 : Int = readln().toInt();
    var entero3 : Int = readln().toInt();
    var entero4 : Int = readln().toInt();

    var sumaEnt = entero1+entero2+entero3+entero4;
    var promedioEnt = sumaEnt.toFloat()/4;


    println("La suma es: " + sumaEnt + "El promedio es: " + promedioEnt);

*/
//8.Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.

/*
    var sueldo = readln().toFloat();
    if(sueldo>3000){
        println("Tienes que pagar impuestos");
    }else{
        println("No tienes que pagar impuestos");
    }
*/
//9.Realizar un programa que solicite ingresar dos números enteros distintos y muestre por pantalla el mayor de ellos.
/*
    var entero1 : Int = readln().toInt();
    var entero2 : Int = readln().toInt();

    if(entero1 == entero2){
        println("Son iguales");
    }else if(entero1 > entero2){
        println("El primero es mayor al segundo");
    }else{
        println("El segundo es mayor al primero");
    }
*/

//10.Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo calcular la suma y la resta,
// luego mostrarlos, sino calcular el producto y la división.

    /*
    var entero1 : Int = readln().toInt();
    var entero2 : Int = readln().toInt();

    if(entero1 == entero2){
        println("Son iguales");
    }else if(entero1 > entero2){
        var producto = entero1*entero2;
        var division = entero1/entero2;
        println("El producto es: " + producto + "La divison es: " + division);
    }else{
        var suma = entero1+entero2;
        var resta = entero1-entero2;
        println("La suma es: " + suma + "La resta es: " + resta);
    }
*/

//11.Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".

    /*

    var nota1 : Float = readln().toFloat();
    var nota2 : Float = readln().toFloat();
    var nota3 : Float = readln().toFloat();

    var promedio = (nota1+nota2+nota3)/3;

    if(promedio >=7){
        println("Promocionado");
    }else{
        println("No promocionado");
    }
*/

//12.Se ingresa por teclado un número entero comprendido entre 1 y 99,
// mostrar un mensaje indicando si el número tiene uno o dos dígitos.

/*
    var ent : Int = readln().toInt();

    if(ent <=99 && ent >=1){

        if(ent >=10){
            println("El numero tiene dos digitos");
        }else{
            println("El numero tiene un digito");
        }

    }
*/

//13.Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra variable la cantidad de dígitos
// que tiene el valor ingresado por teclado. Mostrar la cantidad de dígitos del número ingresado por teclado.

    /*
    var ent : Int = readln().toInt();
    var digit : Int = 0;

    if(ent <=99 && ent >=1){

        if(ent >=10){

            digit = 2;

        }else{

            digit = 1;

        }

    }

    println(digit);
    */


//14.Un postulante a un empleo realiza una prueba de capacitación, se obtuvo la siguiente información:
// cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
// Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel de este según
// el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
    //Nivel máximo:   Porcentaje>=90%.
    //Nivel medio:      Porcentaje>=75% y <90%.
    //Nivel regular:     Porcentaje>=50% y <75%.
    //Fuera de nivel:   Porcentaje<50%.
    /*
    var preguntas : Double = readln().toDouble();
    var correctas : Double = readln().toDouble();

    var porcentaje : Double = (correctas/preguntas) * 100;

    if(porcentaje>=90){
        println("Nivel Maximo");
    }else if(porcentaje>=75){
        println("Nivel Medio");
    }else if(porcentaje>=50){
        println("Nivel Regular");
    }else{
        println("Fuera de nivel");
    }

    */

//15.Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros
// x e y (distintos a cero). Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.

    /*
    var x : Double = 0.0;
    var y : Double = 0.0;
    while (x ==0.0 || y == 0.0){
        println("Inserte dos numeros no iguales a 0")
        x = readln().toDouble();
        y = readln().toDouble();

        if(x == 0.0 || y == 0.0){
            println("Numeros no validos")
        }

    }

    println("El cuadrante se encuentra en x:" + x + " y en Y: " + y);

    */

//16.Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por teclado se guarde en otras dos variables
// el menor y el mayor de esa lista. Utilizar el if como expresión para obtener el mayor y el menor. Imprimir luego las dos variables.
/*
    val nums = arrayOf(1,2,3);
    for (i in 0..2){
        var x : Int = readln().toInt();
        nums[i]=x;
    }
    var mayor : Int = -999;
    for (i in 0..2){
        if(nums[i]>mayor)
            mayor=nums[i];
    }

    var menor : Int = 999;
    for (i in 0..2){
        if(nums[i]<menor)
            menor=nums[i];
    }

    println("El numero mayor es: $mayor El numero menor es: $menor");
*/

    //17.Realizar un programa que imprima en pantalla los números del 1 al 777.
    /*
    for(i in 1..777){
        println(i);
    }

    */
    //18.Desarrollar un programa que permita la carga de 12 valores por teclado y nos muestre posteriormente
// la suma de los valores ingresados y su promedio.

/*
    var nums = arrayOf(0,0,0,0,0,0,0,0,0,0,0,0);

    for (i in nums.indices){
        var x : Int = readln().toInt();
        nums[i]=x;
    }

    var sumaEnt : Int = 0;
    for (i in nums.indices){
        sumaEnt += nums[i];
    }

    var promedioE = sumaEnt/nums.size;

    println("La suma es: " + sumaEnt + " El promedio es: " + promedioE);
    */

//19.Una planta que fabrica perfiles de hierro posee un lote de n piezas. Confeccionar un programa que pida ingresar por teclado
// la cantidad de piezas a procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté comprendida
// en el rango de 1.20 y 1.30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.

    /*
    println("Inserte numero de piezas");
    var numP = readln().toInt();

    var rangos = mutableListOf<Double>();

    for (i in 0..numP){
        println("Inserte rango de la pieza");
        var x = readln().toDouble();
        rangos.add(x);
    }

    for (i in 0..numP){
        if(rangos[i]>=1.2 && rangos[i]<=1.3){
            println("$numP Apto");
        }else{
            println("$numP No Apto");
        }
    }
*/

//20.Realizar un programa que permita cargar dos listas de 5 valores cada una. Informar con un mensaje cuál de las dos
// listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")

    /*NO FUNCIONA BIEN
h
    var lista1 = arrayOf(0,0,0,0,0);
    var lista2 = arrayOf(0,0,0,0,0);

    for (i in lista1.indices){
        println("Inserte numero para lista 1");
        var x = readln().toInt();
        lista1[i] = x;
    }

    for (i in lista2.indices){
        println("Inserte numero para lista 2");
        var x = readln().toInt();
        lista2[i] = x;
    }

    var totList1 =0;
    var totList2 =0;

    for (i in lista1.indices){
        totList1 += lista1[i];
    }
    for (i in lista2.indices){
        totList1 += lista2[i];
    }

    if(totList1>totList2){
        println("La lista 1 es mas grande");
    }else if(totList1==totList2){
        println("Las listas son iguales");
    }else{
        println("La lista 2 es mas grande");
    }

    */

//21.Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.

//22.En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos
// que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además,
// el programa deberá informar el importe que gasta la empresa en sueldos al personal.


/*
    println("Inserte numero de empleados");
    var nEmpleados : Int = readln().toInt();

    var sueldos = mutableListOf<Int>();

    var sMedio = 0;
    var sAlto = 0;

    var stotal = 0;

    for (i in 1..nEmpleados){
        println("Inserte sueldo empleado");
        var x = readln().toInt();
        sueldos.add(x);
    }

    for (i in sueldos.indices){
        if (sueldos[i]>=100 && sueldos[i] <=300){
            sMedio++;
            stotal+=sueldos[i];
        }else if(sueldos[i]<=500 && sueldos[i]>300){
            sAlto++;
            stotal+=sueldos[i];
        }else{
            println("Sueldo incorrecto");
        }
    }

    println("Tienen un sueldo medio $sMedio, un sueldo alto $sAlto y la empresa invierte $stotal en salarios")
*/
    //println("Program arguments: ${args.joinToString()}")
}