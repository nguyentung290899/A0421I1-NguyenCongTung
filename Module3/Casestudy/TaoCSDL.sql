create database resort_furama;
create table vi_tri(
	id_vi_tri int not null,
    ten_vi_tri varchar(45) not null,
    primary key (id_vi_tri)
);
create table trinh_do(
	id_trinh_do int not null,
    trinh_do varchar(45) not null,
    primary key (id_trinh_do)
);
create table bo_phan(
	id_bo_phan int not null,
    ten_bo_phan varchar(45) not null,
    primary key (id_bo_phan)
);
create table nhan_vien(
	id_nhan_vien int not null auto_increment,
    ho varchar(50) not null,
    ten varchar(50) not null,
    id_vi_tri int not null,
    id_trinh_do int not null,
    id_bo_phan int not null,
    ngay_sinh date not null,
    so_chung_minh varchar(20) not null,
    luong float not null,
    so_dien_thoai varchar(12) not null,
    email varchar(50) not null,
    dia_chi varchar(50) not null,
    primary key (id_nhan_vien),
    foreign key (id_vi_tri) references vi_tri(id_vi_tri) on delete cascade on update cascade,
    foreign key (id_bo_phan) references bo_phan(id_bo_phan) on delete cascade on update cascade,
    foreign key (id_trinh_do) references trinh_do(id_trinh_do) on delete cascade on update cascade
);
-- drop table nhan_vien;
create table loai_khach(
	id_loai_khach int not null,
    ten_loai_khach varchar(45) not null,
    primary key (id_loai_khach)
);
create table khach_hang(
	id_khach_hang int not null auto_increment,
    id_loai_khach int not null,
    ho varchar(40) not null,
    ten varchar(40) not null,
    ngay_sinh date not null,
    so_chung_minh varchar(20) not null,
    so_dien_thoai varchar(12) not null,
    email varchar(50) not null,
    dia_chi varchar(50) not null,
    primary key (id_khach_hang),
    foreign key (id_loai_khach) references loai_khach(id_loai_khach) on delete cascade on update cascade
); 
-- drop table khach_hang;
create table kieu_thue(
	id_kieu_thue int not null auto_increment,
    ten_kieu_thue varchar(45) not null,
    primary key (id_kieu_thue)
);
create table loai_dich_vu(
	id_loai_dich_vu int not null auto_increment,
    ten_loai_dich_vu varchar(50) not null,
    primary key (id_loai_dich_vu)
);
create table dich_vu(
	id_dich_vu int not null auto_increment,
    ten_dich_vu varchar(50) not null,
    dien_tich float not null,
    so_tang int ,
    so_nguoi_toi_da int not null,
    chi_phi_thue float not null,
    id_kieu_thue int not null,
    id_loai_dich_vu int not null,
    trang_thai text,
    primary key (id_dich_vu),
    foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue) on delete cascade on update cascade,
    foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu) on delete cascade on update cascade
);
-- drop table dich_vu;
create table hop_dong(
	id_hop_dong int not null auto_increment,
    id_nhan_vien int not null,
    id_dich_vu int not null,
    id_khach_hang int not null,
    ngay_lam_hop_dong date not null,
    ngay_ket_thuc date not null,
    tien_dat_coc float not null,
    tong_tien float not null,
    primary key (id_hop_dong),
    foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien) on delete cascade on update cascade,
    foreign key (id_dich_vu) references dich_vu(id_dich_vu) on delete cascade on update cascade,
    foreign key (id_khach_hang) references khach_hang(id_khach_hang) on delete cascade on update cascade
);
-- drop table hop_dong;
create table hop_dong_chi_tiet(
	id_hop_dong_chi_tiet int not null auto_increment,
    id_hop_dong int not null,
    id_dich_vu_di_kem int not null,
    so_luong int not null,
    primary key (id_hop_dong_chi_tiet),
    foreign key (id_hop_dong) references hop_dong(id_hop_dong) on delete cascade on update cascade,
    foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem) on delete cascade on update cascade
);
-- drop table hop_dong_chi_tiet;
create table dich_vu_di_kem(
	id_dich_vu_di_kem int not null auto_increment,
    ten_dich_vu_di_kem varchar(50) not null,
    gia float not null,
    don_vi int not null,
    trang_thai_kha_dung varchar(50) not null,
    primary key (id_dich_vu_di_kem)
);
insert into trinh_do value (1,"Trung cấp");
insert into trinh_do value (2,"Cao đẳng");
insert into trinh_do value (3,"Đại học");
insert into trinh_do value (4,"Sau đại học");
insert into bo_phan value (1,"Sale – Marketing");
insert into bo_phan value (2,"Hành Chính");
insert into bo_phan value (3,"Phục vụ");
insert into bo_phan value (4,"Quản lý");
insert into vi_tri value (1,"Lễ tân");
insert into vi_tri value (2,"Phục vụ");
insert into vi_tri value (3,"Chuyên viên");
insert into vi_tri value (4,"Giám sát");
insert into vi_tri value (5,"Quản lý");
insert into vi_tri value (6,"Giám Đốc");
insert into kieu_thue value (1, "Thuê theo năm"); 
insert into kieu_thue value (2, "Thuê theo tháng"); 
insert into kieu_thue value (3, "Thuê theo ngày"); 
insert into kieu_thue value (4, "Thuê theo giờ"); 
insert into loai_dich_vu value (1, "Villa"); 
insert into loai_dich_vu value (2, "House"); 
insert into loai_dich_vu value (3, "Room"); 
insert into nhan_vien values (1001,"Nguyễn Văn","Hoài",1,1,3,'1995/07/21',143243243,6000000,0942717483,'nguyenvanhoai@gmail.com','39 Quang Trung, Hà Nội, Việt Nam');
insert into nhan_vien values (1002,"Lê Văn","Linh",2,2,3,'1996/04/15',143243654,7000000,0942754364,'levanlinh@gmail.com','273 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1003,"Hoàng Thị","Hà",3,3,2,'1993/05/13',143438754,10000000,0942473954,'hoangthiha@gmail.com','307 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1004,"Vương Bá","Nhân",3,4,4,'1994/08/05',143635256,12000000,0942643632,'vuongbanhan@gmail.com','290 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1005,"Phan Thị","Châu",3,3,4,'1988/01/28',143479254,10000000,0942958354,'phanthichau@gmail.com','20, Đường số 2, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1006,"Nguyễn Hoàng","Nam",3,4,4,'1986/09/23',143538654,13000000,0942857394,'nguyenhoangnam@gmail.com','10,Bàu Mạc 20, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1007,"Nguyễn Quang","Kiên",3,4,4,'1986/09/23',143538654,13000000,0942857394,'nguyenquangkien@gmail.com','16,Bàu Mạc 20, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1008,"Nguyễn Thị","Thắm",1,2,3,'1992-06-14',143694864,7000000,0942584938,'nguyenthitham@gmail.com','157 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into nhan_vien values (1009,"Vương Hoàng","Tiến",3,4,4,'1986-09-23',143538654,13000000,0942857394,'vuonghoangtien@gmail.com','Hải Châu, Đà Nẵng');
insert into loai_khach values (1, "Diamond");
insert into loai_khach values (2, "Platinium");
insert into loai_khach values (3, "Gold");
insert into loai_khach values (4, "Silver");
insert into loai_khach values (5, "Member");
insert into khach_hang values (2001, 5,"Nguyễn Hữu", "Quang", "1996-06-12", 184738574, 0971574384, 'nguyenhuuquang@gmail.com','187 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into khach_hang values (2002, 2,"Lê Văn", "Huỳnh", "1997-06-12", 184151354, 0971684529, 'levanhuynhg@gmail.com','176 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into khach_hang values (2003, 3,"Vương Quốc", "Hoàng", "1998-06-12", 184612458, 0971316486, 'vuongquochoang@gmail.com','147 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng');
insert into khach_hang values (2004, 2,"Hoàng Thị", "Thơ", "1985-06-12", 184613548, 0971954682, 'hoangthitho@gmail.com','03 Trần Cừ, Hòa Thuận Tây, Hải Châu, Đà Nẵng');
insert into khach_hang values (2005, 1,"Lê Mạnh", "Quân", "1986-06-12", 184615474, 0971684254, 'lemanhquan@gmail.com','ĐT9, Cam khê, Cam Lộ, Quảng Trị');
insert into khach_hang values (2006, 1,"Lê Văn", "Tuấn", "1976-06-12", 184613548, 0971613618, 'lemanhquan@gmail.com','QL1A, Gio Quang, Gio Linh, Quảng Trị');
insert into khach_hang values (2007, 2,"Kiều Văn", "Đại", "1983-06-12", 184661548, 0971615489, 'kieuvandai@gmail.com','TL10D, Vinh Phú, Phú Vang, Thừa Thiên Huế');
insert into khach_hang values (2008, 3,"Nguyễn Thị", "Hương", "1983-06-12", 184661548, 0971615489, 'nguyenthihuong@gmail.com','TL10D, Vinh Phú, Phú Vang, Thừa Thiên Huế');
insert into khach_hang values (2009, 1,"Hoàng Văn", "An", "1976-06-12", 184666131, 0971661325, 'hoangvanan@gmail.com','Quang Trung, Thành phố Qui Nhơn, Bình Định');
insert into khach_hang values (2010, 4,"Lương Bá", "Bảo", "1983-06-12", 184665189, 0971913518, 'luongbabao@gmail.com','Đống Đa, Thành phố Qui Nhơn, Bình Định');
insert into khach_hang values (2011, 1,"Lương Bá", "Bảo", "1953-07-12", 184685948, 0971594815, 'luongbabao1@gmail.com','97-83 Đường Lưu Đức An, Hà Huy Tập, Vinh, Nghệ An');
insert into khach_hang values (2012, 1,"Lương Bá", "Bảo", "1953-07-12", 184685948, 0971594815, 'luongbabao1@gmail.com','97-83 Đường Lưu Đức An, Hà Huy Tập, Vinh, Nghệ An');
insert into dich_vu value (1, "Villa Liên Chiểu", 400, 1, 8, 3000000, 3, 1, "");
insert into dich_vu value (2, "Villa Ngũ Hành Sơn", 400, 2, 8, 3000000, 3, 1, "");
insert into dich_vu value (3, "House Liên Chiểu", 300, 2, 5, 2000000, 3, 2, "");
insert into dich_vu value (4, "House Mỹ Khê", 300, 2, 5, 2000000, 3, 2, "");
insert into dich_vu value (4, "House Ngũ Hành Sơn", 400, 1, 5, 2000000, 3, 2, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
value (5, "Room Lien Chiểu 101", 100, 2, 400000, 4, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (6, "Room Lien Chiểu 102", 100, 2, 400000, 3, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (7, "Room Lien Chiểu 103", 100, 2, 400000, 4, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (8, "Room Lien Chiểu 201", 100, 2, 400000, 2, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (9, "Room Lien Chiểu 202", 100, 2, 400000, 1, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (10, "Room Lien Chiểu 203", 100, 1, 400000, 2, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (11, "Room Mỹ Khê 101", 100, 2, 400000, 4, 1, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (12, "Room Mỹ Khê 102", 100, 2, 400000, 3, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (13, "Room Mỹ Khê 201", 100, 2, 400000, 2, 3, "");
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai) 
value (14, "Room Mỹ Khê 202", 100, 2, 400000, 1, 3, "");
insert into hop_dong value (3001, 1001, 1, 2001, "2018-04-05","2018-04-07", 500000, 6000000);
insert into hop_dong value (3002 , 1002, 2, 2002, "2019-03-05","2019-03-07", 500000, 6000000);
insert into hop_dong value (3003, 1003, 3, 2003, "2020-04-05","2020-04-07", 500000, 6000000);
insert into hop_dong value (3004, 1004, 4, 2004, "2018-02-05","2018-02-07", 500000, 6000000);
insert into hop_dong value (3005, 1005, 5, 2005, "2019-04-05","2019-04-07", 500000, 6000000);
insert into hop_dong value (3006, 1001, 6, 2006, "2021-04-05","2021-04-07", 500000, 6000000);
insert into hop_dong value (3007, 1003, 8, 2008, "2017-04-05","2017-04-07", 500000, 6000000);
insert into hop_dong value (3008, 1005, 1, 2003, "2018-04-05","2018-04-07", 500000, 6000000);
insert into hop_dong value (3009, 1004, 7, 2007, "2019-04-05","2019-04-07", 500000, 6000000);
insert into hop_dong value (3010, 1007, 13, 2009, "2019-04-05","2019-04-07", 500000, 6000000);
insert into hop_dong value (3011, 1009, 2, 2007, "2019-12-12","2020-01-02", 500000, 6000000);
insert into hop_dong value (3012, 1007, 1, 2005, "2021-04-05","2021-04-07", 500000, 6000000);
insert into hop_dong value (3013, 1006, 5, 2001, "2020-07-05","2020-07-07", 500000, 6000000);
insert into hop_dong value (3014, 1008, 3, 2002, "2019-02-05","2019-02-07", 500000, 6000000);
insert into hop_dong value (3015, 1009, 2, 2003, "2018-04-05","2018-04-07", 500000, 6000000);
insert into hop_dong value (3016, 1001, 6, 2006, "2019-04-05","2019-04-07", 500000, 6000000);
insert into hop_dong value (3017, 1002, 7, 2008, "2018-04-05","2018-04-07", 500000, 6000000);
insert into hop_dong value (3018, 1006, 2, 2011, "2019-04-05","2019-04-09", 900000, 12000000);
insert into hop_dong value (3019, 1007, 9, 2001, "2019-11-05","2019-11-09", 800000, 800000);
insert into dich_vu_di_kem value (1, "Ăn sáng", 100000, 1, "");
insert into dich_vu_di_kem value (2, "Ăn sáng", 500000, 1, "");
insert into dich_vu_di_kem value (3, "Ăn sáng", 1000000, 1, "");
insert into dich_vu_di_kem value (4, "Ăn trưa", 500000, 1, "");
insert into dich_vu_di_kem value (5, "Ăn trưa", 1000000, 1, "");
insert into dich_vu_di_kem value (6, "Ăn trưa", 200000, 1, "");
insert into dich_vu_di_kem value (7, "Ăn tối", 200000, 1, "");
insert into dich_vu_di_kem value (8, "Ăn tối", 500000, 1, "");
insert into dich_vu_di_kem value (9, "Ăn tối", 1000000, 1, "");
insert into dich_vu_di_kem value (10, "Dọn dẹp", 100000, 1, "");
insert into hop_dong_chi_tiet value (4001, 3001, 1, 2);
insert into hop_dong_chi_tiet value (4002, 3002, 3, 2);
insert into hop_dong_chi_tiet value (4003, 3003, 6, 2);
insert into hop_dong_chi_tiet value (4004, 3004, 4, 2);
insert into hop_dong_chi_tiet value (4005, 3005, 3, 2);
insert into hop_dong_chi_tiet value (4006, 3006, 2, 2);
insert into hop_dong_chi_tiet value (4007, 3007, 4, 2);
insert into hop_dong_chi_tiet value (4008, 3008, 5, 2);
insert into hop_dong_chi_tiet value (4009, 3009, 6, 2);
insert into hop_dong_chi_tiet value (4010, 3010, 7, 2);
insert into hop_dong_chi_tiet value (4011, 3011, 10, 2);
insert into hop_dong_chi_tiet value (4012, 3012, 9, 2);
insert into hop_dong_chi_tiet value (4013, 3013, 4, 2);
insert into hop_dong_chi_tiet value (4014, 3014, 8, 2);
insert into hop_dong_chi_tiet value (4015, 3015, 9, 2);
insert into hop_dong_chi_tiet value (4016, 3016, 2, 2);
insert into hop_dong_chi_tiet value (4017, 3017, 4, 2);
insert into hop_dong_chi_tiet value (4018, 3018, 4, 3);
insert into hop_dong_chi_tiet value (4019, 3018, 2, 2);
insert into hop_dong_chi_tiet value (4020, 3019, 7, 2);