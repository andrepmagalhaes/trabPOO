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
public class GUI_Aluno extends javax.swing.JFrame {
    private String nome;

    /**
     * Creates new form GUI_Aluno
     */
    public GUI_Aluno(String n) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        boleto.setText(Academia.currentSessionAluno.getPendente());
        this.setNome(n);
        this.setVisible(true);
        imc.setText(Double.toString(Academia.currentSessionAluno.getImc()));
    }
    
    void setNome(String n){
        this.nome = n;
        alunoNome.setText(n);
    }
    
    public String getNome() {
        return nome;
    }
       
    private void initComponents() {

        alunoNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boleto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imc = new javax.swing.JLabel();
        editar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alunoNome.setText("NOME DO USUARIO");

        jLabel4.setText("Cobrança:");

        boleto.setText("0");

        jButton1.setText("Pagar mensalidade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Peso:");

        jLabel6.setText("Altura:");

        peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peso.setText("--");

        altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        altura.setText("--");

        jLabel9.setText("IMC:");

        imc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imc.setText("--");

        editar.setText("Editar Peso/Altura");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boleto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peso))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(imc)
                                .addComponent(altura)))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(editar))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(alunoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(peso))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(altura)
                            .addComponent(editar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(imc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(boleto))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(alunoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        
                   
                     
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Academia.caixa.credito(Double.parseDouble(boleto.getText()));
        boleto.setText("0");        
    }  

     private void editarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        new GUI_EditordePesoAltura();
    }   

    /**
     * @param args the command line arguments
     */
    
    
    public void setBoleto(String x){
        boleto.setText(x);
    }

    // Variables declaration - do not modify                     

  
    private javax.swing.JLabel altura;
    private javax.swing.JLabel alunoNome;
    public javax.swing.JLabel boleto;
    private javax.swing.JToggleButton editar;
    private javax.swing.JLabel imc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel peso;
    // End of variables declaration                        
}
