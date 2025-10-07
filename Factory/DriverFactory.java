class DriverFactory {
  public static Driver getDriver(String dr){
    if (dr == null) {
      return null;
    }
    if (dr.equalsIgnoreCase("car")) {
      return new CarDriver();
    } else if (dr.equalsIgnoreCase("plane")) {
      return new PlaneDriver();
    }
    return null;
  }
}