
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Colaborador;
import view.FormCadastroColaborador;


public class ControllerCadColaborador implements ActionListener{
    FormCadastroColaborador telaCadColaborador;
    
    public ControllerCadColaborador(FormCadastroColaborador parTelaCadColaborador){
        this.telaCadColaborador = parTelaCadColaborador;
        
       telaCadColaborador.getjButtonNovo().addActionListener((ActionListener) this);
       telaCadColaborador.getjButtonCancelar().addActionListener(this);
       telaCadColaborador.getjButtonSalvar().addActionListener(this);
       telaCadColaborador.getjButtonBuscar().addActionListener(this);
       telaCadColaborador.getjButtonSair().addActionListener(this);
       
       telaCadColaborador.ativa(true);
       telaCadColaborador.ligaDesliga(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCadColaborador.getjButtonNovo()){
            telaCadColaborador.ativa(false);
            telaCadColaborador.ligaDesliga(true);
        }else if(acao.getSource() == telaCadColaborador.getjButtonCancelar()){
            telaCadColaborador.ativa(true);
            telaCadColaborador.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadColaborador.getjButtonSalvar()){
            
            if(telaCadColaborador.getjTextFieldLogin().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Login é Obrigatório");           
            }else if (telaCadColaborador.getjTextFieldSenha().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Senha é Obrigatório");           

            }else{
                 Colaborador colaborador = new Colaborador();
                colaborador.setLogin(telaCadColaborador.getjTextFieldLogin().getText());
                colaborador.setSenha(telaCadColaborador.getjTextFieldSenha().getText());
             
               
               
                
                
                telaCadColaborador.ativa(false);
                telaCadColaborador.ligaDesliga(true);  
            }
            
                    
        }else if(acao.getSource() == telaCadColaborador.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadColaborador.getjButtonSair()){
            telaCadColaborador.dispose();
        }
        
    }
    }

