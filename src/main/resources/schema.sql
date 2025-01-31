CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    authors TEXT NOT NULL,  -- Comma-separated authors
    isbn VARCHAR(20) UNIQUE NOT NULL,
    publisher VARCHAR(255),
    publication_date DATE,
    genres TEXT NOT NULL,  -- Comma-separated genres
    number_of_pages INT,
    language VARCHAR(100),
    format VARCHAR(50),
    price DOUBLE,
    rating DOUBLE,
    description TEXT
);
