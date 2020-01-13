DELIMITER //
CREATE PROCEDURE spClientesPorMesTipo(IN actualYear VARCHAR(4))
BEGIN
  SELECT month(FechaRegistrado), TipoCliente, count(*), FechaRegistrado
  FROM Clientes
  WHERE YEAR(FechaRegistrado) = actualYear
  GROUP BY month(FechaRegistrado), TipoCliente;
END;
//
DELIMITER;
