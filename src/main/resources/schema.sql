DROP TABLE IF EXISTS weather;
CREATE TABLE `section` (
                           `id` int(11) NOT NULL,
                           `temp` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS flights;
CREATE TABLE `flights` (
                        `id` int(11) NOT NULL,
                        `weather_idfs` int(11) NOT NULL,
                        `airline` text COLLATE utf8_bin NOT NULL,
                        `planeNr` int(11) NOT NULL,
                        `departure_time` datetime NOT NULL,
                        `arrival_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;