package br.com.phdss;

/**
 * Baixei o ACBrMonitor 0.9.14 atraves do endereco
 * http://sourceforge.net/projects/acbr/files/ACBrMonitor/ACBrMonitor Atual/
 * Testei com ECF Daruma FS600, funcionou perfeitamente bem !!! 
 * (09/11/2012 11:15)
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class ECFTeste {
    
    public static void main(String[] args) throws Exception {
        ECF.conectar("localhost", 3434);
        ECF.ativar();
        ECF.enviar(EComandoECF.ECF_LeituraX);
        ECF.desativar();
    }
    
}
