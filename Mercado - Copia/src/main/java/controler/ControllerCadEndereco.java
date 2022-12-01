
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Endereco;
import javax.swing.JOptionPane;
import view.FormCadastroEndereco;


public class ControllerCadEndereco implements ActionListener{
    FormCadastroEndereco telaCadEndereco;
    
    public ControllerCadEndereco(FormCadastroEndereco parTelaCadEndereco){
        this.telaCadEndereco = parTelaCadEndereco;
        
       telaCadEndereco.getjButtonNovo().addActionListener((ActionListener) this);
       telaCadEndereco.getjButtonCancelar().addActionListener(this);
       telaCadEndereco.getjButtonSalvar().addActionListener(this);
       telaCadEndereco.getjButtonBuscar().addActionListener(this);
       telaCadEndereco.getjButtonSair().addActionListener(this);
       
       telaCadEndereco.ativa(true);
       telaCadEndereco.ligaDesliga(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCadEndereco.getjButtonNovo()){
            telaCadEndereco.ativa(false);
            telaCadEndereco.ligaDesliga(true);
          }else if(acao.getSource() == telaCadEndereco.getjButtonCancelar()){
            telaCadEndereco.ativa(true);
            telaCadEndereco.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadEndereco.getjButtonSalvar()){
            
            if(telaCadEndereco.getjTextFieldLogradouro().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");           
            }else{
                Endereco endereco = new Endereco();
                endereco.setLogradouro(telaCadEndereco.getjTextFieldLogradouro().getText());
                endereco.setCep(telaCadEndereco.getjFormattedTextFieldCEP().getText());
                


              
               
               
                
                
                telaCadEndereco.ativa(false);
                telaCadEndereco.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadEndereco.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadEndereco.getjButtonSair()){
            telaCadEndereco.dispose();
        }
        
    }
    }

