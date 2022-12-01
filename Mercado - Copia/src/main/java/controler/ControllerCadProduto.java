
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Produto;
import javax.swing.JOptionPane;
import view.FormCadastroProduto;


public class ControllerCadProduto implements ActionListener{
    FormCadastroProduto telaCadProduto;
    
    public ControllerCadProduto(FormCadastroProduto parTelaCadProduto){
        this.telaCadProduto = parTelaCadProduto;
        
       telaCadProduto.getjButtonNovo().addActionListener((ActionListener) this);
       telaCadProduto.getjButtonCancelar().addActionListener(this);
       telaCadProduto.getjButtonSalvar().addActionListener(this);
       telaCadProduto.getjButtonBuscar().addActionListener(this);
       telaCadProduto.getjButtonSair().addActionListener(this);
       
       telaCadProduto.ativa(true);
       telaCadProduto.ligaDesliga(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == telaCadProduto.getjButtonNovo()){
            telaCadProduto.ativa(false);
            telaCadProduto.ligaDesliga(true);
            telaCadProduto.getjTextFieldID().setEnabled(false);
        }else if(acao.getSource() == telaCadProduto.getjButtonCancelar()){
            telaCadProduto.ativa(true);
            telaCadProduto.ligaDesliga(false);            
        }else if(acao.getSource() == telaCadProduto.getjButtonSalvar()){
            
            if(telaCadProduto.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");           
            }else{
                Produto produto = new Produto();
                                               
               // produto.setId(telaCadProduto.getjTextFieldID().getText());
                produto.setDescricao(telaCadProduto.getjTextFieldDescricao().getText());
               // produto.setValorCompra(telaCadProduto.getjTextFieldCusto().getText());
                //produto.setValorVenda(telaCadProduto.getjTextFieldVenda().getText());
              //produto.setUndCompra(telaCadProduto.getjComboBoxUnidadeCompra().getText());
                //produto.setUndVenda(telaCadProduto.getjComboBoxUnidadeVenda().getText());
                //produto.setUndVenda(telaCadProduto.getjComboBoxUnidadeVenda().getText());
 

               
               
                
                
                telaCadProduto.ativa(false);
                telaCadProduto.ligaDesliga(true);    
            }
            
                    
        }else if(acao.getSource() == telaCadProduto.getjButtonBuscar()){
            
        }else if(acao.getSource() == telaCadProduto.getjButtonSair()){
            telaCadProduto.dispose();
        }
        
    }
    }

