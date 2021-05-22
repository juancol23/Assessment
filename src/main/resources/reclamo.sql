CREATE TABLE reclamo
(
	id_reclamo           SERIAL NOT NULL,
	cod_reclamo      VARCHAR(200) NULL,
	motivo_reclamo       VARCHAR(200) NULL,
	cod_producto VARCHAR(200) NULL,
	descripcion_reclamo    VARCHAR(200) NULL,
	fecha_grabacion_reclamo     DATE NULL
);


ALTER TABLE reclamo
ADD PRIMARY KEY (id_reclamo);
