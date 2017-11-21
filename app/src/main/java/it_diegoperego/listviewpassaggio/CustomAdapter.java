package it_diegoperego.listviewpassaggio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by utente3.academy on 21-Nov-17.
 */

public class CustomAdapter extends ArrayAdapter<Dipendente>{

    private int resource;
    private LayoutInflater inflater;
    private List<Dipendente> dipendenti;

    public CustomAdapter(Context context, int resourceId, List<Dipendente> objects) {
        super(context, resourceId, objects);
        this.resource = resourceId;
        this.dipendenti = objects;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {

        if(v==null){
            Log.d("Debug","Inflating view");
            v = inflater.inflate(R.layout.dipendente, null);
        }

        Dipendente dipendente= getItem(position);

        Log.d("Debug", "dipendente d "+ dipendente);

        TextView nome;
        TextView cognome;
        TextView matricola;

        nome = v.findViewById(R.id.textNome);
        cognome = v.findViewById(R.id.textCognome);
        matricola = v.findViewById(R.id.textMatricola);

        nome.setText(dipendente.getNome());
        cognome.setText(dipendente.getCognome());
        matricola.setText(""+dipendente.getMatricola());

        return v;
    }

}
