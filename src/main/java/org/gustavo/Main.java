package org.gustavo;

import org.gustavo.configuracao.Configuracao;
import org.gustavo.modelos.Chefe;
import org.gustavo.modelos.Funcionario;
import org.gustavo.modelos.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@ComponentScan(basePackages = {"org.gustavo"})
public class Main {
	
	
	public static void main(String[] args){
		
		//Integrantes : 
		//	Gustavo de Camargo da Silva Ramalho
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracao.class);
		
		Pessoa pessoa = context.getBean(Funcionario.class);
		System.out.println("Funcionario : ");
		System.out.println("nome : "+((Funcionario)pessoa).nome);
		System.out.println("idade : "+((Funcionario)pessoa).idade);
		System.out.println("numero da carteira de trabalho : "+((Funcionario)pessoa).numeroCarteiraDetrabalho);
		System.out.println("Rua : "+((Funcionario)pessoa).endereco.rua + " numero : "
		+((Funcionario)pessoa).endereco.numero + " tipo : "+((Funcionario)pessoa).endereco.tipo);
		System.out.println("Tempo de moradia : "+((Funcionario)pessoa).endereco.tempoDeMoradiaEmDias);
		
		System.out.println();
		pessoa = (Pessoa) context.getBean("chefe");
		System.out.println("Chefe : ");
		System.out.println("Nome : "+((Chefe)pessoa).nome);
		System.out.println("Idade : "+((Chefe)pessoa).idade);
		System.out.println("Empresa : "+((Chefe)pessoa).nomeDaEmpresa);
		System.out.println("Chefe rua : "+((Chefe)pessoa).endereco.rua+" numero :  "
		+((Chefe)pessoa).endereco.numero + " tipo : "+((Chefe)pessoa).endereco.tipo);
		System.out.println("Tempo de moradia : "+((Chefe)pessoa).endereco.tempoDeMoradiaEmDias);
	}

}
