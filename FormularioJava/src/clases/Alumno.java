
package clases;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cruz Medinilla Martín
 */
public class Alumno {
    
    String nombre;
    String paterno;
    String materno;
    String correo;
    //constructor que llena los datos del alumno
    public Alumno( String nombre, String paterno, String materno, String correo){ 
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.correo = correo;
    }
    //método para grabar los datos del alumno en un archivo txt.
    public void guardarAlumno(Alumno nuevoAlumno)  throws IOException {
      
      String datosAlumno = "";
      
      datosAlumno = nuevoAlumno.nombre + " " + nuevoAlumno.paterno + " " + nuevoAlumno.materno + " " + nuevoAlumno.correo + "\n";
      BufferedWriter writer = new BufferedWriter(new FileWriter("Alumnos.txt"));
      writer.write(datosAlumno);
      writer.close();
      JOptionPane.showMessageDialog(null, "Registro exitoso");
    }
    //método que retorna el contendio del archivo
    public String leerArchivoAlumnos(String nombreArchivo) throws FileNotFoundException, IOException {

        String line = null;
        String alumnos = "";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                alumnos +=line;
            }   

            bufferedReader.close();         
        }
        catch(Exception ex) {
            System.out.println(ex);                
        }
       
        return alumnos;
    }
}
