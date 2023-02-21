package com.example.demo.formation_2_theorie.Enums;

public enum Civilite {
    M("Monsieur"), MME("Madame"), MLLE("Mademoiselle"), O("Autre");

    private final String label;

    Civilite(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
