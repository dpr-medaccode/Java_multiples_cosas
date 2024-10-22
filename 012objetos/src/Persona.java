public class Persona {

    private String nombre;

    private String fecha;

    public Persona(String n, String f) {

        this.nombre = n;

        this.fecha = f;

    }

    public String toString() {

        return this.nombre + " " + this.fecha;

    }

}

/*1 - Crear una clase Persona con los atributos teléfono, email y fechaNac.

Crear un constructor por defecto, por parámetros y los métodos getters, setters, toString, equals y hashmode.

Realiza un main para crear los objetos necesarios y mostrar sus atributos para comprobar su correcto funcionamiento

2 - Añade también el atributo DNI. Se validará que el usuario introduzca 8 dígitos y una letra:

Que sean 8 dígitos será validado mediante una expresión regular.

La letra será calculada con un método calcularLetra sin expresiones regulares.

Si los atributos no cumplen con la validación, se quedarán vacíos. En caso contrario con su valor validado correspondiente.

 */