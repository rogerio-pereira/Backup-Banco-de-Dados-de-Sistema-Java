/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.colmeiatech.BackupSistemas.control;

import br.com.colmeiatech.BackupSistemas.model.Conexao;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogério Eduardo Pereira <rogerio@groupsofter.com.br>
 * @version 1.0
 */
public class ControladorBackup {
    
    public void realizaBackup(String caminho) throws IOException
    {
        HashMap config          = Conexao.getConfigBD();
        Runtime	bckp            = Runtime.getRuntime(); 
        File	arquivo         = new File(caminho); 
        boolean realizaBackup   = verificaArquivo(arquivo);
        
        if(realizaBackup == true)
        {
            /*if(config.get("password") == null)
            {*/
                bckp.exec("cmd /c util\\mysqldump.exe -u "+config.get("user")+" -h "+config.get("server")+" "+config.get("database")+" > \""+arquivo+"\"");
            /*}
            else
            {
                bckp.exec("cmd /c util\\mysqldump.exe -u "+config.get("user")+" -p "+config.get("password")+" -h "+config.get("server")+" "+config.get("database")+" > \""+arquivo+"\"");
            }*/
        }
    }
    
    private boolean verificaArquivo(File arquivo)
    {
        if(arquivo.exists())
        {
            //Exibe Confirmação
            Object[] options = { "Sim", "Não" };
            int opcao = JOptionPane.showOptionDialog	(
                                                            null,
                                                            "Este arquivo já existe. Quer sobreescrever este arquivo?",	
                                                            "Atenção!!!",
                                                            JOptionPane.YES_NO_OPTION, 
                                                            JOptionPane.QUESTION_MESSAGE, 
                                                            null,
                                                            options, 
                                                            options[0]
                                                        );
            //Se a confirmação for sim
            if (opcao == JOptionPane.NO_OPTION) 
                return false;
        }
        
        return true;
    }
}
