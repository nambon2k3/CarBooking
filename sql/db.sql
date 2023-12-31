USE [master]
GO
/****** Object:  Database [CarBooking]    Script Date: 10/26/2023 2:12:41 PM ******/
CREATE DATABASE [CarBooking]
GO
ALTER DATABASE [CarBooking] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CarBooking].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CarBooking] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CarBooking] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CarBooking] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CarBooking] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CarBooking] SET ARITHABORT OFF 
GO
ALTER DATABASE [CarBooking] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CarBooking] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CarBooking] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CarBooking] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CarBooking] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CarBooking] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CarBooking] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CarBooking] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CarBooking] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CarBooking] SET  ENABLE_BROKER 
GO
ALTER DATABASE [CarBooking] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CarBooking] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CarBooking] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CarBooking] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CarBooking] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CarBooking] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CarBooking] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CarBooking] SET RECOVERY FULL 
GO
ALTER DATABASE [CarBooking] SET  MULTI_USER 
GO
ALTER DATABASE [CarBooking] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CarBooking] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CarBooking] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CarBooking] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CarBooking] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CarBooking] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'CarBooking', N'ON'
GO
ALTER DATABASE [CarBooking] SET QUERY_STORE = ON
GO
ALTER DATABASE [CarBooking] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [CarBooking]
GO
/****** Object:  Table [dbo].[Bus]    Script Date: 10/26/2023 2:12:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bus](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[seats] [int] NULL,
	[departureTime] [varchar](100) NULL,
	[source] [varchar](100) NULL,
	[destination] [varchar](100) NULL,
	[arrivalTime] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ticket]    Script Date: 10/26/2023 2:12:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ticket](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](100) NULL,
	[busId] [int] NULL,
	[seatNumber] [int] NULL,
	[bookedDate] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 10/26/2023 2:12:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[username] [varchar](100) NOT NULL,
	[dob] [date] NULL,
	[email] [varchar](320) NULL,
	[full_name] [varchar](100) NULL,
	[gender] [int] NULL,
	[password] [varchar](100) NULL,
	[role] [int] NULL,
	[img] [nvarchar](max) NULL,
	[status] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Bus] ON 

INSERT [dbo].[Bus] ([id], [seats], [departureTime], [source], [destination], [arrivalTime]) VALUES (1, 45, N'08:30 AM', N'Hanoi', N'Ho Chi Minh City', N'03:30 PM')
INSERT [dbo].[Bus] ([id], [seats], [departureTime], [source], [destination], [arrivalTime]) VALUES (2, 30, N'10:00 AM', N'Hanoi', N'Da Nang', N'04:30 PM')
INSERT [dbo].[Bus] ([id], [seats], [departureTime], [source], [destination], [arrivalTime]) VALUES (3, 40, N'09:00 AM', N'Hanoi', N'Nha Trang', N'05:00 PM')
SET IDENTITY_INSERT [dbo].[Bus] OFF
GO
SET IDENTITY_INSERT [dbo].[ticket] ON 

INSERT [dbo].[ticket] ([id], [username], [busId], [seatNumber], [bookedDate]) VALUES (7, N'Aline', 1, 1, CAST(N'2023-10-26' AS Date))
INSERT [dbo].[ticket] ([id], [username], [busId], [seatNumber], [bookedDate]) VALUES (8, N'Branden', 1, 2, CAST(N'2023-10-26' AS Date))
INSERT [dbo].[ticket] ([id], [username], [busId], [seatNumber], [bookedDate]) VALUES (9, N'Chiquita', 2, 1, CAST(N'2023-10-26' AS Date))
INSERT [dbo].[ticket] ([id], [username], [busId], [seatNumber], [bookedDate]) VALUES (10, N'Christian', 2, 2, CAST(N'2023-10-26' AS Date))
INSERT [dbo].[ticket] ([id], [username], [busId], [seatNumber], [bookedDate]) VALUES (11, N'Clio', 3, 1, CAST(N'2023-10-26' AS Date))
SET IDENTITY_INSERT [dbo].[ticket] OFF
GO
INSERT [dbo].[Users] ([username], [dob], [email], [full_name], [gender], [password], [role], [img], [status]) VALUES (N'admin', CAST(N'2023-05-26' AS Date), N'malesuada@hotmail.net', N'Castor', 0, N'21232f297a57a5a743894a0e4a801fc3', 0, N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU', 1)
INSERT [dbo].[Users] ([username], [dob], [email], [full_name], [gender], [password], [role], [img], [status]) VALUES (N'Aline', CAST(N'2023-07-19' AS Date), N'phasellus.dolor@yahoo.org', N'Kadeem', 0, N'202cb962ac59075b964b07152d234b70', 0, N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU', 1)
INSERT [dbo].[Users] ([username], [dob], [email], [full_name], [gender], [password], [role], [img], [status]) VALUES (N'Branden', CAST(N'2023-08-15' AS Date), N'consequat.purus@google.com', N'Yuli', 0, N'202cb962ac59075b964b07152d234b70', 0, N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU', 1)
INSERT [dbo].[Users] ([username], [dob], [email], [full_name], [gender], [password], [role], [img], [status]) VALUES (N'Chiquita', CAST(N'2023-04-29' AS Date), N'tellus.justo.sit@google.com', N'Ulysses', 1, N'202cb962ac59075b964b07152d234b70', 0, N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU', 1)
INSERT [dbo].[Users] ([username], [dob], [email], [full_name], [gender], [password], [role], [img], [status]) VALUES (N'Christian', CAST(N'2023-05-26' AS Date), N'eu.erat@google.net', N'Damian', 0, N'202cb962ac59075b964b07152d234b70', 0, N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU', 1)
INSERT [dbo].[Users] ([username], [dob], [email], [full_name], [gender], [password], [role], [img], [status]) VALUES (N'Clio', CAST(N'2023-08-17' AS Date), N'fusce@icloud.com', N'Elvis Nam', 0, N'e10adc3949ba59abbe56e057f20f883e', 0, N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU', 1)
GO
ALTER TABLE [dbo].[ticket] ADD  DEFAULT (getdate()) FOR [bookedDate]
GO
ALTER TABLE [dbo].[Users] ADD  DEFAULT ((0)) FOR [role]
GO
ALTER TABLE [dbo].[Users] ADD  DEFAULT (N'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNL_ZnOTpXSvhf1UaK7beHey2BX42U6solRA&usqp=CAU') FOR [img]
GO
ALTER TABLE [dbo].[Users] ADD  DEFAULT ((1)) FOR [status]
GO
ALTER TABLE [dbo].[ticket]  WITH CHECK ADD FOREIGN KEY([busId])
REFERENCES [dbo].[Bus] ([id])
GO
ALTER TABLE [dbo].[ticket]  WITH CHECK ADD FOREIGN KEY([busId])
REFERENCES [dbo].[Bus] ([id])
GO
ALTER TABLE [dbo].[ticket]  WITH CHECK ADD FOREIGN KEY([username])
REFERENCES [dbo].[Users] ([username])
GO
ALTER TABLE [dbo].[ticket]  WITH CHECK ADD FOREIGN KEY([username])
REFERENCES [dbo].[Users] ([username])
GO
USE [master]
GO
ALTER DATABASE [CarBooking] SET  READ_WRITE 
GO
