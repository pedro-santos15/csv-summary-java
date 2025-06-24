package model.entities;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    private static ArrayList<Produto> produtos = new ArrayList<>();

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        produtos.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double valorTotal(){
        try {
            if (quantidade == 0){
                throw new InputMismatchException("Quantidade inesperada");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return nome +
                "," +
                String.format("%.2f", valorTotal());
    }
}
