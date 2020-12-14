
import java.io.File

/**
 * me crea las carpetas con la ruta dada en ese File
 * pero sobre _todo y mas importante aun,
 * me chequea si estaban ya creadas y me lo dice !!
 *
 */
fun crear_Carpetas(carpetasACrearDelFile: File) {

    if (carpetasACrearDelFile.isDirectory) {
        if (debug) {
            // ya existen las carpetas entonces
            println("* Las carpetas ya existen!!")
        } // if del debug
    } else {
        /*
         * teoria de crear directrios: folder.mkdir();
         * // esto crea la carpeta java, y requiere que exista la ruta folder.mkdirs();
         * // esto crea la carpeta java, independientemente que exista el path completo, si no existe crea toda la ruta necesaria
         */
        // las carpetas no existen, osea las creo ahora
        carpetasACrearDelFile.mkdirs()
        if (debug) {
            println("Carpetas creadas ahora mismo")
        } // fin del if debug
    } // fin del if (carpetasACrearDelFile.isDirectory()) {
}

/**
 * Recorto n caracteres finales de un String que le doy
 * Lo uso para la ruta cuando la obtengo quitarle el \. finales
 * C:\Users\josecarlos\workspace\Playlisto_0.09.0001\.
 * C:\Users\josecarlos\workspace\Playlisto_0.09.0001
 * @param stringAnalizado
 * @param numeroCaractesFinalesQueQuito
 * @return
 */
fun quitarNCaracteresFinalesString(
    stringAnalizado: String,
    numeroCaractesFinalesQueQuito: Int
): String? {
    var stringAnalizado = stringAnalizado
    if (debug) {
        // Total de elementos a eliminar
        println("* Numero caracteres finales a quitar: $numeroCaractesFinalesQueQuito")
    }

    /* Total de elementos a Mostrar */
    val m = Math.max(0, stringAnalizado.length - numeroCaractesFinalesQueQuito)

    // Haciendo uso del método Substring(int inicio, int final) , similar a SubSequence(int inicio, int final)
    // RECORDAR : El tipo de dato String no puede ser modificado después de ser creado.(Inmutable)
    // System.out.println(stringAnalizado.substring(0, stringAnalizado.length()-numeroCaractesFinalesQueQuito));
    // System.out.println(stringAnalizado.subSequence(0, m).toString());
    stringAnalizado = stringAnalizado.substring(0, stringAnalizado.length - numeroCaractesFinalesQueQuito)
    if (debug) {
        println("* Asi queda recortado: $stringAnalizado")
    }
    return stringAnalizado
}