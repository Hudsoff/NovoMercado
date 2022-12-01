package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Bairro;
import view.FormCadastroBairro;

public class ControllerCadBairro implements ActionListener{
   FormCadastroBairro telaCadBairro;

    public ControllerCadBairro(FormCadastroBairro parTelaCadBairro) {
       this.telaCadBairro = parTelaCadBairro;
       
       telaCadBairro.getjButtonNovo().addActionListener(this);
       telaCadBairro.getjButtonCancelar().addActionListener(this);
       telaCadBairro.getjButtonSalvar().addActionListener(this);
       telaCadBairro.getjButtonBuscar().addActionListener(this);
       telaCadBairro.getjButtonSair().addActionListener(this);
       
       telaCadBairro.ativa(true);
       telaCadBairro.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        
        if(acao.getSource() == telaCadBairro.getjButtonNovo()){
            telaCadBairro.ativa(false);
            telaCadBairro.ligaDesliga(true);
            telaCadBairro.getjTextFieldID().setEnabled(false);
        }else if(acao.getSource() == telaCadBairro.getjButtonCancelar()){
            telaCadBairro.ativa(true);
            telaCadBairro.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadBairro.getjButtonSalvar()){
            
            if(telaCadBairro.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");           
            }else{
                Bairro bairro = new Bairro();
                bairro.setDescricao(telaCadBairro.getjTextFieldDescricao().getText());
                
                telaCadBairro.ativa(false);
                telaCadBairro.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadBairro.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadBairro.getjButtonSair()){
            telaCadBairro.dispose();
        }
        
    }
   

   
   
}
