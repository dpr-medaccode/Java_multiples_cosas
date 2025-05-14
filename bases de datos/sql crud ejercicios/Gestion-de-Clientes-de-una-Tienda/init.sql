CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(150) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(20)
);

INSERT INTO clientes (nombre, apellidos, email, telefono)
VALUES ('Juan', 'Perez Gomez', 'juan.perez@example.com', '555-1234');


