
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Bucles {
    public static void main(String[] args) {

        //for en java, repito basado en un contador (i++, i--, etc)
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Java");
        }

        System.out.println("----------------\n");

        //recorriendo array
        String[] names={"pepe","juan","ingrid"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("----------------\n");

        //forEach en java, es mejor porque es mas simple y funciona para varias estructuras, como arrays,listas,sets
        for (String name : names) {
            System.out.println(name);
        }

        //con set
        var countries=new HashSet<String>();
        countries.add("España");
        countries.add("Mexico");
        countries.add("Argentina");

        for (String pais : countries) {
            System.out.println(pais);
        }

        //con maps, se utiliza entrySet para convertir ese par de clave-valor en un unico elemento como un set, puedo utilizar los metodos del entry para capturar la clave o el valor si quiero
        var contactos=new HashMap<String,Integer>();
        contactos.put("Ingrid", 2456776);
        contactos.put("Pepe", 5675647);
        contactos.put("Juan", 7896754);

        for (Map.Entry<String,Integer> contacto : contactos.entrySet()) {
            System.out.println(contacto);
            System.out.println(contacto.getKey());
            System.out.println(contacto.getValue());
        }


        System.out.println("----------------\n");

        //bucle while, repito mientras la condicion sea verdadera
        int i=0;//condicion

        while (i<5) {
            System.out.println("Hola Java");
            i++;
        }

        //con array
        i=0;
        while (i<names.length) {
            System.out.println(names[i]);
            i++;//en si esto permite que la condicion en un momento ya no se cumpla para poder romper el bucle
        }

        System.out.println("----------------\n");


        //bucle do-while,se ejecuta al menos una vez, aqui hacemos la condicion i<0, estando asi al menos se ejecuta el codigo una vez
        i=0;

        do {
            System.out.println("Hola Java,bucle do-while");
            i++;
        } while (i<0);

        System.out.println("----------------\n");


        //control de bucles

        //1-break,rompe el bucle
        for (String name : names) {
            if (name.equals("juan")) {
                break;
            }
            System.out.println(name);
        }

        //2-continue,salta una iteracion que nosostros definamos
        for (int j = 0; j < 5; j++) {
            if (j==3) {
                continue;
            }

            System.out.println(j);
        }

        System.out.println("----------------\n");




        //ejercicios

        // 1. Imprime los números del 1 al 10 usando while.
        i=1;

        while (i<=10) {
            System.out.println(i);
            i++;
        }

        System.out.println("----------------\n");


        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var numbersList=new ArrayList<Integer>(List.of(10, 20, 30, 40));
        int n=0;

        do {
            System.out.println(numbersList.get(n));
            n++;
        } while (n<numbersList.size());

        System.out.println("----------------\n");


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int j = 1; j <=50; j++) {
            if (j % 5 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("----------------\n");


        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] misNumeros = {5, 10, 15, 20, 25};
        int total=0;
        for (int j : misNumeros) {
            total=total+j;
        }
        System.out.println("Suma total: " + total);

        System.out.println("----------------\n");


        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] ciudades={"bogota","medellin","madrid","new york"};
        for (int index = 0; index < ciudades.length; index++) {
            System.out.println(ciudades[index]);
        }

        System.out.println("----------------\n");


        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var equipos=new HashSet<String>();
        equipos.add("millos");
        equipos.add("america");
        equipos.add("nacional");

        var telefonos=new HashMap<String,Integer>();
        telefonos.put("Ingrid", 2456776);
        telefonos.put("Pepe", 5675647);
        telefonos.put("Juan", 7896754);
        telefonos.put("Perez", 9672314);

        for (String equipo : equipos) {
            System.out.println(equipo);
        }

        for (Map.Entry<String,Integer> telefono : telefonos.entrySet()) {
            System.out.println(telefono.getKey() + ": " + telefono.getValue());
        }

        System.out.println("----------------\n");

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int j = 10; j>=1; j--) {
            System.out.println(j);
        }

        System.out.println("----------------\n");

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int j = 1; j <=20; j++) {
            if (j % 3 == 0) {
                continue;
            }

            System.out.println(j);
        }

        System.out.println("----------------\n");

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] negativos={3,45,67,21,11,-3,5,-6};

        for (int j : negativos) {
            if (j<0) {
                System.out.println("!Aqui hay un negativo, break");
                break;
            }
            System.out.println(j);
        }

        System.out.println("----------------\n");


        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println(calcularFactorial(4));
        

    }

    public static long calcularFactorial(int n) {
        // El factorial de 0 y 1 siempre es 1
        long resultado = 1;

        // Recorremos desde el 1 hasta el número dado multiplicando
        for (int i = 1; i <= n; i++) {
            resultado *= i; // Atajo para: resultado = resultado * i
        }

        return resultado;
    }

   

    
}
