CREATE DATABASE IF NOT EXISTS Janderys
GO

CREATE TABLE TiposUsuario (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Nombres VARCHAR(255) NOT NULL
)
GO

CREATE TABLE Empleados (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    
    Dni CHAR(8) NOT NULL,
    Nombres VARCHAR(255) NOT NULL,
    Apellidos VARCHAR(255) NOT NULL,
    FechaNac DATE NOT NULL,

    Usuario VARCHAR(255),
    Contrasena VARCHAR(63),
    IdTipoUsuario INT,
    Estado BIT,

    Cargo VARCHAR(255),

    FOREIGN KEY (IdTipoUsuario) REFERENCES TiposUsuario (Id)
)
GO

CREATE TABLE Clientes (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    
    Dni CHAR(8) NOT NULL,
    Nombres VARCHAR(255) NOT NULL,
    Apellidos VARCHAR(255) NOT NULL,
    FechaNac DATE NOT NULL,

    Direccion VARCHAR(255) NULL,
    NroCelular CHAR(12) NULL,
    Email VARCHAR(255) NULL
)
GO

