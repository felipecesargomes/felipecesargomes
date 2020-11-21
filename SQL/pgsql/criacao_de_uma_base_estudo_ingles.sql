create table words (
id_words serial primary key,
palavra varchar(255) unique not null
)

create table meaning (
id_meaning serial primary key,
significado varchar(255),
id_words int,
constraint fk_words foreign key (id_words) references words(id_words)
)

create function insert_gatilho() returns trigger as $ins_gatilho$
begin
	new.palavra := UPPER(new.palavra);
	return new;
end;
$ins_gatilho$ LANGUAGE plpgsql;

create trigger ins_gatilho before insert on WORDS for each row execute procedure insert_gatilho();

create function insert_gatilho2() returns trigger as $ins_gatilho2$
begin
	new.significado := UPPER(new.significado);
	return new;
end;
$ins_gatilho2$ language plpgsql;

create trigger ins_gatilho2 before insert on MEANING for each row execute procedure insert_gatilho2();

insert into words (palavra) values ('is');
insert into meaning (significado, id_words) values ('com',3)

create FUNCTION add_readenglish(palavraw varchar(255)) returns void as $$
declare word varchar(255);
declare nid int;
declare data_reg date;
declare inteiro int = (select id_words from words where palavra = palavraw);
begin
	word := (select palavra from words where id_words = inteiro);
	nid := (select id_words from words where id_words = inteiro);
	data_reg := (select now());
	insert into readenglish (id_words, data_registro, word) values (nid, data_reg, word);
end;$$ LANGUAGE plpgsql;

create table readenglish (
	id_readenglish serial primary key,
	id_words int not null,
	data_registro date,
	word varchar(255) not null,
	constraint fk_id_words foreign key (id_words) references words (id_words)
)