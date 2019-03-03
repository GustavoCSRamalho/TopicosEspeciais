package org.gustavo.modelos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Funcionario extends Pessoa{
	
	public  String numeroCarteiraDetrabalho = "65487131";
	
	public String nome = "josé";
	
	public int idade = 10;
	
	@Autowired
	public Endereco endereco;
	

}
