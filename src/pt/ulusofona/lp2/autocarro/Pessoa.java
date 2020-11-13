package pt.ulusofona.lp2.autocarro;

public class Pessoa {
    String nome;
    Bilhete bilhete;

    Pessoa(String nome) {
        this.nome=nome;
    }

    void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }

    boolean temBilhete(){
        return (this.bilhete!=null);
    }

    @Override
    public String toString() {
        String texto = this.nome + " - ";
        if (bilhete == null) {
            texto += "s/ bilhete";
        } else {
            texto += bilhete.getNumero();
        }
        return texto;
    }
}
