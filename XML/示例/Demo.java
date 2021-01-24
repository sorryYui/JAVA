import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Demo
{
    public static void main(String args[]) throws ParserConfigurationException, IOException, SAXException {
        String path = Demo.class.getClassLoader().getResource("Test.xml").getPath();
        path = path.replaceAll("%20"," ");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = builder.parse(path);
        NodeList list = document.getElementsByTagName("name");
        int length = list.getLength();
        for (int i = 0;i < length;i++)
            System.out.println(list.item(i).getTextContent());
    }
}
