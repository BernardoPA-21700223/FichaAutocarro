package pt.ulusofona.lp2.autocarro;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Autocarro> oioi = doisAutocarros();
        for(Autocarro a: oioi){
            a.imprimirPercurso();
            System.out.println(a);
            a.temLigacao(a);
        }

    }

    static Autocarro autocarroUrbano() {
        Autocarro autocarro1 = new Autocarro(30);
        autocarro1.adicionarParagem(new Paragem("Rossio"));
        autocarro1.adicionarParagem(new Paragem("Entrecampos"));
        autocarro1.adicionarParagem(new Paragem("Campo Grande"));
        return autocarro1;
    }

    static Autocarro autocarroSuburbano() {
        Autocarro autocarro1 = new Autocarro(27);
        ArrayList<Paragem> percurso = new ArrayList<>();
        percurso.add(new Paragem("Rossio"));
        percurso.add(new Paragem("Entrecampos"));
        percurso.add(new Paragem("Campo Grande"));
        percurso.add(new Paragem("Benfica"));

        autocarro1.setPercurso(percurso);
        return autocarro1;
    }

    static ArrayList<Autocarro> doisAutocarros() {
        ArrayList<Autocarro> autocarros = new ArrayList<>();
        autocarros.add(autocarroUrbano());
        autocarros.add(autocarroSuburbano());
        return autocarros;
    }

    static HashMap<Integer, Autocarro> autocarrosPorID() {
        HashMap<Integer, Autocarro> autocarros = new HashMap<>();
        autocarros.put(100,autocarroUrbano());
        autocarros.put(200,autocarroSuburbano());
        return autocarros;
    }

}
