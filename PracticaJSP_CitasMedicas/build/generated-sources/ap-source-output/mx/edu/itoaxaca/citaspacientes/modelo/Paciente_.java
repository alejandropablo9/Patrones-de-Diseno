package mx.edu.itoaxaca.citaspacientes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.itoaxaca.citaspacientes.modelo.Citas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-30T19:03:30")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Date> fechanac;
    public static volatile SingularAttribute<Paciente, Integer> estatura;
    public static volatile CollectionAttribute<Paciente, Citas> citasCollection;
    public static volatile SingularAttribute<Paciente, Character> sexo;
    public static volatile SingularAttribute<Paciente, Integer> idpaciente;
    public static volatile SingularAttribute<Paciente, String> nombre;

}