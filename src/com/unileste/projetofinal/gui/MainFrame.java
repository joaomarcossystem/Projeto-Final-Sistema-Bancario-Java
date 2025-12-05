package com.unileste.projetofinal.gui;

import com.unileste.projetofinal.entidades.Cliente;
import com.unileste.projetofinal.entidades.Conta;
import com.unileste.projetofinal.operacoes.Banco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    
    private ArrayList<String> listaDeClientes = new ArrayList<>();
    private Banco banco;
    private ArrayList<String> listaDeCpfs = new ArrayList<>();

    public MainFrame() {
        initComponents();
        banco = new Banco("Sistema Bancário");
    }
    
        private void atualizarComboClientes() {
        comboNomeProprietario.removeAllItems();

        for (String nome : listaDeClientes) {
            comboNomeProprietario.addItem(nome);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBarraEsquerda = new javax.swing.JPanel();
        btnIrParaConta = new javax.swing.JButton();
        btnIrParaCliente = new javax.swing.JButton();
        btnIrParaOp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnIrParaSobre = new javax.swing.JButton();
        btnProximaPagina = new javax.swing.JButton();
        btnVoltarPagina = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabPaineis = new javax.swing.JTabbedPane();
        pnlSobre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnAtualizarClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnExcluirLinha = new javax.swing.JButton();
        pnlConta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboTipoConta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btnCriarConta = new javax.swing.JButton();
        btnAtualizarConta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConta = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        comboNomeProprietario = new javax.swing.JComboBox<>();
        lblCpfDoProp = new javax.swing.JLabel();
        pnlOperacoes = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtContaDeposito = new javax.swing.JTextField();
        txtValorDeposito = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtContaSaque = new javax.swing.JTextField();
        txtValorSaque = new javax.swing.JTextField();
        btnSacar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtContaOrigem = new javax.swing.JTextField();
        txtContaDestino = new javax.swing.JTextField();
        txtValorTransferencia = new javax.swing.JTextField();
        btnTransferir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> Sistema Bancario\n Simples");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        pnlBarraEsquerda.setBackground(new java.awt.Color(102, 102, 102));
        pnlBarraEsquerda.setForeground(new java.awt.Color(153, 153, 153));

        btnIrParaConta.setText("Conta");
        btnIrParaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrParaContaMouseClicked(evt);
            }
        });
        btnIrParaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrParaContaActionPerformed(evt);
            }
        });

        btnIrParaCliente.setText("Cliente");
        btnIrParaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrParaClienteMouseClicked(evt);
            }
        });
        btnIrParaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrParaClienteActionPerformed(evt);
            }
        });

        btnIrParaOp.setText("Operações");
        btnIrParaOp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrParaOpMouseClicked(evt);
            }
        });
        btnIrParaOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrParaOpActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ir Para:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnIrParaSobre.setText("Sobre");
        btnIrParaSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrParaSobreMouseClicked(evt);
            }
        });
        btnIrParaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrParaSobreActionPerformed(evt);
            }
        });

        btnProximaPagina.setText("Próximo");
        btnProximaPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaPaginaActionPerformed(evt);
            }
        });

        btnVoltarPagina.setText("Voltar");
        btnVoltarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPaginaActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> Aplicação Full-Stack<br> Este projeto visa a construção de um sistema bancário completo em Java, aplicando os princípios da Programação Orientada a Objetos (POO) <br> gerencie clientes e suas contas bancárias com lógica de negócio robusta, mas que também ofereça uma Interface Gráfica do Usuário (GUI) intuitiva e persistência de dados em um banco de dados MySQL");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBarraEsquerdaLayout = new javax.swing.GroupLayout(pnlBarraEsquerda);
        pnlBarraEsquerda.setLayout(pnlBarraEsquerdaLayout);
        pnlBarraEsquerdaLayout.setHorizontalGroup(
            pnlBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBarraEsquerdaLayout.createSequentialGroup()
                .addGroup(pnlBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraEsquerdaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarPagina)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximaPagina))
                    .addGroup(pnlBarraEsquerdaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIrParaOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIrParaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIrParaConta, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(btnIrParaSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlBarraEsquerdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBarraEsquerdaLayout.setVerticalGroup(
            pnlBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraEsquerdaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIrParaCliente)
                .addGap(18, 18, 18)
                .addComponent(btnIrParaConta)
                .addGap(18, 18, 18)
                .addComponent(btnIrParaOp)
                .addGap(18, 18, 18)
                .addComponent(btnIrParaSobre)
                .addGap(18, 18, 18)
                .addGroup(pnlBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarPagina)
                    .addComponent(btnProximaPagina))
                .addGap(27, 27, 27))
        );

        jPanel1.add(pnlBarraEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 590));

        tabPaineis.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html> BEM VINDO(A) AO BANCO JMDR<br><br>   É uma satisfação ter você conosco. <br> Aqui, trabalhamos para oferecer segurança, confiança e soluções financeiras que acompanham cada etapa da sua vida. <br> Conte sempre com nossa equipe para apoiar suas conquistas e tornar seus objetivos realidade.");

        javax.swing.GroupLayout pnlSobreLayout = new javax.swing.GroupLayout(pnlSobre);
        pnlSobre.setLayout(pnlSobreLayout);
        pnlSobreLayout.setHorizontalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        pnlSobreLayout.setVerticalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        tabPaineis.addTab("Sobre", pnlSobre);

        pnlCliente.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente");

        lblNome.setText("Nome");

        lblCPF.setText("CPF");

        lblEndereco.setText("Endereço");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PAINEL CLIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnAtualizarClientes.setText("Atualizar");
        btnAtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClientesActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endereço", "Qtd de Contas"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnExcluirLinha.setText("Excluir");
        btnExcluirLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlClienteLayout.createSequentialGroup()
                                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF)
                                    .addComponent(lblEndereco))
                                .addGap(18, 18, 18)
                                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpf)
                                    .addComponent(txtNome)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlClienteLayout.createSequentialGroup()
                                .addComponent(btnCadastrarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizarClientes))
                            .addComponent(jScrollPane1)
                            .addComponent(btnExcluirLinha, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClienteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente)
                    .addComponent(btnAtualizarClientes))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirLinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        tabPaineis.addTab("Cliente", pnlCliente);

        pnlConta.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Conta");

        jLabel8.setText("CPF do proprietário");

        jLabel9.setText("Tipo de Conta");

        comboTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corrente", "Poupança" }));
        comboTipoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoContaActionPerformed(evt);
            }
        });

        jLabel10.setText("Saldo");

        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        btnCriarConta.setText("Criar conta");
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });

        btnAtualizarConta.setText("Atualizar Conta");

        tblConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Tipo", "Cpf", "Saldo"
            }
        ));
        jScrollPane2.setViewportView(tblConta);

        jLabel15.setText("Nome proprietário");

        comboNomeProprietario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNomeProprietarioItemStateChanged(evt);
            }
        });
        comboNomeProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNomeProprietarioActionPerformed(evt);
            }
        });

        lblCpfDoProp.setText("0");

        javax.swing.GroupLayout pnlContaLayout = new javax.swing.GroupLayout(pnlConta);
        pnlConta.setLayout(pnlContaLayout);
        pnlContaLayout.setHorizontalGroup(
            pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(pnlContaLayout.createSequentialGroup()
                .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCriarConta)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarConta))
                    .addGroup(pnlContaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlContaLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldo))
                            .addGroup(pnlContaLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpfDoProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlContaLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContaLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(comboNomeProprietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContaLayout.setVerticalGroup(
            pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContaLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(comboNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCpfDoProp))
                .addGap(25, 25, 25)
                .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarConta)
                    .addComponent(btnAtualizarConta))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPaineis.addTab("Conta", pnlConta);

        pnlOperacoes.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Conta depósito");

        jLabel12.setText("Valor depósito");

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtContaDeposito)))
                .addGap(309, 309, 309))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDepositar)
                .addGap(140, 140, 140))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtContaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btnDepositar)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel13.setText("Conta saque");

        jLabel14.setText("Valor saque");

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtContaSaque))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtContaSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnSacar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jLabel16.setText("Conta Origem");

        jLabel17.setText("Conta Destino");

        jLabel18.setText("Valor transferência");

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContaOrigem)
                            .addComponent(txtContaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                .addGap(82, 82, 82)
                .addComponent(btnTransferir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransferir))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtValorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        areaLog.setColumns(20);
        areaLog.setRows(5);
        jScrollPane3.setViewportView(areaLog);

        javax.swing.GroupLayout pnlOperacoesLayout = new javax.swing.GroupLayout(pnlOperacoes);
        pnlOperacoes.setLayout(pnlOperacoesLayout);
        pnlOperacoesLayout.setHorizontalGroup(
            pnlOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        pnlOperacoesLayout.setVerticalGroup(
            pnlOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOperacoesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPaineis.addTab("Operações", pnlOperacoes);

        jPanel1.add(tabPaineis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 680, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrParaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrParaClienteMouseClicked

    }//GEN-LAST:event_btnIrParaClienteMouseClicked

    private void btnIrParaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrParaContaMouseClicked

    }//GEN-LAST:event_btnIrParaContaMouseClicked

    private void btnIrParaOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrParaOpActionPerformed
        tabPaineis.setSelectedComponent(pnlOperacoes);  
        atualizarComboClientes();
    }//GEN-LAST:event_btnIrParaOpActionPerformed

    private void btnIrParaOpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrParaOpMouseClicked

    }//GEN-LAST:event_btnIrParaOpMouseClicked

    private void btnIrParaSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrParaSobreMouseClicked

    }//GEN-LAST:event_btnIrParaSobreMouseClicked

    private void btnIrParaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrParaClienteActionPerformed
        // TODO add your handling code here:
        tabPaineis.setSelectedComponent(pnlCliente); 
        
        atualizarComboClientes();

    }//GEN-LAST:event_btnIrParaClienteActionPerformed

    private void btnIrParaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrParaContaActionPerformed
        // TODO add your handling code here:
        tabPaineis.setSelectedComponent(pnlConta); 
        
        atualizarComboClientes();

    }//GEN-LAST:event_btnIrParaContaActionPerformed

    private void btnIrParaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrParaSobreActionPerformed
        // TODO add your handling code here:
        tabPaineis.setSelectedComponent(pnlSobre); 
        
        atualizarComboClientes();

    }//GEN-LAST:event_btnIrParaSobreActionPerformed

    private void comboTipoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoContaActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        try {
            String numero = txtContaDeposito.getText().trim();
            double valor = Double.parseDouble(txtValorDeposito.getText());

            banco.realizarDeposito(numero, valor);

            // REBUSCAR A CONTA ATUALIZADA
            Conta contaAtualizada = banco.buscarConta(numero);

            String comprovante = banco.gerarComprovante(
                    "Depósito",
                    contaAtualizada,  // agora está com saldo atualizado!
                    null,
                    valor
            );

            JOptionPane.showMessageDialog(this, comprovante);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnVoltarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPaginaActionPerformed
        // TODO add your handling code here:
        int index = tabPaineis.getSelectedIndex();

        if (index > 0) {
            tabPaineis.setSelectedIndex(index - 1);
        }
    }//GEN-LAST:event_btnVoltarPaginaActionPerformed

    private void btnProximaPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaPaginaActionPerformed
        // TODO add your handling code here:
        int index = tabPaineis.getSelectedIndex();
        int total = tabPaineis.getTabCount();

        if (index < total - 1) {
            tabPaineis.setSelectedIndex(index + 1);
        }
    }//GEN-LAST:event_btnProximaPaginaActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        // TODO add your handling code here:
        try {
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String endereco = txtEndereco.getText().trim();

        // 1 — Criar o cliente
        Cliente cliente = new Cliente(nome, cpf, endereco);

        // 2 — Cadastrar no banco REAL
        banco.cadastrarCliente(cliente);

        // 3 — Adicionar tabela visual
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        Object[] novaLinha = { nome, cpf, endereco, 0 };
        modelo.addRow(novaLinha);
        comboNomeProprietario.addItem(nome);
        lblCpfDoProp.setText(cpf);

        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }

    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnAtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClientesActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtCpf.setText("");
        txtEndereco.setText("");
    }//GEN-LAST:event_btnAtualizarClientesActionPerformed

    private void btnExcluirLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLinhaActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tblClientes.getSelectedRow();
        
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada para excluir");
        } else{
            DefaultTableModel tabelaCliente = (DefaultTableModel) tblClientes.getModel();
            
            tabelaCliente.removeRow(linhaSelecionada);
        }
    }//GEN-LAST:event_btnExcluirLinhaActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        // TODO add your handling code here:
            try {
            String cpf = lblCpfDoProp.getText();
            String tipo = comboTipoConta.getSelectedItem().toString();
            double saldo = Double.parseDouble(txtSaldo.getText());

            Cliente cliente = banco.buscarCliente(cpf);

            Conta contaCriada = banco.abrirConta(cliente, tipo, saldo);

            // Adicionar na tabela
            DefaultTableModel modelo = (DefaultTableModel) tblConta.getModel();
            Object[] linha = { contaCriada.getNumero(), tipo, cpf, saldo };
            modelo.addRow(linha);

            JOptionPane.showMessageDialog(this, "Conta criada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void comboNomeProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNomeProprietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNomeProprietarioActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void comboNomeProprietarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNomeProprietarioItemStateChanged
        // TODO add your handling code here:
        int index = comboNomeProprietario.getSelectedIndex();
    
    if (index >= 0 && index < listaDeCpfs.size()) {
        lblCpfDoProp.setText(listaDeCpfs.get(index));
    }
    }//GEN-LAST:event_comboNomeProprietarioItemStateChanged

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        try {
            String numero = txtContaSaque.getText().trim();
            double valor = Double.parseDouble(txtValorSaque.getText());

            banco.realizarSaque(numero, valor);

            Conta contaAtualizada = banco.buscarConta(numero);

            String comprovante = banco.gerarComprovante(
                    "Saque",
                    contaAtualizada,
                    null,
                    valor
            );

            JOptionPane.showMessageDialog(this, comprovante);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        try {
            String origem = txtContaOrigem.getText().trim();
            String destino = txtContaDestino.getText().trim();
            double valor = Double.parseDouble(txtValorTransferencia.getText());

            banco.realizarTransferencia(origem, destino, valor);

            // rebuscar contas atualizadas
            Conta contaOrigemAtualizada = banco.buscarConta(origem);
            Conta contaDestinoAtualizada = banco.buscarConta(destino);

            String comprovante = banco.gerarComprovante(
                    "Transferência",
                    contaOrigemAtualizada,
                    contaDestinoAtualizada,
                    valor
            );

            JOptionPane.showMessageDialog(this, comprovante);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaLog;
    private javax.swing.JButton btnAtualizarClientes;
    private javax.swing.JButton btnAtualizarConta;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnExcluirLinha;
    private javax.swing.JButton btnIrParaCliente;
    private javax.swing.JButton btnIrParaConta;
    private javax.swing.JButton btnIrParaOp;
    private javax.swing.JButton btnIrParaSobre;
    private javax.swing.JButton btnProximaPagina;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVoltarPagina;
    private javax.swing.JComboBox<String> comboNomeProprietario;
    private javax.swing.JComboBox<String> comboTipoConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCpfDoProp;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlBarraEsquerda;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlConta;
    private javax.swing.JPanel pnlOperacoes;
    private javax.swing.JPanel pnlSobre;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTabbedPane tabPaineis;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblConta;
    private javax.swing.JTextField txtContaDeposito;
    private javax.swing.JTextField txtContaDestino;
    private javax.swing.JTextField txtContaOrigem;
    private javax.swing.JTextField txtContaSaque;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValorDeposito;
    private javax.swing.JTextField txtValorSaque;
    private javax.swing.JTextField txtValorTransferencia;
    // End of variables declaration//GEN-END:variables
}
