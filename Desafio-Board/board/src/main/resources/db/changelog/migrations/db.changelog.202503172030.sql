--liquibase formatted sql
--changeset pablo:202503172030
--comment: boards table create

CREATE TABLE BOARDS(
    id BIGINT AUT_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

--rollback DROP TABLE BOARDS