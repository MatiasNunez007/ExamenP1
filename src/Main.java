public class Main{
    void main(String[] args) {
        NodoRed N1 = new NodoRed(2, 0);

       // N1.Conectar();
        System.out.println(N1.Conectar() + "; Conexiones activas: " + N1.conexionesActivas);
        //N1.Conectar();
        System.out.println(N1.Conectar() + "; Conexiones activas: " + N1.conexionesActivas);
        System.out.println(N1.Conectar() + "; Conexiones activas: " + N1.conexionesActivas);

        //N1.Desconectar();
        System.out.println(N1.Desconectar() + "; Conexiones activas: " + N1.conexionesActivas);
        //N1.Desconectar();
        System.out.println(N1.Desconectar() + "; Conexiones activas: " + N1.conexionesActivas);
        System.out.println(N1.Desconectar() + "; Conexiones activas: " + N1.conexionesActivas);

    }
}

