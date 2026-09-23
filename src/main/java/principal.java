
import javax.swing.JOptionPane;
public class principal {

    public static void main(String[] args) {
        String prof;
        prof = JOptionPane.showInputDialog(null,"Digite sua profissão: \ne - engenheiro \nm - médico \nd - designer \np - programador \na - advogado");
        char profCHAR = prof.charAt(0);
        switch(profCHAR){
            case 'e':
                prof = "Engenheiro";
                break;
            case 'm':
                prof = "Médico";
                break;
            case 'd':
                prof = "Designer";
                break;
            case 'p':
                prof = "Programador";
                break;
            case 'a':
                prof = "Advogado";
                break;
            default:prof = "Desempregado";
                break;
            }
        JOptionPane.showMessageDialog(null, "Tibúrcio é: " +prof);
    }
}
