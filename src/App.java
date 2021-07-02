
class Programa {
    public static void main(String[] args) {
        String nombre = "Laura";
        saludo(nombre);
    }

    public static void saludo(String nombre){ //se puede hacer funciones con el mismo nombre en la misma clase, pero deben recibir diferentes parametros
        //como la salida va a ser un string se le quitan los corchetes, los corchetes son para un arreglo de strings
        System.out.print("Hola " + nombre + "!");
    }
}
