
import Iphone.Iphone;


import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int escolha, statusMusica, statusTelefone, escolhaInternet;
        Boolean execucao;
        execucao = true;
        while (execucao) {
            System.out.println("Gostaria de fazer oque no seu iphone?");
            System.out.println("[1]Tocar musica");
            System.out.println("[2]Ligar para alguem");
            System.out.println("[3]Usar a internet");
            escolha = sc.nextInt();
            if (escolha != 0) {
                execucao = false;
            }
            switch (escolha) {
                case 1:
                    sc.nextLine();
                    System.out.println("Oque que você quer que eu toque?");
                    String musica = sc.nextLine();
                    System.out.println("Quantas vezes você quer que eu toque?");
                    int vezesTocadas = sc.nextInt();
                    do {
                        for (int i = 0; i <= vezesTocadas; i++) {
                            iphone.selecionar(musica);
                            iphone.tocar();
                        }
                        iphone.pausar();
                        System.out.println("Gostaria de continuar tocando?");
                        System.out.println("[2]Parar musica");
                        System.out.println("[1]continuar musica");
                        statusMusica = sc.nextInt();
                        sc.nextLine();
                        if (statusMusica == 1) {
                            iphone.tocar();
                        } else if (statusMusica == 2) {
                            execucao = true;
                        }
                    } while (statusMusica != 2);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Qual numero você deseja ligar?");
                    int numero = sc.nextInt();
                    iphone.ligar(numero);
                    System.out.println("Voce ligou para o numero " + iphone.getNumero());
                    iphone.atender();
                    System.out.println("Ligação encerrada.");
                    do {
                        for (int i = 0; i <= 6; i++) {
                            System.out.println("Telefone tocando...");
                        }
                        System.out.println("Gostaria de atender?");
                        System.out.println("[1]sim");
                        System.out.println("[2]não");
                        statusTelefone = sc.nextInt();
                        sc.nextLine();
                        if (statusTelefone == 1) {
                            iphone.atender();
                            execucao = true;
                        } else if (statusTelefone == 2) {
                            iphone.iniciarCorreioVoz();
                            execucao = true;
                        }
                    } while (statusTelefone != 2);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Qual é o site que você quer explorar");
                    String url = sc.nextLine();
                    iphone.exibirPagina(url);
                    System.out.println("Voce esta navegando pelo site " + iphone.getUrl());
                    iphone.atualizarPagina();
                    do {
                        System.out.println("Deseja abrir outra pagina?");
                        System.out.println("[1]sim");
                        System.out.println("[2]não");
                        System.out.println("[3]voltar para a home");
                        escolhaInternet = sc.nextInt();
                        if (escolhaInternet == 1){
                            sc.nextLine();
                            iphone.adicionarNovaAba();
                            System.out.println("Qual é o site que você quer explorar");
                            url = sc.nextLine();
                            iphone.exibirPagina(url);
                            System.out.println("Voce esta navegando pelo site " + iphone.getUrl());
                            iphone.atualizarPagina();
                        }else if (escolhaInternet == 3){
                            execucao = true;
                        }else{
                            System.out.println("Voce esta navegando pelo site " + iphone.getUrl());
                        }
                    }while (escolhaInternet != 3);
            }
        }
    }
}