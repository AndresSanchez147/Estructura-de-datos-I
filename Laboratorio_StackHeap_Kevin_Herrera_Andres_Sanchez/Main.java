public class Main {
    public static void main(String[] args) {
        // VARIABLES PRIMITIVAS
        double notaMinima = 3.0;
        int semestre = 3;
        boolean activo = true;

        // CREACIÓN DE OBJETOS
        Estudiante estudiante1 = new Estudiante("Laura", 20, 4.2);
        Estudiante estudiante2 = new Estudiante("Carlos", 22, 3.8);

        // DOS REFERENCIAS AL MISMO OBJETO
        Estudiante copia = estudiante1;
        copia.setPromedio(4.8);
        System.out.println("Promedio estudiante1: " + estudiante1.getPromedio());
        System.out.println("Promedio copia: " + copia.getPromedio());

        // LLAMADA A MÉTODO
        procesarEstudiante(estudiante2);

        // REFERENCIAS NULL
        estudiante1 = null;
        copia = null;

        // Solicitud a la JVM para considerar GC
        System.gc();
        System.out.println("Programa finalizado.");
    }

    public static void procesarEstudiante(Estudiante estudiante) {
        int puntosExtra = 1;
        double nuevoPromedio = estudiante.getPromedio() + 0.2;
        estudiante.setPromedio(nuevoPromedio);
        estudiante.mostrarDatos();
        System.out.println("Puntos extra: " + puntosExtra);
    }
}
