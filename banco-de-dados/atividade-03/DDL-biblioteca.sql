CREATE DATABASE biblioteca;
USE biblioteca;

-- 1. Tabelas básicas (entidades principais)

CREATE TABLE Funcionario (
    codigoFuncionario INT PRIMARY KEY,
    nomeFuncionario VARCHAR(100),
    enderecoFuncionario VARCHAR(200),
    cidadeFuncionario VARCHAR(100),
    estadoFuncionario CHAR(2),
    telefoneFuncionario VARCHAR(20),
    dataNascimentoFuncionario DATE
);

CREATE TABLE Categoria_Obras (
    ID_Categoria INT PRIMARY KEY,
    Taxa_Multa DECIMAL(10,2)
);

CREATE TABLE Categoria_Leitor (
    ID_CategoriaLeitor INT PRIMARY KEY,
    descricaoCategoria VARCHAR(100),
    numMaxDiasEmprestarCategoriaLeitor INT
);

-- 2. Entidades relacionadas às categorias

CREATE TABLE Obras (
    ID_Obra INT PRIMARY KEY,
    ISBNObra VARCHAR(20),
    tituloObra VARCHAR(150),
    autorObra VARCHAR(100), -- representação simplificada
    palavrasChaveObra VARCHAR(200),
    dataPublicacaoObra DATE,
    numeroEdicaoObra INT,
    editoraObra VARCHAR(100),
    numeroPaginasObra INT,
    ID_Categoria INT,
    FOREIGN KEY (ID_Categoria) REFERENCES Categoria_Obras(ID_Categoria)
);

CREATE TABLE Leitor (
    ID_Leitor INT PRIMARY KEY,
    nomeLeitor VARCHAR(100),
    enderecoLeitor VARCHAR(200),
    cidadeLeitor VARCHAR(100),
    estadoLeitor CHAR(2),
    telefoneLeitor VARCHAR(20),
    emailLeitor VARCHAR(100),
    documentoIDLeitor VARCHAR(20),
    dataNascimentoLeitor DATE,
    ID_CategoriaLeitor INT,
    FOREIGN KEY (ID_CategoriaLeitor) REFERENCES Categoria_Leitor(ID_CategoriaLeitor)
);

-- 3. Entidade dependente (Exemplar depende de Obras)

CREATE TABLE Exemplar (
    ID_Exemplar INT,
    ID_Obra INT,
    PRIMARY KEY (ID_Exemplar, ID_Obra),
    FOREIGN KEY (ID_Obra) REFERENCES Obras(ID_Obra)
);

-- 4. Relacionamentos entre as entidades

CREATE TABLE Emprestimo (
    ID_Emprestimo INT PRIMARY KEY,
    dataEmprestimo DATE,
    dataDevolucaoEmprestimo DATE,
    ID_Leitor INT,
    codigoFuncionario INT,
    ID_Exemplar INT,
    ID_Obra INT,
    FOREIGN KEY (ID_Leitor) REFERENCES Leitor(ID_Leitor),
    FOREIGN KEY (codigoFuncionario) REFERENCES Funcionario(codigoFuncionario),
    FOREIGN KEY (ID_Exemplar, ID_Obra) REFERENCES Exemplar(ID_Exemplar, ID_Obra)
);

CREATE TABLE Reserva (
    ID_Obra INT,
    ID_Leitor INT,
    codigoFuncionario INT,
    dataReserva DATE,
    PRIMARY KEY (ID_Obra, ID_Leitor, codigoFuncionario),
    FOREIGN KEY (ID_Obra) REFERENCES Obras(ID_Obra),
    FOREIGN KEY (ID_Leitor) REFERENCES Leitor(ID_Leitor),
    FOREIGN KEY (codigoFuncionario) REFERENCES Funcionario(codigoFuncionario)
);
