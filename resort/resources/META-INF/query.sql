CREATE TABLE `resort`.`resort_info` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  `checkInTime` TIME NULL,
  `checkOutTime` TIME NULL,
  `createBy` VARCHAR(45) NULL,
  `createDate` DATE NULL,
  `updateDate` DATE NULL,
  `owner` VARCHAR(45) NULL,
  `pricePerDay` DOUBLE NULL,
  PRIMARY KEY (`id`));
