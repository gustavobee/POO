package br.edu.idp.disciplinas.poo2023_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws SQLException {

        // 1. Habilitar o driver JDBC a partir da aplicação cliente;
        //      ok

        // 2. Estabelecer uma conexão entre a aplicação cliente e servidor do banco de dados;
        String paramsConexao = "jdbc:h2:mem:testdb";
        String usuario = "";
        String senha = "";
        Connection conexao = DriverManager.getConnection(paramsConexao, usuario, senha);

        // 3. Montar, inserir e executar a consulta SQL desejada;
        String criacaoSql = "create table pessoa (id int primary key, nome varchar(150), qtdAcesso int, naturalidade varchar(75) )";
        Statement stmtC = conexao.createStatement();
        stmtC.executeUpdate(criacaoSql);
        stmtC.close();

        String insercaoSql = "insert into pessoa (id, nome, qtdAcesso, naturalidade ) values (1, 'Bee', 34, 'Sul-africano' );";
        Statement stmtI = conexao.createStatement();
        stmtI.executeUpdate(insercaoSql);
        stmtI.close();

        String insercaoSql1 = "insert into pessoa (id, nome, qtdAcesso, naturalidade ) values (2, 'Vitor', 10, 'Canadense' );";
        Statement stmtI1 = conexao.createStatement();
        stmtI1.executeUpdate(insercaoSql1);
        stmtI1.close();

        String insercaoSql2 = "insert into pessoa (id, nome, qtdAcesso, naturalidade ) values (3, 'Kelvin', 69, 'Nigeriano' );";
        Statement stmtI2 = conexao.createStatement();
        stmtI2.executeUpdate(insercaoSql2);
        stmtI2.close();

        String consulta = "select * from pessoa";
        //consulta = "select nome as nome_completo, naturalidade from pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(consulta);

        // 4. Processar no cliente o resultado da consulta.
        while (resultado.next()) {

            String nome = resultado.getString("nome");
            Integer quantidade = resultado.getInt("qtdAcesso");
            String naturalidade = resultado.getString("naturalidade");

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setQuantidadeAcesso(quantidade);
            pessoa.setNaturalidade(naturalidade);
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Quantidade: " + pessoa.getQuantidadeAcesso());
            System.out.println("Naturalidade: " + pessoa.getNaturalidade());
            System.out.println(" ");
        }

        // 6. Exibir os dados

        System.out.println("\nTchau, até a próxima\n\n\t\t:-)");
    }

}
