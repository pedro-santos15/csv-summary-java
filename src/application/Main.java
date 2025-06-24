package application;

import model.entities.Produto;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String path = "desafio.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter("out\\summary.csv", true))){

            String line;
            while ((line = br.readLine()) != null) {
                String[] objeto = line.split(",");
                if (objeto.length != 3) continue;

                String nome = objeto[0];
                double preco = Double.parseDouble(objeto[1]);
                int quantidade = Integer.parseInt(objeto[2]);
                Produto produto = new Produto(nome, preco, quantidade);

                bw.write(produto.toString());
                bw.newLine();
            }
            System.out.println("O arquivo foi criado corretamente.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
