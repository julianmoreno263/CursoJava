import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class Maps {
    public static void main(String[] args) {
        
        //son como los diccionarios,almacena clave y valor,con la clave accedemos al valor del elemento,al declararlos debo especificar el tipo de dato de la clave y del valor, pueden ser de diferente tipo. Tambien son elementos desordenados,se accede a ellos por medio de su clave

        var names=new HashMap<String,String>();
        names.size();

        //aqui queremos asociar numeros de telefono con el nombre del usuario
        var telefonos=new HashMap<String,Integer>();

        //Tamaño
        System.out.println(telefonos.size());

        //Agregar elementos
        telefonos.put("Ingrid", 2456776);
        telefonos.put("Pepe", 5675647);
        telefonos.put("Juan", 7896754);
        telefonos.put("Perez", 9672314);

        System.out.println(telefonos);

        //Acceder a los elementos por su clave
        System.out.println(telefonos.get("Ingrid"));

        //se puede utilizar por ejemplo en una aplicacion donde el usuario pone su nombre de usuario(clave) y automaticamente se pone su email en un formulario(valor)

        //Verificar si un elemento existe en el map por medio de su clave o su valor, da true o false
        System.out.println(telefonos.containsKey("Ingrid"));
        System.out.println(telefonos.containsValue(8906654));

        //eliminar por clave
        telefonos.remove("Perez");
        System.out.println(telefonos);

        //limpiar map
        telefonos.clear();
        System.out.println(telefonos);

        //modificar un elemento del map, si el elemento ya existe pues actualiza su valor,si el elemento no existe lo crea y lo almacena en el map
        telefonos.put("Juan", 9801209);
        System.out.println(telefonos.get("Juan"));

        telefonos.put("Ingrid", 8763254);
        System.out.println(telefonos);

        //con replace reemplaza el valor solo si existe la clave,aqui es si estamos seguros que ese elemento existe
        telefonos.replace("Ingrid", 7768899);
        System.out.println(telefonos);

        //comprobar si esta vacio
        System.out.println(telefonos.isEmpty());

        //recorrer un map, la mas comun es con forEach() pero hay muchas mas
        telefonos.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + " | Valor: " + valor);
        });


        //ejercicios
        
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] persons={"pepe","juan","ingrid"};
        System.out.println(persons.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(persons[0]);
        persons[0]="Angie";
        System.out.println(persons[0]);

        // 3. Crea un ArrayList vacío.
        var numberList=new ArrayList<Integer>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        numberList.add(12);
        numberList.add(34);
        numberList.add(89);
        numberList.add(121);
        numberList.remove(1);
        System.out.println(numberList);

        // 5. Crea un HashSet con 2 valores diferentes.
        var animals=new HashSet<>();
        animals.add("perro");
        animals.add("gato");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        animals.add("gato");
        animals.add("conejo");
        System.out.println(animals);

        // 7. Elimina uno de los elementos del HashSet.
        animals.remove("gato");
        System.out.println(animals);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var contactos=new HashMap<String,Integer>();
        contactos.put("Ingrid", 2456776);
        contactos.put("Pepe", 5675647);
        contactos.put("Juan", 7896754);
        System.out.println(contactos);

        // 9. Modifica uno de los contactos y elimina otro.
        contactos.put("Pepe", 6090909);
        contactos.remove("Juan");
        System.out.println(contactos);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] lenguajes = {"Java", "Python", "C++"};
        var lista = new ArrayList<>(List.of(lenguajes));
        System.out.println(lista);

        var miSet=new HashSet<>(lista);
        System.out.println(miSet);


        //llamando al metodo convertirSetAMap()
        System.out.println(convertirSetAMap(miSet));

    }

    //los metodos en java deben estar dentro de una clase pero se crean fuera del metodo main(), no se pueden crear metodos dentro de otro metodo, para llamarlos si se llaman en el main(), pues el main() es donde se ejecuta el programa java.

    //metodo para pasar el set a map usando .forEach con una expresión lambda(s->)
    public static Map<String, String> convertirSetAMap(HashSet<String> miSet) {
        Map<String, String> mapa = new HashMap<>();
            
        // Usando el método forEach del Set
        miSet.forEach(s -> mapa.put(s, "El valor es " + s));
            
        return mapa;
    }

   

       
        

}
