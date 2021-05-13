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
public class GUI_Professor extends javax.swing.JFrame {
         private String nome;
         private static GUI_Agenda age;
         
    /**
     * Creates new form GUI_Professor
     */
    public GUI_Professor(String n) {
        initComponents();
        this.setNome(n);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        age = new GUI_Agenda();
        age.setVisible(true);
        age.dispose();
        salario.setText(Academia.currentSessionProfessor.getDisponivel());
    }
    
    void abrirAgenda(){
        age.setVisible(true);
    }
    
    void setNome(String n){
        this.nome = n;
        NomeProfessor.setText(n);
    }

    public String getNome() {
        return nome;
    }

                           
    private void initComponents() {

        hora = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        NomeProfessor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        aula = new javax.swing.JComboBox<>();
        Hora1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        agenda = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        receberSalario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));

        NomeProfessor.setText("jLabel1");

        jLabel1.setText("Marcar Aula:");

        Hora.setText("Hora");

        aula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peito", "Braço", "Abdomem", "Perna" }));

        Hora1.setText("Aula");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agenda.setText("Verificar Agenda");
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });

        jLabel5.setText("Salário:");

        salario.setText("0");

        receberSalario.setText("Sacar salário");
        receberSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receberSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeProfessor)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Hora))
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addComponent(Hora1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receberSalario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(agenda, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hora1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receberSalario)
                    .addComponent(salario)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>                                          
                       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /*switch(hora.getSelectedIndex()){
            case 0:
                age.a8.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p8.setText(getNome());
                
            break;
            case 1:
                age.a9.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p9.setText(getNome());
                
            break;
            case 2:
                age.a10.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p10.setText(getNome());
                
            break;
            case 3:
                age.a11.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p11.setText(getNome());
                
            break;
            case 4:
                age.a12.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p12.setText(getNome());
                
            break;
            case 5:
                age.a13.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p13.setText(getNome());
                
            break;
            case 6:
                age.a14.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p14.setText(getNome());
                
            break;
            case 7:
                age.a15.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p15.setText(getNome());
                
            break;
            case 8:
                age.a16.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p16.setText(getNome());
                
            break;
            case 9:
                age.a17.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p17.setText(getNome());
                
            break;
            case 10:
                age.a18.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p18.setText(getNome());
                
            break;
            case 11:
                age.a19.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p19.setText(getNome());
                
            break;
            case 12:
                age.a20.setText(aula.getItemAt(aula.getSelectedIndex()));
                age.p20.setText(getNome());
                
            break;
        }*/
    }                                        

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        abrirAgenda();
    }     

    private void receberSalarioActionPerformed(java.awt.event.ActionEvent evt) {                                               
        Academia.caixa.debito(Double.parseDouble(salario.getText()));
        salario.setText("0");  
    }                                    

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Hora1;
    public javax.swing.JLabel NomeProfessor;
    private javax.swing.JButton agenda;
    private javax.swing.JComboBox<String> aula;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton receberSalario;
    public javax.swing.JLabel salario;
    // End of variables declaration                    
}
