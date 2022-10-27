SELECT * FROM ROLE
SELECT * FROM USERS
SELECT * FROM USER_roles

--INGRESAR EN ESE ORDEN PARA MANTENER EL MISMO ID
INSERT INTO ROLE VALUES ('Estudiante')
INSERT INTO ROLE VALUES ('Administrador')
INSERT INTO ROLE VALUES ('OrgSocial')
INSERT INTO ROLE VALUES ('Emprendimiento')
INSERT INTO ROLE VALUES ('Coordinador')
INSERT INTO ROLE VALUES ('Docente')
INSERT INTO ROLE VALUES ('Preinscrito')

USE [AANTIK]
GO

INSERT INTO [dbo].[user_roles]
           ([usuario_id]
           ,[role_id])
     VALUES
           (1,2)
GO

INSERT INTO USERS VALUES ('123','ESTUDIANTE@PRUEBA')
INSERT INTO USERS VALUES ('123','admin@PRUEBA')
INSERT INTO USERS VALUES ('111','OrgSocial@PRUEBA')
INSERT INTO USERS VALUES ('111','emprendimiento@PRUEBA')
INSERT INTO USERS VALUES ('111','docente@PRUEBA')
INSERT INTO USERS VALUES ('000','preinscrito@PRUEBA')
INSERT INTO USERS VALUES ('124','user@holi.com')

--primera columna es el id del usuario, segunda columna es el id del rol
INSERT INTO user_roles VALUES ('10','1')
INSERT INTO user_roles VALUES ('11','2')
INSERT INTO user_roles VALUES ('12','3')
INSERT INTO user_roles VALUES ('13','4')
INSERT INTO user_roles VALUES ('14','6')
INSERT INTO user_roles VALUES ('15','7')

--Ejemplo de update
update user_roles set role_id='5' where usuario_id='1'