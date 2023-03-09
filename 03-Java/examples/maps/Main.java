import java.util.HashMap;
import java.util.Map.Entry;

class Vertex {
  private Double lat;
  private Double lng;

  Vertex(){}

  Vertex(double lat, double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Double getLng() {
    return lng;
  }

  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    if (!super.equals(object)) return false;
    Vertex vertex = (Vertex) object;
    return lat.equals(vertex.lat) && lng.equals(vertex.lng);
  }

  public int hashCode() {
    return java.util.Objects.hash(super.hashCode(), lat, lng);
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Vertex{" +
            "lat=" + lat +
            ", lng=" + lng +
            '}';
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }
}

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
