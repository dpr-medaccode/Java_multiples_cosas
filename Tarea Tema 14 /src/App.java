import java.util.TreeSet;
import java.io.File;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class App {
    public static void main(String[] args) throws Exception {
        
        TreeSet <Paciente> pacientes  = new TreeSet <Paciente> ();

        for (int i = 0; i < 5; i++) {

            pacientes.add(new Paciente(i,  (i % 2 == 0) ? 1 : 2, "Nombre " + i, "Apellido " + i, "Manzana " + i));
            
        }

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.newDocument();

        ////////////////////////////////////////////////////////
        
        Element root = doc.createElement("pacientes"); // <- elemeto raiz
        doc.appendChild(root);

        for (Paciente pacienteFor : pacientes) {

            Element paciente = doc.createElement("paciente");
            root.appendChild(paciente);

            Element habitacion = doc.createElement("habitacion");
            habitacion.appendChild(doc.createTextNode(Integer.toString(pacienteFor.getHabitacion())));
            paciente.appendChild(habitacion);

            Element cama = doc.createElement("cama");
            cama.appendChild(doc.createTextNode(Integer.toString(pacienteFor.getCama())));
            paciente.appendChild(cama);

            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode(pacienteFor.getNombre()));
            paciente.appendChild(nombre);

            Element apellido = doc.createElement("apellido");
            apellido.appendChild(doc.createTextNode(pacienteFor.getApellidos()));
            paciente.appendChild(apellido);

            Element dieta = doc.createElement("dieta");
            dieta.appendChild(doc.createTextNode(pacienteFor.getDieta()));
            paciente.appendChild(dieta);
            
        }

        ////////////////////////////////////////////////////////

        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer();

        DOMSource source = new DOMSource(doc);

        StreamResult result = new StreamResult(new File("ejercicio.xml"));

        transformer.transform(source, result);

        


        }


    }

