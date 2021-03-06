/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import gerenciartelas.GerenciadorDeTelas;
import javax.swing.JDesktopPane;
import view.telasaida.TelaAlterarSaida;
import view.telasaida.TelaCadastrarSaida;
import view.telasaida.TelaConsultarSaida;
import view.telasaida.TelaExcluirSaida;
import view.telascategoria.TelaAlterarCategoria;
import view.telascategoria.TelaCadastroCategoria;
import view.telascategoria.TelaConsultarCategoria;
import view.telascategoria.TelaExcluirCategoria;
import view.telasdistribuidoras.TelaAlterarDistribuidora;
import view.telasdistribuidoras.TelaCadastrarDistribuidora;
import view.telasdistribuidoras.TelaConsultarDistribuidora;
import view.telasdistribuidoras.TelaExcluirDistribuidora;
import view.telasfornecedora.TelaAlterarFornecedora;
import view.telasfornecedora.TelaCadastrarFornecedora;
import view.telasfornecedora.TelaConsultarFornecedora;
import view.telasfornecedora.TelaExcluirFornecedora;
import view.telaslote.TelaAlterarLote;
import view.telaslote.TelaCadastrarLote;
import view.telaslote.TelaConsultarLote;
import view.telaslote.TelaExcluirLote;
import view.telasproduto.TelaAlterarProduto;
import view.telasproduto.TelaCadastrarProduto;
import view.telasproduto.TelaConsultarProduto;
import view.telasproduto.TelaExcluirProduto;

/**
 *
 * @author emanu
 */
public class TelaInicial extends javax.swing.JFrame {
    private TelaCadastroCategoria cadastroCategoria = null;
    private TelaAlterarCategoria alterarCategoria = new TelaAlterarCategoria();
    private TelaConsultarCategoria consultarCategoria = new TelaConsultarCategoria();
    private TelaExcluirCategoria excluirCategoria = new TelaExcluirCategoria();
    private TelaCadastrarProduto cadastrarProduto = null;
    private TelaConsultarProduto consultarProduto = new TelaConsultarProduto();
    private TelaAlterarProduto alterarProduto = new TelaAlterarProduto();
    private TelaExcluirProduto excluirProduto = new TelaExcluirProduto();
    private TelaCadastrarFornecedora cadastrarFornecedora = new TelaCadastrarFornecedora();
    private TelaConsultarFornecedora consultarFornecedora = new TelaConsultarFornecedora();
    private TelaAlterarFornecedora alterarFornecedora = new TelaAlterarFornecedora();
    private TelaExcluirFornecedora excluirFornecedora = new TelaExcluirFornecedora();
    private TelaCadastrarDistribuidora cadastrarDistribuidora = new TelaCadastrarDistribuidora();
    private TelaConsultarDistribuidora consultarDistribuidora = new TelaConsultarDistribuidora();
    private TelaAlterarDistribuidora alterarDistribuidora = new TelaAlterarDistribuidora();
    private TelaExcluirDistribuidora excluirDistribuidora = new TelaExcluirDistribuidora();
    private TelaCadastrarLote cadastrarLote = new TelaCadastrarLote();
    private TelaConsultarLote consultarLote = new TelaConsultarLote();
    private TelaAlterarLote alterarLote = new TelaAlterarLote();
    private TelaExcluirLote excluirLote = new TelaExcluirLote();
    private TelaCadastrarSaida cadastrarSaida = new TelaCadastrarSaida();
    private TelaConsultarSaida consultarSaida = new TelaConsultarSaida();
    private TelaAlterarSaida alterarSaida = null;
    private TelaExcluirSaida excluirSaida = null;
    private TelaVerificarEstoque verficarEstoque = null;
    GerenciadorDeTelas gerenciadorDeTelas;
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents(); 
        this.gerenciadorDeTelas = new GerenciadorDeTelas(desktopPane);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnCadastrarProduto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCastrarProduto = new javax.swing.JMenuItem();
        menuCategoriaCadastro = new javax.swing.JMenuItem();
        menuCadastrarFornecedora = new javax.swing.JMenuItem();
        menuCadastrarDistribuidora = new javax.swing.JMenuItem();
        menuCadastrarLote = new javax.swing.JMenuItem();
        menuCadastrarSaida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuConsultarLote = new javax.swing.JMenuItem();
        menuConsultarCategoria = new javax.swing.JMenuItem();
        menuConsultarProduto = new javax.swing.JMenuItem();
        menuConsultarDistribuidora = new javax.swing.JMenuItem();
        menuConsultarFornecedora = new javax.swing.JMenuItem();
        menuConsultarSaida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuAlterarLote = new javax.swing.JMenuItem();
        menuAlterarDistribuidora = new javax.swing.JMenuItem();
        menuAlterarProduto = new javax.swing.JMenuItem();
        menuCategoriaAlterar = new javax.swing.JMenuItem();
        menuAlterarFornecedora = new javax.swing.JMenuItem();
        menuAlterarSaida = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuExcluirLote = new javax.swing.JMenuItem();
        menuExcluirDistribuidora = new javax.swing.JMenuItem();
        menuExcluirProduto = new javax.swing.JMenuItem();
        menuExcluirCategoria = new javax.swing.JMenuItem();
        menuExcluirFornecedora = new javax.swing.JMenuItem();
        menuExcluirSaida = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        menuVerificarEstoque = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_product-hunt_1608428.png"))); // NOI18N
        btnCadastrarProduto.setText("Produto");
        btnCadastrarProduto.setFocusable(false);
        btnCadastrarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrarProduto);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Attribute_category_label_shop_price_price_tag_tag_1886315.png"))); // NOI18N
        jButton2.setText("Categoria");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_truck_115775.png"))); // NOI18N
        jButton3.setText("Fornecedora");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/truck.png"))); // NOI18N
        jButton4.setText("Distribuidora");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_entoni_dropbox_330867.png"))); // NOI18N
        jButton5.setText("Lote");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));
        desktopPane.setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuCastrarProduto.setText("Produto");
        menuCastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCastrarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(menuCastrarProduto);

        menuCategoriaCadastro.setText("Categoria");
        menuCategoriaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(menuCategoriaCadastro);

        menuCadastrarFornecedora.setText("Fornecedora");
        menuCadastrarFornecedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFornecedoraActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastrarFornecedora);

        menuCadastrarDistribuidora.setText("Distribuidora");
        menuCadastrarDistribuidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarDistribuidoraActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastrarDistribuidora);

        menuCadastrarLote.setText("Lote");
        menuCadastrarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarLoteActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastrarLote);

        menuCadastrarSaida.setText("Saída");
        menuCadastrarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarSaidaActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastrarSaida);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        menuConsultarLote.setText("Lote");
        menuConsultarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarLoteActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultarLote);

        menuConsultarCategoria.setText("Categoria");
        menuConsultarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultarCategoria);

        menuConsultarProduto.setText("Produto");
        menuConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultarProduto);

        menuConsultarDistribuidora.setText("Distribuidora");
        menuConsultarDistribuidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarDistribuidoraActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultarDistribuidora);

        menuConsultarFornecedora.setText("Fornecedora");
        menuConsultarFornecedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarFornecedoraActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultarFornecedora);

        menuConsultarSaida.setText("Saída");
        menuConsultarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarSaidaActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsultarSaida);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Alterar");

        menuAlterarLote.setText("Lote");
        menuAlterarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarLoteActionPerformed(evt);
            }
        });
        jMenu3.add(menuAlterarLote);

        menuAlterarDistribuidora.setText("Distribuidora");
        menuAlterarDistribuidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarDistribuidoraActionPerformed(evt);
            }
        });
        jMenu3.add(menuAlterarDistribuidora);

        menuAlterarProduto.setText("Produto");
        menuAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(menuAlterarProduto);

        menuCategoriaAlterar.setText("Categoria");
        menuCategoriaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaAlterarActionPerformed(evt);
            }
        });
        jMenu3.add(menuCategoriaAlterar);

        menuAlterarFornecedora.setText("Fornecedora");
        menuAlterarFornecedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarFornecedoraActionPerformed(evt);
            }
        });
        jMenu3.add(menuAlterarFornecedora);

        menuAlterarSaida.setText("Saída");
        menuAlterarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarSaidaActionPerformed(evt);
            }
        });
        jMenu3.add(menuAlterarSaida);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Excluir");

        menuExcluirLote.setText("Lote");
        menuExcluirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirLoteActionPerformed(evt);
            }
        });
        jMenu4.add(menuExcluirLote);

        menuExcluirDistribuidora.setText("Distribuidora");
        menuExcluirDistribuidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirDistribuidoraActionPerformed(evt);
            }
        });
        jMenu4.add(menuExcluirDistribuidora);

        menuExcluirProduto.setText("Produto");
        menuExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirProdutoActionPerformed(evt);
            }
        });
        jMenu4.add(menuExcluirProduto);

        menuExcluirCategoria.setText("Categoria");
        menuExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(menuExcluirCategoria);

        menuExcluirFornecedora.setText("Fornecedora");
        menuExcluirFornecedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirFornecedoraActionPerformed(evt);
            }
        });
        jMenu4.add(menuExcluirFornecedora);

        menuExcluirSaida.setText("Saida");
        menuExcluirSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirSaidaActionPerformed(evt);
            }
        });
        jMenu4.add(menuExcluirSaida);

        jMenuBar1.add(jMenu4);

        menuEstoque.setText("Estoque");
        menuEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEstoqueMouseClicked(evt);
            }
        });
        menuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstoqueActionPerformed(evt);
            }
        });

        menuVerificarEstoque.setText("Verficiar Estoque");
        menuVerificarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerificarEstoqueActionPerformed(evt);
            }
        });
        menuEstoque.add(menuVerificarEstoque);

        jMenuBar1.add(menuEstoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCastrarProdutoActionPerformed
        // TODO add your handling code here:
        cadastrarProduto = new TelaCadastrarProduto();
        this.gerenciadorDeTelas.abrirJanelas(cadastrarProduto);
    }//GEN-LAST:event_menuCastrarProdutoActionPerformed

    private void menuCadastrarFornecedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFornecedoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastrarFornecedora);
    }//GEN-LAST:event_menuCadastrarFornecedoraActionPerformed

    private void menuConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarProdutoActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(consultarProduto);
    }//GEN-LAST:event_menuConsultarProdutoActionPerformed

    private void menuConsultarFornecedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarFornecedoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(consultarFornecedora);
    }//GEN-LAST:event_menuConsultarFornecedoraActionPerformed

    private void menuAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarProdutoActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(alterarProduto);
    }//GEN-LAST:event_menuAlterarProdutoActionPerformed

    private void menuAlterarFornecedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarFornecedoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(alterarFornecedora);

    }//GEN-LAST:event_menuAlterarFornecedoraActionPerformed

    private void menuExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirProdutoActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(excluirProduto);
    }//GEN-LAST:event_menuExcluirProdutoActionPerformed

    private void menuExcluirFornecedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirFornecedoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(excluirFornecedora);
    }//GEN-LAST:event_menuExcluirFornecedoraActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        cadastrarProduto = new TelaCadastrarProduto();
        this.gerenciadorDeTelas.abrirJanelas(cadastrarProduto);
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuCategoriaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaCadastroActionPerformed
        // TODO add your handling code here:
        cadastroCategoria = new TelaCadastroCategoria();
        this.gerenciadorDeTelas.abrirJanelas(cadastroCategoria);
    }//GEN-LAST:event_menuCategoriaCadastroActionPerformed

    private void menuCategoriaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaAlterarActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(alterarCategoria);
    }//GEN-LAST:event_menuCategoriaAlterarActionPerformed

    private void menuAlterarDistribuidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarDistribuidoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(alterarDistribuidora);
    }//GEN-LAST:event_menuAlterarDistribuidoraActionPerformed

    private void menuConsultarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarCategoriaActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(consultarCategoria);
    }//GEN-LAST:event_menuConsultarCategoriaActionPerformed

    private void menuExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirCategoriaActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(excluirCategoria);
    }//GEN-LAST:event_menuExcluirCategoriaActionPerformed

    private void menuCadastrarDistribuidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarDistribuidoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastrarDistribuidora);

    }//GEN-LAST:event_menuCadastrarDistribuidoraActionPerformed

    private void menuConsultarDistribuidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarDistribuidoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(consultarDistribuidora);

    }//GEN-LAST:event_menuConsultarDistribuidoraActionPerformed

    private void menuExcluirDistribuidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirDistribuidoraActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(excluirDistribuidora);
    }//GEN-LAST:event_menuExcluirDistribuidoraActionPerformed

    private void menuCadastrarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarLoteActionPerformed
        // TODO add your handling code here:
                this.gerenciadorDeTelas.abrirJanelas(cadastrarLote);

    }//GEN-LAST:event_menuCadastrarLoteActionPerformed

    private void menuConsultarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarLoteActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(consultarLote);
    }//GEN-LAST:event_menuConsultarLoteActionPerformed

    private void menuAlterarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarLoteActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(alterarLote);
    }//GEN-LAST:event_menuAlterarLoteActionPerformed

    private void menuExcluirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirLoteActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(excluirLote);
    }//GEN-LAST:event_menuExcluirLoteActionPerformed

    private void menuCadastrarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarSaidaActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastrarSaida);
    }//GEN-LAST:event_menuCadastrarSaidaActionPerformed

    private void menuConsultarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarSaidaActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(consultarSaida);
    }//GEN-LAST:event_menuConsultarSaidaActionPerformed

    private void menuAlterarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarSaidaActionPerformed
        // TODO add your handling code here:
        alterarSaida = new TelaAlterarSaida();
        this.gerenciadorDeTelas.abrirJanelas(alterarSaida);
    }//GEN-LAST:event_menuAlterarSaidaActionPerformed

    private void menuExcluirSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirSaidaActionPerformed
        // TODO add your handling code here:
        excluirSaida = new TelaExcluirSaida();
        this.gerenciadorDeTelas.abrirJanelas(excluirSaida);
    }//GEN-LAST:event_menuExcluirSaidaActionPerformed

    private void menuEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEstoqueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEstoqueMouseClicked

    private void menuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstoqueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuEstoqueActionPerformed

    private void menuVerificarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerificarEstoqueActionPerformed
        // TODO add your handling code here:
        verficarEstoque = new TelaVerificarEstoque();
        this.gerenciadorDeTelas.abrirJanelas(verficarEstoque);
    }//GEN-LAST:event_menuVerificarEstoqueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastroCategoria);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastrarFornecedora);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastrarDistribuidora);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.gerenciadorDeTelas.abrirJanelas(cadastrarLote);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuAlterarDistribuidora;
    private javax.swing.JMenuItem menuAlterarFornecedora;
    private javax.swing.JMenuItem menuAlterarLote;
    private javax.swing.JMenuItem menuAlterarProduto;
    private javax.swing.JMenuItem menuAlterarSaida;
    private javax.swing.JMenuItem menuCadastrarDistribuidora;
    private javax.swing.JMenuItem menuCadastrarFornecedora;
    private javax.swing.JMenuItem menuCadastrarLote;
    private javax.swing.JMenuItem menuCadastrarSaida;
    private javax.swing.JMenuItem menuCastrarProduto;
    private javax.swing.JMenuItem menuCategoriaAlterar;
    private javax.swing.JMenuItem menuCategoriaCadastro;
    private javax.swing.JMenuItem menuConsultarCategoria;
    private javax.swing.JMenuItem menuConsultarDistribuidora;
    private javax.swing.JMenuItem menuConsultarFornecedora;
    private javax.swing.JMenuItem menuConsultarLote;
    private javax.swing.JMenuItem menuConsultarProduto;
    private javax.swing.JMenuItem menuConsultarSaida;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenuItem menuExcluirCategoria;
    private javax.swing.JMenuItem menuExcluirDistribuidora;
    private javax.swing.JMenuItem menuExcluirFornecedora;
    private javax.swing.JMenuItem menuExcluirLote;
    private javax.swing.JMenuItem menuExcluirProduto;
    private javax.swing.JMenuItem menuExcluirSaida;
    private javax.swing.JMenuItem menuVerificarEstoque;
    // End of variables declaration//GEN-END:variables
}
