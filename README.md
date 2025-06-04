# Desafio DIO: Abstraindo um Bootcamp com Java 🚀
Este projeto é uma solução do desafio de abstração de um Bootcamp da Digital Innovation One (DIO), desenvolvido em Java. Ele simula a dinâmica de um bootcamp de programação, com desenvolvedores se inscrevendo em conteúdos (cursos e mentorias), progredindo através deles e acumulando experiência (XP).

## 📋 Visão Geral
O projeto modela as principais entidades de um bootcamp:

Bootcamp: Representa o programa de treinamento completo, com nome, descrição, datas de início e fim, e uma coleção de conteúdos (cursos e mentorias).
Conteúdo: Uma classe abstrata que define o esqueleto para itens que podem ser aprendidos, como cursos e mentorias. Possui título, descrição e um método abstrato para calcular o XP.
Curso: Um tipo de Conteudo com uma cargaHoraria específica. O XP de um curso é calculado com base nessa carga horária.
Mentoria: Outro tipo de Conteudo, que inclui uma data específica. Mentorias concedem um XP fixo.
Dev (Desenvolvedor): O participante do bootcamp. Pode se inscrever em um bootcamp, progredir nos conteúdos inscritos e calcular seu XP total.

## ✨ Funcionalidades
Criação de Conteúdos: Crie diferentes tipos de conteúdos como Cursos e Mentorias.
Definição de Bootcamps: Organize conteúdos em Bootcamps com datas de início e fim.
Inscrição de Desenvolvedores: Desenvolvedores podem se inscrever em Bootcamps, adicionando seus conteúdos aos seus itens "inscritos".
Progressão: Desenvolvedores podem "progredir", movendo um conteúdo de seus itens "inscritos" para "concluídos".
Cálculo de XP: Cada conteúdo concluído contribui para o XP total do desenvolvedor.
Controle de Conteúdos: Gerenciamento de conteúdos inscritos e concluídos para cada desenvolvedor.

## 🛠️ Tecnologias Utilizadas
Java 11+
Conceitos de POO: Herança, Polimorfismo, Abstração, Encapsulamento.
Coleções Java: Set ( HashSet, LinkedHashSet) para gerenciar conteúdos e desenvolvedores.
API de Data e Hora (java.time): Para manipulação de datas de início e fim do bootcamp, e datas de mentorias.

