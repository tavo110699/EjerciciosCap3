/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ30_22_ImpresionFechasVariosFormatos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import EJ30_22_ImpresionFechasVariosFormatos.UIDate;
import java.text.DateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class utils {

    SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yy");
    boolean res = true;
    Date date;
    String strDate;
    String strOldDate;

    public String formatDate(String oldDate) {
        UIDate ui = new UIDate();
        SimpleDateFormat formateador = new SimpleDateFormat("MMMM dd, yyyy");

        res = validarFecha(oldDate);
        if (res == true) {
            System.out.println("La fecha es valida");
            Date date = null;
            try {
                date = parseador.parse(oldDate);
                strDate = formateador.format(date);
                ui.txtChangeDate.setText(strDate);

                //       System.out.println(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return formateador.format(date);
        } else {
               JOptionPane.showMessageDialog(null, "Operación fallida: \n Ingresa la fecha en formato dd/mm/yyyy");
            return null;
        }

    }

    public void Updated_date() {
        UIDate ui = new UIDate();
        date = new Date(Calendar.getInstance().getTimeInMillis());
        strOldDate = parseador.format(date);
        formatDate(strOldDate);

    }

    public boolean validarFecha(String fecha) {
        try {

            parseador.setLenient(false);
            parseador.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

}
