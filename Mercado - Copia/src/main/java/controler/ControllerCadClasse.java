
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Classe;
import view.FormCadastroClasse;


public class ControllerCadClasse implements ActionListener{
    FormCadastroClasse telaCadClasse;
    
        public ControllerCadClasse(FormCadastroClasse parTelaCadastroClasse){
            this.telaCadClasse = parTelaCadastroClasse;
            
            telaCadClasse.getjButtonNovo().addActionListener(this);
            telaCadClasse.getjButtonCancelar().addActionListener(this);
            telaCadClasse.getjButtonSalvar().addActionListener(this);
            telaCadClasse.getjButtonBuscar().addActionListener(this);
            telaCadClasse.getjButtonSair().addActionListener(this);
       
            telaCadClasse.ativa(true);
            telaCadClasse.ligaDesliga(false);
            
        }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCadClasse.getjButtonNovo()){
            telaCadClasse.ativa(false);
            telaCadClasse.ligaDesliga(true);
            telaCadClasse.getjTextFieldID().setEnabled(false);
        }else if(acao.getSource() == telaCadClasse.getjButtonCancelar()){
            telaCadClasse.ativa(true);
            telaCadClasse.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadClasse.getjButtonSalvar()){
            
            if(telaCadClasse.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");           
            }else{
                Classe classe = new Classe();
                classe.setDescricao(telaCadClasse.getjTextFieldDescricao().getText());
                
                telaCadClasse.ativa(false);
                telaCadClasse.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadClasse.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadClasse.getjButtonSair()){
            telaCadClasse.dispose();
        }    }
    
}
