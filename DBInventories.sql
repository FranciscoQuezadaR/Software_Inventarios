CREATE DATABASE inventories
USE inventories

CREATE TABLE empresas (
  idEmpresa int IDENTITY NOT NULL, 
  nombre    varchar(50)  NOT NULL UNIQUE, 
  giro      varchar(30)  NOT NULL, 
  email     varchar(50)  NULL UNIQUE, 
  telefono  varchar(10)  NOT NULL UNIQUE, 
  domicilio varchar(100) NOT NULL, 
  CONSTRAINT PK_empresas PRIMARY KEY (idEmpresa)
);

CREATE TABLE productos (
  idProd       int IDENTITY NOT NULL, 
  codigo       int          NOT NULL, 
  nombre       varchar(30)  NOT NULL UNIQUE, 
  marca        varchar(20)  NOT NULL, 
  precioCompra float(10)    NOT NULL, 
  precioVenta  float(10)    NOT NULL, 
  existencias  int          NOT NULL, 
  idProvedor   int          NOT NULL, 
  CONSTRAINT PK_producto PRIMARY KEY (idProd), 
  CONSTRAINT UQ_producto UNIQUE (codigo)
);

CREATE TABLE productos_ventas (
  codigo       int       NOT NULL, 
  prodCantidad int       NOT NULL, 
  prodTotal    float(10) NOT NULL, 
  idVenta      int       NOT NULL, 
  idProd       int		 NOT NULL
);

CREATE TABLE provedores (
  idProvedor    int IDENTITY NOT NULL, 
  nombre        varchar(100) NOT NULL, 
  telefono      varchar(10)  NOT NULL UNIQUE, 
  email         varchar(50)  NULL UNIQUE, 
  fechaContrato date         NOT NULL, 
  idEmpresa     int          NOT NULL, 
  CONSTRAINT PK_provedor PRIMARY KEY (idProvedor)
);

CREATE TABLE usuarios (
  idUsuario  int IDENTITY NOT NULL, 
  usuario    varchar(50)  NOT NULL, 
  contrasena varchar(20)  NOT NULL, 
  CONSTRAINT PK_usuarios PRIMARY KEY (idUsuario)
);

CREATE TABLE ventas (
  idVenta  int IDENTITY NOT NULL, 
  fecha    datetime     NOT NULL, 
  subtotal float(10)    NOT NULL, 
  total    float(10)    NOT NULL, 
  CONSTRAINT PK_ventas PRIMARY KEY (idVenta)
);


ALTER TABLE dbo.productos ADD CONSTRAINT FKproductos641334 FOREIGN KEY (idProvedor) REFERENCES dbo.provedores (idProvedor) ON UPDATE Cascade ON DELETE Cascade;
ALTER TABLE dbo.productos_ventas ADD CONSTRAINT FKproductos_231111 FOREIGN KEY (idVenta) REFERENCES dbo.ventas (idVenta) ON UPDATE Cascade ON DELETE Cascade;
ALTER TABLE dbo.productos_ventas ADD CONSTRAINT FKproductos_696608 FOREIGN KEY (idProd) REFERENCES dbo.productos (idProd) ON UPDATE Cascade ON DELETE Cascade;
ALTER TABLE dbo.provedores ADD CONSTRAINT FKprovedores546863 FOREIGN KEY (idEmpresa) REFERENCES dbo.empresas (idEmpresa) ON UPDATE Cascade ON DELETE Cascade;

SELECT * FROM ventas
SELECT * FROM productos_ventas

DELETE FROM ventas
DELETE FROM productos_ventas

SELECT p.nombre, pv.prodCantidad, pv.prodTotal
FROM ventas AS v, productos_ventas AS pv, productos AS p
WHERE (v.idVenta = pv.idVenta) AND (pv.idProd = p.idProd) AND pv.codigo = 1
