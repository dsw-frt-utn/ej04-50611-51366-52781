package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.Menu;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        //ListarVehiculosView view = new ListarVehiculosView();
        //view.setVisible(true);
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
