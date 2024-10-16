-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2023 at 02:44 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sdu`
--

-- --------------------------------------------------------

--
-- Table structure for table `addcoures`
--

CREATE TABLE `addcoures` (
  `DegreeProgramme` varchar(100) NOT NULL,
  `Credit` varchar(20) NOT NULL,
  `TimeDuration` varchar(20) NOT NULL,
  `CourseFee` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addcoures`
--

INSERT INTO `addcoures` (`DegreeProgramme`, `Credit`, `TimeDuration`, `CourseFee`) VALUES
('BIT (Hons) Networking and Mobile Computing', '120', '4', '180000'),
('BSc (Hons) in Biological Science', '220', '4', '80000000'),
('BSc (Hons) in Information Technology', '220', '4', '1200000');

-- --------------------------------------------------------

--
-- Table structure for table `addlecture`
--

CREATE TABLE `addlecture` (
  `LectureName` varchar(20) NOT NULL,
  `LectureAge` varchar(20) NOT NULL,
  `LectureGender` varchar(10) NOT NULL,
  `DegreeProgramme` varchar(100) NOT NULL,
  `LectureType` varchar(20) NOT NULL,
  `NIC` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addlecture`
--

INSERT INTO `addlecture` (`LectureName`, `LectureAge`, `LectureGender`, `DegreeProgramme`, `LectureType`, `NIC`) VALUES
('', '', 'null', 'BSc (Hons) in Information Technology', 'null', ''),
('sandu', '12', 'Female', 'BM (Hons) in Marketing', 'visiting', '123');

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `Position` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`FirstName`, `LastName`, `Position`, `Email`, `UserName`, `Password`) VALUES
('', '', 'Lecture', '', '', ''),
('Malaka', 'Perera', 'xcvbn', 'cvbnm', 'cvbnm', '123'),
('Damsara', 'Damsara', 'Dean', 'Upekasana', 'Dama', '123'),
('Upe', 'we', 'we', 'we', 'MC', '123'),
('Sade', 'Sade', 'Sade', 'Sade2', 'Sade', '12'),
('Sanduni', 'Kanchana', 'Admin', 'sandini123@gmail.com', 'Sandu', '123'),
('Upeka', 'Sandaruwan', 'Test', 'Upeka@gmail.com', 'USA', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `registernewstu`
--

CREATE TABLE `registernewstu` (
  `Name` varchar(100) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DegreeProgramme` varchar(100) NOT NULL,
  `Diuration` varchar(20) NOT NULL,
  `DegreeType` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `pay` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registernewstu`
--

INSERT INTO `registernewstu` (`Name`, `ContactNo`, `Address`, `Date`, `NIC`, `Gender`, `DegreeProgramme`, `Diuration`, `DegreeType`, `Email`, `pay`) VALUES
('zzzzzzzzzzz', '777777777', 'kkkkkkkkkkkkkk', '55555', '000000', 'Female', 'BM (Hons) in Marketing', '3 Years', 'Full Time', 'mmmmmmmmm', 'Paid'),
('mano', '0774', 'rakwana', '1999', '44', 'Male', 'BSc (Hons) in Information Technology', '3 Years', 'Full Time', 'vbn', 'NotPaid'),
('fghjkFGHJK', '123', 'ghjkl;', '123', '55', 'Male', 'BSc in Businessf Management (HRM)', '5 Years', 'Full Time', 'dd', 'Paid'),
('dfghjk', 'fghjkl;', 'fghjkl', 'fghjkl', 'fghjkl;', 'Female', 'BSc (Hons) in Information Technology', '3 Years', 'Part Time', 'ghjkl;', 'NotPaid');

-- --------------------------------------------------------

--
-- Table structure for table `studentlogin`
--

CREATE TABLE `studentlogin` (
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `UserID` varchar(20) NOT NULL,
  `Password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentlogin`
--

INSERT INTO `studentlogin` (`FirstName`, `LastName`, `UserID`, `Password`) VALUES
('Hasith', 'Damsara', 'HasithDamsara', '123456'),
('Maxwell', 'Fernando', 'MAXWELL', '1234'),
('Mangala', 'Chaminda', 'MC', '123'),
('Sanduni', 'Kanchana', 'Sandu', '123'),
('Upeka', 'Sandaruwan', 'USA', '1234'),
('Upe', 'sade', 'usdsfa', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addcoures`
--
ALTER TABLE `addcoures`
  ADD PRIMARY KEY (`DegreeProgramme`);

--
-- Indexes for table `addlecture`
--
ALTER TABLE `addlecture`
  ADD PRIMARY KEY (`LectureName`);

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`UserName`);

--
-- Indexes for table `registernewstu`
--
ALTER TABLE `registernewstu`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `studentlogin`
--
ALTER TABLE `studentlogin`
  ADD PRIMARY KEY (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
