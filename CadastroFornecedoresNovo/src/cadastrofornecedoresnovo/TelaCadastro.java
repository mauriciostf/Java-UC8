package cadastrofornecedoresnovo;

import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        iniciarTipoPessoa();
        liberarCamposFormulario();
        limparInibirCamposFormulario();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTotal = new javax.swing.JPanel();
        pnlLogotipo = new javax.swing.JPanel();
        lblLogotipo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTutulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        pnlDataHora = new javax.swing.JPanel();
        lblDataHora = new javax.swing.JLabel();
        pnlDadosBasicos = new javax.swing.JPanel();
        lblNomeFornecedor = new javax.swing.JLabel();
        txtfNomeFornecedor = new javax.swing.JTextField();
        btnPessoaFisica = new javax.swing.JRadioButton();
        btnPessoaJuridica = new javax.swing.JRadioButton();
        lblCpf = new javax.swing.JLabel();
        lblProdutoPrincipal = new javax.swing.JLabel();
        txtfPrincipalProduto = new javax.swing.JTextField();
        txtfCpf = new javax.swing.JFormattedTextField();
        pnlDadosContato = new javax.swing.JPanel();
        lblCelular = new javax.swing.JLabel();
        txtfCelular = new javax.swing.JFormattedTextField();
        lblTelFixo = new javax.swing.JLabel();
        txtfTelFixo = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JFormattedTextField();
        lblTelComercial = new javax.swing.JLabel();
        txtfTelComercial = new javax.swing.JFormattedTextField();
        lblTelRecado = new javax.swing.JLabel();
        jtxtTelRecado = new javax.swing.JFormattedTextField();
        lblNomeCtt = new javax.swing.JLabel();
        jtxtNomeCtt = new javax.swing.JFormattedTextField();
        pnlDadosEndereco = new javax.swing.JPanel();
        lblCep = new javax.swing.JLabel();
        jtxtCep = new javax.swing.JFormattedTextField();
        lblEndereco = new javax.swing.JLabel();
        jtxtEndereco = new javax.swing.JFormattedTextField();
        lblNumero = new javax.swing.JLabel();
        jtxtNumero = new javax.swing.JFormattedTextField();
        lblBairro = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        jtxtCidade = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox<>();
        pnlDadosAdicionais = new javax.swing.JPanel();
        jSPDadosAdicionais = new javax.swing.JScrollPane();
        jTADadosAdicionais = new javax.swing.JTextArea();
        pnlBotoes = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogotipo.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\LOGOTIPO.png")); // NOI18N

        javax.swing.GroupLayout pnlLogotipoLayout = new javax.swing.GroupLayout(pnlLogotipo);
        pnlLogotipo.setLayout(pnlLogotipoLayout);
        pnlLogotipoLayout.setHorizontalGroup(
            pnlLogotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogotipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogotipo)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlLogotipoLayout.setVerticalGroup(
            pnlLogotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogotipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogotipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTutulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTutulo.setText("Cadastro de Fornecedores -TDS");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSubtitulo.setText("Cadastre e Edite os dados dos seus fornecedores e parceiros de negócios!");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTutulo))
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblSubtitulo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblTutulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo))
        );

        lblDataHora.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDataHora.setText("DATA - HORA");

        javax.swing.GroupLayout pnlDataHoraLayout = new javax.swing.GroupLayout(pnlDataHora);
        pnlDataHora.setLayout(pnlDataHoraLayout);
        pnlDataHoraLayout.setHorizontalGroup(
            pnlDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataHora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataHoraLayout.setVerticalGroup(
            pnlDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataHoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDataHora)
                .addGap(43, 43, 43))
        );

        pnlDadosBasicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Dados Básicos"), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        lblNomeFornecedor.setText("Nome Fornecedor:");

        btnPessoaFisica.setText("Pessoa Física");
        btnPessoaFisica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnPessoaFisicaStateChanged(evt);
            }
        });
        btnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaFisicaActionPerformed(evt);
            }
        });

        btnPessoaJuridica.setText("Pessoa Jurídica");
        btnPessoaJuridica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnPessoaJuridicaStateChanged(evt);
            }
        });
        btnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaJuridicaActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF:");

        lblProdutoPrincipal.setText("Principal Produto Fornecido:");

        try {
            txtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosBasicosLayout = new javax.swing.GroupLayout(pnlDadosBasicos);
        pnlDadosBasicos.setLayout(pnlDadosBasicosLayout);
        pnlDadosBasicosLayout.setHorizontalGroup(
            pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                        .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeFornecedor)
                            .addComponent(txtfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblCpf))
                            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProdutoPrincipal)
                                    .addComponent(txtfPrincipalProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))
                            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtfCpf))))
                    .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                        .addComponent(btnPessoaFisica)
                        .addGap(109, 109, 109)
                        .addComponent(btnPessoaJuridica)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlDadosBasicosLayout.setVerticalGroup(
            pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFornecedor)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPessoaJuridica)
                        .addComponent(btnPessoaFisica))
                    .addComponent(lblProdutoPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfPrincipalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnlDadosContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Contato:"));

        lblCelular.setText("Celular:");

        try {
            txtfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelFixo.setText("Tel. Fixo:");

        try {
            txtfTelFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setText("E-mail:");

        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });

        lblTelComercial.setText("Tel. Comercial:");

        try {
            txtfTelComercial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelRecado.setText("Tel. Recado:");

        try {
            jtxtTelRecado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNomeCtt.setText("Nome Contato:");

        javax.swing.GroupLayout pnlDadosContatoLayout = new javax.swing.GroupLayout(pnlDadosContato);
        pnlDadosContato.setLayout(pnlDadosContatoLayout);
        pnlDadosContatoLayout.setHorizontalGroup(
            pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosContatoLayout.createSequentialGroup()
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCelular)
                    .addComponent(txtfCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(pnlDadosContatoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTelComercial))
                    .addComponent(txtfTelComercial))
                .addGap(15, 15, 15)
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosContatoLayout.createSequentialGroup()
                        .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelFixo)
                            .addComponent(lblTelRecado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtfTelFixo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jtxtTelRecado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail)
                    .addComponent(lblNomeCtt)
                    .addComponent(txtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jtxtNomeCtt))
                .addContainerGap())
        );
        pnlDadosContatoLayout.setVerticalGroup(
            pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosContatoLayout.createSequentialGroup()
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(lblTelFixo)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelComercial)
                    .addComponent(lblTelRecado)
                    .addComponent(lblNomeCtt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfTelComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTelRecado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNomeCtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDadosEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Endereço:"));

        lblCep.setText("Cep:");

        try {
            jtxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco.setText("Endereço:");

        jtxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnderecoActionPerformed(evt);
            }
        });

        lblNumero.setText("Número:");

        jtxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumeroActionPerformed(evt);
            }
        });

        lblBairro.setText("Bairro:");

        lblCidade.setText("Cidade:");

        lblEstado.setText("Estado:");

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        jCBEstado.setSelectedIndex(20);
        jCBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosEnderecoLayout = new javax.swing.GroupLayout(pnlDadosEndereco);
        pnlDadosEndereco.setLayout(pnlDadosEnderecoLayout);
        pnlDadosEnderecoLayout.setHorizontalGroup(
            pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep)
                            .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(jtxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtxtNumero)))
                    .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtxtBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade)
                            .addComponent(jtxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstado)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlDadosEnderecoLayout.setVerticalGroup(
            pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEnderecoLayout.createSequentialGroup()
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlDadosAdicionais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Adicionais:"));

        jTADadosAdicionais.setColumns(20);
        jTADadosAdicionais.setRows(5);
        jSPDadosAdicionais.setViewportView(jTADadosAdicionais);

        javax.swing.GroupLayout pnlDadosAdicionaisLayout = new javax.swing.GroupLayout(pnlDadosAdicionais);
        pnlDadosAdicionais.setLayout(pnlDadosAdicionaisLayout);
        pnlDadosAdicionaisLayout.setHorizontalGroup(
            pnlDadosAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosAdicionaisLayout.createSequentialGroup()
                .addComponent(jSPDadosAdicionais)
                .addContainerGap())
        );
        pnlDadosAdicionaisLayout.setVerticalGroup(
            pnlDadosAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosAdicionaisLayout.createSequentialGroup()
                .addComponent(jSPDadosAdicionais)
                .addContainerGap())
        );

        pnlBotoes.setLayout(new java.awt.GridLayout(1, 7, 10, 10));

        btnAtualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\UPLOAD.png")); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnAtualizar);

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\CANCELAR.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar);

        btnRemover.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\REMOVER.png")); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlBotoes.add(btnRemover);

        btnListar.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\LISTAR.png")); // NOI18N
        btnListar.setText("Listar");
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlBotoes.add(btnListar);

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\NOVO.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnNovo);

        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\SALVAR.png")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnSalvar);

        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\04503358014\\Desktop\\UC8---JAVA\\FrmCadastro\\Imagens\\SAIR.png")); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnSair);

        javax.swing.GroupLayout pnlTotalLayout = new javax.swing.GroupLayout(pnlTotal);
        pnlTotal.setLayout(pnlTotalLayout);
        pnlTotalLayout.setHorizontalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDadosBasicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                                .addComponent(pnlLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                        .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlDadosAdicionais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTotalLayout.createSequentialGroup()
                                .addComponent(pnlDadosContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlDadosEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlTotalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        pnlTotalLayout.setVerticalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pnlLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDadosBasicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDadosEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //criacao de variavel
    DadosFornecedores novoItem;
    
    private void btnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaFisicaActionPerformed

    }//GEN-LAST:event_btnPessoaFisicaActionPerformed

    private void btnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaJuridicaActionPerformed
    }//GEN-LAST:event_btnPessoaJuridicaActionPerformed


    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        //JOptionPane.showMessageDialog(null, novoItem.getNomeContato());

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jtxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEnderecoActionPerformed
    }//GEN-LAST:event_jtxtEnderecoActionPerformed

    private void jCBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEstadoActionPerformed
    }//GEN-LAST:event_jCBEstadoActionPerformed

    private void txtfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCpfActionPerformed
    }//GEN-LAST:event_txtfCpfActionPerformed

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
    }//GEN-LAST:event_txtfEmailActionPerformed

    private void jtxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumeroActionPerformed
        
    }//GEN-LAST:event_jtxtNumeroActionPerformed

    private void btnPessoaFisicaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnPessoaFisicaStateChanged

        if (btnPessoaFisica.isSelected()) {
            btnPessoaJuridica.setSelected(false);
            lblCpf.setText("CPF");
        } else {
            btnPessoaJuridica.setSelected(true);
            lblCpf.setText("CNPJ");
        }
    }//GEN-LAST:event_btnPessoaFisicaStateChanged

    private void btnPessoaJuridicaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnPessoaJuridicaStateChanged
        if (btnPessoaJuridica.isSelected()) {
            btnPessoaFisica.setSelected(false);
            lblCpf.setText("CNPJ");
        } else {
            btnPessoaFisica.setSelected(true);
            lblCpf.setText("CPF");
        }
    }//GEN-LAST:event_btnPessoaJuridicaStateChanged

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberarCamposFormulario();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparInibirCamposFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String message = "Voce deseja realmente salvar os dados?";
        int resultado = JOptionPane.showConfirmDialog(null, message);
        
        if(resultado == 0){
            
        String nomeFornecedor = txtfNomeFornecedor.getText();
        String tipoFornecedor = txtfCpf.getText();
        String principalProduto = txtfPrincipalProduto.getText();
        String celular = txtfCelular.getText();
        String telFixo = txtfTelFixo.getText();
        String email = txtfEmail.getText();
        String telComercial = txtfTelComercial.getText();
        String telRecado = jtxtTelRecado.getText();
        String nomeContato = jtxtNomeCtt.getText();
        String cep = jtxtCep.getText();
        String numero = jtxtNumero.getText();
        String bairro = jtxtBairro.getText();
        String cidade = jtxtCidade.getText();
        String estado = jCBEstado.getSelectedItem().toString();
        String dadosAdicionais = jTADadosAdicionais.getText();
       
        novoItem = new DadosFornecedores(nomeFornecedor, tipoFornecedor, principalProduto, celular, telFixo, email, telComercial, telRecado, nomeContato, cep, cep, numero, bairro, cidade, estado, dadosAdicionais);
        
        BancoForm oper = new BancoForm();
        oper.inserirItemArray(novoItem);
        
        JOptionPane.showMessageDialog(null, "Item criado com sucesso!");
        }
        else if(resultado == 1){
        JOptionPane.showMessageDialog(null, "Putz!! Que pena!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JRadioButton btnPessoaFisica;
    private javax.swing.JRadioButton btnPessoaJuridica;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JScrollPane jSPDadosAdicionais;
    private javax.swing.JTextArea jTADadosAdicionais;
    private javax.swing.JFormattedTextField jtxtBairro;
    private javax.swing.JFormattedTextField jtxtCep;
    private javax.swing.JFormattedTextField jtxtCidade;
    private javax.swing.JFormattedTextField jtxtEndereco;
    private javax.swing.JFormattedTextField jtxtNomeCtt;
    private javax.swing.JFormattedTextField jtxtNumero;
    private javax.swing.JFormattedTextField jtxtTelRecado;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblNomeCtt;
    private javax.swing.JLabel lblNomeFornecedor;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProdutoPrincipal;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTelComercial;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JLabel lblTelRecado;
    private javax.swing.JLabel lblTutulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlDadosAdicionais;
    private javax.swing.JPanel pnlDadosBasicos;
    private javax.swing.JPanel pnlDadosContato;
    private javax.swing.JPanel pnlDadosEndereco;
    private javax.swing.JPanel pnlDataHora;
    private javax.swing.JPanel pnlLogotipo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JFormattedTextField txtfCelular;
    private javax.swing.JFormattedTextField txtfCpf;
    private javax.swing.JFormattedTextField txtfEmail;
    private javax.swing.JTextField txtfNomeFornecedor;
    private javax.swing.JTextField txtfPrincipalProduto;
    private javax.swing.JFormattedTextField txtfTelComercial;
    private javax.swing.JFormattedTextField txtfTelFixo;
    // End of variables declaration//GEN-END:variables

    private void iniciarTipoPessoa() {
        btnPessoaFisica.setSelected(true);
        btnPessoaJuridica.setSelected(false);
    }

    private void liberarCamposFormulario() {
        txtfNomeFornecedor.setEnabled(true);
        txtfCelular.setEnabled(true);
        txtfCpf.setEnabled(true);
        txtfEmail.setEnabled(true);
        txtfPrincipalProduto.setEnabled(true);
        txtfTelComercial.setEnabled(true);
        txtfTelFixo.setEnabled(true);
        jtxtBairro.setEnabled(true);
        jtxtCep.setEnabled(true);
        jtxtCidade.setEnabled(true);
        jtxtEndereco.setEnabled(true);
        jtxtNomeCtt.setEnabled(true);
        jtxtNumero.setEnabled(true);
        jtxtTelRecado.setEnabled(true);
        jTADadosAdicionais.setEnabled(true);
        }

    private void limparInibirCamposFormulario() {
        txtfNomeFornecedor.setText("");
        txtfNomeFornecedor.setEnabled(false);
        txtfCelular.setText("");
        txtfCelular.setEnabled(false);
        txtfCpf.setText("");
        txtfCpf.setEnabled(false);
        txtfEmail.setText("");
        txtfEmail.setEnabled(false);
        txtfPrincipalProduto.setText("");
        txtfPrincipalProduto.setEnabled(false);
        txtfTelComercial.setText("");
        txtfTelComercial.setEnabled(false);
        txtfTelFixo.setText("");
        txtfTelFixo.setEnabled(false);
        jtxtBairro.setText("");
        jtxtBairro.setEnabled(false);
        jtxtCep.setText("");
        jtxtCep.setEnabled(false);
        jtxtCidade.setText("");
        jtxtCidade.setEnabled(false);
        jtxtEndereco.setEnabled(false);
        jtxtNomeCtt.setText("");
        jtxtNomeCtt.setEnabled(false);
        jtxtNumero.setText("");
        jtxtNumero.setEnabled(false);
        jTADadosAdicionais.setText("");
        jTADadosAdicionais.setEnabled(false);
        jtxtTelRecado.setText("");
        jtxtTelRecado.setEnabled(false);
    }
}
