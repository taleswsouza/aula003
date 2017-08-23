package cap02;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
public class EntradaComJOptionPane {
    public static void main(String[] args) {
        String aux;
        float comprimento, largura, area, perimetro;
        try {
            aux = JOptionPane.showInputDialog("Entre com o comprimento: ");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a largura: ");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área: " + area + ", perímetro: " + perimetro);
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos. Erro: " + erro.toString());
        }
    }
    
}
