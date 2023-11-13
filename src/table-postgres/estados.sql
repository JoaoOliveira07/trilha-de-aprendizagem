-- Mais estados

CREATE TABLE MW.estados ( --Criando tabela
    id SERIAL primary KEY,
    nome VARCHAR(45) NOT NULL,
    sigla CHAR(2) NOT NULL,
    regiao VARCHAR(15) NOT NULL CHECK (regiao IN ('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul')),
    populacao DECIMAL(5,2) NOT NULL,
    CONSTRAINT unique_nome UNIQUE (nome),
    CONSTRAINT unique_sigla UNIQUE (sigla)
);

INSERT INTO estados
    (nome, sigla, regiao, populacao)
VALUES
    ('Bahia', 'BA', 'Nordeste', 15.34),
    ('Ceará', 'CE', 'Nordeste', 9.02),
    ('Distrito Federal', 'DF', 'Centro-Oeste', 3.04),
    ('Espírito Santo', 'ES', 'Sudeste', 4.02),
    ('Goiás', 'GO', 'Centro-Oeste', 6.78),
    ('Maranhao', 'MA', 'Nordeste', 7.00),
    ('Mato Grosso', 'MT', 'Centro-Oeste', 3.34),
    ('Mato Grosso do Sul', 'MS', 'Centro-Oeste', 2.71),
    ('Minas Gerais', 'MG', 'Sudeste', 21.12),
    ('Pará', 'PA', 'Norte', 8.36),
    ('Paraíba', 'PB', 'Nordeste', 4.03),
    ('Parana', 'PR', 'Sul', 11.22),
    ('Pernambuco', 'PE', 'Nordeste', 9.47),
    ('Piauí', 'PI', 'Nordeste', 3.22),
    ('Rio de Janeiro', 'RJ', 'Sudeste', 16.72),
    ('Rio Grande do Norte', 'RN', 'Nordeste', 3.51),
    ('Rio Grande do Sul', 'RS', 'Sul', 11.32),
    ('Rondônia', 'RO', 'Norte', 1.81),
    ('Roraima', 'RR', 'Norte', 0.52),
    ('Santa Catarina', 'SC', 'Sul', 7.01),
    ('São Paulo', 'SP', 'Sudeste', 45.10),
    ('Sergipe', 'SE', 'Nordeste', 2.29),
    ('Tocantins', 'TO', 'Norte', 1.55);

-- Exemplo de Insert 1
INSERT INTO estados (nome, sigla, regiao, populacao)  --Incluindo dados
    VALUES ('Acre', 'AC', 'Norte', 0.83);

-- Exemplo de Insert 2
INSERT INTO estados  //Incluindo dados
    (nome, sigla, regiao, populacao)
VALUES
    ('Alagoas', 'AL', 'Nordeste', 3.38),
    ('Amapá', 'AP', 'Norte', 0.8),
    ('Amazonas', 'AM', 'Norte', 4.06);
    
SELECT Sigla, nome AS "Nome do Estado" FROM estados where regiao = 'Norte' --FILTRANDO POR COLUNA

select nome, regiao, populacao from estados where populacao >= 10 order by populacao desc --FILTRANDO E ORDERNANDO POR TAMANHO DA POPULAÇÃO

update estados set nome = 'Maranhão' where sigla = 'MA' --Atualizando dados

update estados set nome = 'Paraná', populacao = 11.32 where sigla = 'PR' --Atualizando dados

insert into estados (id, nome, sigla, regiao, populacao) --Inserindo dados com ID
values (1000,'Novo','NV','Sul',2.54)

insert into estados (nome, sigla, regiao, populacao)
values ('Mais Novo','MN','Sul',2.54)

delete from estados where sigla = 'NV' --Deletando

delete from estados where id >= 1000 --Deletando acima ou igual do id 1000

SELECT regiao AS "Região", SUM(populacao) AS "Total" FROM estados GROUP BY regiao ORDER BY "Total" DESC; --Soma total de habitantes
select sum(populacao) as "Total" from estados --Total de pop


