--  DDL
drop database db_veterinaria;
create database db_veterinaria;
use db_veterinaria;

create table if not exists tbl_departamento
(
	id_departamento int not null auto_increment,
    departamento varchar(35),
    primary key (id_departamento),
    unique (id_departamento)
);

create table if not exists tbl_servicios
(
	id_servicios int not null auto_increment,
    servicios varchar(55),
    costo_servicios float,
    primary key (id_servicios),
    unique (id_servicios)
);

create table if not exists tbl_mascota
(
	id_mascota int not null auto_increment,
    nombre_mascota varchar(30),
    raza_mascota varchar(30),
    color_mascota varchar(30),
    estado_activo boolean,
    primary key (id_mascota),
    unique (id_mascota)
    
);

create table if not exists tbl_doctor
(
	id_doctor int not null auto_increment,
    nombre_doctor varchar(40),
    apellido_doctor varchar(40),
    telefono_doctor varchar(25),
    direccion_doctor varchar(40),
    id_departamento_doctor int,
    especialidad_doctor varchar(40),
    estado_activo boolean,
    primary key (id_doctor),
    unique (id_doctor),
    foreign key (id_departamento_doctor) references tbl_departamento (id_departamento)
);

create table if not exists tbl_cliente
(
	id_cliente int not null auto_increment,
    nombre_cliente varchar(40),
    apellido_cliente varchar(40),
    telefono_cliente varchar(25),
    email_cliente varchar(40),
    dpi_cliente varchar(25),
    usuario_cliente varchar(40),
    contraseña_cliente varchar(40),
    estado_activo boolean,
    primary key (id_cliente),
    unique (id_cliente)
);

create table if not exists tbl_cita
(
	id_cita int not null auto_increment,
    fecha_cita date,
    hora_cita time,
    nombre_mascota varchar(40),
    nombre_dueño_mascota varchar(40),
    email_dueño varchar(40),
    telefono_dueño varchar(25),
    id_servicio_cita int,
    dpi_dueño varchar(25), 
    nit_dueño varchar(40),
    costo_cita float,
    estado_activo boolean,
    primary key (id_cita),
    unique (id_cita),
    foreign key (id_servicio_cita) references tbl_servicios (id_servicios)
);

create table if not exists tbl_detalle_cita_doctor
(
	id_detalle_cita_medico int not null auto_increment,
    id_cita_detalle int,
    id_doctor_detalle int,
    id_servicios_detalle int,
    primary key (id_detalle_cita_medico),
    unique (id_detalle_cita_medico),
    foreign key (id_cita_detalle) references tbl_cita (id_cita),
    foreign key (id_doctor_detalle) references tbl_doctor (id_doctor),
    foreign key (id_servicios_detalle) references tbl_servicios (id_servicios)
);


create table if not exists tbl_detalle_cliente_mascota
(
	id_detalle_cliente_mascota int not null auto_increment,
    id_cliente_detalle int,
    id_mascota_detalle int,
    primary key (id_detalle_cliente_mascota),
    unique (id_detalle_cliente_mascota),
    foreign key (id_cliente_detalle) references tbl_cliente (id_cliente),
    foreign key (id_mascota_detalle) references tbl_mascota (id_mascota)
);


show tables;