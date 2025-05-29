
package ModelosDUTS;


public class DUTS {
   
    private int DUTS = 100;
    private int DUTSaEnviar;

    public int getDUTSactuales() {
        return DUTS;
    }

    public void setDUTSactuales(int DUTSactuales) {
        this.DUTS = DUTSactuales;
    }
    
    
            
    public void llamarMetodoenviarDUTS() {
        EnviarDUTS.enviarDUTS(DUTSaEnviar);
    
    }
    
    
    
    
}
