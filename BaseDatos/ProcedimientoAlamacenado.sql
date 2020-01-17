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
CREATE PROCEDURE spRecargasMes(IN actualYear VARCHAR(4))
BEGIN
  SELECT month(FechaRecarga), TipoPago, count(*), FechaRecarga
  FROM Recargas
  WHERE YEAR(FechaRecarga) = actualYear
  GROUP BY month(FechaRecarga), TipoPago;
END;
//

DELIMITER //
CREATE PROCEDURE spClienteDetalle()
BEGIN
  SELECT C.Nombres, C.Apellidos, C.DNI, C.TipoCliente, R.FechaRecarga, R.montoRecargar, R.TipoPago
  FROM Recargas AS R
  INNER JOIN Clientes AS C
  ON C.idClientes=R.idClientes;
END;
//


DELIMITER //
CREATE PROCEDURE spDetalleRecarga(IN dni INT(8))
BEGIN
  SELECT C.DNI, C.Nombres, C.Apellidos, C.MontoActual, R.montoRecargar, R.TipoPago
  FROM Recargas AS R
  INNER JOIN Clientes AS C
  ON C.idClientes=R.idClientes
  WHERE C.DNI=dni;
END;
//
