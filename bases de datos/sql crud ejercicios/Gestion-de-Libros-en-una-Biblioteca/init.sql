CREATE TABLE libros (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(50) NOT NULL,
    annoPublicacion INT NOT NULL,
    genero VARCHAR(30) NOT NULL,
    disponible BOOLEAN DEFAULT TRUE
);

INSERT INTO
    libros (
        titulo,
        autor,
        annoPublicacion,
        genero,
        disponible
    )
VALUES (
        'Cien años de soledad',
        'Gabriel García Márquez',
        1967,
        'Realismo mágico',
        TRUE
    );