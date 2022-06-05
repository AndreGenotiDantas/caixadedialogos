package caixaDeDialogo;
import javax.swing.JOptionPane;
public class caixamain {
	public static void main(String[] args) {
		String nome = null;
		int resposta;
		int resposta_1 = 999;
		nome = JOptionPane.showInputDialog("Qual o seu nome: ");
		resposta = JOptionPane.showConfirmDialog(null,"nome: "+nome);
		
		if(resposta == JOptionPane.YES_OPTION) {
			resposta_1 = JOptionPane.showConfirmDialog(null,"quer redistrar o nome ?");
		}else {
			JOptionPane.showConfirmDialog(null,"nome incorreto ");
		}
		if (resposta_1 == JOptionPane.YES_OPTION) {
			JOptionPane.showConfirmDialog(null,"nome registrado ");
		}else {
			JOptionPane.showConfirmDialog(null,"nome nao registrado ");
		}
		
	}

}
