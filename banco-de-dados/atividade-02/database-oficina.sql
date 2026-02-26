-- ============================================
-- BANCO DE DADOS: bdOficina
-- ============================================

CREATE DATABASE bdOficina;
GO

USE bdOficina;
GO

-- ============================================
-- TABELA: OFICINA
-- ============================================

CREATE TABLE OFICINA (
    cod BIGINT PRIMARY KEY,
    cnpj VARCHAR(14) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    responsavel VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);
GO

-- ============================================
-- TABELA: FABRICANTE
-- ============================================

CREATE TABLE FABRICANTE (
    cod BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    responsavel VARCHAR(100) NOT NULL
);
GO

-- ============================================
-- TABELA: MODELO
-- ============================================

CREATE TABLE MODELO (
    cod BIGINT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    peso INT DEFAULT 0,
    horaTeste DATETIME NOT NULL,
    cod_fabricante BIGINT,
    cod_oficina BIGINT,

    CONSTRAINT fk_modelo_fabricante
        FOREIGN KEY (cod_fabricante) REFERENCES FABRICANTE(cod),

    CONSTRAINT fk_modelo_oficina
        FOREIGN KEY (cod_oficina) REFERENCES OFICINA(cod)
);
GO

-- ============================================
-- TABELA: MAQUINA
-- ============================================

CREATE TABLE MAQUINA (
    cod BIGINT PRIMARY KEY,
    ano_fabricacao INT NOT NULL,
    horas_uso INT DEFAULT 0,
    cod_modelo BIGINT,

    CONSTRAINT fk_maquina_modelo
        FOREIGN KEY (cod_modelo) REFERENCES MODELO(cod)
);
GO

-- ============================================
-- TABELA: TECNICO
-- ============================================

CREATE TABLE TECNICO (
    cod_funcional BIGINT PRIMARY KEY,
    endereco VARCHAR(150) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    qualificacao VARCHAR(100) NOT NULL,
    cod_oficina BIGINT,

    CONSTRAINT fk_tecnico_oficina
        FOREIGN KEY (cod_oficina) REFERENCES OFICINA(cod)
);
GO

-- ============================================
-- TABELA: TESTE
-- ============================================

CREATE TABLE TESTE (
    cod BIGINT PRIMARY KEY,
    pontuacao INT NOT NULL,
    resultado VARCHAR(50) NOT NULL,
    recomendacoes VARCHAR(255),
    cod_oficina BIGINT,
    cod_tecnico BIGINT,

    CONSTRAINT fk_teste_oficina
        FOREIGN KEY (cod_oficina) REFERENCES OFICINA(cod),

    CONSTRAINT fk_teste_tecnico
        FOREIGN KEY (cod_tecnico) REFERENCES TECNICO(cod_funcional)
);
GO
    

CREATE TABLE TECNICO_MODELO (
    cod_tecnico BIGINT,
    cod_modelo BIGINT,

    PRIMARY KEY (cod_tecnico, cod_modelo),

    CONSTRAINT fk_tm_tecnico
        FOREIGN KEY (cod_tecnico) REFERENCES TECNICO(cod_funcional),

    CONSTRAINT fk_tm_modelo
        FOREIGN KEY (cod_modelo) REFERENCES MODELO(cod)
);
GO
