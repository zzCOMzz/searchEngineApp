import javax.swing.JOptionPane;

public class SearchEngine {

	public static void main(String[] args) {
		try {
			String web = JOptionPane.showInputDialog("PROGRAM SEARCH ENGINE");
			if(web == null) {
				JOptionPane.showMessageDialog(null, "WEB YANG DIMASUKKAN Tidak Boleh Kosong");
			}else {
				java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://"+web));
			}
		}catch(Exception ex) {
			ex.getMessage();
			System.out.println("System Error: "+ex);
		}
	}

}
