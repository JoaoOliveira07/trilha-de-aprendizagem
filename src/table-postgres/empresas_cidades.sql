CREATE TABLE IF NOT EXISTS empresas_unidades (
  empresa_id INT NOT NULL,
  cidade_id INT NOT NULL
  sede TINYINT(1) NOT NULL,
  PRIMARY KEY (empresa_id, cidade_id)
);

insert into empresas_unidades (empresa_id, cidade_id, sede)
values (2, 2, false),
(2, 3, false),
(3, 2, false),
(4, 3, true);
