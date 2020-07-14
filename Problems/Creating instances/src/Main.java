class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        java.math.BigInteger multyply = new java.math.BigInteger(number);
        return multyply; // create BigIntegere instance here
    }
}
