CREATE TABLE cliente (
	id bigint NOT NULL auto_increment,
    nome varchar(60) NOT NULL,
    email varchar(255) NOT NULL,
    telefone varchar(20) NOT NULL,

    PRIMARY KEY (id)
);