package pt.ulusofona.lp2.autocarro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Autocarro {
    int capacidade;
    List passageiros;
    List<Paragem> percurso;

    Autocarro(int capacidade) {
        this.capacidade = capacidade;
    }

    void setPercurso(List<Paragem> paragens) {
        this.percurso = new ArrayList<>();
        this.percurso = paragens;
    }

    void adicionarParagem(Paragem paragem) {
        if (percurso == null) {
            percurso = new ArrayList<>();
        }
        percurso.add(paragem);
    }

    String imprimirPercurso() {
        String texto = "";
        if (percurso == null || percurso.isEmpty()) {
            return texto;
        } else {
            for (Paragem p : percurso) {
                texto += p.getLocalizacao() + " » ";
            }
        }
        if ((texto != "") && (texto.length() > 0)) {
            texto = texto.substring(0, texto.length() - 3);
        }

        return texto;
    }

    boolean entrar(Pessoa pessoa) {
        if (passageiros == null) {
            passageiros = new ArrayList();
        }
        if (passageiros.size() < capacidade && pessoa.temBilhete()) {
            passageiros.add(pessoa);
            return true;
        }
        return false;
    }

    ArrayList<Paragem> getPercurso() {
        return new ArrayList<>(percurso);
    }

    boolean passaNaParagem(String localizacao) {
        if (percurso != null) {
            for (Paragem p : percurso) {
                if (p.getLocalizacao().equals(localizacao)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean mesmoPercurso(Autocarro outro) {
        if (this.percurso.size() == outro.percurso.size()) {
            if (this.imprimirPercurso().equals(outro.imprimirPercurso())) {
                return true;
            }
        }
        return false;
    }

    boolean temLigacao(Autocarro outro) {
        String ultimaParagemThis = percurso.get(percurso.size()-1).getLocalizacao();
        String primeiraParagemOutro = outro.getPercurso().get(0).getLocalizacao();
        if (ultimaParagemThis.equals(primeiraParagemOutro)) {
            return true;
        }
        return false;
    }

    boolean temParagensComuns(Autocarro outro) {
        for (Paragem pThis : percurso) {
            for (Paragem pOutro : outro.getPercurso()) {
                if (pOutro.getLocalizacao().equals(pThis.getLocalizacao())) {
                        return true;
                }
            }
        }
        return false;
    }

    HashSet<Paragem> paragensComuns(Autocarro outro) {
        HashSet<Paragem> paragens = new HashSet<Paragem>();
        for (Paragem pThis : percurso) {
            for (Paragem pOutro : outro.percurso) {
                if (pOutro.getLocalizacao().equals(pThis.getLocalizacao())) {
                    paragens.add(pOutro);
                }
            }
        }
        return paragens;

    }

    @Override
    public String toString() {

        String texto = this.capacidade + " | ";
        if (passageiros == null || passageiros.isEmpty()) {
            texto += "vazio | ";
        } else {
            texto += passageiros.size() + " | ";
        }
        String percurssoStr = imprimirPercurso();
        if (percurssoStr.equals("")) {
            texto += "s/ percurso";
        } else {
            texto += percurssoStr;
        }
        return texto;
    }


}
