class LerParalelepipedo {
    public static void main(String[] args)  throws  Exception {
        Paralelepipedo paralelepipedo =  new Paralelepipedo ();
        Paralelepipedo paralelepipedo2 =  new Paralelepipedo (5,8,12);
        paralelepipedo2.mostrarDados ();
        System.out.println ("Dados do Paralelepipedo");
        System.out.print ("\nInforme o comprimento -> ");
        paralelepipedo.setComprimento (JUtil.readFloat ());
        while (paralelepipedo.getComprimento () != 0) {
            System.out.print ("\nInforme a largura -> ");
            paralelepipedo.setLargura (JUtil.readFloat ());
            System.out.print ("\nInforme a altura -> ");
            paralelepipedo.setAltura (JUtil.readFloat ());
            paralelepipedo.mostrarDados ();
            System.out.print ("\nInforme o comprimento -> ");
            paralelepipedo.setComprimento (JUtil.readFloat ());
	} 
	}
}
