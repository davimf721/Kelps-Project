CREATE DATABASE kelps;


USE kelps;


create table amigos
(
    id       int auto_increment
        primary key,
    nome     varchar(255) not null,
    telefone varchar(20)  null
);

create table ferramentas
(
    id              int auto_increment
        primary key,
    nome            varchar(255)   not null,
    marca           varchar(255)   null,
    custo_aquisicao decimal(10, 2) not null
);

create table emprestimos
(
    id_emprestimo   int auto_increment
        primary key,
    id_ferramenta   int                  not null,
    id_amigo        int                  not null,
    data_emprestimo date                 not null,
    data_devolucao  date                 null,
    devolvido       tinyint(1) default 0 not null,
    constraint emprestimos_ibfk_1 foreign key (id_ferramenta) references ferramentas (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    constraint emprestimos_ibfk_2 foreign key (id_amigo) references amigos (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

create index id_amigo
    on emprestimos (id_amigo);

create index id_ferramenta
    on emprestimos (id_ferramenta);

