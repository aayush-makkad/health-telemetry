CREATE TABLE `registrations` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `url` VARCHAR(1000) NOT NULL,
  `alias` VARCHAR(1000) NULL,
  `registrationTimestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
