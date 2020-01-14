DELIMITER //
CREATE PROCEDURE spClientesPorMesTipo(IN actualYear VARCHAR(4))
BEGIN
  SELECT month(FechaRegistrado), TipoCliente, count(*), FechaRegistrado
  FROM Clientes
  WHERE YEAR(FechaRegistrado) = actualYear
  GROUP BY month(FechaRegistrado), TipoCliente;
END;
//


DELIMITER //
ALTER PROCEDURE spClienteDetalle(IN NumeroDni VARCHAR(8))
BEGIN
  SELECT Recargas.FechaRecarga, Recargas.montoRecargar, Clientes.Nombres, Clientes.Apellidos
  FROM Recargas
  INNER JOIN Clientes
  ON Clientes.idClientes=Recargas.idClientes
  WHERE Clientes.DNI = NumeroDni;
END;
//
