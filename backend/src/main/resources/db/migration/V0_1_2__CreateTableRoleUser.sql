-- auto-generated definition
CREATE TABLE t_user_role
(
  user_id INT DEFAULT 0     NOT NULL,
  role_nom       VARCHAR(50) DEFAULT '' NOT NULL,
  PRIMARY KEY (user_id, role_nom),
  CONSTRAINT fk_user_id
  FOREIGN KEY (user_id) REFERENCES tuser (id),
  CONSTRAINT fk_role_nom
  FOREIGN KEY (role_nom) REFERENCES trole (nom)
)
  ENGINE = InnoDB;

CREATE INDEX fk_role_nom
  ON t_user_role (role_nom);

  CREATE INDEX fk_user_id
  ON t_user_role (user_id);

