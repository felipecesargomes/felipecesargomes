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