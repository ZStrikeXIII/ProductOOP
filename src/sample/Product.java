package sample;

public abstract class Product implements Item {

  int id;
  String type;
  String manufacturer;
  String name;

  public int getInt() {
    return this.id;
  }

  ;

  public void setName(String n) {
    this.name = n;
  }

  ;

  public String getName() {
    return this.name;
  }

  ;

  public void setManufacturer(String m) {
    this.manufacturer = m;
  }

  ;

  public String getManufacturer() {
    return this.manufacturer;
  }

  ;
}
