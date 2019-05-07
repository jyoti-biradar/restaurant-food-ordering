-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 23, 2019 at 07:39 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurentlogin`
--

-- --------------------------------------------------------

--
-- Table structure for table `menus`
--

DROP TABLE IF EXISTS `menus`;
CREATE TABLE IF NOT EXISTS `menus` (
  `id` int(50) NOT NULL,
  `menuitems` varchar(100) NOT NULL,
  `subitems` varchar(100) NOT NULL,
  `price` int(100) NOT NULL,
  `available/or_not` varchar(50) NOT NULL,
  UNIQUE KEY `unique` (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menus`
--

INSERT INTO `menus` (`id`, `menuitems`, `subitems`, `price`, `available/or_not`) VALUES
(1, 'burger', 'becon', 100, 'true'),
(2, 'burger', 'cheese_burger', 200, 'true'),
(3, 'burger', 'smash', 250, 'true'),
(4, 'burger', 'chilli', 150, 'true'),
(5, 'burger', 'rice', 180, 'true'),
(6, 'burger', 'veggie', 250, 'true'),
(7, 'burger', 'steak', 100, 'true'),
(8, 'burger', 'chinese', 140, 'true'),
(9, 'burger', 'veg_burger', 130, 'true'),
(10, 'cake', 'AngelFoodCake', 200, 'true'),
(11, 'cake', 'AppleCake', 300, 'true'),
(12, 'cake', 'BananaCake', 340, 'true'),
(13, 'cake', 'BatternBergCake', 240, 'true'),
(14, 'cake', 'BlackForestCake', 220, 'true'),
(15, 'cake', 'Brownies', 120, 'true'),
(16, 'cake', 'CarrotCake', 100, 'true'),
(17, 'cake', 'CharlotteCake ', 300, 'true'),
(18, 'cake', 'Chocolate Cake  ', 140, 'true'),
(19, 'pizza', 'FarmHousePizza', 340, 'true'),
(20, 'pizza', 'PeppyPaneerpizza', 140, 'true'),
(21, 'pizza', 'MexicanGreenWave', 129, 'true'),
(22, 'pizza', 'CHEESECORN', 100, 'true'),
(23, 'pizza', 'PANEER MAKHANI ', 120, 'true'),
(24, 'pizza', 'VEGGIE PARADISE', 120, 'true'),
(25, 'pizza', 'FRESH VEGGIE', 120, 'true'),
(26, 'pizza', 'Non Veg Supreme', 220, 'true'),
(27, 'pizza', 'CHICKEN FIESTA ', 120, 'true'),
(28, 'rice', 'tamarindRice', 120, 'true'),
(29, 'rice', 'tomatoRice', 100, 'true'),
(30, 'rice', 'LemonRice', 100, 'true'),
(31, 'rice', 'jeeraRice', 130, 'true'),
(32, 'rice', 'ricekheer', 110, 'true'),
(33, 'rice', 'PlainBasmatiwhiteRice', 300, 'true'),
(34, 'noodles', 'EggNoodles', 50, 'true'),
(35, 'noodles', 'chowmein', 70, 'true'),
(36, 'noodles', 'oatsnoodle', 40, 'true'),
(37, 'noodles', 'chickenchowmein', 90, 'true'),
(38, 'noodles', 'panfriedNoddles', 100, 'true'),
(39, 'noodles', 'vegchowmein', 200, 'true'),
(40, 'noodles', 'singapore-noodles', 290, 'true'),
(41, 'noodles', 'paneernoodles', 320, 'true'),
(42, 'noodles', 'chickenschewannoodles', 290, 'true'),
(43, 'chicken', 'barbecueChicken', 200, 'true'),
(44, 'chicken', 'Chickenlollipop', 220, 'true'),
(45, 'chicken', 'fried-chicken', 150, 'true'),
(46, 'chicken', 'TandooriChicken', 130, 'true'),
(47, 'chicken', 'Chickencurry', 250, 'true'),
(48, 'chicken', 'LemongrassChicken', 300, 'true'),
(49, 'fish', 'Masala Fried Pomfret', 120, 'true'),
(50, 'fish', 'Fish Cutlets', 140, 'true'),
(51, 'fish', 'Fishfry', 100, 'true'),
(52, 'fish', 'salmon fish', 200, 'true'),
(53, 'salad', 'ckicken salad', 100, 'true'),
(54, 'salad', 'Chinesechickensalad', 130, 'true'),
(55, 'salad', 'Cookie_salad', 200, 'true'),
(56, 'salad', 'EggSalad', 150, 'true'),
(57, 'salad', 'Fruit_salad', 150, 'true'),
(58, 'salad', 'gardenSalad', 170, 'true'),
(59, 'vegetables', 'Spanich', 200, 'true'),
(60, 'vegetables', 'gobi', 60, 'true'),
(61, 'vegetables', 'Hyderabadi Baingan', 90, 'true'),
(62, 'vegetables', 'PavBhaji', 100, 'true'),
(63, 'vegetables', 'Spicy_Bhindi', 100, 'true'),
(64, 'vegetables', 'Puran_Poli', 200, 'true'),
(65, 'vegetables', 'Fenugreek', 50, 'true'),
(66, 'vegetables', 'kajuvadi', 50, 'true'),
(67, 'vegetables', 'BatataVada', 80, 'true'),
(68, 'Drinks', 'water', 20, 'true'),
(69, 'Drinks', 'coco cola', 45, 'true'),
(70, 'Drinks', 'pepsi', 30, 'true'),
(71, 'Drinks', 'Sprite', 30, 'true'),
(72, 'Drinks', 'thumsup', 30, 'true'),
(73, 'Drinks', 'maaza', 40, 'true');

-- --------------------------------------------------------

--
-- Table structure for table `orderitemtosafe`
--

DROP TABLE IF EXISTS `orderitemtosafe`;
CREATE TABLE IF NOT EXISTS `orderitemtosafe` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `menus` varchar(100) NOT NULL,
  `rate` int(50) NOT NULL,
  `quantity` int(50) NOT NULL,
  `tablenum` int(50) NOT NULL,
  `userid` int(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  PRIMARY KEY (`id`,`userid`)
) ENGINE=MyISAM AUTO_INCREMENT=72 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orderitemtosafe`
--

INSERT INTO `orderitemtosafe` (`id`, `menus`, `rate`, `quantity`, `tablenum`, `userid`, `username`) VALUES
(2, 'cheese_burger', 200, 2, 20, 500, 'tanaji'),
(6, 'veggie', 250, 1, 78, 20, 'abc'),
(63, 'Spicy_Bhindi', 100, 1, 2, 20, 'abc'),
(71, 'Sprite', 30, 1, 1, 10, 'jyoti'),
(2, 'cheese_burger', 200, 2, 1, 10, 'jyoti'),
(56, 'EggSalad', 150, 2, 1, 10, 'jyoti'),
(2, 'cheese_burger', 200, 2, 50, 2, 'balaji'),
(3, 'smash', 250, 2, 10, 20, 'jyoti'),
(2, 'cheese_burger', 200, 2, 10, 20, 'netaji'),
(68, 'water', 20, 1, 10, 1, 'netaji');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE IF NOT EXISTS `register` (
  `username` varchar(100) NOT NULL,
  `password` bigint(50) NOT NULL,
  `mobilenumber` bigint(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `Date` datetime(6) NOT NULL,
  PRIMARY KEY (`mobilenumber`),
  UNIQUE KEY `unique` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`username`, `password`, `mobilenumber`, `email`, `gender`, `address`, `Date`) VALUES
('swati', 1997, 9270297704, 'swatib3266@gmail.com', 'female', 'boisar saravali', '2019-03-25 15:57:55.000000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
