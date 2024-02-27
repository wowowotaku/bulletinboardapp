-- ranksテーブル
INSERT IGNORE INTO ranks (rank_name, rank_value) VALUES ('Bronze', 1);
INSERT IGNORE INTO ranks (rank_name, rank_value) VALUES ('Silver', 2);
INSERT IGNORE INTO ranks (rank_name, rank_value) VALUES ('Gold', 3);

-- usersテーブル
INSERT IGNORE INTO users (username, email, password, rank_id) VALUES ('user1', 'user1@example.com', 'password1', 1);
INSERT IGNORE INTO users (username, email, password, rank_id) VALUES ('user2', 'user2@example.com', 'password2', 2);
INSERT IGNORE INTO users (username, email, password, rank_id) VALUES ('user3', 'user3@example.com', 'password3', 3);

-- boardテーブル
INSERT IGNORE INTO board (user_id, rank_id, content) VALUES (1, 1, 'Looking for a Bronze duo partner!');
INSERT IGNORE INTO board (user_id, rank_id, content) VALUES (2, 2, 'Silver team seeking scrims.');
INSERT IGNORE INTO board (user_id, rank_id, content) VALUES (3, 3, 'Gold player offering coaching.');
