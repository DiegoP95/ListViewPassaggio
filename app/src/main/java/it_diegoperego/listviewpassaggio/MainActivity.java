package it_diegoperego.listviewpassaggio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listOriginal;
    private ListView listClone;
    private Button bSwitch;
    //private String[] element2;
    //private String[] elements = {"Antonio", "Giuseppe", "Michele", "Francesco", "Roberto", "Ernesto"};
    private int index = 0;
    //private ArrayAdapter<String> arrayAdapter;
    //private ArrayAdapter<String> adapter;
    private Azienda azienda;
    private Azienda azienda2;
    private CustomAdapter customAdapter;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        azienda = new Azienda();
        azienda.init();
        azienda2 = new Azienda();
        bSwitch = findViewById(R.id.bSwitch);
        listOriginal = (ListView) findViewById(R.id.list1);
        listClone = (ListView) findViewById(R.id.list2);

        customAdapter = new CustomAdapter(this,R.layout.dipendente,azienda.getDipendenti());
        adapter = new CustomAdapter(this, R.layout.dipendente,azienda2.getDipendenti());

        listOriginal.setAdapter(customAdapter);
        //customAdapter.notifyDataSetChanged();

        bSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!azienda.getDipendenti().isEmpty()){
                    Dipendente temp = azienda.removeIndex(index);
                    azienda2.addDipendente(temp);
                    listClone.setAdapter(adapter);
                    customAdapter.notifyDataSetChanged();
                    adapter.notifyDataSetChanged();
                }
            }
        });

        /*bSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s = "";
                s = elements[0];
                if(!elements[0].equals("")) {
                    remove();
                    element2[index] = s;
                    index++;
                    arrayAdapter.notifyDataSetChanged();
                    adapter.notifyDataSetChanged();
                }
            }
        });
        */

                /*int max = elements.length;
        element2 = new String[max];
        for(int i = 0; i < max; i++){
            element2[i] = "";
        }*/
                /*listOriginal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = listOriginal.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),""+str,Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    /*public void remove(){
        for(int i = 0; i<elements.length; i++){
            if(i<elements.length-index-1){
                int j = i+1;
                elements[i]= elements[j];
            }else{
                elements[i]= "";
            }
        }
    }*/
}
