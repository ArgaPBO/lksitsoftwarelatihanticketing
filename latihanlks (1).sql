-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20221125.2e001c186a
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2023 at 02:26 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `latihanlks`
--

-- --------------------------------------------------------

--
-- Table structure for table `level`
--

CREATE TABLE `level` (
  `id_level` int(11) NOT NULL,
  `nama_level` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level`
--

INSERT INTO `level` (`id_level`, `nama_level`) VALUES
(1, 'lord'),
(2, 'manager'),
(3, 'karyawan'),
(4, 'satpam');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pemesanan` int(11) NOT NULL,
  `kode_pemesanan` varchar(6) NOT NULL,
  `tanggal_pemesanan` date NOT NULL,
  `tempat_pemesanan` varchar(255) NOT NULL,
  `id_pelanggan` int(11) NOT NULL,
  `kode_kursi` varchar(6) NOT NULL,
  `id_rute` int(11) NOT NULL,
  `tujuan` varchar(25) DEFAULT NULL,
  `tanggal_berangkat` date NOT NULL,
  `jam_cekin` time NOT NULL,
  `jam_berangkat` time NOT NULL,
  `total_bayar` int(25) DEFAULT NULL,
  `id_petugas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`id_pemesanan`, `kode_pemesanan`, `tanggal_pemesanan`, `tempat_pemesanan`, `id_pelanggan`, `kode_kursi`, `id_rute`, `tujuan`, `tanggal_berangkat`, `jam_cekin`, `jam_berangkat`, `total_bayar`, `id_petugas`) VALUES
(2, '67890', '2023-01-31', 'tangerang', 5, '12345', 1, NULL, '2023-01-31', '01:00:00', '13:00:00', NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `id_penumpang` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `nama_penumpang` varchar(55) NOT NULL,
  `alamat_penumpang` varchar(255) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `telefone` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`id_penumpang`, `username`, `password`, `nama_penumpang`, `alamat_penumpang`, `tanggal_lahir`, `jenis_kelamin`, `telefone`) VALUES
(1, 'jTextField1', 'jTextField2', 'jTextField3', '123', '2023-01-27', 'Perempuan', '123'),
(4, 'abc', 'def', 'ghi', '12345', '2020-01-03', 'Laki-laki', '2'),
(5, 'arga', 'arga123', 'arga a', '123', '2023-01-31', 'Laki-laki', '123');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `nama_petugas` varchar(55) NOT NULL,
  `id_level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `username`, `password`, `nama_petugas`, `id_level`) VALUES
(1, 'testpetugas', 'test', 'test', 4),
(2, 'userpetugas', 'petugas', 'petugas1', 3);

-- --------------------------------------------------------

--
-- Table structure for table `rute`
--

CREATE TABLE `rute` (
  `id_rute` int(11) NOT NULL,
  `tujuan` varchar(25) NOT NULL,
  `rute_awal` varchar(25) NOT NULL,
  `rute_ahir` varchar(25) NOT NULL,
  `harga` int(25) NOT NULL,
  `id_transportasi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rute`
--

INSERT INTO `rute` (`id_rute`, `tujuan`, `rute_awal`, `rute_ahir`, `harga`, `id_transportasi`) VALUES
(1, 'Rawa Buntu', 'Tanah Abang', 'Rangkasbitung', 3000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `test1`
--

CREATE TABLE `test1` (
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `test1`
--

INSERT INTO `test1` (`username`, `password`, `name`) VALUES
('arga', 'herlambang', 'argaathallah'),
('useradmin', '12345', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `transportasi`
--

CREATE TABLE `transportasi` (
  `id_transportasi` int(11) NOT NULL,
  `kode` varchar(6) NOT NULL,
  `jumlah_kursi` int(11) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `id_type_transportasi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transportasi`
--

INSERT INTO `transportasi` (`id_transportasi`, `kode`, `jumlah_kursi`, `keterangan`, `id_type_transportasi`) VALUES
(1, '12345', 12, 'asdasdasd aaaaaaaaaaaaaaaaaaaaaaaaaaaaas dadasd', 5),
(2, '2323', 2132, 'arga', 5),
(4, '213', 1223, 'asasdasddsa2xe1dsqx2doni', 4),
(7, '21313', 1223, 'asasdasddsa2xe1dsqx2doni', 4);

-- --------------------------------------------------------

--
-- Table structure for table `type_transportasi`
--

CREATE TABLE `type_transportasi` (
  `id_type_transportasi` int(11) NOT NULL,
  `nama_type` varchar(25) NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type_transportasi`
--

INSERT INTO `type_transportasi` (`id_type_transportasi`, `nama_type`, `keterangan`) VALUES
(4, 'tipekeren', 'keren banget lorem ipsum dolor sit amet siji loro telu papat'),
(5, 'tipejelek', 'jelek banget duh ga enak liatnya lorem ipsum dolor sit amet siji loro telu papat limo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `level`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`id_level`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`),
  ADD UNIQUE KEY `kode_kursi` (`kode_kursi`),
  ADD KEY `fk_id_pelanggan` (`id_pelanggan`),
  ADD KEY `fk_id_rute` (`id_rute`),
  ADD KEY `fk_id_petugas` (`id_petugas`);

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`id_penumpang`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `fk_id_level` (`id_level`);

--
-- Indexes for table `rute`
--
ALTER TABLE `rute`
  ADD PRIMARY KEY (`id_rute`),
  ADD KEY `fk_id_transportasi` (`id_transportasi`);

--
-- Indexes for table `transportasi`
--
ALTER TABLE `transportasi`
  ADD PRIMARY KEY (`id_transportasi`),
  ADD UNIQUE KEY `kode` (`kode`),
  ADD KEY `fk_id_type_transportasi` (`id_type_transportasi`);

--
-- Indexes for table `type_transportasi`
--
ALTER TABLE `type_transportasi`
  ADD PRIMARY KEY (`id_type_transportasi`),
  ADD UNIQUE KEY `nama_type` (`nama_type`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `level`
--
ALTER TABLE `level`
  MODIFY `id_level` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `id_pemesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `penumpang`
--
ALTER TABLE `penumpang`
  MODIFY `id_penumpang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id_petugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `rute`
--
ALTER TABLE `rute`
  MODIFY `id_rute` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `transportasi`
--
ALTER TABLE `transportasi`
  MODIFY `id_transportasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `type_transportasi`
--
ALTER TABLE `type_transportasi`
  MODIFY `id_type_transportasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `fk_id_pelanggan` FOREIGN KEY (`id_pelanggan`) REFERENCES `penumpang` (`id_penumpang`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_id_petugas` FOREIGN KEY (`id_petugas`) REFERENCES `petugas` (`id_petugas`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_id_rute` FOREIGN KEY (`id_rute`) REFERENCES `rute` (`id_rute`) ON DELETE CASCADE;

--
-- Constraints for table `petugas`
--
ALTER TABLE `petugas`
  ADD CONSTRAINT `fk_id_level` FOREIGN KEY (`id_level`) REFERENCES `level` (`id_level`) ON DELETE CASCADE;

--
-- Constraints for table `rute`
--
ALTER TABLE `rute`
  ADD CONSTRAINT `fk_id_transportasi` FOREIGN KEY (`id_transportasi`) REFERENCES `transportasi` (`id_transportasi`) ON DELETE CASCADE;

--
-- Constraints for table `transportasi`
--
ALTER TABLE `transportasi`
  ADD CONSTRAINT `fk_id_type_transportasi` FOREIGN KEY (`id_type_transportasi`) REFERENCES `type_transportasi` (`id_type_transportasi`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
