package it_diegoperego.listviewpassaggio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by utente3.academy on 21-Nov-17.
 */

public class Azienda {
    private List<Dipendente> dipendenti;

    public Azienda(List<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    public Dipendente removeIndex(int x){
        return dipendenti.remove(x);
    }

    public void addDipendente(Dipendente dip){
        dipendenti.add(dip);
    }



    public Azienda() {
        this.dipendenti = new ArrayList<>();
    }

    public List<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(List<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    public void init(){

        dipendenti.add(new Dipendente(131,"Roberto", "Neri"));
        dipendenti.add(new Dipendente(146,"Alberto", "Neri"));
        dipendenti.add(new Dipendente(186,"Ernesto", "Neri"));
        dipendenti.add(new Dipendente(123,"Filippo", "Neri"));
        dipendenti.add(new Dipendente(180,"Giacomo", "Neri"));
        dipendenti.add(new Dipendente(147,"Antonio", "Neri"));
        dipendenti.add(new Dipendente(136,"Michele", "Neri"));
        dipendenti.add(new Dipendente(192,"Federico", "Neri"));
        dipendenti.add(new Dipendente(167,"Mirko", "Neri"));

    }
}
