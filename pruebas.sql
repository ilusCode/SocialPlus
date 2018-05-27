DROP DATABASE pruebas;
create database pruebas;

use pruebas;

create table Cliente (
    idCli int AUTO_INCREMENT CHECK(idCli>=1),
    nombre varchar (50) NOT NULL,
    direccion VARCHAR (50) Not NULL,
    ciudad VARCHAR (20) NOT NULL,
    cp int (5) NOT NULL,
    tel BIGINT(10) NOT NULL,
    PRIMARY KEY (idCli)
);

CREATE TABLE Mobiliario(
    idMob int AUTO_INCREMENT CHECK(idMob>=1),
    descrip VARCHAR (30),
    precio DOUBLE NOT NULL,
    p_unitario DOUBLE NOT NULL,
    nexistencia INT,
    provedor VARCHAR(50) NOT NULL,
    PRIMARY KEY (idMob)
);

CREATE TABLE Evento(
    folio int AUTO_INCREMENT CHECK(folio>=1),
    descu int NOT NULL,
    idCli int CHECK(idCli>0),
    f_evento date DEFAULT "2018-05-30"  CHECK(f_evento>="2018-05-30"),
    f_entrega date DEFAULT "2018-05-30"  CHECK(f_entrega>="2018-05-30"),
    f_dev date DEFAULT "2018-05-30"  CHECK(f_dev>="2018-05-30"),
    PRIMARY KEY (folio),
    FOREIGN KEY (idCli) REFERENCES Cliente (idCli)
);

CREATE table Mob_Evento(
    cantidad int,
    folio int,
    idMob int,
    FOREIGN KEY (folio) REFERENCES Evento (folio),
    FOREIGN KEY (idMob) REFERENCES Mobiliario (idMob)
);

insert into cliente(nombre,direccion,ciudad,cp,tel) values 
                                    ("Luis Roberto Perdomo Martínez","Nuevo Mexico Sur","toluca",50250,7221444281),
                                    ("Marian Isabel Perdomo Martínez","Nuevo Mexico Sur","toluca",50250,7227714268),
                                    ("Claudia Maria Vazquez Moreno","Nuevo Mexico Sur","toluca",50250,7223838137),
                                    ("Yaneth Casimiro Hernandez","Nuevo Mexico Sur","toluca",50250,7221444281),
                                    ("Maritza Lara Mendizabal","Nuevo Mexico Sur","toluca",50250,7221444218);

insert into Mobiliario(descrip,precio,p_unitario,nexistencia,provedor) VALUES
                                    ("mesa cuadrada",170,40,10,"toluca"),
                                    ("mesa redonda",200,50,10,"toluca"),
                                    ("silla normal",20,7,100,"toluca"),
                                    ("silla tifani",40,14,100,"toluca"),
                                    ("mesa media luna",150,50,2,"toluca");

insert into Evento(idCli,descu,f_evento,f_entrega,f_dev) values 
                                    (1,10,"2018-06-02","2018-06-01","2018-06-03"),
                                    (2,15,"2018-06-03","2018-06-04","2018-06-05"),
                                    (1,10,"2018-06-05","2018-06-06","2018-06-07"),
                                    (2,5,"2018-06-08","2018-06-09","2018-06-10"),
                                    (3,20,"2018-06-11","2018-06-12","2018-06-13");

insert into Mob_Evento(cantidad, idMob, folio) VALUES
                                    (5,1,1),                                        
                                    (100,4,2),
                                    (1,5,5),
                                    (10,2,2),
                                    (1,1,4);
                                                                        


