CREATE DATABASE marwah_adriani;


USE marwah_adriani;

CREATE TABLE users (
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    token VARCHAR(100),
    toked_expired_at BIGINT,
    PRIMARY KEY(username),
    UNIQUE(token)
) ENGINE InnoDB;

SELECT * FROM users;

DESC users;

CREATE TABLE product (
    id VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    jumlah VARCHAR(100),
    type VARCHAR(100),
    address VARCHAR(100),
    PRIMARY KEY(id),
    FOREIGN KEY fk_name_product (username) REFERENCES users (username)
) ENGINE InnoDB;

SELECT * FROM product;
DESC product;


CREATE TABLE address (
    id VARCHAR(100) NOT NULL,
    product_id VARCHAR(100) NOT NULL,
    name VARCHAR(100),
    street VARCHAR(100),
    city    VARCHAR(100),
    province VARCHAR(100),
    country VARCHAR(100),
    postcode VARCHAR(100),
    PRIMARY KEY(id),
    FOREIGN KEY fk_product_addrees(product_id) REFERENCES product (id)
) ENGINE InnoDB;

SELECT * FROM address;

DESC address;