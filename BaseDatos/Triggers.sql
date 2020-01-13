CREATE TABLE Recargas(
    idRecargas INT AUTO_INCREMENT,
    idClientes INT,
    Nombres VARCHAR(100),
    Apellidos VARCHAR(150),
    MontoActual DECIMAL(10, 2),
    FechaRecarga DATETIME DEFAULT CURRENT_TIMESTAMP,
    TipoPago VARCHAR(20),
    TipoCliente VARCHAR(20),
    PRIMARY KEY(idRecargas),
    FOREIGN KEY(idClientes) REFERENCES Clientes(idClientes)
);

CREATE TABLE agregarRecarga(
    idAgregarRecarga INT AUTO_INCREMENT,
    montoRecargar DECIMAL(10, 2),
    idRecargas INT,
    PRIMARY KEY(idAgregarRecarga),
    FOREIGN KEY(idRecargas) REFERENCES Recargas(idRecargas)
);
INSERT INTO Clientes VALUES
(NULL,'JIMMY', 'HUAMANI', 12345678, 'MASCULINO', 'Escolar', 'sjdfl', DEFAULT, DEFAULT),
(NULL,'juan', 'HUAMANI', 12335678, 'MASCULINO', 'Escolar', 'sjdfl', DEFAULT, DEFAULT),
(NULL,'erick', 'HUAMANI', 16665678, 'MASCULINO', 'Escolar', 'sjdfl', DEFAULT, DEFAULT);

INSERT INTO Recargas VALUES
(NULL, 1, 'JIMMY', 'HUAMANI', 0, DEFAULT, 'EFECTICO', 'Escolar'),
(NULL, 2, 'juan', 'HUAMANI', 0, DEFAULT, 'EFECTICO', 'Escolar'),
(NULL, 3, 'erick', 'HUAMANI', 0, DEFAULT, 'EFECTICO', 'Escolar');

INSERT INTO agregarRecarga VALUES
(NULL, 34, 1),
(NULL, 64, 2),
(NULL, 53, 3);

DELIMITER //
CREATE TRIGGER RECARGA_UPDATE
BEFORE UPDATE
ON agregarRecarga FOR EACH ROW
BEGIN
UPDATE Recargas
SET MontoActual=MontoActual+(NEW.montoRecargar + OLD.montoRecargar)
WHERE idRecargas = OLD.idRecargas;
END;
//

UPDATE agregarRecarga 
SET montoRecargar = 40 WHERE idRecargas = 1;
