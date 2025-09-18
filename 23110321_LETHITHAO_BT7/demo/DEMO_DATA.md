# HƯỚNG DẪN TEST CHỨC NĂNG

## 🎯 CÁC CHỨC NĂNG CẦN TEST

### 1. CRUD Operations

#### ➕ CREATE (Thêm danh mục)
1. Truy cập: `/admin/categories/add`
2. Nhập dữ liệu test:
   - **Tên:** Điện thoại
   - **Mô tả:** Các loại điện thoại smartphone
   - **Trạng thái:** Hoạt động
3. Click "Lưu"

#### 📖 READ (Xem danh sách)
1. Truy cập: `/admin/categories`
2. Xem danh sách categories
3. Click "Xem chi tiết" để xem thông tin cụ thể

#### ✏️ UPDATE (Cập nhật)
1. Trong danh sách, click nút "Sửa" (icon bút)
2. Thay đổi thông tin và lưu

#### 🗑️ DELETE (Xóa)
1. Click nút "Xóa" (icon thùng rác)
2. Xác nhận xóa

### 2. Search & Pagination

#### 🔍 Tìm kiếm
1. Truy cập: `/admin/categories/searchpaginated`
2. Nhập từ khóa tìm kiếm
3. Chọn số dòng/trang
4. Click "Tìm kiếm"

#### 📄 Phân trang
1. Thêm nhiều categories (>5 records)
2. Test các chức năng phân trang:
   - Next/Previous
   - First/Last
   - Chọn trang cụ thể

### 3. Internationalization (i18n)

#### 🌐 Chuyển đổi ngôn ngữ
1. Click nút "English" ở header
2. Giao diện chuyển sang tiếng Anh
3. Click "Việt Nam" để chuyển về tiếng Việt

### 4. Responsive Design

#### 📱 Test trên mobile
1. Mở Developer Tools (F12)
2. Chọn responsive mode
3. Test các screen size khác nhau

## 🧪 DỮ LIỆU TEST MẪU

```
Category 1:
- Tên: Laptop
- Mô tả: Máy tính xách tay các loại
- Trạng thái: Hoạt động

Category 2:
- Tên: Điện thoại
- Mô tả: Smartphone và điện thoại thông minh
- Trạng thái: Hoạt động

Category 3:
- Tên: Tablet
- Mô tả: Máy tính bảng iPad, Android
- Trạng thái: Ngừng hoạt động

Category 4:
- Tên: Phụ kiện
- Mô tả: Tai nghe, sạc, ốp lưng
- Trạng thái: Hoạt động

Category 5:
- Tên: Gaming
- Mô tả: Thiết bị chơi game, console
- Trạng thái: Hoạt động
```

## ✅ CHECKLIST ĐÁNH GIÁ

- [ ] Ứng dụng khởi động thành công
- [ ] Trang chủ hiển thị đầy đủ thông tin
- [ ] CRUD operations hoạt động
- [ ] Tìm kiếm theo tên
- [ ] Phân trang chính xác
- [ ] Chuyển đổi ngôn ngữ
- [ ] Giao diện responsive
- [ ] Validation form
- [ ] Error handling
- [ ] Thông tin sinh viên đầy đủ
