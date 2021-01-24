import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
public class Demo
{
    public static void main(String args[]) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        String path = Demo.class.getClassLoader().getResource("Test.xml").getPath();
        path = path.replaceAll("%20"," ");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = builder.parse(path);
        NodeList list = document.getElementsByTagName("name");
        Element value = document.createElement("value");
        Text text = document.createTextNode("56");
        value.appendChild(text);
        list.item(0).appendChild(value);
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.transform(new DOMSource(document), new StreamResult(path));
    }
}
