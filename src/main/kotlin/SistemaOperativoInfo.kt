
import java.io.File
import java.nio.file.Paths

var ubicacionEjecucionPrograma = "nada"
var ubicacionEjecucionJarMasConfiguracion = "nada"

/**
 * Me da la carpeta desde la que ese ejecuta el programa
 * haciendolo con 2 metodos diferentes
 */
fun lugarDesdeDondeEjecutaPrograma() {

    // prueba de que me diga el compilador en que metodo estoy en el codigo ejecutandose
    if (debug) {
        val name = object {}.javaClass.enclosingMethod.name
        System.out.println("*")
        System.out.println("**********************************************************************************")
        System.out.println("***** INICIO  $name")
        System.out.println("**********************************************************************************")
        System.out.println("*")
    }

    // 1er metodo
    val path = Paths.get("").toAbsolutePath().toString()
    if (debug) {
        println("* 1er metodo de hacerlo con path")
        println("* Ubicacion desde donde se ejecuta programa : $path")
        println("* ")

        ubicacionEjecucionPrograma = path
        println("* 1er metodo de hacerlo con path")
        println("* Ubicacion desde donde se ejecuta programa : $ubicacionEjecucionPrograma")
        println("* ")
    }

    // 2nd metodo
    val carpetaDesdeDondeSeEjecuta = File("./playlisto_basedatos").canonicalPath
    if (debug) {
        println("* 2nd metodo con canonicalPath + carpetaConfiguracion")
        println("* Ubicacion donde se mando a ejecutar el jar + carpeta mia de configuracion : $carpetaDesdeDondeSeEjecuta")
        println("* ")
    }

    ubicacionEjecucionJarMasConfiguracion = File("./playlisto_basedatos").canonicalPath
    if (debug) {
        println("* 2nd metodo con canonicalPath + carpetaConfiguracion")
        println("* Ubicacion donde se mando a ejecutar el jar + carpeta mia de configuracion : $ubicacionEjecucionJarMasConfiguracion")
        println("* ")
    }

    if (debug) {
        val name2 = object {}.javaClass.enclosingMethod.name
        System.out.println("*")
        System.out.println("**********************************************************************************")
        System.out.println("***** FINAL  $name2")
        System.out.println("**********************************************************************************")
        System.out.println("*")
    }

}


// quizas esta es la forma de obtener carpeta del appdata de windows 10
// Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData)
