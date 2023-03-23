package sv.edu.utec.p2_marlon_castro;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends ArrayAdapter<String>{
Activity contexto;
String []person;
String []cargo;
String []companias;
Integer []ImgPerson;
ImageView imgCara;
TextView tvNombre;

TextView tvCargoPerson;
TextView tvCompaniaPerson;

public Adaptador(Activity contexto,String []person,String []cargo, String []companias, Integer []ImgPerson){
    super(contexto, R.layout.personas,person);
    this.contexto=contexto;
    this.person=person;
    this.cargo=cargo;
    this.companias=companias;
    this.ImgPerson=ImgPerson;

}
public View getView(int posicion, View v, ViewGroup parent){
    LayoutInflater inflater = contexto.getLayoutInflater();
    View rowView=inflater.inflate(R.layout.personas, null, true);
    tvNombre=rowView.findViewById(R.id.tvNombrePerson);
    tvCargoPerson=rowView.findViewById(R.id.tvCargo);
    imgCara=rowView.findViewById(R.id.imgDeCara);
    tvCompaniaPerson=rowView.findViewById(R.id.tvCompania);

    tvNombre.setText(person[posicion]);
    tvCargoPerson.setText(cargo[posicion]);
    imgCara.setImageResource(ImgPerson[posicion]);
    tvCompaniaPerson.setText(companias[posicion]);
    return rowView;
}
}
