CREATE TABLE IF NOT EXISTS users (
  servicio VARCHAR(100),
  nombre VARCHAR(100),
  contrasenna VARCHAR(100)
);

INSERT INTO users (servicio, nombre, contrasenna)
VALUES ('correo', 'juan.perez', 'miContraseña123');


