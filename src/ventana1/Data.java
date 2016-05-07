
package ventana1;

//CapturarDatos

import javax.swing.JOptionPane;

public class Data {
    int n=15,p=0;
   String []nom= new String [n];
   int[] edad= new int[n];
    public Data() {
    }

  

    
    public void CapturarDatos()
    {
        //capturamos datos y convertir
        if(p<15)
        {
        nom[p]=Ventana.TFNombre.getText(); 
        edad[p]=Integer.parseInt(Ventana.TFEdad.getText());
        p++;
        Ventana.LBContador.setText(String.valueOf(p));
        }else{
            
             JOptionPane.showMessageDialog(null,"lista llena","message",JOptionPane.PLAIN_MESSAGE);
        }
    }
   
   public void Imprimir()
   {
       for(int i=0;i<p;i++)
       {
       JOptionPane.showMessageDialog(null,"el nombre: "+nom[i]+" edad: "+edad[i],"Error Registros",JOptionPane.PLAIN_MESSAGE);
       }
   }
    
}
