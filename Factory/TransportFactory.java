class TransportFactory {
    public int getTransport(String tr) {
        if (tr == null) return 0;
        if (tr.equals("car")) {
            return 600;
        } else if (tr.equals("plane")) {
            return 10000;
        } else {
            return 0;
        }
    }
}