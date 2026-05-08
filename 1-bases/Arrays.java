import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        
        //estructuras de datos, es algo que nos sirven para almacenar mas de un dato

        //1-arrays, en java almacenan multiples valores del mismo tipo

        //declaracion y creacion de arrays en java
        int[] numbers=new int[3];//aqui solo declaro el array y sus posiciones
        String[] names={"pepe","juan","ingrid"};//aqui declaro y lo inicializo

        //acceder a los arrays
        System.out.println(names[0]);

        //2-no se puede cambiar el tamaño de un "Array" tradicional una vez creado. Los arreglos en Java son de tamaño fijo. La forma moderna: Usar ArrayList (Recomendado)
        // Si necesitas una lista a la que puedas agregar elementos dinámicamente, no uses un arreglo simple, usa un ArrayList. Es la forma estándar en Java.
        ArrayList<String> namesList= new ArrayList<String>(List.of("Ana", "Pedro", "Luis"));//forma clasica de crearlos
        var numbersList=new ArrayList<Integer>(List.of(10, 20, 30, 40));//forma moderna en java 21

        //agregar datos a las listas
        namesList.add("Ingrid");
        numbersList.add(70);

        System.out.println(namesList);
        System.out.println(numbersList);

        //ver tamaño de las listas
        System.out.println(namesList.size());
        System.out.println(numbersList.size());

        //acceder a los indices de la lista, se utilizan metodos
        System.out.println(namesList.get(1));
        System.out.println(numbersList.getFirst());

        //modificar un elemento de la lista
        namesList.set(1,"paco");
        System.out.println(namesList);

        //eliminar elemento, elimina tambien el indice
        namesList.remove(0);
        System.out.println(namesList.size());
        System.out.println(namesList);

        //buscar elementos
        System.out.println(namesList.contains("Ingrid"));

        //limpiar la lista
        namesList.clear();
        System.out.println(namesList);


        
        


    }

    public static Object asList(String[] lenguajes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
