package org.hibernate.orm;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.setNome("Teste");
        System.out.println("olá " + jogador.getNome());

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bd_jpa_jogador_h2");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        insereUmJogador(entityManager);

        insereVariosJogadores(entityManager);

        listarJogadores(entityManager);

        entityManager.close();

    }

    private static List<Jogador> listarJogadores(EntityManager entityManager) {
        List<Jogador> jogadores = entityManager.createQuery("select jogador from Jogador jogador")
                .getResultList();
        return jogadores;
    }

    private static void insereVariosJogadores(EntityManager entityManager) {
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(criarJogador("Fulano", "Entry", "Vasco", "Global"));
        jogadores.add(criarJogador("Ciclano", "AWP", "Loud", "Prata"));
        jogadores.add(criarJogador("Robson", "Plant", "Corinthians", "Águia"));

        entityManager.getTransaction().begin();
        for (Jogador j: jogadores) {
            entityManager.persist(j);
        }
        entityManager.getTransaction().commit();    }

    private static Jogador criarJogador(String nome, String funcao, String nomeTime, String patente) {
        Jogador novoJogador = new Jogador();
        novoJogador.setNome(nome);
        novoJogador.setFuncao(funcao);
        novoJogador.setNomeTime(nomeTime);
        novoJogador.setPatente(patente);
        return novoJogador;
    }

    private static void insereUmJogador(EntityManager entityManager) {
        Jogador fulano = criarJogador("Fulano", "AWP", "Flamengo", "Ouro");

        entityManager.getTransaction().begin();
        entityManager.persist(fulano);
        entityManager.getTransaction().commit();
    }
}