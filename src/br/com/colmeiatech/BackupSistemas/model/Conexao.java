/*
 * Copyright (C) 2016 Rogério Pereira
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.colmeiatech.BackupSistemas.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * Controle referente a conexão ao banco de dados
 * 
 * @author Rogério Eduardo Pereira <rogerio@groupsofter.com.br>
 * @version 1.0
 */
public class Conexao 
{
    /**
     * Obtem as configuracoes do Banco de dados
     * 
     * @return HashMap HashMap de Configurações
     */
   public static HashMap getConfigBD()
   {
        Map         cfg         = new HashMap();
        Properties	prop		= new Properties();
        InputStream input		= null;
        String		show_sql	= new String();
        String		user		= new String();
        String		password	= new String();
        String		server		= new String();
        String		port		= new String();
        String		database	= new String();

        try
        {
            //Abre arquivo de configurações
            input = new FileInputStream("config/bd_config.properties");

            //Obtem as informações do arquivo
            prop.load(input);

            //Seta as propriedades
            show_sql    = prop.getProperty("show_sql");
            user        = prop.getProperty("user");
            password    = prop.getProperty("password");
            server      = prop.getProperty("server");
            database    = prop.getProperty("database");

            //Mapeia as propriedades
            cfg.put("user",     user);
            cfg.put("password", password);
            cfg.put("server",   server);
            cfg.put("database", database);
        }
        catch (IOException e)
        {
            return null;
        }
        finally
        {
            if (input != null) 
            {
                try 
                {
                    input.close();
                } 
                catch (IOException e) 
                {
                    return null;
                }
            }
        }

        return (HashMap)cfg;
    }
}
