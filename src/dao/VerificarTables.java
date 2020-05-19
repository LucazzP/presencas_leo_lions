package dao;

import controller.CadastrarUsuarioController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerificarTables {
    Conexao conexao = new Conexao();

    public void verificar(){
        try {
            boolean haveUsuarioTable = conexao.getConnection().getMetaData().getTables(null, null, "usuario", null).next();
            boolean haveReuniaoTable = conexao.getConnection().getMetaData().getTables(null, null, "reuniao", null).next();
            boolean havePresencaTable = conexao.getConnection().getMetaData().getTables(null, null, "presenca", null).next();
            if(!haveUsuarioTable){
                conexao.executeQuery(createTableUsuario);
            }
            if(!haveReuniaoTable){
                conexao.executeQuery(createTableReuniao);
            }
            if(!havePresencaTable){
                conexao.executeQuery(createTablePresenca);
            }
            if(!haveUsuarioTable) {
                CadastrarUsuarioController cadastrarUsuarioController = new CadastrarUsuarioController(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    final String createTableUsuario =
            "CREATE TABLE `db_bsi`.`usuario` (\n" +
            "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `nome` VARCHAR(45) NULL DEFAULT NULL,\n" +
            "  `senha` VARCHAR(200) NULL DEFAULT NULL,\n" +
            "  `idade` INT NULL DEFAULT 16,\n" +
            "  `email` VARCHAR(70) NULL DEFAULT NULL,\n" +
            "  `permissao` INT NULL DEFAULT '0',\n" +
            "  `salt` VARCHAR(70) NULL DEFAULT '0',\n" +
            "  PRIMARY KEY (`id`))";

    final String createTableReuniao = "CREATE TABLE `db_bsi`.`reuniao` (\n" +
            "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `data` DATETIME NOT NULL,\n" +
            "  `numero` INT NULL,\n" +
            "  PRIMARY KEY (`id`))";

    final String createTablePresenca = "CREATE TABLE `presenca` (\n" +
            "  `reuniao_id` INT NOT NULL,\n" +
            "  `usuario_id` INT NOT NULL,\n" +
            "  PRIMARY KEY (`reuniao_id`, `usuario_id`),\n" +
            "  INDEX `fk_reuniao_has_usuario_usuario1_idx` (`usuario_id` ASC) VISIBLE,\n" +
            "  INDEX `fk_reuniao_has_usuario_reuniao_idx` (`reuniao_id` ASC) VISIBLE,\n" +
            "  CONSTRAINT `fk_reuniao_has_usuario_reuniao`\n" +
            "    FOREIGN KEY (`reuniao_id`)\n" +
            "    REFERENCES `db_bsi`.`reuniao` (`id`)\n" +
            "    ON DELETE CASCADE \n" +
            "    ON UPDATE CASCADE ,\n" +
            "  CONSTRAINT `fk_reuniao_has_usuario_usuario1`\n" +
            "    FOREIGN KEY (`usuario_id`)\n" +
            "    REFERENCES `db_bsi`.`usuario` (`id`)\n" +
            "    ON DELETE CASCADE \n" +
            "    ON UPDATE CASCADE )\n";

}
