package pt.ulusofona.lp2.autocarro;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class TestAutocarro {

    @Test
    public void setPercurso() {
    }

    @Test
    public void adicionarParagem() {
    }

    @Test
    public void imprimirPercurso() {
    }

    @Test
    public void entrar() {
        Autocarro a= new Autocarro(1);
        Pessoa p = new Pessoa("Maria");
        p.setBilhete(new Bilhete(1));
        Pessoa p2 = new Pessoa("Maria");
        p2.setBilhete(new Bilhete(1));
        boolean obtido =a.entrar(p);
obtido=a.entrar(p2);
        boolean esperado= true;
        assertEquals(obtido,esperado);


    }

    @Test
    public void getPercurso() {
    }

    @Test
    public void passaNaParagem() {
    }

    @Test
    public void mesmoPercurso() {
    }

    @Test
    public void temLigacao() {
    }

    @Test
    public void temParagensComuns() {
        Autocarro a = new Autocarro(20);
        Autocarro b = new Autocarro(20);
        ArrayList<Paragem> paragems = new ArrayList<>();
        paragems.add(new Paragem("Sintra"));
        paragems.add(new Paragem("Cascais"));
        a.setPercurso(paragems);
        ArrayList<Paragem> paragemsA = new ArrayList<>();
        paragemsA.add(new Paragem("Sintra"));
        paragemsA.add(new Paragem("Cascais"));
        b.setPercurso(paragemsA);

        boolean obtido= a.temParagensComuns(b);
        boolean esperado = true;

        assertEquals(esperado,obtido);

    }



    @Test
    public void paragensComuns() {
        Autocarro a= Main.autocarroSuburbano();
        Autocarro b = Main.autocarroUrbano();
        HashSet<Paragem> obtido= a.paragensComuns(b);
        HashSet<Paragem> esperado = new HashSet<>();
        esperado.add(new Paragem("Rossio"));
        esperado.add(new Paragem("Entrecampos"));
        esperado.add(new Paragem("Campo Grnade"));
assertEquals(esperado,obtido);

    }

    @Test
    public void testToString() {
    }
}