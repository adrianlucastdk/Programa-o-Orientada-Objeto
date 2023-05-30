
package com.mycompany.armazenavel;


public class ArquivoCache implements Armazenavel{
        Salvar salvar = new Salvar();
        Carregar carregar = new Carregar();
        
        salvar.salvar();
        carregar.carregar();
}
