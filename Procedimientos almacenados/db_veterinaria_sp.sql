-- Stored Procedure

use db_veterinaria;

-- -------------------------------------------------------
--  INGRESAR
-- sp_ingresarMascota

DELIMITER //
create procedure sp_ingresarMascota(nombre varchar(30), raza varchar(30), color varchar(30), estado boolean)
begin
insert into tbl_mascota (nombre_mascota, raza_mascota, color_mascota, estado_activo)
values (nombre, raza, color, estado);
end //
DELIMITER ;

call sp_ingresarMascota('Lia', 'Pitbull', 'Blanco', true);

select * from tbl_mascota;
describe tbl_mascota;

-- --------------------------------------------------------------
-- sp_ingresarCita

DELIMITER //
create procedure sp_ingresarCita(fecha date, hora time, nombreM varchar(40), nombreD varchar(40), email varchar(40), telefono varchar(25), idS int, dpi varchar(25), nit varchar(40), costo float, estado boolean  )
begin
insert into tbl_cita (fecha_cita, hora_cita, nombre_mascota, nombre_dueño_mascota, email_dueño, telefono_dueño, id_servicio_cita, dpi_dueño, nit_dueño, costo_cita, estado_activo)
values (fecha, hora, nombreM, nombreD, email, telefono, idS, dpi, nit, costo, estado);
end //
DELIMITER ;

call sp_ingresarCita('2022-09-09', '11:30:00', 'Pedro', 'Rodrigo', 'rodro@gmail', '46464646', 7, '46464646464', '46464646', 100, true);
describe tbl_cita;
select * from tbl_cita;

-- ----------------------------------------------------------------
-- sp_ingresarCliente

DELIMITER //
create procedure sp_ingresarCliente(nombre varchar(40), apellido varchar(40), telefono varchar(25), email varchar(40), dpi varchar(25), usuario varchar(40), contraseña varchar(40), estado boolean)
begin
insert into tbl_cliente (nombre_cliente, apellido_cliente, telefono_cliente, email_cliente, dpi_cliente, usuario_cliente, contraseña_cliente, estado_activo)
values (nombre, apellido, telefono, email, dpi, usuario, contraseña, estado);
end //
DELIMITER ;

call sp_ingresarCliente('Rodrigo', 'Diaz', '557245', 'rodr qgnail.com', '4654654654', 'rodro', '123', true);
describe tbl_cliente;
select * from tbl_cliente;

-- --------------------------------------------------------------------------
-- sp_ingresarMedico

DELIMITER //
create procedure sp_ingresarMedico(nombre varchar(40), apellido varchar(40), telefono varchar(25), direccion varchar(40), idD int, especialidad varchar(40), estado boolean )
begin
insert into tbl_doctor (nombre_doctor, apellido_doctor, telefono_doctor, direccion_doctor, id_departamento_doctor, especialidad_doctor, estado_activo)
values (nombre, apellido, telefono, direccion, idD, especialidad, estado);
end //
DELIMITER ;

call sp_ingresarMedico('Juan', 'Villegas', '5457646', '11 av B 19-25', 7, 'Fisioterapia', true);

describe tbl_doctor;
select * from tbl_doctor;


-- --------------------------------------


-- -----------------------------------------------------------------------
-- sp_elimiarMascota

DELIMITER //
create procedure sp_ocultarMascota(id int)
begin
update tbl_mascota set estado_activo = false where id_mascota = id;
end //
DELIMITER ;

CALL sp_ocultarMascota(1);
select * from tbl_mascota;

DELIMITER //
create procedure sp_regresarMascota(id int)
begin
update tbl_mascota set estado_activo = true where id_mascota = id;
end //
DELIMITER ;

call sp_regresarMascota(1);

-- ---------------------------------------------
DELIMITER //
create procedure sp_ocultarCliente(id int)
begin
update tbl_cliente set estado_activo = false where id_cliente = id;
end //
DELIMITER ;

call sp_ocultarCliente(2);
select * from tbl_cliente;

DELIMITER //
create procedure sp_regresarCliente(id int)
begin
update tbl_cliente set estado_activo = true where id_cliente = id;
end //
DELIMITER ;

call sp_regresarCliente(1);

-- ---------------------------------------------------

DELIMITER //
create procedure sp_ocultarCita(id int)
begin
update tbl_cita set estado_activo = false where id_cita = id;
end //
DELIMITER ;

call sp_ocultarCita(1);
select * from tbl_cita;

DELIMITER //
create procedure sp_regresarCita(id int)
begin
update tbl_cita set estado_activo = true where id_cita = id;
end //
DELIMITER ;

call sp_regresarCita(1);

-- -----------------------------------------------------------
DELIMITER //
create procedure sp_ocultarDoctor(id int)
begin
update tbl_doctor set estado_activo = false where id_doctor = id;
end //
DELIMITER ;

select * from tbl_doctor;
call sp_ocultarDoctor(1);

DELIMITER //
create procedure sp_regresarDoctor(id int)
begin
update tbl_doctor set estado_activo = true where id_doctor = id;
end //
DELIMITER ;

call sp_regresarDoctor(1);

-- ----------------------------------------------------------------------
-- Actualizar

DELIMITER //
create procedure sp_actualizarMascota(id int,  nombre varchar(30), raza varchar(30), color varchar(30), estado boolean)
begin
update tbl_mascota set id_mascota = id, nombre_mascota = nombre, raza_mascota = raza, color_mascota = color, estado_activo = estado
where id_mascota = id;
end//
DELIMITER ;

call sp_actualizarMascota(2, 'Teo', 'Gato', 'blanco con amarillo', true);
drop procedure sp_actualizarMascota;
describe tbl_mascota;
select * from tbl_mascota;

-- -------------------------------------------------------------
DELIMITER //
create procedure sp_actualizarDoctor(id int, nombre varchar(40), apellido varchar(40), telefono varchar(25), direccion varchar(40), idD int, especialidad varchar(40), estado boolean )
begin
update tbl_doctor set id_doctor = id, nombre_doctor = nombre, apellido_doctor = apellido, telefono_doctor = telefono,
direccion_doctor = direccion, id_departamento_doctor = idD, especialidad_doctor = especialidad, estado_activo = estado
where id_doctor = id; 
end //
DELIMITER ;

call sp_actualizarDoctor(1, 'Jose', 'Villegas', '7879831', '11 av A 19-25', 2, 'Castracion', true);
describe tbl_doctor;
select * from tbl_doctor;

-- -------------------------------------------------------
DELIMITER //
create procedure sp_actualizarCliente(id int, nombre varchar(40), apellido varchar(40), telefono varchar(25), email varchar(40), dpi varchar(25), usuario varchar(40), contraseña varchar(40), estado boolean )
begin
update tbl_cliente set id_cliente = id, nombre_cliente = nombre, apellido_cliente = apellido, telefono_cliente = telefono, email_cliente = email, dpi_cliente = dpi, usuario_cliente = usuario, contraseña_cliente = contraseña, estado_activo = estado
where id_cliente = id; 
end //
DELIMITER ;

call sp_actualizarCliente(1, 'Emmanuel', 'Garcia', '55789456', 'rodro@gmail.com', '12345678910234', 'rodro', '1230', true);

describe tbl_cliente;
select * from tbl_cliente;

-- ------------------------------------------------------------
DELIMITER //
create procedure sp_actualizarCita(id int, fecha date, hora time, nombreM varchar(40), nombreD varchar(40), email varchar(40), telefono varchar(25),
idS int, dpi varchar(25), nit varchar(40), costo float, estado boolean)
begin
update tbl_cita set id_cita = id, fecha_cita = fecha, hora_cita = hora, nombre_mascota = nombreM, nombre_dueño_mascota = nombreD, email_dueño = email,
telefono_dueño = telefono, id_servicio_cita = idS, dpi_dueño = dpi, nit_dueño = nit, costo_cita = costo, estado_activo = estado where id_cita = id; 
end //
DELIMITER ;

call sp_actualizarCita(1, '2022-10-10', '12:30:00', 'TEO', 'Rodrigo', 'rodrD@kinal.edu.gt', '11345678', 7, '1234567891023', '4785136', 100, true);
describe tbl_cita;
select * from tbl_cita;

-- -----------------------------------------------------------------------
DELIMITER //
create procedure sp_ingresarDetalleCD(idC int, idD int, idS int, estado boolean)
begin
insert into tbl_detalle_cita_doctor(id_cita_detalle, id_doctor_detalle, id_servicios_detalle, estado_activo)
values(idC, idD, idS, estado);
end //
DELIMITER ;

call sp_ingresarDetalleCD(1,1,1, true);

select * from tbl_detalle_cita_doctor;

-- ----------------------------------
DELIMITER //
create procedure sp_ingresarDetalleCM(idC int, idM int, estado boolean)
begin
insert into tbl_detalle_cliente_mascota(id_cliente_detalle, id_mascota_detalle, estado_activo)
values(idC, idM, estado);
end //
DELIMITER ;

call sp_ingresarDetalleCM(1,1, true);
select * from tbl_detalle_cliente_mascota;

-- ------------------------------------------------
DELIMITER //
create procedure sp_ocultarDetalleCM(id int)
begin
update tbl_detalle_cliente_mascota set estado_activo = false where id_detalle_cliente_mascota = id;
end //
DELIMITER ;

call sp_ocultarDetalleCM(1);
select * from tbl_detalle_cliente_mascota;



DELIMITER //
create procedure sp_regresarDetalleCM(id int)
begin
update tbl_detalle_cliente_mascota set estado_activo = true where id_detalle_cliente_mascota = id;
end //
DELIMITER ;

call sp_regresarDetalleCM(1);

-- -----------------------------------------------------------
DELIMITER //
create procedure sp_ocultarDetalleCD(id int)
begin
update tbl_detalle_cita_doctor set estado_activo = false where id_detalle_cita_medico = id;
end //
DELIMITER ;

call sp_ocultarDetalleCD(1);
select * from tbl_detalle_cita_doctor;

DELIMITER //
create procedure sp_regresarDetalleCD(id int)
begin
update tbl_detalle_cita_doctor set estado_activo = true where id_detalle_cita_medico = id;
end //
DELIMITER ;

call sp_regresarDetalleCD(1);

-- -----------------------------------------------------------------------
DELIMITER //
create procedure sp_actualizarDetalleCM(id int, idC int, idM int,estado boolean)
begin
update tbl_detalle_cliente_mascota set id_detalle_cliente_mascota = id, id_cliente_detalle = idC, id_mascota_detalle = idM, estado_activo = estado
where id_detalle_cliente_mascota = id;
end //
DELIMITER ;

call sp_actualizarDetalleCM(1,2,2, true);

select * from tbl_detalle_cliente_mascota;

-- ----------------------------------------

DELIMITER //
create procedure sp_actualizarDetalleCD(id int, idC int, idD int, idS int, estado boolean)
begin
update tbl_detalle_cita_doctor set id_detalle_cita_medico = id, id_cita_detalle = idC, id_doctor_detalle  = idD, id_servicios_detalle = idS, estado_activo = estado
where id_detalle_cita_medico = id; 
end //
DELIMITER ;

drop procedure sp_actualizarDetalleCD;
call sp_actualizarDetalleCD(1,2,2,2, true);

select * from tbl_detalle_cita_doctor;


-- ----------------------------------------------------
DELIMITER //
create procedure sp_buscarMascota(id int)
begin 
select nombre_mascota, raza_mascota, color_mascota, estado_activo from tbl_mascota where id_mascota = id;
end //
DELIMITER ;

call sp_buscarMascota(1);

select * from tbl_mascota;

-- ---------------------------------------------------------------
DELIMITER //
create procedure sp_mostrarMascota()
begin
select * from tbl_mascota;
end //
DELIMITER ;

call sp_mostrarMascota();

select * from tbl_mascota;

-- --------------------------------------------
DELIMITER //
create procedure sp_mostrarCliente()
begin
select * from tbl_cliente;
end //
DELIMITER ;

call sp_mostrarCliente();

-- ---------------------------------------------
DELIMITER //
create procedure sp_mostrarServicios()
begin
select * from tbl_servicios;
end //
DELIMITER ;

call sp_mostrarServicios();

-- -------------------------------------
DELIMITER //
create procedure sp_mostrarDoctor()
begin
select * from tbl_doctor;
end //
DELIMITER ;

call sp_mostrarDoctor();

-- ------------------------------------------------
DELIMITER //
create procedure sp_mostrarCita()
begin
select * from tbl_cita;
end //
DELIMITER ;

call sp_mostrarCita();

-- -----------------------------------------------------
DELIMITER //
create procedure sp_mostrarDetalleCD()
begin
select * from tbl_detalle_cita_doctor;
end //
DELIMITER ;

call sp_mostrarDetalleCD();
select * from tbl_detalle_cita_doctor;

-- -----------------------------------------------
DELIMITER //
create procedure sp_mostrarDetalleCM()
begin
select * from tbl_detalle_cliente_mascota;
end //
DELIMITER ;

call sp_mostrarDetalleCM();
select * from tbl_detalle_cliente_mascota;

-- --------------------------------------------
DELIMITER //
create procedure sp_buscarMascota(id int)
begin
select * from tbl_mascota where id_mascota = id;
end //
DELIMITER ;

call sp_buscarMascota(1);
select * from tbl_mascota;

-- ---------------------------------------------------
DELIMITER //
create procedure sp_buscarCliente(id int)
begin
select * from tbl_cliente where id_cliente = id;
end //
DELIMITER ;

call sp_buscarCliente(1);
select * from tbl_cliente;

-- ----------------------------------------------------
DELIMITER //
create procedure sp_buscarDoctor(id int)
begin
select * from tbl_doctor where id_doctor = id;
end //
DELIMITER ;

call sp_buscarDoctor(1);
select * from tbl_doctor;

-- --------------------------------------------------
DELIMITER //
create procedure sp_buscarCita(id int)
begin
select * from tbl_cita where id_cita = id;
end //
DELIMITER ;

call sp_buscarCita(1);
select * from tbl_cita;

-- --------------------------------------------------
DELIMITER //
create procedure sp_buscarDetalleCD(id int)
begin
select * from tbl_detalle_cita_doctor where id_detalle_cita_medico = id;
end //
DELIMITER ;

call sp_buscarDetalleCD(1);
select * from tbl_detalle_cita_doctor;

-- ---------------------------------------------------
DELIMITER //
create procedure sp_buscarDetalleCM(id int)
begin
select * from tbl_detalle_cliente_mascota where id_detalle_cliente_mascota = id;
end //
DELIMITER ;

call sp_buscarDetalleCM(1);
select * from tbl_detalle_cliente_mascota;

-- ---------------------------------------------
DELIMITER //
create procedure sp_inicioSesion()
begin
select usuario_cliente, contraseña_cliente from tbl_cliente;
end //
DELIMITER ;

call sp_inicioSesion();
