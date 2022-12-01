
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import javax.swing.JOptionPane;
import view.FormCadastroCliente;


public class ControllerCadFornecedor implements ActionListener{
    FormCadastroCliente telaCadCliente;
    
    public ControllerCadFornecedor(FormCadastroCliente parTelaCadCliente){
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
               // cliente.setStatus(telaCadCliente.getjCheckBox1().getText());
                cliente.setCpf(telaCadCliente.getjFormattedTextFieldCPF().getText());
                cliente.setRg(telaCadCliente.getjTextFieldRG().getText());
                cliente.setFone1(telaCadCliente.getjFormattedTextFieldfone1().getText());
                cliente.setFone2(telaCadCliente.getjFormattedTextFieldFone2().getText());
               // cliente.setDtNascimento(telaCadCliente.getjFormattedTextFieldnascimento().getText());
               cliente.setSexo((char) telaCadCliente.getjComboBoxSexo().getSelectedItem());
               cliente.setEmail(telaCadCliente.getjTextFieldemail().getText());
               cliente.setCep(telaCadCliente.getjFormattedTextFieldCEP().getText());
               
               
                
                
                telaCadCliente.ativa(false);
                telaCadCliente.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadCliente.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadCliente.getjButtonSair()){
            telaCadCliente.dispose();
        }
        
    }
    }

