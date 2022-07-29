create table if not exists books (
    id identity primary key,
    title varchar(255),
    author varchar(255),
    price varchar(255)
);