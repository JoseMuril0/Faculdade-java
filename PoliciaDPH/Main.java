class Main {

    public static void Mostrar(Policial[] lista) {
        System.out.println("+===================DADOS DO POLICIAL===========================+");
        System.out.println("NOME    | PATENTE     | MEDIA | RESULTADO");
        for(int i = 0; i < lista.length; i++) {
            lista[i].mostrarDados();
        }
        System.out.println("+===============================================================+");
    }

    public static void Prova(Policial[] lista, int questao) throws Exception {
        for (int i = 0; i < lista.length; i++) {
            System.out.println((questao+1) + "Responde:");
            System.out.println("Policia: " + lista[i].getNome() + "| Patente: " + lista[i].getPatente());
            lista[i].notas[questao] = JUtil.readFloat();
        }
    }

    public static int Menu() throws Exception {
        System.out.println("=====================================");
        System.out.println("                 MENU"); 
        System.out.println("======================================");
        System.out.println("1 - Aplicar teste");
        System.out.println("2 - Nostrar status do aluno");
        System.out.println("3 - Sair");
        System.out.println("======================================");
        System.out.print(": ");
        return JUtil.readInt();
    }

    public static void main(String[] args) throws Exception {
        int opcao = 0;
        System.out.println("Quantas policiais irao realzar o treinamento: ");
        Policial lista[] = new Policial[JUtil.readInt()];
       
        for(int i = 0; i < lista.length; i++) {
            System.out.println("<-> NOVO, policial <->");
            System.out.println("Nick do policia (>) ");
            String nick = JUtil.readString();
            System.out.println("Patente do policia (>) ");
            String patente = JUtil.readString();            
            lista[i] = new Policial(nick, patente); /* Momento da instacia */
        }
        for (int i = 0; i < 50; ++i) {System.out.println ();}
        while(opcao != 3) {
            opcao = Menu();
            if (opcao == 1) {
                System.out.println("[            APLICACAO T1             ]");
                for(int i = 0; i < 10; i++) {
                    Prova(lista, i);
                }
            } else if(opcao == 2) {
                Mostrar(lista);
            }
        }
        System.out.println("[x] FIM DO PROGRAMA [x]");
        
    }
}