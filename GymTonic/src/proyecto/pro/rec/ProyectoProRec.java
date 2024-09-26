
package proyecto.pro.rec;



/**
 *
 * @author Salvador
 */
public class ProyectoProRec {

  
    public static void main(String[] args) {
       
        LoginPrincipal LoginP = new LoginPrincipal();
        LoginP.setTitle("Gimnasio GymTonic");
        LoginP.setVisible(true);
        
        /*
        ObjectInputStream in = null;
        List <Cliente> listP;
        
        try {
            ObjectInputStream ficherocargaCliente = new ObjectInputStream(new FileInputStream("Cliente.dat"));
            listP =(List <Cliente>) ficherocargaCliente.readObject();
             for (int i = 0; i<listP.size(); i++){
                 System.out.println("Nombre: "+listP.get(i).getNombre()+" Dni:"+listP.get(i).getDni()+ "Cuota: "+listP.get(i).getCuota()+" NumeroSocio: "+listP.get(i).getNumeroSocio());
        
        }
            
            ficherocargaCliente.close();
        } catch (Exception ex) {
            listP= new LinkedList();
            Logger.getLogger(ProyectoProRec.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       */
        
        
    }
   
        
}
