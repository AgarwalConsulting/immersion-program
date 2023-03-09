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
