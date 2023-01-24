CREATE TABLE IF NOT EXISTS post (id SERIAL PRIMARY KEY,post varchar(255),user_fk int REFERENCES site_user(id));
