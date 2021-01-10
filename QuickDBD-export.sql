-- Exported from QuickDBD: https://www.quickdatabasediagrams.com/
-- NOTE! If you have used non-SQL datatypes in your design, you will have to change these here.

-- Modify this code to update the DB schema diagram.
-- To reset the sample schema, replace everything with
-- two dots ('..' - without quotes).

CREATE TABLE `Course` (
    `CourseID` int  NOT NULL ,
    `Name` varchar  NOT NULL ,
    `Title` varchar  NOT NULL ,
    `Description` varchar  NULL ,
    PRIMARY KEY (
        `CourseID`
    )
);

CREATE TABLE `Chapter` (
    `ChapterID` int  NOT NULL ,
    `CourseID` int  NOT NULL ,
    `Title` varchar  NOT NULL ,
    `Description` varchar  NULL ,
    PRIMARY KEY (
        `ChapterID`
    )
);

CREATE TABLE `Paragraph` (
    `ParagraphID` int  NOT NULL ,
    `ChapterID` int  NOT NULL ,
    `Text` varchar  NOT NULL ,
    `image` varbinary(max)  NOT NULL ,
    PRIMARY KEY (
        `ParagraphID`
    )
);

CREATE TABLE `ControlTest` (
    `CtID` int  NOT NULL ,
    `ChapterID` int  NOT NULL ,
    `Question` varchar  NOT NULL ,
    `Answer` varchar  NOT NULL ,
    PRIMARY KEY (
        `CtID`
    )
);

ALTER TABLE `Chapter` ADD CONSTRAINT `fk_Chapter_CourseID` FOREIGN KEY(`CourseID`)
REFERENCES `Course` (`CourseID`);

ALTER TABLE `Paragraph` ADD CONSTRAINT `fk_Paragraph_ChapterID` FOREIGN KEY(`ChapterID`)
REFERENCES `Chapter` (`ChapterID`);

ALTER TABLE `ControlTest` ADD CONSTRAINT `fk_ControlTest_ChapterID` FOREIGN KEY(`ChapterID`)
REFERENCES `Chapter` (`ChapterID`);

CREATE INDEX `idx_Course_Name`
ON `Course` (`Name`);

