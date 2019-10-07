import java.rmi.Naming;
import java.util.Scanner;

public class WhatsappClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			WhatsServerInterface stub = (WhatsServerInterface) Naming.lookup("//localhost/whatsapp");
			;
			System.out.println("Nome do usuario");
			String contato = sc.nextLine();
			Boolean response = stub.cadastrarUsuario(contato);
			System.out.println("response: " + response);
			String[] contatos = stub.contatos();
			for (String string : contatos) {
				System.out.println(string);
			}
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

