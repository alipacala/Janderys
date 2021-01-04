CREATE TABLE TiposUsuario (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Nombres VARCHAR(255) NOT NULL
)

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

CREATE TABLE Clientes (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    
    Dni CHAR(8) NOT NULL,
    Nombres VARCHAR(255) NOT NULL,
    Apellidos VARCHAR(255) NOT NULL,
    FechaNac DATE NOT NULL,

    Direccion VARCHAR(255),
    NroCelular CHAR(12),
    Email VARCHAR(255)
)

CREATE TABLE Ventas (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Serie INT NOT NULL,
    Nro INT NOT NULL,
    Fecha DATE NOT NULL,

    IdCliente INT NOT NULL,
    IdEmpleado INT NOT NULL,

    ValorVenta NUMERIC(7, 2) NOT NULL,
    Descuento NUMERIC(7, 2) NOT NULL,
    Subtotal NUMERIC(7, 2) NOT NULL,
    Igv NUMERIC(7, 2) NOT NULL,
    Total NUMERIC(7, 2) NOT NULL
)

CREATE TABLE DetallesVenta (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    IdVenta INT NOT NULL,
    IdCalzado INT NOT NULL,
    Cantidad INT NOT NULL,
    PrecioUnit NUMERIC(5, 2),
    Total NUMERIC(6, 2) NOT NULL
)

CREATE TABLE Calzados (
    Id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion VARCHAR(255),
    Categoria VARCHAR(255),
    Stock INT NOT NULL,
    PrecioCosto NUMERIC(5, 2),
    PrecioVenta NUMERIC(5, 2),
    Disponible BIT
)