package bredex.brokenapp.model;


public enum StockId {
    COKE("COKE"),
    PEP("PEP"),
    TSLA("TSLA"),
    AMZN("AMZN"),
    MOL_BD("MOL.BD"),
    OTP_BD("OTP.BD"),
    MTEL_BD("MTEL.BD"),
    OPUS_BD("OPUS.BD"),
    FOURIG("4IG.BD");

    private final String name;

    StockId(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
