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
UPDATE Recargas 
SET montoRecargar = 30 WHERE idClientes = 1;

select * from Recargas;
select * from Clientes;