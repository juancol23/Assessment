CREATE TABLE producto
(
	id_producto           SERIAL NOT NULL,
	cod_producto VARCHAR(200) NULL,
	nombre       VARCHAR(200) NULL,
	tecnologia     VARCHAR(200) NULL,
	fecha_grabacion     DATE NULL
);

ALTER TABLE producto
ADD PRIMARY KEY (id_producto);