SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- DROP DATABASE IF EXISTS `yydb_db`;

CREATE DATABASE IF NOT EXISTS `yydb_db`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `yydb_db`;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

-- -----------------------------
-- Table structure for yydb_user
-- -----------------------------
DROP TABLE IF EXISTS `yydb_user`;
create table `yydb_user`(
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `email` varchar(60) NOT NULL DEFAULT '',
  `name` varchar(60) NOT NULL DEFAULT '',
  `password` varchar(32) NOT NULL DEFAULT '',
  `money` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `pay_points` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `rank_points` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `reg_time` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `last_login` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `last_ip` varchar(60) NOT NULL DEFAULT '',
  `visit_count` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `rank_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `parent_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `mobile_phone` varchar(20) NOT NULL DEFAULT '',
  `is_validated` tinyint(1) UNSIGNED NOT NULL DEFAULT 0,
  `address_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT = 1000000000;

-- ----------------------------------
-- Table structure for yydb_user_rank
-- ----------------------------------
DROP TABLE IF EXISTS `yydb_user_rank`;
create table `yydb_user_rank`(
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL DEFAULT '',
  `min_points` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `max_points` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `spacial_rank` tinyint(1) UNSIGNED NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- -------------------------------------
-- Table structure for yydb_user_address
-- -------------------------------------
DROP TABLE IF EXISTS `yydb_user_address`;
create table `yydb_user_address`(
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL DEFAULT '',
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `consignee` varchar(60) NOT NULL DEFAULT '',
  `country` smallint(5) UNSIGNED NOT NULL DEFAULT 0,
  `province` smallint(5) UNSIGNED NOT NULL DEFAULT 0,
  `city` smallint(5) UNSIGNED NOT NULL DEFAULT 0,
  `district` smallint(5) UNSIGNED NOT NULL DEFAULT 0,
  `address` varchar(255) NOT NULL DEFAULT '',
  `zipcode` varchar(60) NOT NULL DEFAULT '',
  `tel` varchar(60) NOT NULL DEFAULT '',
  `mobile_phone` varchar(60) NOT NULL DEFAULT '',
  `best_time` varchar(120) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  INDEX `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;