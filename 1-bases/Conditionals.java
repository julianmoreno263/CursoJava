public class Conditionals {
    public static void main(String[] args) {
        
        //Condicionales if en Java se usan para evaluar condiciones
        var age=18;

        if (age>=18) {
            System.out.println("Eres mayor de edad");
        }else if(age==18){
            System.out.println("Acabas de cumplir 18 años");
        } else {
            System.out.println("Eres menor de edad");
        }


        //condicionales switch en java, sirve para inspeccionar el valor de una variable
        var day=5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
        
            default:
                System.out.println("No es lunes,martes o miercoles");
                break;
        }

        //ejercicios
         // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var edad=18;

        if (edad>=18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num1=22;
        var num2=12;
        if (num1>num2) {
            System.out.println("num1 es el número mayor");
        }else if(num1==num2){
            System.out.println("Los números son iguales");
        } else {
            System.out.println("num2 es el número mayor");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        var num3=11;

        if (num3>0) {
            System.out.println("El número es positivo");
        }else if(num3<0){
            System.out.println("El número es negativo");
        } else if(num3==0){
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        if (num3%2==0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if (num2>=1 & num2<=100) {
            System.out.println("El número esta en el rango de 1 a 100");
        } else {
            System.out.println("El número esta fuera del rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var diaSemana=4;

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Número de día no existe");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-10).
        var nota=6;

        if (nota>=1 & nota<=5) {
            System.out.println("Suspendido");
        }else if(nota>=6 & nota<=8){
            System.out.println("Aprobado");
        } else if(nota>=9 & nota<=10) {
            System.out.println("Sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var miEdad=11;
        var acompañado=true;

        if (miEdad>=15 || acompañado==true) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var letra="e";

        if (letra=="a" || letra=="e" || letra=="i" || letra=="o" || letra=="u") {
            System.out.println("La letra es vocal");
        } else {
            System.out.println("La letra es consonante");
        }

        

    }
}
