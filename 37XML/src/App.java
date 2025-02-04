
import java.io.File;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class App {
    public static void main(String[] args) throws Exception {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.newDocument();

        ////////////////////////////////////////////////////////

        // creacion de elementos

        Element root = doc.createElement("personas"); // <- elemeto raiz
        doc.appendChild(root);

        for (int i = 0; i < 4; i++) {

            Element persona1 = doc.createElement("persona");
        root.appendChild(persona1);

        Element nombre1 = doc.createElement("nombre");
        nombre1.appendChild(doc.createTextNode("Juan"));
        persona1.appendChild(nombre1);

        Element edad1 = doc.createElement("edad");
        edad1.appendChild(doc.createTextNode(String.valueOf(30 + i)));
        persona1.appendChild(edad1);

        }

        ////////////////////////////////////////////////////////
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer();

        DOMSource source = new DOMSource(doc);

        StreamResult result = new StreamResult(new File("ejercicio.xml"));

        transformer.transform(source, result);

        ////////////////////////////////////////////////////////
        
        File xmlFile = new File("ejercicio.xml");

        NodeList nodeList = doc.getElementsByTagName("persona");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);


            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element personaElement = (Element) node;

                String nombre = personaElement.getElementsByTagName("nombre").item(0).getTextContent();
                String edad = personaElement.getElementsByTagName("edad").item(0).getTextContent();

                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        }
    }

    }

