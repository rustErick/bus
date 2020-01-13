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
CREATE PROCEDURE spClienteDetalle(IN NumeroDni INT(8))
BEGIN
  SELECT R.idRecargas, R.MontoActual, C.Nombres, C.Apellidos, C.Picture
  FROM Clientes AS C
  INNER JOIN Recargas AS R ON R.idClientes=C.idClientes
  WHERE C.DNI = 45345345;
END;
//
