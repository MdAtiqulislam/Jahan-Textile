-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2020 at 07:43 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jahan`
--

-- --------------------------------------------------------

--
-- Table structure for table `allo_management`
--

CREATE TABLE `allo_management` (
  `id` int(11) NOT NULL,
  `att_allo` double(11,2) DEFAULT NULL,
  `night_allo` double(11,2) DEFAULT NULL,
  `red_night_all` double(11,2) DEFAULT NULL,
  `festival_allo` double(11,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `allo_management`
--

INSERT INTO `allo_management` (`id`, `att_allo`, `night_allo`, `red_night_all`, `festival_allo`) VALUES
(1, 20.00, 25.00, 15.00, 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `code` int(11) NOT NULL,
  `name` varchar(52) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `code`, `name`) VALUES
(1, 1, 'Weaving(Jute)'),
(2, 2, 'Weaving(Cotton)'),
(3, 3, 'Time Rate'),
(5, 4, 'Folding'),
(6, 5, 'Drawar Man');

-- --------------------------------------------------------

--
-- Table structure for table `designation`
--

CREATE TABLE `designation` (
  `id` int(11) NOT NULL,
  `name` varchar(52) NOT NULL,
  `code` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `designation`
--

INSERT INTO `designation` (`id`, `name`, `code`) VALUES
(1, 'Weaver', 1),
(2, 'Folding Man', 2),
(3, 'Cleaner', 3),
(4, 'Roll Cutter Man', 4),
(5, 'Drawer Man', 5);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `card_no` int(11) NOT NULL,
  `name` varchar(52) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `phone` varchar(52) DEFAULT NULL,
  `gender` varchar(32) DEFAULT NULL,
  `department` varchar(52) DEFAULT NULL,
  `designation` varchar(52) DEFAULT NULL,
  `d_basic` double(11,2) DEFAULT NULL,
  `hr_deductiom` int(11) DEFAULT NULL,
  `joinning_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `card_no`, `name`, `address`, `phone`, `gender`, `department`, `designation`, `d_basic`, `hr_deductiom`, `joinning_date`) VALUES
(1, 1001, 'FATEMA BEGUM', '', '', 'Female', 'Time Rate', 'Cleaner', 220.00, 0, '2020-01-01'),
(3, 1002, 'RAHMATULLAH', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(4, 1003, 'JAYNAL', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(5, 1004, 'ANOWER-2', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(6, 1005, 'MOZIBUR', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(7, 1006, 'LOKMAN', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(8, 1007, 'OSMAN', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(9, 1008, 'SADEK', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(10, 1009, 'BULBUL', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(11, 1010, 'ALAMGIR', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(12, 1011, 'NAYEEM', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(13, 1012, 'SURUJ MIAH', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(14, 1013, 'AKASH', '', '', 'Male', 'Weaving(Jute)', 'Weaver', 0.00, 0, '2020-01-01'),
(15, 1014, 'RASEL MIA', '', '', 'Male', 'Folding', 'Folding Man', 0.00, 0, '2020-01-01'),
(16, 1015, 'NUR MOHAMMAD', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(17, 1016, 'RUBEL MIA', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(18, 1017, 'ALI HOSSIAN', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(19, 1018, 'JAMAL MIA', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(20, 1019, 'RATAN BISWASH', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(21, 1020, 'MAMUN MIA', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(22, 1021, 'ANOWER', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01'),
(23, 1022, 'NUR ALAM', '', '', 'Male', 'Weaving(Cotton)', 'Weaver', 0.00, 0, '2020-01-01');

-- --------------------------------------------------------

--
-- Table structure for table `folding_rate`
--

CREATE TABLE `folding_rate` (
  `id` int(11) NOT NULL,
  `rate` double(11,2) DEFAULT NULL,
  `quentity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `folding_rate`
--

INSERT INTO `folding_rate` (`id`, `rate`, `quentity`) VALUES
(1, 0.25, 1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(52) NOT NULL,
  `rate` double(11,3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `rate`) VALUES
(16, '11x11x120', 1.850),
(8, '11x11x40', 1.850),
(13, '11x11x48', 1.850),
(4, '11x11x60', 1.850),
(1, '11x12x120', 2.000),
(10, '11x12x45', 2.000),
(11, '11x13x40', 2.170),
(7, '11x9x40', 1.700),
(19, '13x13x62', 2.500),
(18, '20x20x78x48=91', 2.200),
(9, '7x7x36', 1.500),
(20, '7x7x40', 1.500),
(14, '8x7x36', 1.500),
(5, '9x10x45', 1.800),
(6, '9x7x36', 1.500),
(15, '9x8x48', 1.700),
(17, '9x8x60', 1.700),
(12, '9x8x72', 1.700);

-- --------------------------------------------------------

--
-- Table structure for table `production_per_employee`
--

CREATE TABLE `production_per_employee` (
  `id` int(11) NOT NULL,
  `card_no` int(11) DEFAULT NULL,
  `product` varchar(52) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `rate` double(11,2) DEFAULT NULL,
  `sub_total` double(11,2) DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `production_per_employee`
--

INSERT INTO `production_per_employee` (`id`, `card_no`, `product`, `quantity`, `rate`, `sub_total`, `from_date`, `to_date`) VALUES
(1, 1009, '8x7x36', 896, 1.50, 1344.00, '2020-10-30', '2020-11-05'),
(2, 1009, '11x13x40', 459, 2.17, 996.03, '2020-10-30', '2020-11-05'),
(3, 1009, '9x8x48', 1034, 1.70, 1757.80, '2020-10-30', '2020-11-05'),
(4, 1009, '11x11x120', 346, 1.85, 640.10, '2020-10-30', '2020-11-05'),
(5, 1011, '7x7x36', 1214, 1.50, 1821.00, '2020-10-30', '2020-11-05'),
(6, 1011, '11x13x40', 466, 2.17, 1011.22, '2020-10-30', '2020-11-05'),
(7, 1011, '9x8x72', 72, 1.70, 122.40, '2020-10-30', '2020-11-05'),
(8, 1002, '8x7x36', 753, 1.50, 1129.50, '2020-10-30', '2020-11-05'),
(9, 1002, '9x8x48', 863, 1.70, 1467.10, '2020-10-30', '2020-11-05'),
(10, 1002, '11x11x120', 276, 1.85, 510.60, '2020-10-30', '2020-11-05'),
(11, 1002, '11x13x40', 371, 2.17, 805.07, '2020-10-30', '2020-11-05'),
(12, 1008, '11x13x40', 354, 2.17, 768.18, '2020-10-30', '2020-11-05'),
(13, 1008, '11x11x120', 330, 1.85, 610.50, '2020-10-30', '2020-11-05'),
(14, 1012, '7x7x36', 1763, 1.50, 2644.50, '2020-10-30', '2020-11-05'),
(15, 1012, '11x12x45', 138, 2.00, 276.00, '2020-10-30', '2020-11-05'),
(16, 1010, '11x13x40', 299, 2.17, 648.83, '2020-10-30', '2020-11-05'),
(17, 1010, '9x8x60', 480, 1.70, 816.00, '2020-10-30', '2020-11-05'),
(18, 1010, '7x7x36', 616, 1.50, 924.00, '2020-10-30', '2020-11-05'),
(19, 1013, '7x7x36', 1970, 1.50, 2955.00, '2020-10-30', '2020-11-05'),
(20, 1013, '11x13x40', 337, 2.17, 731.29, '2020-10-30', '2020-11-05'),
(21, 1013, '9x8x60', 229, 1.70, 389.30, '2020-10-30', '2020-11-05'),
(22, 1003, '7x7x36', 1185, 1.50, 1777.50, '2020-10-30', '2020-11-05'),
(23, 1003, '11x9x40', 80, 1.70, 136.00, '2020-10-30', '2020-11-05'),
(24, 1003, '11x13x40', 334, 2.17, 724.78, '2020-10-30', '2020-11-05'),
(25, 1003, '9x8x72', 90, 1.70, 153.00, '2020-10-30', '2020-11-05'),
(26, 1004, '11x11x120', 273, 1.85, 505.05, '2020-10-30', '2020-11-05'),
(27, 1004, '11x13x40', 473, 2.17, 1026.41, '2020-10-30', '2020-11-05'),
(28, 1004, '11x9x40', 225, 1.70, 382.50, '2020-10-30', '2020-11-05'),
(29, 1005, '7x7x36', 2632, 1.50, 3948.00, '2020-10-30', '2020-11-05'),
(30, 1005, '11x9x40', 39, 1.70, 66.30, '2020-10-30', '2020-11-05'),
(31, 1005, '11x12x45', 204, 2.00, 408.00, '2020-10-30', '2020-11-05'),
(32, 1005, '11x13x40', 97, 2.17, 210.49, '2020-10-30', '2020-11-05'),
(33, 1006, '9x8x60', 700, 1.70, 1190.00, '2020-10-30', '2020-11-05'),
(34, 1006, '7x7x36', 261, 1.50, 391.50, '2020-10-30', '2020-11-05'),
(35, 1006, '11x13x40', 414, 2.17, 898.38, '2020-10-30', '2020-11-05'),
(36, 1006, '8x7x36', 293, 1.50, 439.50, '2020-10-30', '2020-11-05'),
(41, 1018, '20x20x78x48=91', 1623, 2.20, 3570.60, '2020-10-30', '2020-11-05'),
(42, 1015, '20x20x78x48=91', 1286, 2.20, 2829.20, '2020-10-30', '2020-11-05'),
(43, 1017, '20x20x78x48=91', 1698, 2.20, 3735.60, '2020-10-30', '2020-11-05'),
(44, 1016, '20x20x78x48=91', 1414, 2.20, 3110.80, '2020-10-30', '2020-11-05'),
(45, 1019, '20x20x78x48=91', 1745, 2.20, 3839.00, '2020-10-30', '2020-11-05'),
(46, 1021, '20x20x78x48=91', 745, 2.20, 1639.00, '2020-10-30', '2020-11-05'),
(47, 1022, '20x20x78x48=91', 1773, 2.20, 3900.60, '2020-10-30', '2020-11-05'),
(48, 1020, '20x20x78x48=91', 2163, 2.20, 4758.60, '2020-10-30', '2020-11-05'),
(49, 1007, '7x7x36', 2561, 1.50, 3841.50, '2020-10-30', '2020-11-05'),
(50, 1007, '11x9x40', 62, 1.70, 105.40, '2020-10-30', '2020-11-05'),
(51, 1007, '9x8x60', 467, 1.70, 793.90, '2020-10-30', '2020-11-05'),
(52, 1007, '11x13x40', 434, 2.17, 941.78, '2020-10-30', '2020-11-05'),
(53, 1009, '8x7x36', 1063, 1.50, 1594.50, '2020-11-06', '2020-11-12'),
(54, 1009, '11x9x40', 978, 1.70, 1662.60, '2020-11-06', '2020-11-12'),
(55, 1009, '9x8x48', 1343, 1.70, 2283.10, '2020-11-06', '2020-11-12'),
(56, 1009, '11x11x120', 716, 1.85, 1324.60, '2020-11-06', '2020-11-12'),
(57, 1011, '13x13x62', 341, 2.50, 852.50, '2020-11-06', '2020-11-12'),
(58, 1011, '7x7x40', 368, 1.50, 552.00, '2020-11-06', '2020-11-12'),
(59, 1011, '11x9x40', 761, 1.70, 1293.70, '2020-11-06', '2020-11-12'),
(60, 1011, '7x7x36', 486, 1.50, 729.00, '2020-11-06', '2020-11-12'),
(61, 1008, '11x9x40', 642, 1.70, 1091.40, '2020-11-06', '2020-11-12'),
(62, 1008, '11x12x120', 161, 2.00, 322.00, '2020-11-06', '2020-11-12'),
(63, 1008, '8x7x36', 48, 1.50, 72.00, '2020-11-06', '2020-11-12'),
(64, 1008, '9x8x60', 239, 1.70, 406.30, '2020-11-06', '2020-11-12'),
(65, 1008, '7x7x36', 198, 1.50, 297.00, '2020-11-06', '2020-11-12'),
(66, 1012, '7x7x40', 683, 1.50, 1024.50, '2020-11-06', '2020-11-12'),
(67, 1012, '7x7x36', 1201, 1.50, 1801.50, '2020-11-06', '2020-11-12'),
(68, 1012, '11x9x40', 188, 1.70, 319.60, '2020-11-06', '2020-11-12'),
(69, 1012, '8x7x36', 74, 1.50, 111.00, '2020-11-06', '2020-11-12'),
(70, 1010, '9x8x60', 259, 1.70, 440.30, '2020-11-06', '2020-11-12'),
(71, 1010, '7x7x40', 100, 1.50, 150.00, '2020-11-06', '2020-11-12'),
(72, 1010, '7x7x36', 166, 1.50, 249.00, '2020-11-06', '2020-11-12'),
(73, 1010, '11x9x40', 149, 1.70, 253.30, '2020-11-06', '2020-11-12'),
(74, 1013, '7x7x40', 125, 1.50, 187.50, '2020-11-06', '2020-11-12'),
(75, 1013, '11x9x40', 103, 1.70, 175.10, '2020-11-06', '2020-11-12'),
(76, 1013, '7x7x36', 59, 1.50, 88.50, '2020-11-06', '2020-11-12'),
(78, 1002, '11x9x40', 256, 1.70, 435.20, '2020-11-06', '2020-11-12'),
(79, 1002, '9x8x48', 418, 1.70, 710.60, '2020-11-06', '2020-11-12'),
(80, 1002, '11x11x120', 154, 1.85, 284.90, '2020-11-06', '2020-11-12'),
(84, 1003, '13x13x62', 305, 2.50, 762.50, '2020-11-06', '2020-11-12'),
(85, 1003, '7x7x40', 322, 1.50, 483.00, '2020-11-06', '2020-11-12'),
(86, 1003, '7x7x36', 496, 1.50, 744.00, '2020-11-06', '2020-11-12'),
(87, 1003, '11x9x40', 360, 1.70, 612.00, '2020-11-06', '2020-11-12'),
(88, 1004, '11x9x40', 982, 1.70, 1669.40, '2020-11-06', '2020-11-12'),
(89, 1004, '11x11x120', 435, 1.85, 804.75, '2020-11-06', '2020-11-12'),
(90, 1004, '9x8x60', 32, 1.70, 54.40, '2020-11-06', '2020-11-12'),
(91, 1005, '7x7x40', 720, 1.50, 1080.00, '2020-11-06', '2020-11-12'),
(92, 1005, '7x7x36', 1121, 1.50, 1681.50, '2020-11-06', '2020-11-12'),
(93, 1005, '11x9x40', 641, 1.70, 1089.70, '2020-11-06', '2020-11-12'),
(94, 1006, '9x8x60', 807, 1.70, 1371.90, '2020-11-06', '2020-11-12'),
(95, 1006, '7x7x36', 446, 1.50, 669.00, '2020-11-06', '2020-11-12'),
(96, 1006, '7x7x40', 145, 1.50, 217.50, '2020-11-06', '2020-11-12'),
(97, 1007, '7x7x40', 369, 1.50, 553.50, '2020-11-06', '2020-11-12'),
(98, 1007, '11x9x40', 42, 1.70, 71.40, '2020-11-06', '2020-11-12'),
(99, 1007, '7x7x36', 1483, 1.50, 2224.50, '2020-11-06', '2020-11-12'),
(100, 1007, '9x8x60', 479, 1.70, 814.30, '2020-11-06', '2020-11-12'),
(102, 1002, '8x7x36', 243, 1.50, 364.50, '2020-11-06', '2020-11-12');

-- --------------------------------------------------------

--
-- Table structure for table `running_week`
--

CREATE TABLE `running_week` (
  `id` int(11) NOT NULL,
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `work_hour` double(11,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `running_week`
--

INSERT INTO `running_week` (`id`, `from_date`, `to_date`, `work_hour`) VALUES
(1, '2020-11-06', '2020-11-12', 72.00);

-- --------------------------------------------------------

--
-- Table structure for table `sallery`
--

CREATE TABLE `sallery` (
  `id` int(11) NOT NULL,
  `card_no` int(11) DEFAULT NULL,
  `name` varchar(52) DEFAULT NULL,
  `designation` varchar(52) DEFAULT NULL,
  `department` varchar(52) DEFAULT NULL,
  `shift` varchar(52) DEFAULT NULL,
  `work_hour` double(11,2) DEFAULT NULL,
  `fol_production` int(11) DEFAULT NULL,
  `fol_rate` double(11,2) DEFAULT NULL,
  `daily_all` double(11,2) DEFAULT NULL,
  `basic` double(11,2) DEFAULT NULL,
  `total_payable` int(11) DEFAULT NULL,
  `hr_deductiom` int(11) DEFAULT NULL,
  `att_allow` double(11,2) DEFAULT NULL,
  `night_allow` double(11,2) DEFAULT NULL,
  `looms` varchar(52) DEFAULT NULL,
  `product` varchar(52) DEFAULT NULL,
  `production` int(11) DEFAULT NULL,
  `net_payable` int(11) DEFAULT NULL,
  `week_start_date` date DEFAULT NULL,
  `week_end_date` date DEFAULT NULL,
  `pay_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sallery`
--

INSERT INTO `sallery` (`id`, `card_no`, `name`, `designation`, `department`, `shift`, `work_hour`, `fol_production`, `fol_rate`, `daily_all`, `basic`, `total_payable`, `hr_deductiom`, `att_allow`, `night_allow`, `looms`, `product`, `production`, `net_payable`, `week_start_date`, `week_end_date`, `pay_date`) VALUES
(1, 1009, 'BULBUL', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 4737.93, 4738, 0, 0.00, 0.00, '21, 22, 23, 24', '11x11x120', 2735, 4738, '2020-10-30', '2020-11-05', NULL),
(2, 1011, 'NAYEEM', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 2954.62, 2955, 0, 0.00, 0.00, '25, 26, 27', '9x8x72', 1752, 2955, '2020-10-30', '2020-11-05', NULL),
(3, 1002, 'RAHMATULLAH', 'Weaver', 'Weaving(Jute)', 'Night', 72.00, 0, 0.00, 0.00, 3912.27, 3912, 0, 0.00, 0.00, '21, 22, 23, 24', '11x13x40', 2263, 3912, '2020-10-30', '2020-11-05', NULL),
(4, 1008, 'SADEK', 'Weaver', 'Weaving(Jute)', 'Day', 60.00, NULL, NULL, 0.00, 1378.68, 1379, 0, 0.00, 0.00, '28, 29, 30', '11x11x120', 684, 1379, '2020-10-30', '2020-11-05', NULL),
(5, 1012, 'SURUJ MIAH', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 2920.50, 2921, 0, 0.00, 0.00, '31, 32, 34', '11x12x45', 1901, 2921, '2020-10-30', '2020-11-05', NULL),
(6, 1010, 'ALAMGIR', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 2388.83, 2389, 0, 0.00, 0.00, '33, 35, 36', '7x7x36', 1395, 2389, '2020-10-30', '2020-11-05', NULL),
(7, 1013, 'AKASH', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 4075.59, 4076, 0, 0.00, 0.00, '37, 38, 39, 40', '9x8x60', 2536, 4076, '2020-10-30', '2020-11-05', NULL),
(8, 1003, 'JOYNAL', 'Weaver', 'Weaving(Jute)', 'Night', 72.00, NULL, NULL, 0.00, 2791.28, 2791, 0, 0.00, 0.00, '25, 26, 27', '9x8x72', 1689, 2791, '2020-10-30', '2020-11-05', NULL),
(9, 1004, 'ANOWER-2', 'Weaver', 'Weaving(Jute)', 'Night', 72.00, NULL, NULL, 0.00, 1913.96, 1914, 0, 0.00, 0.00, '28, 29, 30', '11x9x40', 971, 1914, '2020-10-30', '2020-11-05', NULL),
(10, 1005, 'MOJIBUR', 'Weaver', 'Weaving(Jute)', 'Night', 84.00, NULL, NULL, 0.00, 4632.79, 4633, 0, 0.00, 0.00, '31, 32, 33, 34', '11x13x40', 2972, 4633, '2020-10-30', '2020-11-05', NULL),
(11, 1006, 'LOKMAN', 'Weaver', 'Weaving(Jute)', 'Night', 72.00, NULL, NULL, 0.00, 2919.38, 2919, 0, 0.00, 0.00, '33, 35, 36', '8x7x36', 1668, 2919, '2020-10-30', '2020-11-05', NULL),
(13, 1018, 'JAMAL MIA', 'Weaver', 'Weaving(Cotton)', 'Day', 72.00, NULL, NULL, 0.00, 3570.60, 3571, 0, 0.00, 0.00, '3, 4, 5, 6, 7, 8, 9', '20x20x78x48=91', 1623, 3571, '2020-10-30', '2020-11-05', NULL),
(14, 1015, 'NUR MOHAMMAD', 'Weaver', 'Weaving(Cotton)', 'Day', 72.00, NULL, NULL, 0.00, 2829.20, 2829, 0, 0.00, 0.00, '3, 4, 5, 6, 7, 8, 9', '20x20x78x48=91', 1286, 2829, '2020-10-30', '2020-11-05', NULL),
(15, 1017, 'ALI HOSSIAN', 'Weaver', 'Weaving(Cotton)', 'Day', 72.00, NULL, NULL, 0.00, 3735.60, 3736, 0, 0.00, 0.00, '11, 12, 13, 14, 15', '20x20x78x48=91', 1698, 3736, '2020-10-30', '2020-11-05', NULL),
(16, 1016, 'RUBEL MIA', 'Weaver', 'Weaving(Cotton)', 'Day', 72.00, NULL, NULL, 0.00, 3110.80, 3111, 0, 0.00, 0.00, '16, 17, 18, 19, 20', '20x20x78x48=91', 1414, 3111, '2020-10-30', '2020-11-05', NULL),
(17, 1019, 'RATAN BISWASH', 'Weaver', 'Weaving(Cotton)', 'Night', 84.00, NULL, NULL, 0.00, 3839.00, 3839, 0, 0.00, 0.00, '3, 4, 5, 6, 10, 18', '20x20x78x48=91', 1745, 3839, '2020-10-30', '2020-11-05', NULL),
(18, 1021, 'ANOWER', 'Weaver', 'Weaving(Cotton)', 'Night', 48.00, NULL, NULL, 0.00, 1639.00, 1639, 0, 0.00, 0.00, '6, 7, 8, 9, 10', '20x20x78x48=91', 745, 1639, '2020-10-30', '2020-11-05', NULL),
(19, 1022, 'NUR ALAM', 'Weaver', 'Weaving(Cotton)', 'Night', 84.00, NULL, NULL, 0.00, 3900.60, 3901, 0, 0.00, 0.00, '11, 12, 13, 14, 15', '20x20x78x48=91', 1773, 3901, '2020-10-30', '2020-11-05', NULL),
(20, 1020, 'MAMUN MIA', 'Weaver', 'Weaving(Cotton)', 'Night', 84.00, NULL, NULL, 0.00, 4758.60, 4759, 0, 0.00, 0.00, '11, 12, 13, 14, 15', '20x20x78x48=91', 2163, 4759, '2020-10-30', '2020-11-05', NULL),
(21, 1001, 'FATEMA BEGUM', 'Cleaner', 'Time Rate', 'General', 54.00, 0, 0.00, 220.00, 990.00, 990, 0, 0.00, 0.00, 'null', NULL, 0, 990, '2020-10-30', '2020-11-05', NULL),
(22, 1007, 'OSMAN', 'Weaver', 'Weaving(Jute)', 'Night', 84.00, NULL, NULL, 0.00, 5682.58, 5683, 0, 0.00, 0.00, '36, 37, 38, 39, 40', '11x13x40', 3524, 5683, '2020-10-30', '2020-11-05', NULL),
(23, 1014, 'RASEL MIA', 'Folding Man', 'Folding', 'General', 72.00, 12450, 0.25, 0.00, 3112.50, 3113, 0, 0.00, 0.00, 'null', NULL, 0, 3113, '2020-10-30', '2020-11-05', NULL),
(24, 1009, 'BULBUL', 'Weaver', 'Weaving(Jute)', 'Night', 84.00, NULL, NULL, 0.00, 6864.80, 6865, 0, 0.00, 0.00, '21, 22, 23, 24', '11x11x120', 4100, 6865, '2020-11-06', '2020-11-12', NULL),
(25, 1011, 'NAYEEM', 'Weaver', 'Weaving(Jute)', 'Night', 84.00, NULL, NULL, 0.00, 3427.20, 3427, 0, 0.00, 0.00, '25, 26, 27 ', '7x7x36', 1956, 3427, '2020-11-06', '2020-11-12', NULL),
(26, 1008, 'SADEK', 'Weaver', 'Weaving(Jute)', 'Night', 72.00, NULL, NULL, 0.00, 2188.70, 2189, 0, 0.00, 0.00, '28, 29, 30', '7x7x36', 1288, 2189, '2020-11-06', '2020-11-12', NULL),
(27, 1012, 'SURUJ MIAH', 'Weaver', 'Weaving(Jute)', 'Night', 84.00, NULL, NULL, 0.00, 3256.60, 3257, 0, 0.00, 0.00, '31, 32, 34', '8x7x36', 2146, 3257, '2020-11-06', '2020-11-12', NULL),
(28, 1010, 'ALAMGIR', 'Weaver', 'Weaving(Jute)', 'Night', 72.00, NULL, NULL, 0.00, 1092.60, 1093, 0, 0.00, 0.00, '33, 35, 36', '11x9x40', 674, 1093, '2020-11-06', '2020-11-12', NULL),
(29, 1013, 'AKASH', 'Weaver', 'Weaving(Jute)', 'Night', 24.00, NULL, NULL, 0.00, 451.10, 451, 0, 0.00, 0.00, '37, 38, 39, 40', '7x7x36', 287, 451, '2020-11-06', '2020-11-12', NULL),
(30, 1002, 'RAHMATULLAH', 'Weaver', 'Weaving(Jute)', 'Day', 36.00, 0, 0.00, 0.00, 1795.20, 1795, 0, 0.00, 0.00, '21, 22, 23, 24', '11x11x120', 1071, 1795, '2020-11-06', '2020-11-12', NULL),
(31, 1003, 'JAYNAL', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 2601.50, 2602, 0, 0.00, 0.00, '25, 26, 27', '11x9x40', 1483, 2602, '2020-11-06', '2020-11-12', NULL),
(32, 1004, 'ANOWER-2', 'Weaver', 'Weaving(Jute)', 'Day', 60.00, NULL, NULL, 0.00, 2528.55, 2529, 0, 0.00, 0.00, '28, 29, 30', '9x8x60', 1449, 2529, '2020-11-06', '2020-11-12', NULL),
(33, 1005, 'MOZIBUR', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, 0, 0.00, 0.00, 3851.20, 3851, 0, 0.00, 0.00, '31, 32, 34', '11x9x40', 2482, 3851, '2020-11-06', '2020-11-12', NULL),
(34, 1006, 'LOKMAN', 'Weaver', 'Weaving(Jute)', 'Day', 60.00, NULL, NULL, 0.00, 2258.40, 2258, 0, 0.00, 0.00, '33, 35, 36', '7x7x40', 1398, 2258, '2020-11-06', '2020-11-12', NULL),
(35, 1007, 'OSMAN', 'Weaver', 'Weaving(Jute)', 'Day', 72.00, NULL, NULL, 0.00, 3663.70, 3664, 0, 0.00, 0.00, '37, 38, 39, 40', '9x8x60', 2373, 3664, '2020-11-06', '2020-11-12', NULL),
(36, 1001, 'FATEMA BEGUM', 'Cleaner', 'Time Rate', 'General', 78.00, 0, 0.00, 220.00, 1430.00, 1430, 0, 120.00, 0.00, 'null', NULL, 0, 1550, '2020-11-06', '2020-11-12', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `wages_weeks`
--

CREATE TABLE `wages_weeks` (
  `id` int(11) NOT NULL,
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `work_hour` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wages_weeks`
--

INSERT INTO `wages_weeks` (`id`, `from_date`, `to_date`, `work_hour`) VALUES
(1, '2020-10-23', '2020-10-29', 72.00),
(2, '2020-10-30', '2020-11-05', 72.00),
(3, '2020-11-06', '2020-11-12', 72.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `allo_management`
--
ALTER TABLE `allo_management`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`code`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `designation`
--
ALTER TABLE `designation`
  ADD PRIMARY KEY (`code`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`card_no`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `folding_rate`
--
ALTER TABLE `folding_rate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`name`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `production_per_employee`
--
ALTER TABLE `production_per_employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `running_week`
--
ALTER TABLE `running_week`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sallery`
--
ALTER TABLE `sallery`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wages_weeks`
--
ALTER TABLE `wages_weeks`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `allo_management`
--
ALTER TABLE `allo_management`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `designation`
--
ALTER TABLE `designation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `folding_rate`
--
ALTER TABLE `folding_rate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `production_per_employee`
--
ALTER TABLE `production_per_employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;
--
-- AUTO_INCREMENT for table `running_week`
--
ALTER TABLE `running_week`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `sallery`
--
ALTER TABLE `sallery`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
--
-- AUTO_INCREMENT for table `wages_weeks`
--
ALTER TABLE `wages_weeks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
