-- phpMyAdmin SQL Dump
-- version 2.11.9.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 20, 2013 at 02:21 PM
-- Server version: 5.0.67
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `akademik_sman1mhy`
--

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE IF NOT EXISTS `guru` (
  `nip` varchar(9) NOT NULL,
  `nama_guru` varchar(50) NOT NULL,
  `tempat_lahir_guru` varchar(25) NOT NULL,
  `tanggal_lahir_guru` varchar(20) NOT NULL,
  `jk_guru` varchar(10) NOT NULL,
  `agama_guru` varchar(10) NOT NULL,
  `kewarganegaraan_guru` varchar(20) NOT NULL,
  `status_guru` varchar(10) NOT NULL,
  `golongan_guru` varchar(5) NOT NULL,
  `no_telp_guru` varchar(15) NOT NULL,
  `alamat_guru` varchar(250) NOT NULL,
  PRIMARY KEY  (`nip`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`nip`, `nama_guru`, `tempat_lahir_guru`, `tanggal_lahir_guru`, `jk_guru`, `agama_guru`, `kewarganegaraan_guru`, `status_guru`, `golongan_guru`, `no_telp_guru`, `alamat_guru`) VALUES
('131672156', 'Asep Ratiadi', 'Bandung', '15-04-1959', 'Laki-Laki', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('131646316', 'Johan Johny E', 'Bandung', '15-12-1955', 'Laki-Laki', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('130892606', 'Rita Zuhriah', 'Aceh', '30-09-1955', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV C', '000000000000', 'Bandung'),
('131414896', 'Tintin Rostini', 'Bandung', '20-02-1959', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('131287319', 'H. Amin Wijaya', 'Cimahi', '08-03-1960', 'Laki-Laki', 'Islam', 'WNI', 'PNS', 'IV C', '000000000000', 'Cimahi'),
('131163841', 'Hj. Neneng Ekaningsih', 'Bandung', '25-05-1962', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('131407434', 'Nurlaela', 'Cianjur', '08-12-1958', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('131780943', 'Hj. Cahya Wulan', 'Karang Anyar', '08-01-1960', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('130797663', 'Endju Djuriah', 'Ciamis', '10-11-1952', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('131691473', 'Ajat Sudrajat', 'Bandung', '24-04-1959', 'Laki-Laki', 'Islam', 'WNI', 'PNS', 'IV B', '000000000000', 'Bandung'),
('131270748', 'Neni Anggraeni', 'Bandung', '27-08-1959', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV A', '000000000000', 'Bandung'),
('131792101', 'H. Nadjib', 'Pandeglang', '10-07-1952', 'Laki-Laki', 'Islam', 'WNI', 'PNS', 'IV A', '000000000000', 'Bandung'),
('131781546', 'Tati Rasmayanti', 'Rengat', '03-05-1963', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV A', '000000000000', 'Bandung'),
('131468876', 'Eti Sumiati', 'Bandung', '30-09-1961', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV A', '000000000000', 'Bandung'),
('131676634', 'Lukman', 'Tanah Datar', '12-08-1963', 'Laki-Laki', 'Islam', 'WNI', 'PNS', 'IV A', '000000000000', 'Bandung'),
('131873737', 'Sri Setiowati Rezeki', 'Madiun', '16-05-1969', 'Perempuan', 'Islam', 'WNI', 'PNS', 'IV A', '000000000000', 'Bandung');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE IF NOT EXISTS `jadwal` (
  `kode_mata_pelajaran` varchar(10) NOT NULL,
  `nama_mata_pelajaran` varchar(30) NOT NULL,
  `nama_guru` varchar(50) NOT NULL,
  `nama_kelas` varchar(20) NOT NULL,
  `hari` varchar(10) NOT NULL,
  `jam_masuk` varchar(10) NOT NULL,
  `jam_tengah` varchar(10) NOT NULL,
  `jam_keluar` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal`
--


-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE IF NOT EXISTS `kelas` (
  `tahun_ajaran` varchar(20) NOT NULL,
  `jumlah_siswa` varchar(4) NOT NULL,
  `nama_kelas` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--


-- --------------------------------------------------------

--
-- Table structure for table `mata_pelajaran`
--

CREATE TABLE IF NOT EXISTS `mata_pelajaran` (
  `kode_mata_pelajaran` varchar(10) NOT NULL,
  `nama_mata_pelajaran` varchar(30) NOT NULL,
  `jam_mata_pelajaran` varchar(10) NOT NULL,
  PRIMARY KEY  (`kode_mata_pelajaran`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mata_pelajaran`
--

INSERT INTO `mata_pelajaran` (`kode_mata_pelajaran`, `nama_mata_pelajaran`, `jam_mata_pelajaran`) VALUES
('mtk', 'Matematika', '2'),
('ppkn', 'PPKN', '2'),
('geo', 'Geografi', '2'),
('sosio', 'Sosiologi', '2'),
('eko', 'Ekonomi', '2'),
('indo', 'Bahasa Indonesia', '2'),
('bk', 'Bimbingan Konseling', '2'),
('penjas', 'Penjaskes', '2'),
('ing', 'Bahasa Inggris', '2'),
('bio', 'Biologi', '2'),
('jpg', 'Bahasa Jepang', '2'),
('pai', 'Pendidikan Agama Islam', '2'),
('sjr', 'Sejarah', '2'),
('kma', 'Kimia', '2'),
('sni', 'Kesenian', '2'),
('fsk', 'Fisika', '2');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE IF NOT EXISTS `nilai` (
  `kode_mata_pelajaran` varchar(10) NOT NULL,
  `nama_mata_pelajaran` varchar(30) NOT NULL,
  `nama_guru` varchar(50) NOT NULL,
  `nama_kelas` varchar(10) NOT NULL,
  `persentase_nh1` varchar(5) NOT NULL,
  `persentase_nh2` varchar(5) NOT NULL,
  `persentase_nh3` varchar(5) NOT NULL,
  `persentase_nuts` varchar(5) NOT NULL,
  `persentase_nuas` varchar(5) NOT NULL,
  `nis` varchar(9) NOT NULL,
  `nama_siswa` varchar(50) NOT NULL,
  `nh1` varchar(5) NOT NULL,
  `nh2` varchar(5) NOT NULL,
  `nh3` varchar(5) NOT NULL,
  `nuts` varchar(5) NOT NULL,
  `nuas` varchar(5) NOT NULL,
  `nakhir` varchar(5) NOT NULL,
  `tahun_ajaran` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--


-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE IF NOT EXISTS `siswa` (
  `nis` varchar(9) NOT NULL,
  `nama_siswa` varchar(50) NOT NULL,
  `tempat_lahir_siswa` varchar(25) NOT NULL,
  `tanggal_lahir_siswa` varchar(20) NOT NULL,
  `jk_siswa` varchar(10) NOT NULL,
  `agama_siswa` varchar(10) NOT NULL,
  `kewarganegaraan_siswa` varchar(20) NOT NULL,
  `no_telp_siswa` varchar(15) NOT NULL,
  `anak_ke` varchar(2) NOT NULL,
  `saudara` varchar(2) NOT NULL,
  `berat_siswa` varchar(3) NOT NULL,
  `tinggi_siswa` varchar(3) NOT NULL,
  `golongan_darah_siswa` varchar(2) NOT NULL,
  `alamat_siswa` varchar(250) NOT NULL,
  `nama_ayah` varchar(50) NOT NULL,
  `pendidikan_ayah` varchar(3) NOT NULL,
  `pekerjaan_ayah` varchar(30) NOT NULL,
  `nama_ibu` varchar(50) NOT NULL,
  `pendidikan_ibu` varchar(3) NOT NULL,
  `pekerjaan_ibu` varchar(30) NOT NULL,
  `no_telp_ortu` varchar(15) NOT NULL,
  `nama_wali` varchar(50) NOT NULL,
  `pendidikan_wali` varchar(3) NOT NULL,
  `pekerjaan_wali` varchar(30) NOT NULL,
  `hubungan_wali` varchar(30) NOT NULL,
  `no_telp_wali` varchar(15) NOT NULL,
  PRIMARY KEY  (`nis`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nis`, `nama_siswa`, `tempat_lahir_siswa`, `tanggal_lahir_siswa`, `jk_siswa`, `agama_siswa`, `kewarganegaraan_siswa`, `no_telp_siswa`, `anak_ke`, `saudara`, `berat_siswa`, `tinggi_siswa`, `golongan_darah_siswa`, `alamat_siswa`, `nama_ayah`, `pendidikan_ayah`, `pekerjaan_ayah`, `nama_ibu`, `pendidikan_ibu`, `pekerjaan_ibu`, `no_telp_ortu`, `nama_wali`, `pendidikan_wali`, `pekerjaan_wali`, `hubungan_wali`, `no_telp_wali`) VALUES
('121310001', 'Abu Jafar Yasit', 'Bandung', '31-05-1997', 'Laki-Laki', 'Islam', 'WNI', '000000000000', '1', '2', '65', '164', 'O', 'Bandung', 'Irsyad Syifa', 'SMA', 'Pegawai Swasta', 'Tety Subowo', 'S1', 'Ibu Rumah Tangga', '000000000000', '', '', '', '', ''),
('121310002', 'Adila Tri Gatika', 'Bandung', '09-10-1997', 'Perempuan', 'Islam', 'WNI', '000000000000', '2', '2', '69', '160', 'B', 'Bandung', 'Hermawan Julianto', 'S1', 'Guru', 'Harni Rusdiar', 'S1', 'Wirausahawan', '000000000000', '', '', '', '', ''),
('121310003', 'Albiba Insani', 'Bandung', '10-07-1996', 'Perempuan', 'Islam', 'WNI', '000000000000', '3', '4', '54', '155', 'AB', 'Bandung', 'Dedi Kusnadi', 'SMA', 'Wirausahawan', 'Enung Herawaty', 'SMA', 'PNS', '000000000000', '', '', '', '', ''),
('121310004', 'Amanda Insani Ginanjar', 'Bandung', '11-07-1998', 'Perempuan', 'Islam', 'WNI', '000000000000', '1', '3', '59', '162', 'A', 'Bandung', 'Ferry Rusmianto', 'SMP', 'PNS', 'Tati Komalasari', 'SMP', 'Guru', '000000000000', '', '', '', '', ''),
('121310005', 'Anji Rusdi Harjono', 'Jambi', '28-03-1997', 'Laki-Laki', 'Islam', 'WNI', '000000000000', '1', '2', '55', '157', 'AB', 'Bandung', 'Kukun Kusmaya', 'SMA', 'Pegawai Swasta', 'Dini Asri Putri', 'S1', 'Guru', '000000000000', 'Dedi Suradi', 'S1', 'PNS', 'Keluarga', '000000000000'),
('121310006', 'Arief Danial Rahman', 'Bandung', '24-09-1997', 'Laki-Laki', 'Islam', 'WNI', '000000000000', '1', '2', '58', '156', 'O', 'Bandung', 'Jati Pradana', 'S2', 'Dokter', 'Marliana Susanti', 'S1', 'PNS', '000000000000', '', '', '', '', ''),
('121310007', 'Ayu Putri Utami', 'Bandung', '08-09-1997', 'Perempuan', 'Islam', 'WNI', '000000000000', '3', '4', '60', '152', 'B', 'Bandung', 'Roni Sudireja', 'D1', 'TNI', 'Enok Sumarni', 'SMA', 'Wirausahawan', '000000000000', '', '', '', '', ''),
('121310008', 'Azka Vira Astari', 'Bandung', '09-06-1997', 'Perempuan', 'Islam', 'WNI', '000000000000', '2', '3', '69', '155', 'A', 'Bandung', 'Awal Gumilar', 'S1', 'PNS', 'Endju Yuningsih', 'S2', 'PNS', '000000000000', '', '', '', '', ''),
('121310009', 'Azmi Azizah', 'Bandung', '16-03-1997', 'Perempuan', 'Islam', 'WNI', '000000000000', '4', '4', '52', '155', 'AB', 'Bandung', 'Galih Aprianto', 'S1', 'PNS', 'Susi Silvianty', 'D1', 'Wirausahawan', '000000000', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` varchar(10) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `jabatan` varchar(15) NOT NULL,
  `kode_mata_pelajaran` varchar(10) NOT NULL,
  `nama_mata_pelajaran` varchar(30) NOT NULL,
  `nama_guru` varchar(50) NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`, `jabatan`, `kode_mata_pelajaran`, `nama_mata_pelajaran`, `nama_guru`) VALUES
('2013001', 'amin', '12345', 'Kepala Sekolah', '', '', 'H. Amin Wijaya'),
('2013002', 'amin2', '12345', 'Guru', 'ppkn', 'PPKN', 'H. Amin Wijaya'),
('2013003', 'ajat', '12345', 'Kesiswaan', '', '', 'Ajat Sudrajat'),
('2013004', 'ajat2', '12345', 'Guru', 'bio', 'Biologi', 'Ajat Sudrajat'),
('2013005', 'rita', '12345', 'Guru', 'mtk', 'Matematika', 'Rita Zuhriah'),
('2013006', 'johan', '12345', 'Guru', 'geo', 'Geografi', 'Johan Johny E'),
('2013007', 'tintin', '12345', 'Guru', 'sosio', 'Sosiologi', 'Tintin Rostini'),
('2013008', 'asep', '12345', 'Guru', 'penjas', 'Penjaskes', 'Asep Ratiadi'),
('2013009', 'cahya', '12345', 'Guru', 'bk', 'Bimbingan Konseling', 'Hj. Cahya Wulan'),
('2013010', 'endju', '12345', 'Guru', 'ing', 'Bahasa Inggris', 'Endju Djuriah'),
('2013011', 'neneng', '12345', 'Guru', 'eko', 'Ekonomi', 'Hj. Neneng Ekaningsih'),
('2013012', 'neni', '12345', 'Guru', 'jpg', 'Bahasa Jepang', 'Neni Anggraeni'),
('2013013', 'nadjib', '12345', 'Guru', 'pai', 'Pendidikan Agama Islam', 'H. Nadjib'),
('2013014', 'tati', '12345', 'Guru', 'sjr', 'Sejarah', 'Tati Rasmayanti'),
('2013015', 'eti', '12345', 'Guru', 'kma', 'Kimia', 'Eti Sumiati'),
('2013016', 'lukman', '12345', 'Guru', 'sni', 'Kesenian', 'Lukman'),
('2013017', 'sri', '12345', 'Guru', 'fsk', 'Fisika', 'Sri Setiowati Rezeki'),
('2013018', 'nurlaela', '12345', 'Guru', 'indo', 'Bahasa Indonesia', 'Nurlaela'),
('2013019', 'admin', '12345', 'Admin', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `wali_kelas`
--

CREATE TABLE IF NOT EXISTS `wali_kelas` (
  `kelas` varchar(5) NOT NULL,
  `nama_guru` varchar(50) NOT NULL,
  `status_guru` varchar(10) NOT NULL,
  `golongan_guru` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wali_kelas`
--

INSERT INTO `wali_kelas` (`kelas`, `nama_guru`, `status_guru`, `golongan_guru`) VALUES
('X 1', 'H. Nadjib', 'PNS', 'IV A'),
('X 2', 'Lukman', 'PNS', 'IV A');
