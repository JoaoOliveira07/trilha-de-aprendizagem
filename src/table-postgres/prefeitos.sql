CREATE TABLE IF NOT EXISTS prefeitos ( 
    id serial PRIMARY KEY,
    nome varchar(255) NOT NULL,
    cidade_id int,
    CONSTRAINT fk_cidade_id FOREIGN KEY (cidade_id) REFERENCES cidades(id),
    UNIQUE (cidade_id)
); --Criando tabela prefeitos

insert into prefeitos (nome, cidade_id)
values ('Axel Grael', 2),
('Rodrigo Pinheiro',3),
('Glêdson Lima Bezerra',4);

insert into prefeitos (nome, cidade_id)
values 
('Tião Bocalom', (SELECT id FROM cidades WHERE nome ='Rio Branco')),
('José de Souza Lima', (SELECT id FROM cidades WHERE nome ='Cruzeiro do Sul')),
('Mazinho Serafim', (SELECT id FROM cidades WHERE nome ='Sena Madureira')),
('Maria Lucinéia Nery de Lima Menezes', (SELECT id FROM cidades WHERE nome ='Tarauacá')),
('Kiefer Cavalcante', (SELECT id FROM cidades WHERE nome ='Feijó')),
('João Henrique Caldas', (SELECT id FROM cidades WHERE nome ='Maceió')),
('Luciano Barbosa',( SELECT id FROM cidades WHERE nome ='Arapiraca')),
('Gilberto Gonçalves', (SELECT id FROM cidades WHERE nome ='Rio Largo')),
('Julio Cézar', (SELECT id FROM cidades WHERE nome ='Palmeira dos Índios')),
('Areski Damara de Omena Freitas Junior', (SELECT id FROM cidades WHERE nome ='União dos Palmares')),
('Antônio Furlan',(SELECT id FROM cidades WHERE nome ='Macapá')),
('Sebastião Bala Rocha',(SELECT id FROM cidades WHERE nome ='Santana')),
('Márcio Serrão', (SELECT id FROM cidades WHERE nome ='Laranjal do Jari')),
('Breno Lima de Almeida', (SELECT id FROM cidades WHERE nome ='Oiapoque')),
('João da Silva Costa', (SELECT id FROM cidades WHERE nome ='Mazagão')),
('David Almeida', (SELECT id FROM cidades WHERE nome ='Manaus')),
('Bi Garcia', (SELECT id FROM cidades WHERE nome ='Parintins')),
('Mário Jorge Bouez Abrahim', (SELECT id FROM cidades WHERE nome ='Itacoatiara')),
('Betanael da Silva D Ângelo', (SELECT id FROM cidades WHERE nome ='Manacapuru')),
('Keitton Wyllyson Pinheiro Batista', (SELECT id FROM cidades WHERE nome ='Coari')),
('Bruno Reis', (SELECT id FROM cidades WHERE nome ='Salvador')),
('Colbert Martins', (SELECT id FROM cidades WHERE nome ='Feira de Santana')),
('Sheila Lemos', (SELECT id FROM cidades WHERE nome ='Vitória da Conquista')),
('Elinaldo Araújo', (SELECT id FROM cidades WHERE nome ='Camaçari')),
('Augusto Narciso Castro', (SELECT id FROM cidades WHERE nome ='Itabuna')),
('José Sarto', (SELECT id FROM cidades WHERE nome ='Fortaleza')),
('Vitor Valim', (SELECT id FROM cidades WHERE nome ='Caucaia')),
('Roberto Pessoa', (SELECT id FROM cidades WHERE nome ='Maracanaú')),
('Ivo Gomes', (SELECT id FROM cidades WHERE nome ='Sobral')),
('Mano Paganotto', (SELECT id FROM cidades WHERE nome ='Brasília')),
('Sérgio Vidigal', (SELECT id FROM cidades WHERE nome ='Serra')),
('Arnaldo Borgo Filho', (SELECT id FROM cidades WHERE nome ='Vila Velha')),
('Euclerio de Azevedo Sampaio Junior', (SELECT id FROM cidades WHERE nome ='Cariacica')),
('Lorenzo Pazolini', (SELECT id FROM cidades WHERE nome ='Vitória')),
('Victor da Silva Coelho', (SELECT id FROM cidades WHERE nome ='Cachoeira de Itapemirim')),
('Geraldo Neto', (SELECT id FROM cidades WHERE nome ='Goiânia')),
('Vilmar Mariano', (SELECT id FROM cidades WHERE nome ='A')),
('Roberto Naves e Siqueira', (SELECT id FROM cidades WHERE nome ='Anápolis')),
('Paulo Faria do Vale', (SELECT id FROM cidades WHERE nome ='Rio Verde')),
('Diego Sorgatto', (SELECT id FROM cidades WHERE nome ='Luziânia')),
('Eduardo Braide', (SELECT id FROM cidades WHERE nome ='São Luís')),
('Francisco de Assis Andrade Ramos', (SELECT id FROM cidades WHERE nome ='Imperatriz')),
('Luis Fernando Silva', (SELECT id FROM cidades WHERE nome ='São José do Ribamar')),
('Wilson Miguel', (SELECT id FROM cidades WHERE nome ='Caxias')),
('Dinair Veloso', (SELECT id FROM cidades WHERE nome ='Timon')),
('Emanuel Pinheiro', (SELECT id FROM cidades WHERE nome ='Cuiabá')),
('Kalil Baracat', (SELECT id FROM cidades WHERE nome ='Várzea Grande')),
('José Carlos do Pátio', (SELECT id FROM cidades WHERE nome ='Rondonópolis')),
('Roberto Dorner', (SELECT id FROM cidades WHERE nome ='Sinop')),
('Vander Masson', (SELECT id FROM cidades WHERE nome ='Tangará da Serra')),
('Adriane Lopes', (SELECT id FROM cidades WHERE nome ='Campo Grande')),
('Alan Guedes', (SELECT id FROM cidades WHERE nome ='Dourados')),
('Angelo Guerreiro', (SELECT id FROM cidades WHERE nome ='Três Lagoas')),
('Marcelo Iunes', (SELECT id FROM cidades WHERE nome ='Corumbá')),
('Eduardo Campos', (SELECT id FROM cidades WHERE nome ='Ponta Porã')),
('Fuad Noman', (SELECT id FROM cidades WHERE nome ='Belo Horizonte')),
('Odelmo Leão', (SELECT id FROM cidades WHERE nome ='Uberlândia')),
('Marília Campos', (SELECT id FROM cidades WHERE nome ='Contagem')),
('Margarida Salomão', (SELECT id FROM cidades WHERE nome ='Juiz de Fora')),
('Vittorio Medioli', (SELECT id FROM cidades WHERE nome ='Betim')),
('Edmilson Rodrigues', (SELECT id FROM cidades WHERE nome ='Belém')),
('Daniel Barbosa Santos', (SELECT id FROM cidades WHERE nome ='Ananindeua')),
('Francisco Nélio Aguiar da Silva', (SELECT id FROM cidades WHERE nome ='Santarém')),
('Tião Miranda', (SELECT id FROM cidades WHERE nome ='Marabá')),
('Darci José Lermen', (SELECT id FROM cidades WHERE nome ='Parauapebas')),
('Cícero Lucena', (SELECT id FROM cidades WHERE nome ='João Pessoa')),
('Bruno Cunha Lima', (SELECT id FROM cidades WHERE nome ='Campina Grande')),
('Emerson Fernandes Alvino Panta', (SELECT id FROM cidades WHERE nome ='Santa Rita')),
('Nabor Wanderley da Nóbrega Filho', (SELECT id FROM cidades WHERE nome ='Patos')),
('Luciene Gomes Martinho', (SELECT id FROM cidades WHERE nome ='Bayeux')),
('Rafael Greca', (SELECT id FROM cidades WHERE nome ='Curitiba')),
('Marcelo Belinati', (SELECT id FROM cidades WHERE nome ='Londrina')),
('Ulisses Maia', (SELECT id FROM cidades WHERE nome ='Maringá')),
('Elizabeth Silveira Schmidt', (SELECT id FROM cidades WHERE nome ='Ponta Grossa')),
('Leonaldo Paranhos da Silva', (SELECT id FROM cidades WHERE nome ='Cascavel')),
('João Henrique Campos', (SELECT id FROM cidades WHERE nome ='Recife')),
('Luiz Medeiros', (SELECT id FROM cidades WHERE nome ='Jaboatão dos Guararapes')),
('Lupércio Carlos do Nascimento', (SELECT id FROM cidades WHERE nome ='Olinda')),
('Simão Durando', (SELECT id FROM cidades WHERE nome ='Petrolina')),
('José Pessoa Leal', (SELECT id FROM cidades WHERE nome ='Teresina')),
('Francisco de Assis de Moraes Souza', (SELECT id FROM cidades WHERE nome ='Parnaíba')),
('Gil Marques de Medeiros', (SELECT id FROM cidades WHERE nome ='Picos')),
('Jove Oliveira', (SELECT id FROM cidades WHERE nome ='Piripiri')),
('Antônio Reis Neto', (SELECT id FROM cidades WHERE nome ='Floriano')),
('Eduardo Paes', (SELECT id FROM cidades WHERE nome ='Rio de Janeiro')),
('Nelson Ruas dos Santos', (SELECT id FROM cidades WHERE nome ='São Gonçalo')),
('Wilson Miguel', (SELECT id FROM cidades WHERE nome ='Duque de Caxias')),
('Rogerio Lisboa', (SELECT id FROM cidades WHERE nome ='Nova Iguaçu')),
('Rosano Taveira da Cunha', (SELECT id FROM cidades WHERE nome ='Parnamirim')),
('Álvaro Costa Dias', (SELECT id FROM cidades WHERE nome ='Natal')),
('Allyson Bezerra', (SELECT id FROM cidades WHERE nome ='Mossoró')),
('Eraldo Daniel de Paiva', (SELECT id FROM cidades WHERE nome ='São Gonçalo do Amarante')),
('Edivaldo Emídio da Silva Júnior', (SELECT id FROM cidades WHERE nome ='Macaíba')),
('Sebastião Melo', (SELECT id FROM cidades WHERE nome ='Porto Alegre')),
('Adiló Didomenico', (SELECT id FROM cidades WHERE nome ='Caxias do Sul')),
('Paula Mascarenhas', (SELECT id FROM cidades WHERE nome ='Pelotas')),
('Jorge Pozzobom', (SELECT id FROM cidades WHERE nome ='Santa Maria')),
('Jairo Jorge', (SELECT id FROM cidades WHERE nome ='Canoas')),
('Hildon Chaves', (SELECT id FROM cidades WHERE nome ='Porto Velho')),
('Isaú Raimundo da Fonseca', (SELECT id FROM cidades WHERE nome ='Ji-Paraná')),
('Carla Redano', (SELECT id FROM cidades WHERE nome ='Ariquemes')),
('Flori Cordeiro De Miranda Junior', (SELECT id FROM cidades WHERE nome ='Vilhena')),
('Adailton Furia', (SELECT id FROM cidades WHERE nome ='Cacoal')),
('Arthur Henrique Machado', (SELECT id FROM cidades WHERE nome ='Boa Vista')),
('Alessandro Daltro Sousa', (SELECT id FROM cidades WHERE nome ='Rorainópolis')),
('Dianiery de Souza Coelho', (SELECT id FROM cidades WHERE nome ='Caracaraí')),
('Pedro Henrique Machado', (SELECT id FROM cidades WHERE nome ='Alto Alegre')),
('Eronildes Aparecida Gonçalves', (SELECT id FROM cidades WHERE nome ='Mucajaí')),
('Adriano Silva', (SELECT id FROM cidades WHERE nome ='Joinville')),
('Topázio Neto', (SELECT id FROM cidades WHERE nome ='Florianópolis')),
('Mário Hildebrandt', (SELECT id FROM cidades WHERE nome ='Blumenau')),
('Orvino Coelho de Ávila', (SELECT id FROM cidades WHERE nome ='São José')),
('João Rodrigues', (SELECT id FROM cidades WHERE nome ='Chapecó')),
('Ricardo Nunes', (SELECT id FROM cidades WHERE nome ='São Paulo')),
('Gustavo Henric Costa', (SELECT id FROM cidades WHERE nome ='Guarulhos')),
('Dário Saadi', (SELECT id FROM cidades WHERE nome ='Campinas')),
('Orlando Morando', (SELECT id FROM cidades WHERE nome ='São Bernardo do Campo')),
('Paulo Henrique Pinto Serra', (SELECT id FROM cidades WHERE nome ='Santo André')),
('Edvaldo Nogueira', (SELECT id FROM cidades WHERE nome ='Aracaju')),
('Inaldo Luis da Silva', (SELECT id FROM cidades WHERE nome ='Nossa Senhora do Socorro')),
('Hilda Ribeiro', (SELECT id FROM cidades WHERE nome ='Lagarto')),
('Adaílton Resende Sousa', (SELECT id FROM cidades WHERE nome ='Itabaiana')),
('Marcos Santana', (SELECT id FROM cidades WHERE nome ='São Cristovão')),
('Cinthia Ribeiro', (SELECT id FROM cidades WHERE nome ='Palmas')),
('Wagner Rodrigues Barros', (SELECT id FROM cidades WHERE nome ='Araguaína')),
('Josi Nunes', (SELECT id FROM cidades WHERE nome ='Gurupi')),
('Ronivon Maciel Gama', (SELECT id FROM cidades WHERE nome ='Porto Nacional')),
('Celso Soares Rêgo Morais',(SELECT id FROM cidades WHERE nome ='Paraíso do Tocantins'));



------------------------------------------------------------------------------

Governadores 

insert into governador (nome, estado_id)
values('Paulo Dantas',(select id FROM estados WHERE sigla ='AL')),
('Clécio',(select id FROM estados WHERE sigla ='AP')),
('Wilson Lima',(select id FROM estados WHERE sigla ='AM')),
('Jerônimo',(select id FROM estados WHERE sigla ='BA')),
('Elmano de Freitas',(select id FROM estados WHERE sigla ='CE')),
('Ibaneis Rocha',(select id FROM estados WHERE sigla ='DF')),
('Renato Casagrande',(select id FROM estados WHERE sigla ='ES')),
('Ronaldo Caiado	',(select id FROM estados WHERE sigla ='GO')),
('Carlos Brandão Junior',(select id FROM estados WHERE sigla ='MA')),
('Mauro Mendes',(select id FROM estados WHERE sigla ='MT')),
('Eduardo Riedel',(select id FROM estados WHERE sigla ='MS')),
('Romeu Zema',(select id FROM estados WHERE sigla ='MG')),
('Helder Barbalho',(select id FROM estados WHERE sigla ='PA')),
('João Azevêdo',(select id FROM estados WHERE sigla ='PB')),
('Ratinho Júnior',(select id FROM estados WHERE sigla ='PR')),
('Raquel Lyra',(select id FROM estados WHERE sigla ='PE')),
('Rafael Fonteles',(select id FROM estados WHERE sigla ='PI')),
('Cláudio Castro',(select id FROM estados WHERE sigla ='RJ')),
('Fátima Bezerra',(select id FROM estados WHERE sigla ='RN')),
('Eduardo Leite',(select id FROM estados WHERE sigla ='RS')),
('Coronel Marcos Rocha',(select id FROM estados WHERE sigla ='RO')),
('Antônio Denarium',(select id FROM estados WHERE sigla ='RR')),
('Jorginho Mello',(select id FROM estados WHERE sigla ='SC')),
('Tarcísio de Freitas',(select id FROM estados WHERE sigla ='SP')),
('Fábio',(select id FROM estados WHERE sigla ='SE')),
('Wanderlei Barbosa',(select id FROM estados WHERE sigla ='TO'));
