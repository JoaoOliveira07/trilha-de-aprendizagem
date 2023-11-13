--cidades empresas

CREATE TABLE IF NOT EXISTS empresas (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  cnpj NUMERIC,
  CONSTRAINT cnpj_unique UNIQUE (cnpj)
);

insert into empresas (nome, cnpj)
values ('Cielo', '01598317000134'),
('Segs',  '04578978000124');

ALTER TABLE empresas ALTER COLUMN cnpj TYPE VARCHAR(14);

delete from empresas where nome = 'Cielo'
