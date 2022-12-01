
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import javax.swing.JOptionPane;
import view.FormCadastroCliente;


public class ControllerCadCliente implements ActionListener{
    FormCadastroCliente telaCadCliente;
    
    public ControllerCadCliente(FormCadastroCliente parTelaCadCliente){
        this.telaCadCliente = parTelaCadCliente;
        
       telaCadCliente.getjButtonNovo().addActionListener((ActionListener) this);
       telaCadCliente.getjButtonCancelar().addActionListener(this);
       telaCadCliente.getjButtonSalvar().addActionListener(this);
       telaCadCliente.getjButtonBuscar().addActionListener(this);
       telaCadCliente.getjButtonSair().addActionListener(this);
       
       telaCadCliente.ativa(true);
       telaCadCliente.ligaDesliga(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCadCliente.getjButtonNovo()){
            telaCadCliente.ativa(false);
            telaCadCliente.ligaDesliga(true);
            telaCadCliente.getjTextFieldID().setEnabled(false);
        }else if(acao.getSource() == telaCadCliente.getjButtonCancelar()){
            telaCadCliente.ativa(true);
            telaCadCliente.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadCliente.getjButtonSalvar()){
            
            if(telaCadCliente.getjTextFieldNome().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");           
            }else{
                Cliente cliente = new Cliente();
                cliente.setNome(telaCadCliente.getjTextFieldNome().getText());
                
                telaCadCliente.ativa(false);
                telaCadCliente.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadCliente.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadCliente.getjButtonSair()){
            telaCadCliente.dispose();
        }
        
    }
    }

