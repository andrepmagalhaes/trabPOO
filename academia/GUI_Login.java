/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.awt.Color;

//import java.awt.event.ActionEvent;
//import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class GUI_Login extends javax.swing.JFrame {
    
    /**
     * Creates new form GUI_Login
     */


    public GUI_Login() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    
           
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Acessar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cTexto_nome = new javax.swing.JTextField();
        senhaErrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYM SYSTEM");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Professor", "Aluno", "--" }));
        jComboBox1.setSelectedIndex(3);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha");

        Acessar.setText("Acessar");
        Acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessarActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        cTexto_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTexto_nomeActionPerformed(evt);
            }
        });

        

        senhaErrada.setForeground(new java.awt.Color(204, 204, 204));
        senhaErrada.setText("Senha ou Nome incorreto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cTexto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Acessar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(senhaErrada))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Senha))
                                .addGap(13, 13, 13)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cTexto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acessar)
                    .addComponent(senhaErrada))
                .addGap(18, 18, 18)
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>                        


    private void AcessarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        Color cinza = new Color(204,204,204);

        switch(jComboBox1.getSelectedIndex()){
            case 0:
                System.out.println("Administrador");
                GUI_Adm adm = new GUI_Adm();
                adm.setVisible(true);
                break;
                
            case 1:
                if(Academia.loginProfessor(cTexto_nome.getText(),Senha.getText())==0){
                    senhaErrada.setForeground(Color.RED);
                }else {
                    senhaErrada.setForeground(cinza);//Login efetuado
                    Professor p = Academia.currentSessionProfessor;
                    new GUI_Professor(p.getNome());    
                }
             break;
                
            case 2:
               
                if(Academia.loginAluno(cTexto_nome.getText(),Senha.getText())==0){
                    senhaErrada.setForeground(Color.RED);
                } else {
                    senhaErrada.setForeground(cinza);
                    Aluno a = Academia.currentSessionAluno;
                    new GUI_Aluno(a.getNome());
                }
            break;
        }
        
    }                                       

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try
        {
            Academia.saveData();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.exit(0);
        }
    }                                    

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        
    }                                     

    private void cTexto_nomeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          
    
    void getAlunos(String nome){
        
    }
    
    /*private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
    } */                                       

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton Acessar;
    //private javax.swing.JButton Cadastro;
    private javax.swing.JButton Sair;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField cTexto_nome;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel senhaErrada;
    // End of variables declaration                   
}
