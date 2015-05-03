package oscar.alfaro.galera.cat.controladorpacman;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ActivityMain extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_main);
        Button btnConnectar = (Button) this.findViewById(R.id.lay_main_btnConnectar);
        btnConnectar.setOnClickListener(this);
    }

    @Override
    public void onClick(View vista) {
        switch(vista.getId()){
            case R.id.lay_main_btnConnectar:{
                if(true){
                    Intent intencio = new Intent(this, ActivityControlador.class);
                    startActivity(intencio);
                }
            }break;
        }
    }
}
