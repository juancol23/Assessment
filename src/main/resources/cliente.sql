CREATE TABLE cliente
(
	id_cliente           SERIAL NOT NULL,
	cod_cliente       VARCHAR(200) NULL,
	tipo_documento       VARCHAR(200) NULL,
	numero_documento     VARCHAR(200) NULL,
	nombre               VARCHAR(200) NULL,
	apellido             VARCHAR(200) NULL,
	fecha_nacimiento     DATE NULL
);


ALTER TABLE cliente
ADD PRIMARY KEY (id_cliente);