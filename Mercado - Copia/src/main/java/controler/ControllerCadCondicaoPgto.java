
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.CondicaoPgto;
import view.FormCadastroCondicaoPgto;


public class ControllerCadCondicaoPgto implements ActionListener{
    FormCadastroCondicaoPgto telaCadCondicaoPgto;
    
    public ControllerCadCondicaoPgto(FormCadastroCondicaoPgto parTelaCadCondicaoPgto){
        this.telaCadCondicaoPgto = parTelaCadCondicaoPgto;
        
       telaCadCondicaoPgto.getjButtonNovo().addActionListener((ActionListener) this);
       telaCadCondicaoPgto.getjButtonCancelar().addActionListener(this);
       telaCadCondicaoPgto.getjButtonSalvar().addActionListener(this);
       telaCadCondicaoPgto.getjButtonBuscar().addActionListener(this);
       telaCadCondicaoPgto.getjButtonSair().addActionListener(this);
       
       telaCadCondicaoPgto.ativa(true);
       telaCadCondicaoPgto.ligaDesliga(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCadCondicaoPgto.getjButtonNovo()){
            telaCadCondicaoPgto.ativa(false);
            telaCadCondicaoPgto.ligaDesliga(true);
            telaCadCondicaoPgto.getjTextFieldID().setEnabled(false);
        }else if(acao.getSource() == telaCadCondicaoPgto.getjButtonCancelar()){
            telaCadCondicaoPgto.ativa(true);
            telaCadCondicaoPgto.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadCondicaoPgto.getjButtonSalvar()){
            
            if(telaCadCondicaoPgto.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");           
            }else{
                CondicaoPgto condicao = new CondicaoPgto();
                condicao.setDescricaoCondicao(telaCadCondicaoPgto.getjTextFieldDescricao().getText());
             // condicao.setNumeroParcelas(telaCadCondicaoPgto.getjTextFieldParcelas().getInt());
              //condicao.setDiasPrimeiraParcela(telaCadCondicaoPgto.getjTextFieldPrimeiraParcela().getText());
              //condicao.setDiasPrimeiraParcela(telaCadCondicaoPgto.getjTextFieldPrimeiraParcela().getText());
                
               
               
                
                
                telaCadCondicaoPgto.ativa(false);
                telaCadCondicaoPgto.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadCondicaoPgto.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadCondicaoPgto.getjButtonSair()){
            telaCadCondicaoPgto.dispose();
        }
        
    }
    }

