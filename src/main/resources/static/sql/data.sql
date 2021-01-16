DELETE FROM roles;
DELETE FROM users;

INSERT INTO users(username,password)
	VALUES('personal','$2a$10$ApoufhCm7R.GeAFWBLT4WeklAShvEwkwoIZRXDgIJsHQHapjyE4oK');--alex123
INSERT INTO users(username,password)
	VALUES('personali','$2a$10$ApoufhCm7R.GeAFWBLT4WeklAShvEwkwoIZRXDgIJsHQHapjyE4oK');
	
INSERT INTO roles(username,role) VALUES ('personal', 'USER');
INSERT INTO roles(username,role) VALUES ('personali', 'ADMIN'); 
INSERT INTO roles(username,role) VALUES ('personali', 'USER');