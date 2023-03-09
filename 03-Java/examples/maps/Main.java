import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
  public static void main(String args[]) {
    HashMap<String, Vertex> companyMap = new HashMap<String, Vertex>();

    companyMap.put("Oracle", new Vertex(12.124, 14.12));
    companyMap.put("Synchrony", new Vertex(16.12, 56.234));
    companyMap.put("CoderMana", new Vertex(46.12, 75.12));

    System.out.println(companyMap);

    Vertex oracleLocation = companyMap.get("Oracle");

    System.out.println("Oracle is located at: "+oracleLocation);

    for (Entry<String, Vertex> e : companyMap.entrySet()) { // For each
      System.out.printf("\t%s is located at %s\n", e.getKey(), e.getValue());
    }

    companyMap.put("CoderMana", new Vertex(13.0060841,79.9487266));

    System.out.println(companyMap);

    companyMap.remove("CoderMana");

    Vertex cmLocation = companyMap.get("CoderMana");

    System.out.println("CM is located at: "+cmLocation);

    System.out.println(companyMap);
  }
}
