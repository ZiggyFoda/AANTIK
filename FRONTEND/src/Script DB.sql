SELECT * FROM ROLE
SELECT * FROM USERS
SELECT * FROM USER_roles

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

