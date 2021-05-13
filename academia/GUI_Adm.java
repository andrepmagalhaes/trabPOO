/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author douglas
 */
public class GUI_Adm extends javax.swing.JFrame {
    GUI_Cadastro cad;
    int id = 0;
    /**
     * Creates new form GUI_Adm
     */
    public GUI_Adm() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
                       
     private void initComponents() {

        verCaixa = new javax.swing.JButton();
        receber = new javax.swing.JToggleButton();
        pagar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        valorEmCaixa = new javax.swing.JLabel();
        cadastrarEquip = new javax.swing.JButton();
        equipamentoNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verCaixa.setText("Visualizar caixa");
        verCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCaixaActionPerformed(evt);
            }
        });

        receber.setText("Cobrar Mensalidade");
        receber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receberActionPerformed(evt);
            }
        });

        pagar.setText("Pagar professores");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar Usuário");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        valorEmCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorEmCaixa.setText("--");

        cadastrarEquip.setText("Cadastrar Equipamento");
        cadastrarEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEquipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(receber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(pagar))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(verCaixa)
                                    .addComponent(cadastrar))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(valorEmCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(equipamentoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(186, Short.MAX_VALUE)
                    .addComponent(cadastrarEquip)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorEmCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receber)
                    .addComponent(pagar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(equipamentoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(cadastrar)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(253, Short.MAX_VALUE)
                    .addComponent(cadastrarEquip)
                    .addGap(16, 16, 16)))
        );

        pack();
    }// </editor-fold>                        
                    
             
                  

    private void verCaixaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(id == 0){
            verCaixa.setText("Esconder");
            valorEmCaixa.setText(String.valueOf(Academia.caixa.getCaixa()));
            id = 1;
        } else {
            verCaixa.setText("Mostrar");
            valorEmCaixa.setText("--");
            id = 0;
        } 
    }                                        

    private void receberActionPerformed(java.awt.event.ActionEvent evt) {                                        
        for(Aluno x : Academia.alunos){
            x.setPendente(x.getMensalidade());
        }
    }                                       

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {                                      
        for (Professor x : Academia.professores){
            x.setDisponivel(x.getSalario());
        }
    }                                     

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        cad = new GUI_Cadastro();
        cad.setVisible(true);
    }   

    private void cadastrarEquipActionPerformed(java.awt.event.ActionEvent evt) {                                               
       Academia.addEquipment(equipamentoNome.getText());
    }                                        

   

    // Variables declaration - do not modify                     
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cadastrarEquip;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton pagar;
    private javax.swing.JToggleButton receber;
    private javax.swing.JButton verCaixa;
    private javax.swing.JLabel valorEmCaixa;
    private javax.swing.JTextField equipamentoNome;
    // End of variables declaration                   
}
