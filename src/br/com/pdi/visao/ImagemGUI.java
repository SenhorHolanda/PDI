package br.com.pdi.visao;

import br.com.pdi.dominio.Imagem;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 * Esta classe armazena dados e implementa o comportamento comuns a
 * imagens exibidas na interface gráfica do software da disciplina "Tópicos 
 * Especiais em Informática" - Processamento Digital de Imagens.
 *
 * @author Leandro Luque (Professor) - leandro.luque@gmail.com
 * @version 1.0
 */
public class ImagemGUI extends Imagem {

    static ImagemGUI montarImagem(int[][][] canais) {
        int largura = canais[0].length;
        int altura = canais[0][0].length;
        int r, g, b;
        
        ImagemGUI imagem = new ImagemGUI(largura, altura);
        
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                r = canais[Imagem.RED][x][y];
                g = canais[Imagem.GREEN][x][y];
                b = canais[Imagem.BLUE][x][y];
                imagem.setRGB(x, y, r, g, b);
            }
        }
        return imagem;
    }
   
    /**
     * JLabel onde a imagem foi desenhada.
     */
    private JLabel conteiner;

    /**
     * Janela onde a imagem foi desenhada.
     */
    private JanelaImagem janela;

    /**
     * Nome da imagem (não precisa ser igual ao nome do arquivo, pois a imagem pode ainda
     * não ter sido salvada - como uma imagem criada por meio de uma técnica de PDI).
     */
    private String nome;

    // Construtores.
    /**
     * Cria uma nova imagem baseada na especificada.
     * @param imagem imagem.
     */
    public ImagemGUI(BufferedImage imagem) {
        super(imagem);
    }

    /**
     * Cria uma nova imagem baseada na especificada e com o nome especificado.
     * @param nome nome da imagem.
     * @param imagem imagem.
     */
    public ImagemGUI(String nome, BufferedImage imagem) {
        super(imagem);
        setNome(nome);
    }    

    /**
     * Cria uma nova imagem baseada na especificada e com o nome especificado.
     * @param nome nome da imagem.
     * @param imagem imagem.
     */
    public ImagemGUI(String nome, Imagem imagem) {
        super(imagem);
        setNome(nome);
    }
    
    /**
     * Cria uma nova imagem com a largura e altura especificadas.
     * @param largura largura da imagem.
     * @param altura altura da imagem.
     */
    public ImagemGUI(int largura, int altura) {
        super(largura, altura);
    }
    
     /**
     * Cria uma nova imagem com a largura e altura especificadas.
     * @param largura largura da imagem.
     * @param altura altura da imagem.
     */
    public ImagemGUI(String nome, int largura, int altura) {
        super(largura, altura);
        setNome(nome);
    }
    
    
    // Métodos de acesso.
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public JLabel getConteiner() { return conteiner; }
    public void setConteiner(JLabel conteiner) { this.conteiner = conteiner; }
    public void setJanela(JanelaImagem janela) { this.janela = janela; }
    public JanelaImagem getJanela() { return janela; }
    
}
