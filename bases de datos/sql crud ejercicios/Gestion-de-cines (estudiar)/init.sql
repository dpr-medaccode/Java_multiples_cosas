CREATE TABLE peliculas (
    id_pelicula INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    duracion INT NOT NULL
);

CREATE TABLE salas (
    id_sala INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    capacidad INT NOT NULL
);

CREATE TABLE reservas (
    id_reserva INT PRIMARY KEY AUTO_INCREMENT,
    id_pelicula INT NOT NULL,
    id_sala INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    nombre_cliente VARCHAR(100) NOT NULL,
    asientos_reservados INT NOT NULL,
    FOREIGN KEY (id_pelicula) REFERENCES peliculas (id_pelicula) ON DELETE CASCADE,
    FOREIGN KEY (id_sala) REFERENCES salas (id_sala) ON DELETE CASCADE -- eliminara la reserva si se elimina la pelicula, muy util
);

INSERT INTO
    peliculas (titulo, genero, duracion)
VALUES (
        'Inception',
        'Ciencia Ficción',
        148
    );

INSERT INTO salas (nombre, capacidad) VALUES ('Sala 1', 100);

INSERT INTO
    reservas (
        id_pelicula,
        id_sala,
        fecha,
        hora,
        nombre_cliente,
        asientos_reservados
    )
VALUES (
        1,
        1,
        '2025-05-14',
        '19:30:00',
        'Juan Pérez',
        2
    );