public class Strings {

    public static void main(String[] args) {

        var name="Julian";

        //concatenar
        System.out.println("Hola" + " " + name);
        
        //longitud
        System.out.println(name.length());

        //obtener caracter, aqui obtiene el ultimo
        System.out.println(name.charAt(name.length() -1));

        //substring, es tomar un trozo del string
        System.out.println(name.substring(2));

        //mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //comprobar si contiene algo especifico
        System.out.println("Hola, Java".contains("Java"));

        //comparacion entre cadenas
        System.out.println(name.equals("Julian"));
        System.out.println(name.equalsIgnoreCase("julian"));//aqui ignora mayusculas o minusculas

        // == vs equals()
        var a="julian";
        var b="julian";
        // var c=new Strings("julian");

        System.out.println(a==b);//aqui da true porque java compara que son dos objetos iguales del sistema
        // System.out.println(a==c);//aqui da false porque java dice que son objetos diferentes,uno creado con String

        //aqui da true porque equals compara el valor y ve que son iguales, la buena practica es usar equals
        // System.out.println(a.equals(c));

        //trim(), elimina espacios al principio y al final
        System.out.println("  Hola Julian, como estas?   ".trim());

        //replace(), reemplaza caracteres,por ejemplo quiero reemplazar el nombre
        System.out.println("  Hola Julian, como estas?   ".replace("Julian", "Pepe"));

        //format, se pasa $s para cadenas, %d para enteros y %f para decimales
        var age=34;
        System.out.println(String.format("Hola %s, tienes %d años",name,age, args));

        //ejercicios
        // 1. Concatena dos cadenas de texto.
        var string1="Hola amigos";
        var string2="Estamos estudiando java";
        System.out.println(string1 + " " + string2);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(string1.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(string1.charAt(0));
        System.out.println(string1.charAt(string1.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(string1.toUpperCase());
        System.out.println(string2.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(string1.contains("amigos"));

        // 6. Formatea un string con un entero.
        var precio=200;
        System.out.println(String.format("El precio del pc es de $%d pesos",precio));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        var string3="   el perro se llama toby    ";
        System.out.println(string3.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("  Hola Julian, como estas?   ".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(string1.equals((string2)));

        // 10. Comprueba si dos strings tienen la misma longitud
        String str1 = "Hola";
        String str2 = "Chao";

        if (str1.length() == str2.length()) {
            System.out.println("Tienen la misma longitud");
        } else {
            System.out.println("Tienen longitudes diferentes");
        }





    }
}