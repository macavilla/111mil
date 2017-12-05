/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import modelo.Alumno;
import modelo.Libro;

public class AplicacionHibernate {

    public static void main(String[] args) {
        //Genero una instancia/objeto que me permite manejar la persistencia con Hibernate        
        HibernateManager hibernateManager = new HibernateManager();
        
        //Genero conexion a la BASE
        hibernateManager.conectar();

        //Le pongo libro a Alumnos que ya existen                
        Libro unLibro = (Libro) hibernateManager.consultar(Libro.class, 1);
 
        Alumno unAlumno = (Alumno) hibernateManager.consultar(Alumno.class, 2);
        unAlumno.getLibros().add(unLibro);
        hibernateManager.guardar(unAlumno);

        Alumno otroAlumno = (Alumno) hibernateManager.consultar(Alumno.class, 4);      
        otroAlumno.getLibros().add(unLibro);
        hibernateManager.guardar(otroAlumno);
        
        //Desconexion de la BASE
        hibernateManager.desconectar();
    }
}
