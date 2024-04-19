CREATE TABLE IF NOT EXISTS user_entity (
    id UUID PRIMARY KEY,
    email varchar NOT NULL UNIQUE,
    username varchar(100) NOT NULL UNIQUE,
    password varchar NOT NULL
)