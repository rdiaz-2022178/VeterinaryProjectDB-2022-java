--  DML

use db_veterinaria;

-- ----------------------------------------
-- tbl_departamento

describe tbl_departamento;
select * from tbl_departamento;

insert into tbl_departamento(departamento)
values
('Alta Verapaz'),
('Baja Verapaz'),
('Chimaltenango'),
('Chiquimula'),
('El Progreso'),
('Escuintla'),
('Guatemala'),
('Huehuetenango'),
('Izabal'),
('Jalapa'),
('Jutiapa'),
('Peten'),
('Quetzaltenango'),
('Quiche'),
('Retalhuleu'),
('Sacatepequez'),
('San Marcos'),
('Santa Rosa'),
('Solola'),
('Suchitepequez'),
('Totonicapan'),
('Zacapa');

-- ---------------------------------------------------------------------
-- tbl_servicios

describe tbl_servicios;
select * from tbl_servicios;

insert into tbl_servicios (servicios, costo_servicios)
values 
('Anestesiologo', 750),
('Cardiologia', 500),
('Cirugia', 800),
('Dermatologia', 300),
('Fisioterapia', 600),
('Neurologia', 1000),
('Oftalmologia', 950),
('Oncologia', 450),
('Ortopedia', 740),
('Equinos', 450);

-- ---------------------------------------------------------------------
-- tbl_detalle_cita_doctor

alter table tbl_detalle_cita_doctor add column estado_activo boolean;
select * from tbl_detalle_cita_doctor;

-- --------------------------------------------------------------------
alter table tbl_detalle_cliente_mascota add column estado_activo boolean;
select * from tbl_detalle_cliente_mascota;



describe tbl_mascota;
select * from tbl_cita;
