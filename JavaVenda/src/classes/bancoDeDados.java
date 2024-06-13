/*
sql
-- Banco de dados: futura

-- Estrutura para tabela clientes

CREATE TABLE clientes (
  IdCliente varchar(30) NOT NULL,
  IdTipo int(11) NOT NULL,
  Nomes varchar(30) NOT NULL,
  Sobre_Nome varchar(30) NOT NULL,
  endereco varchar(60) NOT NULL,
  Telefone varchar(20) NOT NULL,
  id_cidade varchar(60) NOT NULL,
  data_nascimento date NOT NULL,
  data_cadastro date NOT NULL,
  PRIMARY KEY (IdCliente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Despejando dados para a tabela clientes

INSERT INTO clientes (IdCliente, IdTipo, Nomes, Sobre_Nome, endereco, Telefone, id_cidade, data_nascimento, data_cadastro) VALUES
('1', 1, 'Nome', 'Sobrenome', 'Endereco', '123456789', '1', '2000-01-01', '2024-06-04');

-- Estrutura para tabela detalhes_da_fatura

CREATE TABLE detalhes_da_fatura (
  Id_fatura int(11) NOT NULL,
  id_lista int(11) NOT NULL,
  id_produto varchar(15) NOT NULL,
  descricao varchar(60) NOT NULL,
  preco int(11) NOT NULL,
  quantidade int(11) NOT NULL,
  PRIMARY KEY (Id_fatura)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Estrutura para tabela produtos

CREATE TABLE produtos (
  Id_produto varchar(15) NOT NULL,
  descricao varchar(55) NOT NULL,
  preco int(11) NOT NULL,
  Id_imposto int(11) NOT NULL,
  Notas text NOT NULL,
  PRIMARY KEY (Id_produto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Despejando dados para a tabela produtos

INSERT INTO produtos (Id_produto, descricao, preco, Id_imposto, Notas) VALUES
('1', 'Refrigerante', 10, 1, 'Refrigerante de 2 litros sabor uva.'),
('2', 'Feijão', 8, 0, 'Feijão carioca');

-- Estrutura para tabela usuarios

CREATE TABLE usuarios (
  Id_usuario varchar(10) NOT NULL,
  Nome varchar(30) NOT NULL,
  Sobre_Nome varchar(30) NOT NULL,
  Senha varchar(10) NOT NULL,
  Id_perfil varchar(10) NOT NULL,
  PRIMARY KEY (Id_usuario)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Despejando dados para a tabela usuarios

INSERT INTO usuarios (Id_usuario, Nome, Sobre_Nome, Senha, Id_perfil) VALUES
('1', 'Nome', 'Sobrenome', 'senha', '1');

-- Estrutura para tabela vendas

CREATE TABLE vendas (
  Id_fatura int(11) NOT NULL,
  Id_cliente varchar(20) NOT NULL,
  data date NOT NULL,
  PRIMARY KEY (Id_fatura)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci; *\