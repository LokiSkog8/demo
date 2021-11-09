CREATE TABLE file(
fileid UUID NOT NULL DEFAULT get_random_uuid() PRIMARY KEY,
contenttype TEXT,
data bytea
);