public enum ItemType {
  AU("Audio", "AU"),
  VI("Visual","VI"),
  AM("AudioMobile", "AM"),
  VM("VisualMobile", "VM");

  private final String type;
  private final String code;

  ItemType(String type, String code){
    this.type = type;
    this.code = code;
  }
}
