-- yeu cau 2
select * from nhanvien where (ho_va_ten like 'h%' or ho_va_ten like 't%') and lenght(ho_va_ten)<15;

-- yeu cau 3
select * from khachhang where Diachia in('Quang Tri'.' Da Nang') and (curdate()-NgaySinh(18*30*365) and curdate()-NgaySinh(50*30*365));

-- yeu cau 4
select khachang.ho_va_ten, count(hopdong.IDHopDong) as so_lan_dat_phong from khachhang 
inner join hopdong on khachang.IDKhachHang=hopdong.IDKhachHang inner join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach where loaikhach.TenLoaiKhach"Diamond"
group by khach hang.IDKhachHang order by so_lan_dat_phong;