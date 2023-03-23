package sv.edu.utec.p2_marlon_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] personas={"Marlon Castro","Alexander Pierrot","Carlos Lopez","Sara Bonz", "Liliana Clarence", "Benito Peralta", "Juan Jaramillo", "Christian Steps", "Alexa Giraldo", "Linda Murillo", "Lizeth Astrada"};
    String [] cargo={"Fundador","CEO ","Asistente ","Directora de Marketing", "Diseñadora de Producto", "Supervisor de Ventas", "CEO", "CTO", "Lead Programmer", "Directora de Marketing", "CEO"};
    String [] compañia={"Universidad Tecnologica","Insures S.O.","Hospital Blue","Electrical Parts Itd", "Creativa App", "Neumaticos Press", "Banco Nacional", "Cooperativa Verde", "Frutisofy", "Seguros Boliver", "Concesionario Motolox"};
    ListView lvstPersonas;
    Integer []ImgPers= {
            R.drawable.fototeams,
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Adaptador adaptador = new Adaptador(this,personas, cargo, compañia,ImgPers);
        lvstPersonas = findViewById(R.id.lstListaPersonas);
        lvstPersonas.setAdapter(adaptador);
    }
}