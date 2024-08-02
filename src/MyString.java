public class MyString {
    public static void main(String[] args) {


        //nombre de cadena es una clase y el valor el objeto.
        //FOrmas de crear una string:
        var string1 = "Hola";
        var string2 = "Hola";//string2 apunta al mismo sitio q string1, el Hola se guarda solo 1vez
        var string3 = new String("Hola");//crea otro Hola distinto en memoria

        //text blok o cadena de múltiples líneas:
        var string5 = """
                Línea uno
                línea dos
                línea tres
                """;
        //la cadena es inmutable por lo q si le das otro valor estás creando otra referencia de memoria, es decir otro objeto
        var string6 = "Hello";
        string6 = "Hi";

        //Comparar cadenas: == comparan si apuntan a lo mismo en memoria, equals compara valores
        System.out.println(string1 == string2); //true pq apuntan al mismo
        System.out.println(string1 == string3); //false pq no apuntan al mismo
        System.out.println(string1.equals(string3));//true pq es el mismo valor

        //Recuperar caracteres (char) con índices desde el 0
        System.out.println(string1.charAt(0));//devuelve un char

        //Métodos
        var string1Longitud = string1.length(); //longitud
        var string1Mayusculas = string1.toUpperCase();//tod mayúsculas
        var string1Minusculas = string1.toLowerCase();//tod minúsculas
        var string1Replace = string1.replace('o', 'a');//reemplaza los caracteres o por a, crea otro objeto q es el q enseña
       var string1ReplaceMore = string1.replace("Hola", "Adiós"); //reemplaza más de un char
        var string7 = "  hi  ";
        var strin7Trim = string7.trim();//quita spacios de antes y despues


        //subcadenas
        var string9 = "Hello World";
        var otrherString1 = string9.substring(5);//desde 5 hasta el final
        var otrhesString = string9.substring(0,4);//del 0 al 3(el nº anterior)
        System.out.println(otrhesString);
        System.out.println(otrherString1);

        //buscar subcadenas en la cadena
        var bigString = "Hello World";
        var StringIndexLookForFirst = bigString.indexOf("Hello");//te indica el índice de la 1ª(h), si hay hello varias veces indica la h del primero solo
        var StringIndexLookForLast = bigString.lastIndexOf("Hello"); //la o del último Hello q haya
        //si no hay coincidencia responde -1


        //Unir cadenas
        //la cadena es inmutable por lo q si quieres unir dos hay q crear una nueva cadena
        var string4 = string1 + " " + string2;
        var myStringConcat = string1.concat(" ").concat(string4);
        //Builder:más eficaz, menos memoria
        var myStringBouilder = new StringBuilder();
        myStringBouilder.append(string1);
        myStringBouilder.append(" ");
        myStringBouilder.append(string9);
        var resultMyStringBuilder = myStringBouilder.toString();
        //StringBuffer:algo de varios hilos
        var stringBuffer =new StringBuffer();
        stringBuffer.append(string1).append(" ").append(string9);
        var resultBuffer = stringBuffer.toString();
        //join: 1- el separador, en este caso un espacio y después lo q unes
        var stringJoin = String.join(" ", string9, string2,stringBuffer);

        //caracteres especiales
        // \n salto de línea "hello\nworld"
        // \t espacio
        // \' comilla simple
        // \" comilla doble
        // \\ diagonal invertida



        //Ejercicio de prácticas
        var startedString = "*** Generador de email***";
        var userName = "Silvia García Bouza";
        var companyName = "Osos";
        var domainExtension = ".com";

        System.out.println(startedString);
        var userNameSpaces = " " + userName + " ";
        System.out.println("Nombre usuario: " + userNameSpaces);
        var userNameMin = userName.toLowerCase();
        var userNameMinDot = userNameMin.replace(" ", ".");
        var userNameMinDOtFinal = userNameMinDot.substring(0,19);
        System.out.println("Nombre usuario normalizado:"+" "+ userNameMinDOtFinal);
        var companyNameSpaces = new StringBuilder();
        companyNameSpaces.append(" ").append(companyName).append(" ");
        var companyNameSpacesFinal = companyNameSpaces.toString();
        System.out.println();
        System.out.println("Company name: " + companyNameSpacesFinal);
        var emailGenerator = new StringBuffer();
        emailGenerator.append(userNameMinDOtFinal).append("@").append(companyName.trim()).append(".com");
        var emailGeneratorFinal = emailGenerator.toString();
        var emailGeneratorFinalMin = emailGeneratorFinal.toLowerCase();
        System.out.println();
        System.out.println(emailGeneratorFinalMin);



    }
}
