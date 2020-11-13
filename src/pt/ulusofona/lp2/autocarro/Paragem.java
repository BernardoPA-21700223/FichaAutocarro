package pt.ulusofona.lp2.autocarro;

public class Paragem {
    String localizacao;



    Paragem (String localizacao){
        this.localizacao =localizacao;
    }


    String getLocalizacao(){
        return this.localizacao;
    }

    @Override
    public String toString() {
        return localizacao;
    }
}
