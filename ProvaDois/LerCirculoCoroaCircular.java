import jutil.*;
class LerCirculoCoroaCircular {
    public static void main(String[] args) throws Exception {
        CilindroCoroaCircular x;
        System.out.print("RAIO MAIOR: ");
        float raioMaior = JUtil.readFloat();
        while (raioMaior != 0) {
            System.out.println("Infome a RAIO MENOR e ALTURA: ");
            x = new CilindroCoroaCircular(raioMaior, JUtil.readFloat(), JUtil.readFloat());
            x.mostrarDados();
            System.out.print("RAIO MAIOR: ");
            raioMaior = JUtil.readFloat();
        }
    }
}