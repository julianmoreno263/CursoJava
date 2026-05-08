import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
         
        //3- sets en java: son estructuras que solo guardan datos unicos,osea no guardan repetidos
        HashSet<String> names=new HashSet<>();
        var number=new HashSet<>();

        //tamaño
        System.out.println(names.size());

        //agregar elementos
        names.add("Pepe");
        names.add("Juan");
        names.add("Ingrid");

        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println(names.size());

        //el set no es ordenado,osea guarda los elementos perobasandose en un hash,no es como el array que los guarda de forma ordenada, por esto el set es mas rapido que una lista. No se puede modificar un dato del set porque no se sabe en donde estara.

        //contains, saca true o false
        System.out.println(names.contains("Ingrid"));

        //eliminar elementos
        names.remove("Pepe");
        System.out.println(names);

        //el set no acepta elementos repetidos porque el asocia un hash a un elemento,si ve que ese hash ya existe pues no agrega el mismo elemento 2 veces. Se pueden unir dos sets pero deben de ser del mismo tipo.
        var countries=new HashSet<String>();
        countries.add("España");
        countries.add("Mexico");
        countries.add("Argentina");

        names.addAll(countries);

        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        //retainAll deja solo los elementos comunes en los dos sets, como ya habiamos eliminado los paises pues no hay elementos comunes y saca el set vacio
        names.retainAll(countries);
        System.out.println(names);



    }
}
