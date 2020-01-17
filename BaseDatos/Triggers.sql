DELIMITER //
CREATE TRIGGER AgregarRecarga
BEFORE  INSERT
ON Recargas FOR EACH ROW
BEGIN
UPDATE Clientes
SET MontoActual = MontoActual + NEW.montoRecargar 
WHERE idClientes = NEW.idClientes;
END;
//


insert into Recargas values(null, 7, default, 'tarjeta', 100);

DELIMITER //
CREATE TRIGGER ActualizarRecarga
BEFORE DELETE
ON Recargas FOR EACH ROW
BEGIN
UPDATE 

select * from Recargas;
select * from Clientes;