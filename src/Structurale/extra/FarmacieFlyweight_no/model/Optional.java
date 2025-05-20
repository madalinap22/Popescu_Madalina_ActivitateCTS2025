package Structurale.extra.FarmacieFlyweight_no.model;

public class Optional {
    private String mesajTemporar;

    public Optional(String mesajTemporar) {
        this.mesajTemporar = mesajTemporar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optional{");
        sb.append("mesajTemporar='").append(mesajTemporar).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
