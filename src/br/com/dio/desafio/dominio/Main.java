package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(7);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMarcelo = new Dev();
		devMarcelo.setNome("Marcelo");
		devMarcelo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devMarcelo.getConteudosInscritos());
		
		devMarcelo.progredir();
		System.out.println("-");
		
		System.out.println("Conteudos Inscritos" + devMarcelo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devMarcelo.getConteudosConcluídos());
		
		System.out.println("------------");
		
		Dev devJulia = new Dev();
		devJulia.setNome("Julia");
		devJulia.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devJulia.getConteudosInscritos());
		
		devJulia.progredir();
		System.out.println("-");
		
		System.out.println("Conteudos Inscritos" + devJulia.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devJulia.getConteudosConcluídos());
		
	}
	
}
