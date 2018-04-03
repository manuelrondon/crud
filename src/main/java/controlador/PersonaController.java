package controlador;

import data.PersonaDATA;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Persona;


@ManagedBean
@ViewScoped
public class PersonaController
{

    private List<Persona> personas;
    private Persona persona;
    public PersonaController()
    {
    }

    public List<Persona> getPersonas()
    {
        PersonaDATA data = new PersonaDATA();
        personas = data.read("from Persona");
        return personas;
    }

    public void setPersonas(List<Persona> personas)
    {
        this.personas = personas;
    }

    public Persona getPersona()
    {
        return persona;
    }

    public void setPersona(Persona persona)
    {
        this.persona = persona;
    }
    
    
    
}
