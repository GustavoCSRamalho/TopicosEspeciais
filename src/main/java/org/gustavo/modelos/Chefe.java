package org.gustavo.modelos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("chefe")
public class Chefe extends Pessoa{
	
	public int idade = 40;
	
	public String nomeDaEmpresa = "TelexFree";
	
	public String nome = "Rodolfo";
	
	@Autowired
	public Endereco endereco;

}
