-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2024 at 09:29 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pointofsales`
--

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `payment_id` int(11) NOT NULL,
  `trx_id` int(11) DEFAULT NULL,
  `payment_method` varchar(50) NOT NULL,
  `amount_paid` int(11) NOT NULL,
  `payment_date` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `gambar` varchar(100) NOT NULL,
  `kategori` varchar(100) NOT NULL,
  `suplier` varchar(100) NOT NULL,
  `harga_jual` int(11) NOT NULL,
  `harga_beli` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`id`, `kode`, `nama`, `gambar`, `kategori`, `suplier`, `harga_jual`, `harga_beli`, `stok`) VALUES
(5, 'X3', 'Downy', 'C:\\Users\\BoyBlanco\\Pictures\\1338180.png', 'Pemutih', 'Hj sarimi', 1000, 400, 4),
(6, 'X4', 'Malkist roma', 'C:\\Users\\BoyBlanco\\Pictures\\1355020.jpeg', 'Jajan', 'Nestle', 11000, 8000, 6),
(7, '482', 'mie', 'hadkjdh', 'makana', 'indofood', 20000, 2000, 45);

-- --------------------------------------------------------

--
-- Table structure for table `trx`
--

CREATE TABLE `trx` (
  `trx_id` int(11) NOT NULL,
  `trx_date` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `trx_detail`
--

CREATE TABLE `trx_detail` (
  `trx_detail_id` int(11) NOT NULL,
  `trx_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `Role` enum('Admin','Kasir','Owner') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`, `alamat`, `Role`) VALUES
(1, 'user', 'password1', 'user@example.com', 'Jl. Mawar No. 123', 'Admin'),
(2, 'Zahra', 'zahra123', 'Zahra123@yahoo.com', 'Brebes', 'Kasir'),
(5, 'sakip', 'sakip', 'sakip@smile.com', 'poltek', 'Admin'),
(6, 'Wildan', 'gaul', 'boyblanco77@gmail.com', 'Kluwut', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `trx_id` (`trx_id`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kode` (`kode`),
  ADD KEY `id_kategori` (`kategori`,`suplier`),
  ADD KEY `suplier` (`suplier`);

--
-- Indexes for table `trx`
--
ALTER TABLE `trx`
  ADD PRIMARY KEY (`trx_id`);

--
-- Indexes for table `trx_detail`
--
ALTER TABLE `trx_detail`
  ADD PRIMARY KEY (`trx_detail_id`),
  ADD KEY `trx_id` (`trx_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `payments`
--
ALTER TABLE `payments`
  MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `produk`
--
ALTER TABLE `produk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `trx`
--
ALTER TABLE `trx`
  MODIFY `trx_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `trx_detail`
--
ALTER TABLE `trx_detail`
  MODIFY `trx_detail_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payments`
--
ALTER TABLE `payments`
  ADD CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`trx_id`) REFERENCES `trx` (`trx_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `payments_ibfk_2` FOREIGN KEY (`payment_id`) REFERENCES `produk` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `trx_detail`
--
ALTER TABLE `trx_detail`
  ADD CONSTRAINT `trx_detail_ibfk_1` FOREIGN KEY (`trx_id`) REFERENCES `trx` (`trx_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `trx_detail_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
