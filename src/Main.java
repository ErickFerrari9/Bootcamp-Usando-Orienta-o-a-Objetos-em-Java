package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java Básico");
        curso1.setDescricao("Aprenda os fundamentos da linguagem Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript Moderno");
        curso2.setDescricao("Domine JavaScript para desenvolvimento web.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira em Java");
        mentoria.setDescricao("Sessão de mentoria focada em crescimento profissional na área Java.");
        mentoria.setData(LocalDate.now());

        // --- Create Bootcamp ---
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp: Java e IA na Europa");
        bootcamp.setDescricao("Um programa intensivo para desenvolvedores Java com foco em Inteligência Artificial.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("====== Detalhes do Bootcamp ======");
        System.out.println("Nome do Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Data de Início: " + bootcamp.getDataInicial());
        System.out.println("Data de Término Estimada: " + bootcamp.getDataFinal());
        System.out.println("\n--- Conteúdos Oferecidos no Bootcamp ---");
        bootcamp.getConteudos().forEach(conteudo -> System.out.println("- " + conteudo.getTitulo() + " (" + conteudo.getClass().getSimpleName() + ")"));
        System.out.println("==================================\n");

        // --- Developer: Maria ---
        Dev devMaria = new Dev();
        devMaria.setNome("Maria Silva");
        System.out.println("--- Perfil do Desenvolvedor: " + devMaria.getNome() + " ---");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Maria se inscreveu no Bootcamp: " + bootcamp.getNome());
        System.out.println("Conteúdos Atuais Inscritos de " + devMaria.getNome() + ": " + devMaria.getConteudosInscritos().stream().map(c -> c.getTitulo()).collect(java.util.stream.Collectors.joining(", ")));

        System.out.println("\nMaria está progredindo no Bootcamp...");
        devMaria.progredir(); // Completes 1st content
        System.out.println(devMaria.getNome() + " concluiu um conteúdo.");
        devMaria.progredir(); // Completes 2nd content
        System.out.println(devMaria.getNome() + " concluiu mais um conteúdo.");
        devMaria.progredir(); // Tries to progress again (will show error as only 3 contents)

        System.out.println("\n--- Situação de " + devMaria.getNome() + " após progredir ---");
        System.out.println("Conteúdos Ainda Inscritos: " + devMaria.getConteudosInscritos().stream().map(c -> c.getTitulo()).collect(java.util.stream.Collectors.joining(", ")));
        System.out.println("Conteúdos Concluídos por " + devMaria.getNome() + ": " + devMaria.getConteudosConcluidos().stream().map(c -> c.getTitulo()).collect(java.util.stream.Collectors.joining(", ")));
        System.out.printf("Total de XP de " + devMaria.getNome() + ": %.2f XP\n", devMaria.calcularTotalXp());
        System.out.println("-----------------------------------\n");

        // --- Developer: João ---
        Dev devJoao = new Dev();
        devJoao.setNome("João Oliveira");
        System.out.println("--- Perfil do Desenvolvedor: " + devJoao.getNome() + " ---");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("João se inscreveu no Bootcamp: " + bootcamp.getNome());
        System.out.println("Conteúdos Atuais Inscritos de " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos().stream().map(c -> c.getTitulo()).collect(java.util.stream.Collectors.joining(", ")));

        System.out.println("\nJoão está progredindo no Bootcamp...");
        devJoao.progredir(); // Completes 1st content
        System.out.println(devJoao.getNome() + " concluiu um conteúdo.");
        devJoao.progredir(); // Completes 2nd content
        System.out.println(devJoao.getNome() + " concluiu mais um conteúdo.");
        devJoao.progredir(); // Completes 3rd content
        System.out.println(devJoao.getNome() + " concluiu o último conteúdo.");


        System.out.println("\n--- Situação de " + devJoao.getNome() + " após progredir ---");
        System.out.println("Conteúdos Ainda Inscritos: " + (devJoao.getConteudosInscritos().isEmpty() ? "Nenhum" : devJoao.getConteudosInscritos().stream().map(c -> c.getTitulo()).collect(java.util.stream.Collectors.joining(", "))));
        System.out.println("Conteúdos Concluídos por " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos().stream().map(c -> c.getTitulo()).collect(java.util.stream.Collectors.joining(", ")));
        System.out.printf("Total de XP de " + devJoao.getNome() + ": %.2f XP\n", devJoao.calcularTotalXp());
        System.out.println("-----------------------------------\n");
    }
}
