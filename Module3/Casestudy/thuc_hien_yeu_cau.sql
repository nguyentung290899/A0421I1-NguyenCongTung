-- câu 2:
select * from nhan_vien where ten like 'H%' or ten like 'T%' or ten like 'K%';
-- câu 3:
select * from khach_hang where (51*30*365) > (curdate()-ngay_sinh) and (curdate()-ngay_sinh) >(18*30*365) and (dia_chi like '%da nang%' or dia_chi like '%Quang tri%');
-- câu 4:
select khach_hang.ho, khach_hang.ten, count(hop_dong.id_hop_dong) as so_lan_dat_phong from khach_hang inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang where khach_hang.id_loai_khach = 1
group by khach_hang.id_khach_hang order by so_lan_dat_phong;
-- câu 5:
select khach_hang.id_khach_hang, khach_hang.ho, khach_hang.ten, loai_khach.ten_loai_khach, hop_dong.id_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
sum(dich_vu_di_kem.gia*hop_dong_chi_tiet.so_luong + dich_vu.chi_phi_thue) as tong_tien from khach_hang
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong.id_hop_dong;
-- câu 6:
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu from dich_vu
left join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where not exists( select hop_dong.id_hop_dong from hop_dong 
where (hop_dong.ngay_lam_hop_dong between "2019-01-01" and "2019-03-31") and hop_dong.id_dich_vu = dich_vu.id_dich_vu);
-- câu 7:
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu from dich_vu
left join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where not exists( select hop_dong.id_hop_dong from hop_dong where year(hop_dong.ngay_lam_hop_dong) = 2019 and hop_dong.id_dich_vu = dich_vu.id_dich_vu)
and exists(select hop_dong.id_hop_dong from hop_dong where  year(hop_dong.ngay_lam_hop_dong) =2018 and hop_dong.id_dich_vu = dich_vu.id_dich_vu);
-- câu 8:
	-- cách 1:
select distinct khach_hang.ten from khach_hang;
	-- cách 2:
select khach_hang.ho, khach_hang.ten from khach_hang group by khach_hang.ten;
	-- cách 3:
select khach_hang.ho, khach_hang.ten from khach_hang union select khach_hang.ho, khach_hang.ten from khach_hang;
-- câu 9:
select temp.month, count(month(hop_dong.ngay_lam_hop_dong)) as so_khach_hang_dang_ki, sum(hop_dong.tong_tien) as tong_tien from
(select 1 as month 
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join hop_dong on month(hop_dong.ngay_lam_hop_dong) = temp.month
where year(hop_dong.ngay_lam_hop_dong) = '2019' or hop_dong.ngay_lam_hop_dong is null
group by temp.month
order by temp.month;
-- câu 10:
select hop_dong.id_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem from hop_dong
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by hop_dong.id_hop_dong;
-- Câu 11:
select distinct dich_vu_di_kem.id_dich_vu_di_kem, ten_dich_vu_di_kem, dich_vu_di_kem.gia,dich_vu_di_kem.don_vi from dich_vu_di_kem 
inner join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
inner join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
inner join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach where loai_khach.ten_loai_khach = "Diamond" and (khach_hang.dia_chi like "%vinh%" or khach_hang.dia_chi like "%quang ngai%");
-- câu 12:
select hop_dong.id_hop_dong, nhan_vien.ten, khach_hang.ten, khach_hang.so_dien_thoai, dich_vu.ten_dich_vu, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lam_su_dung
from hop_dong
inner join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
inner join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
inner join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
where not exists(select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-06-30')
and exists( select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2019-10-01' and '2019-12-31')
group by dich_vu.ten_dich_vu;
-- câu 13:
select dich_vu_di_kem.id_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem, dich_vu_di_kem.gia, dich_vu_di_kem.don_vi, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
from dich_vu_di_kem 
inner join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.id_dich_vu_di_kem
order by so_lan_su_dung desc limit 3;
-- câu 14:
select dich_vu_di_kem.id_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem, dich_vu_di_kem.gia, dich_vu_di_kem.don_vi, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
from dich_vu_di_kem 
inner join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.id_dich_vu_di_kem
having so_lan_su_dung =1;
-- câu 15:
select nhan_vien.id_nhan_vien, nhan_vien.ten, trinh_do.trinh_do, bo_phan.ten_bo_phan, nhan_vien.so_dien_thoai, nhan_vien.dia_chi, count(hop_dong.id_hop_dong) as so_hop_dong_lap_duoc
from nhan_vien 
inner join trinh_do on nhan_vien.id_trinh_do = trinh_do.id_trinh_do
inner join bo_phan on nhan_vien.id_bo_phan = bo_phan.id_bo_phan
inner join hop_dong on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
where exists(select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2018-01-01' and '2019-01-01')
group by nhan_vien.id_nhan_vien
having so_hop_dong_lap_duoc < 4;
-- câu 16:
-- select khach_hang.id_khach_hang from khach_hang inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
-- where hop_dong.ngay_lam_hop_dong not between '2017-01-01' and '2019-01-01'
-- group by khach_hang.id_khach_hang;
delete khach_hang from khach_hang inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
where hop_dong.ngay_lam_hop_dong not between '2017-01-01' and '2019-01-01';
-- câu 17:
select khach_hang.id_khach_hang, khach_hang.ten, khach_hang.ngay_sinh, khach_hang.email, sum(hop_dong.tong_tien) as tong_tien from khach_hang 
inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
where year(hop_dong.ngay_lam_hop_dong) = '2019'
group by khach_hang.id_khach_hang
having tong_tien > 10000000;
-- câu 18:
delete khach_hang from khach_hang inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
where hop_dong.ngay_lam_hop_dong not between '2016-01-01' and current_date();
-- câu 19:
update dich_vu_di_kem 
set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2
where exists(select dich_vu_di_kem.id_dich_vu_di_kem, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as so_lan_su_dung from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
inner join hop_dong on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong_chi_tiet 
where year(hop_dong.ngay_lam_hop_dong) = '2019'
group by dich_vu_di_kem.id_dich_vu_di_kem
having so_lan_su_dung > 10);
-- câu 20:
select nhan_vien.id_nhan_vien as id_nhan_vien_or_id_khach_hang, nhan_vien.ho, nhan_vien.ten, nhan_vien.email, nhan_vien.so_dien_thoai, nhan_vien.ngay_sinh, nhan_vien.dia_chi 
from nhan_vien
union all select khach_hang.id_khach_hang,khach_hang.ho, khach_hang.ten, khach_hang.email, khach_hang.so_dien_thoai, khach_hang.ngay_sinh, khach_hang.dia_chi
from khach_hang;
-- câu 21:
-- sử dụng view:
create view nhan_vien_hai_chau as select nhan_vien.id_nhan_vien, nhan_vien.ho, nhan_vien.ten, vi_tri.ten_vi_tri, trinh_do.trinh_do, bo_phan.ten_bo_phan, nhan_vien.ngay_sinh, nhan_vien.email, nhan_vien.dia_chi
from nhan_vien inner join vi_tri on vi_tri.id_vi_tri = nhan_vien.id_vi_tri
inner join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
inner join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
inner join hop_dong on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
where nhan_vien.dia_chi like '%hải châu%'
and exists(select nhan_vien.id_nhan_vien where hop_dong.ngay_lam_hop_dong = '2019-12-12' );
select * from nhan_vien_hai_chau;
drop view nhan_vien_hai_chau;
-- sử dụng Store procedure:
DELIMITER //
create procedure v_nhan_vien(out nhan_vien_hai_chau varchar(50)) 
begin
set nhan_vien_hai_chau = (select nhan_vien.id_nhan_vien
from nhan_vien 
inner join hop_dong on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
where nhan_vien.dia_chi like '%hải châu%'
and exists(select nhan_vien.id_nhan_vien where hop_dong.ngay_lam_hop_dong = '2019-12-12' ));
end // 
DELIMITER ;
DROP PROCEDURE v_nhan_vien;
call v_nhan_vien(@nhan_vien);
select nhan_vien.id_nhan_vien, nhan_vien.ho, nhan_vien.ten, vi_tri.ten_vi_tri, trinh_do.trinh_do, bo_phan.ten_bo_phan, nhan_vien.ngay_sinh, nhan_vien.email, nhan_vien.dia_chi
from nhan_vien inner join vi_tri on vi_tri.id_vi_tri = nhan_vien.id_vi_tri
inner join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
inner join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
where nhan_vien.id_nhan_vien = @nhan_vien;
-- câu 22:
-- sử dụng view: 
set sql_safe_updates =0;
update nhan_vien_hai_chau
set nhan_vien_hai_chau.dia_chi = 'Liên Chiểu, Đà Nẵng'
where nhan_vien_hai_chau.dia_chi like '%hải châu%';
set sql_safe_updates =1;
-- sử dụng Store procedure:
update nhan_vien
set nhan_vien.dia_chi = 'Liên Chiểu, Đà Nẵng'
where nhan_vien.id_nhan_vien = @nhan_vien;
-- câu 23:
DELIMITER //
create procedure sp_1(in id_kh int)
begin 
delete from khach_hang where khach_hang.id_khach_hang = id_kh;
end //
DELIMITER ;
call sp_1(2012);
-- câu 24:
DELIMITER //
create procedure sp_2(
in id_hd int,
in id_nv int,
in id_dv int,
in id_kh int,
in ngay_lam_hd date,
in ngay_ket_thuc date,
in tien_dat_coc float,
in tong_tien float
)
begin 
insert into hop_dong value (id_hd,id_nv,id_dv,id_kh,ngay_lam_hd,ngay_ket_thuc,tien_dat_coc,tong_tien);
end //
DELIMITER ;
call sp_2(3020,1001,8,2001,'2018-07-26', '2018-07-28', 1000000, 3000000);
-- câu 25:
DELIMITER //
create trigger hien_thi_hop_dong after delete on hop_dong
for each row
begin
set @a = (select count(hop_dong.id_hop_dong) as so_luong_ban_ghi_con_lai from hop_dong);
end //
DELIMITER ;
delete hop_dong from hop_dong where hop_dong.id_hop_dong = 3020;
select @a;
-- câu 26:
DELIMITER //
create trigger tr_2 before update on hop_dong
for each row
begin
if (new.ngay_ket_thuc-hop_dong.ngay_lam_hop_dong) < '2' then
signal sqlstate '45000'
set message_text = "ERROR: ngày kết thúc phải lớn hơn ngày làm ít nhất 2 ngày";
end if;
end //
DELIMITER ;
drop trigger tr_2;
set sql_safe_updates =0;
update hop_dong
set hop_dong.ngay_ket_thuc = '2018-04-08'
where hop_dong.id_hop_dong = 3001;
set sql_safe_updates =1;
-- câu 27:
DELIMITER //
create function func_1() returns int 
READS SQL DATA
begin
set @dem_dich_vu = (select count(dich_vu.id_dich_vu) from dich_vu inner join hop_dong on hop_dong.id_dich_vu = dich_vu.id_dich_vu
where hop_dong.tong_tien > 2000000);
return @dem_dich_vu;
end //
DELIMITER ;
select func_1();
-- -----
DELIMITER //
create function func_2(id_khach_hang int) returns int 
READS SQL DATA
begin
set @thoi_gian_dai_nhat = (select max(hop_dong.ngay_ket_thuc-hop_dong.ngay_lam_hop_dong) from hop_dong 
where hop_dong.id_khach_hang = id_khach_hang);
return @thoi_gian_dai_nhat;
end //
DELIMITER ;
drop function func_2;
select func_2(2001);
-- câu 28:
DELIMITER //
create procedure sp_3(out id_dich_vu int) 
begin
set id_dich_vu = (select dich_vu.id_dich_vu from dich_vu inner join hop_dong on hop_dong.id_dich_vu = dich_vu.id_dich_vu
inner join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where loai_dich_vu.ten_loai_dich_vu = 'Room' and year(hop_dong.ngay_lam_hop_dong) between '2015' and '2019');
end //
DELIMITER ;
call sp_3(@dich_vu);
delete from dich_vu where dich_vu.id_dich_vu = @dichvu;