CREATE TABLE Shows(id INTEGER NOT NULL primary key autoincrement,
Status	VARCHAR(65),
Cancelled	VARCHAR(65),
EpguidesShowNameLink	VARCHAR(60),
TivoNameLink	VARCHAR(31),
NetworkLink	VARCHAR(306),
EpguidesShowName	VARCHAR(47) NOT NULL,
PremiereDate	DATETIME,
Premiere	VARCHAR(65),
InCanceledAs	VARCHAR(47),
Network	VARCHAR(14),
InCanceledAsLink	VARCHAR(70),
LastShow	VARCHAR(10),
TivoName	VARCHAR(47));