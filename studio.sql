-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 19. Mei 2016 jam 17:14
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `studio`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`, `status`) VALUES
('usernamekh', '123456', 'pemilik'),
('usernamedi', '123456', 'petugas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE IF NOT EXISTS `member` (
  `id_member` varchar(15) NOT NULL,
  `nama_member` varchar(20) NOT NULL,
  `no_telepon` varchar(12) NOT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_member`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `no_telepon`, `alamat`) VALUES
('M0002', 'khodijah', '08561331672', 'bekasi'),
('M0003', 'dj', '08561331672', 'bekasi'),
('M0004', 'ade', '08571144571', 'bekasi'),
('M0005', 'SEVI', '08578899101', 'pakuning'),
('M0006', 'yadi', '08561441768', 'dago'),
('M0007', 'misnaya', '08571221486', 'tambelang city'),
('M0008', 'Jajan', '086481245162', 'Bandung'),
('M0009', 'Aldy', '085691334701', 'bekasi'),
('M0010', 'HARYATI', '08561331674', 'bekasi'),
('M0011', 'Aldy Sigit Saputra', '08561331672', 'bekasi city'),
('M0012', 'dea gumilar', '08561554701', 'Bandung, Cibiru'),
('M0013', 'rudy zaenal', '08561221675', 'Subang, Jawa barat '),
('M0014', 'david vandethen', '08561223456', 'Pengasinan, Jawa Barat'),
('M0015', 'yadi setiawa', '08561221672', 'Dago, Bandung');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemilik`
--

CREATE TABLE IF NOT EXISTS `pemilik` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemilik`
--

INSERT INTO `pemilik` (`username`, `password`) VALUES
('khodijah', '123456');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`username`, `password`) VALUES
('dijah', '123456');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sewa`
--

CREATE TABLE IF NOT EXISTS `sewa` (
  `no_sewa` varchar(10) NOT NULL,
  `id_member` varchar(15) NOT NULL,
  `nama_penyewa` varchar(20) NOT NULL,
  `no_telepon` varchar(13) NOT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `ruang_studio` varchar(10) DEFAULT NULL,
  `paket_sewa` varchar(10) NOT NULL,
  `harga_sewa` int(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  PRIMARY KEY (`no_sewa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `sewa`
--

INSERT INTO `sewa` (`no_sewa`, `id_member`, `nama_penyewa`, `no_telepon`, `alamat`, `ruang_studio`, `paket_sewa`, `harga_sewa`, `tanggal`) VALUES
('NS0001', 'M0001', 'gagan', '08561331672', 'kp.pakuning', 'Ruang 1', '2 Jam', 50000, '2016-05-01'),
('NS0002', 'M0002', 'khodijah', '08561331672', 'bekasi', 'Ruang 1', '3 Jam', 75000, '2016-05-01'),
('NS0003', 'M0002', 'khodijah', '08561331672', 'bekasi', 'Ruang 1', '2 Jam', 50000, '2016-05-01'),
('NS0004', 'M0002', 'khodijah', '08561331672', 'bekasi', 'Ruang 1', '3 Jam', 75000, '2016-05-08'),
('NS0005', 'M0003', 'dj', '08561331672', 'bekasi', 'Ruang 2', '4 Jam', 100000, '2016-05-10'),
('NS0006', 'M0004', 'ade', '08571144571', 'bekasi', 'Ruang 2', '2 Jam', 50000, '2016-05-10'),
('NS0007', 'M0009', 'Aldy', '085691334701', 'bekasi', 'Ruang 2', '2 Jam', 50000, '2016-05-11'),
('NS0008', 'M0010', 'HARYATI', '08561331674', 'bekasi', 'Ruang 3', '2 Jam', 50000, '2016-05-11'),
('NS0009', 'M0009', 'Aldy', '085691334701', 'bekasi', 'Ruang 1', '5 Jam', 125000, '2016-05-11'),
('NS0010', 'M0011', 'Aldy Sigit Saputra', '08561331672', 'bekasi city', 'Ruang 3', '3 Jam', 75000, '2016-05-11'),
('NS0011', 'M0012', 'dea gumilar', '08561554701', 'Bandung, Cibiru', 'Ruang 3', '4 Jam', 100000, '2016-05-11'),
('NS0012', 'M0013', 'rudy zaenal', '08561221675', 'Subang, Jawa barat ', 'Ruang 1', '3 Jam', 75000, '2016-05-11'),
('NS0013', 'M0014', 'david vandethen', '08561223456', 'Pengasinan, Jawa Barat', 'Ruang 4', '4 Jam', 100000, '2016-05-11'),
('NS0014', 'M0015', 'yadi setiawa', '08561221672', 'Dago, Bandung', 'Ruang 3', '3 Jam', 75000, '2016-05-11');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
