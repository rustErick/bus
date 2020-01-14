CREATE DATABASE BDBuses;
USE BDBuses;

CREATE TABLE Usuarios (
    idUsuarios INT AUTO_INCREMENT,
    Nombres VARCHAR(100),
    Apellidos VARCHAR(150),
    DNI INT(8),
    Telefono INT(10),
    Username VARCHAR(50),
    Pass VARCHAR(100),
    Picture VARCHAR(255),
    Sexo VARCHAR(10),
    Estado VARCHAR(10) DEFAULT 'Activo',
    Cargo VARCHAR(13) DEFAULT 'Empleado',
    PRIMARY KEY(idUsuarios)
);

CREATE TABLE Clientes (
    idClientes INT AUTO_INCREMENT,
    Nombres VARCHAR(100),
    Apellidos VARCHAR(150),
    DNI INT(8),
    Sexo VARCHAR(10),
    TipoCliente VARCHAR(20),
    Picture VARCHAR(255),
    Estado VARCHAR(10) DEFAULT 'Activo',
    FechaRegistrado DATETIME DEFAULT CURRENT_TIMESTAMP,
    MontoActual DECIMAL(10, 2) DEFAULT 0.0,
    PRIMARY KEY(idClientes)
);

CREATE TABLE Recargas(
    idRecargas INT AUTO_INCREMENT,
    idClientes INT,
    FechaRecarga DATETIME DEFAULT CURRENT_TIMESTAMP,
    TipoPago VARCHAR(20),
    montoRecargar DECIMAL(10, 2) DEFAULT 0.0,
    PRIMARY KEY(idRecargas),
    FOREIGN KEY(idClientes) REFERENCES Clientes(idClientes)
);

CREATE TABLE EstadoCliente (
    id INT AUTO_INCREMENT,
    Saldo DECIMAL(10, 8),
    FechaViaje DATETIME DEFAULT CURRENT_TIMESTAMP,
    FechaPago DATETIME DEFAULT CURRENT_TIMESTAMP,
    MontoPago DECIMAL(5, 3),
    PRIMARY KEY(id)
);
