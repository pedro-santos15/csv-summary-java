# Processador de Arquivo CSV – Exercício de Fixação

Este projeto Java foi desenvolvido como parte dos exercícios de fixação do **curso de Java do professor Nélio Alves** na [Udemy](https://www.udemy.com/course/java-curso-completo/).

## 📝 Descrição

O programa realiza a leitura de um arquivo `.csv` contendo uma lista de produtos vendidos, onde cada linha contém:

```
nome,preço,quantidade
```

Exemplo:

```
TV,1000.00,2
Notebook,2000.00,1
Mouse,50.00,5
```

O programa calcula o valor total de cada produto (`preço * quantidade`) e gera um novo arquivo chamado `summary.csv`, contendo apenas o nome do produto e o valor total, no seguinte formato:

```
TV,2000.00
Notebook,2000.00
Mouse,250.00
```

O arquivo `summary.csv` é salvo dentro de uma subpasta chamada `out`, localizada no mesmo diretório do arquivo de entrada.

---

## 💡 Tecnologias utilizadas

- Java
- API de leitura e escrita de arquivos (`BufferedReader`, `BufferedWriter`)
- Tratamento básico de exceções

---

## 🚀 Como executar o projeto

1. Coloque um arquivo `desafio.csv` no diretório raiz do projeto, com os dados no formato citado acima.
2. Compile e execute a classe `Main`.
3. Verifique a pasta `out` gerada — nela estará o arquivo `summary.csv` com os totais calculados.

---

## 📚 Autor

Exercício proposto no curso de Java do professor **Nélio Alves**.  
Este projeto faz parte do meu processo de aprendizagem em Java. 💻
