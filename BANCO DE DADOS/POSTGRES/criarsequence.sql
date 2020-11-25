-- DROP SEQUENCE public.nomesequencia;

CREATE SEQUENCE public.table
    -- forma que é incremetada de um em um
    INCREMENT 1
    -- start começa a partir de 5
    START 5
    -- valor minimo
    MINVALUE 1
    -- esse é o valor maximo por default
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.table
    OWNER TO postgres;

-- Atribuir sequência a uma coluna

ALTER TABLE tabela ALTER COLUMN coluna SET DEFAULT nextval('nome_da_sequencia'::regclass);