# Criação de Tela de Cadastro de Fornecedor

## Integrantes do Grupo:
- Ana Flávia Alves Rosa  
- Beatriz da Costa Lauro  
- Brenda Bonaita de Oliveira  
- Juliana Aparecida Silva Reis  
- Leticia Gomes dos Santos  

---

## Instruções

Nossa aplicação **InterfaceGrafica3** possui alguns cadastros já implementados. Neste trabalho, o objetivo é **implementar o cadastro de Fornecedor**:  
1. Criar o **menu** na tela principal.  
2. Criar a **tela de cadastro de fornecedor**.  
3. Criar o **Model** para o fornecedor com os seguintes atributos:  
   - `id` (tipo `int`)  
   - `categoria` (tipo `string`)  
   - `uf` (do tipo `Uf`)  
   > **Nota:** O modelo deve estender a classe `Pessoa Jurídica`.  

---

### Campos para o Banco de Dados:
- **id**
- **nome**
- **email**
- **endereco**
- **uf** (id de UF - chave estrangeira)
- **telefone**
- **cnpj**
- **inscricaoEstadual**
- **nomeFantasia**
- **categoria**

---

### Repositório
Criar a classe **FornecedorRepository** no pacote `repository` para realizar os comandos de banco de dados.

---

### Ajustes na Tela de Cadastro
- Implementar a tela para o cadastro de fornecedor.  
- Utilizar um componente **JComboBox** para o campo de UF.  
=======
# cadastroFornecedor
 Trabalho para a disciplina de Programação I, do 4° período do curso de Sistemas de Informação.
