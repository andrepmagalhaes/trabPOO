/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;



/**
 *
 * @author kamek
 */
public class GUI_Cadastro extends javax.swing.JFrame {


    /**
     * Creates new form GUI_Cadastro
     */
    public GUI_Cadastro() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(GUI_Cadastro.DISPOSE_ON_CLOSE);
        nome_cad.setEnabled(false);
        usuario_cad.setEnabled(false);
        senha_cad.setEnabled(false);
        
    }
                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome_cad = new javax.swing.JTextField();
        pessoa_cad = new javax.swing.JComboBox<>();
        confirm_Cad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario_cad = new javax.swing.JTextField();
        peso_cad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        altura_cad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nivelAula = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        senha_cad = new javax.swing.JTextField();
        Label_valor = new javax.swing.JLabel();
        valor_cad = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYM NEW CAD");

        jLabel1.setText("Nome");

        jLabel3.setText("Usuário");

        nome_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cadActionPerformed(evt);
            }
        });
        nome_cad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nome_cadPropertyChange(evt);
            }
        });

        pessoa_cad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Aluno", "--" }));
        pessoa_cad.setSelectedIndex(2);
        pessoa_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoa_cadActionPerformed(evt);
            }
        });

        confirm_Cad.setText("Confirmar");
        confirm_Cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCadActionPerformed(evt);
            }
        });

        jLabel5.setText("Selecione");

        usuario_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_cadActionPerformed(evt);
            }
        });

        peso_cad.setEnabled(false);
        peso_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_cadActionPerformed(evt);
            }
        });

        jLabel6.setText("Peso");

        jLabel7.setText("Altura");

        altura_cad.setEnabled(false);
        altura_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altura_cadActionPerformed(evt);
            }
        });

        jLabel9.setText("Nível");

        nivelAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        nivelAula.setEnabled(false);
        nivelAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelAulaActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        senha_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_cadActionPerformed(evt);
            }
        });

        Label_valor.setText("--");

        valor_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_cadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_cad)
                    .addComponent(pessoa_cad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nivelAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(senha_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(valor_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Label_valor))
                                        .addGap(72, 72, 72))
                                    .addComponent(confirm_Cad, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(altura_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pessoa_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nome_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(senha_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(peso_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(altura_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(nivelAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(Label_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm_Cad)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void nome_cadActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }     

     private void cadastrarEquipActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                         

    private void pessoa_cadActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(pessoa_cad.getSelectedIndex()==0){//Caso seja professor
           
            nome_cad.setEnabled(true);
            usuario_cad.setEnabled(true);
            senha_cad.setEnabled(true);
            
            nivelAula.setEnabled(true);
            Label_valor.setText("Salário:");
        }else {
            nivelAula.setEnabled(false);
        }
         if(pessoa_cad.getSelectedIndex()==1){//Caso seja aluno
        
            peso_cad.setEnabled(true);
            altura_cad.setEnabled(true);
            nome_cad.setEnabled(true);
            usuario_cad.setEnabled(true);
            senha_cad.setEnabled(true);
            Label_valor.setText("Mensalidade:");
           
        }else {
            peso_cad.setEnabled(false);
            altura_cad.setEnabled(false);
          
         
         }
         if(pessoa_cad.getSelectedIndex()==2){
            nome_cad.setEnabled(false);
            usuario_cad.setEnabled(false);
            senha_cad.setEnabled(false);
            Label_valor.setText("--");
         }
    }                                          

    private void confirmCadActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        String nome = nome_cad.getText();
        String senha = senha_cad.getText();
        String user = usuario_cad.getText();
        double valor = Double.parseDouble(valor_cad.getText());
               
        int op = pessoa_cad.getSelectedIndex();//Quem foi selecionado
        
            switch(op){
                case 0:
                    Academia.professores.add(new Professor(nome,user,senha,valor));
                    dispose();
                break;
                
                case 1:
                    double peso = Double.parseDouble(peso_cad.getText());
                    double altura = Double.parseDouble(altura_cad.getText());
                    int nivel = nivelAula.getSelectedIndex();    
                        Academia.alunos.add(new Aluno(nome,user,senha,nivel+1,peso,altura,valor));
                        dispose();
                 break;
            }

    }                                          

    private void usuario_cadActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void peso_cadActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(Float.valueOf(peso_cad.getText()) > 0){
            nivelAula.setSelectedIndex(1);
        }
        
        if (Float.valueOf(peso_cad.getText()) > 50 ){
            nivelAula.setSelectedIndex(2);
        }
        
        if (Float.valueOf(peso_cad.getText()) > 70 ){
            nivelAula.setSelectedIndex(3);
        }
        
        if (Float.valueOf(peso_cad.getText()) > 90 ){
            nivelAula.setSelectedIndex(4);
        }
        
        if (Float.valueOf(peso_cad.getText()) >= 100 ){
            nivelAula.setSelectedIndex(5);
        }
    }                                        

    private void altura_cadActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void nivelAulaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void senha_cadActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void valor_cadActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void nome_cadPropertyChange(java.beans.PropertyChangeEvent evt) {                                        
        
    }                                       

   
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Label_valor;
    private javax.swing.JTextField altura_cad;
    private javax.swing.JButton confirm_Cad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nivelAula;
    private javax.swing.JTextField nome_cad;
    private javax.swing.JTextField peso_cad;
    private javax.swing.JComboBox<String> pessoa_cad;
    private javax.swing.JTextField senha_cad;
    private javax.swing.JTextField usuario_cad;
    private javax.swing.JTextField valor_cad;
    private javax.swing.JButton cadastrarEquip;
    // End of variables declaration                   
}
