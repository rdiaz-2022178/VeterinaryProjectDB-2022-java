-- vistas

use db_veterinaria;

-- --------------------------------------------------------
--  
create view view_mascota as select * from tbl_mascota;
select * from view_mascota;

create view view_departamento as select * from tbl_departamento;

create view view_servicios as select * from tbl_servicios;
create view view_cita as select * from tbl_cita;
create view view_doctor as select * from tbl_doctor;
create view view_cliente as select * from tbl_cliente;
create view view_detalle_cita_doctor as select * from tbl_detalle_cita_doctor;
create view view_detalle_cliente_mascota as select * from tbl_detalle_cliente_mascota;

create view view_consulta_dias as select * from tbl_cita
where fecha_cita > '2022-09-09';

create view view_cpdd as select * from tbl_cita inner join tbl_servicios group by(id_Cita) and costo_servicios > 200;
select * from view_consulta_dias;

select * from view_cpdd;

create view view_verCostoses as select sum(c.costo_cita + s.costo_servicios) as costoTotal from tbl_cita as c inner join tbl_servicios as s;

-- SELECT sum(venta1+venta2+venta3) from prueba where vendedor='robert'


select * from view_verCostose;
show tables;