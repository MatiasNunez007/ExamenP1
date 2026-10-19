public class NodoRed {
    private int id;
    private static final int MAX = 2;
    public int conexionesActivas;
    private static int contador = 0;

    /*public NodoRed(){
        contador++;
    }*/
    public static int getContador(){
        return contador;
    }

    public NodoRed(int id, int conexionesActivas) {
        setId(id);
        setconexionesActivas(conexionesActivas);
        if (id >= 0 && conexionesActivas >= 0 && MAX > 0){
            contador++;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    /*public int getMaxConexiones() {
        return maxConexiones;
    }

    public void setMaxConexiones(int maxConexiones) {
        if (maxConexiones > 0) {
            this.maxConexiones = maxConexiones;
        }
    }*/

    public int getConexionesActivas() {
        return conexionesActivas;
    }

    public void setconexionesActivas(int conexionesActivas) {
        if (conexionesActivas >= 0 && conexionesActivas <= MAX) {
            this.conexionesActivas = conexionesActivas;
        }
    }

    public boolean Conectar(){
        if (conexionesActivas < MAX){
            conexionesActivas += 1;
            //System.out.println("True");
            return true;
        }else{
            //System.out.println("False");
            System.out.println("Conserva: " + conexionesActivas);
            return false;
        }
    }

    public boolean Desconectar(){
        if (conexionesActivas > 0){
            conexionesActivas -= 1;
            //System.out.println("True");
            return true;
        }else{
            //System.out.println("False");
            System.out.println("Conserva: " + conexionesActivas);
            return false;
        }
    }
}
