CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    fecha DATE NOT NULL,
    pista INT NOT NULL,
    hora TIME NOT NULL,
    duracion INT NOT NULL -- 0 = 60, 1 = 120/1; 2 =120/2
);

INSERT INTO reservas (nombre, fecha, pista, hora, duracion)
VALUES ('Juan', '2000-02-02', 1, '09:00:00', 0);

