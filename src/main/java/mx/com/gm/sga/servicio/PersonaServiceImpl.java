
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan","Perez","jperez@mail.com","444555666"));
        personas.add(new Persona(1, "Marta","Suarez","msuarez@mail.com","888555666"));
        
        return personas;
        
     }

    @Override
    public Persona encontrarPersonaPorID(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
     }
    
    
    
}
