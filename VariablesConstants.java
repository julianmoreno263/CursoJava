public class VariablesConstants {
    public static void main(String[] args) {
        //variables,en nuevas versiones de java se usa var y java ya sabra de que tipo es,esto se llama inferencia de tipos
        var name="pepe";
        System.out.println(name);

        int age=36;
        System.out.println(age);

        //constantes
        final String EMAIL="jota@email.com";
        System.out.println(EMAIL);


        //ejercicios operadores

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a=3;
        var b=5;

        var suma=a+b;
        var resta=a-b;
        var multipli=a*b;
        var div=a/b;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multipli);
        System.out.println(div);


        // 2. Crea una variable para cada tipo de operación de asignación.
        var num1=4;
        num1+=2;
        num1-=1;
        System.out.println(num1);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a<b);
        System.out.println(b<10);
        System.out.println(num1>2);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(num1==a);
        System.out.println(b>=20);
        System.out.println(a!=3);

        // 5. Utiliza el operador lógico and.
        System.out.println(a<b & b==num1);

        // 6. Utiliza el operador lógico or.
        System.out.println(a>b || b==num1);

        // 7. Combina ambos operadores lógicos.
        System.out.println((a<b & b==num1)|| b==num1);

        // 8. Añade alguna negación.
        System.out.println((a<b & b==num1)|| b!=num1);
        
    }
}
