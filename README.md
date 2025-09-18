# 23110321_LETHITHAO_LapTrinhWeb_BT7
# BÀI TẬP 7 - CATEGORY MANAGEMENT SYSTEM

## 👩‍🎓 THÔNG TIN SINH VIÊN
- **Họ tên:** Lê Thị Thảo
- **MSSV:** 23110321
- **Lớp:** 231102B
- **Ngành:** Công Nghệ Thông Tin
- **Trường:** Đại Học Sư Phạm Kỹ Thuật Tp.HCM
- **Giới tính:** Nữ

## 📚 THÔNG TIN BÀI TẬP
- **Môn học:** Lập trình Web (WEBPR330479)
- **Bài tập:** BT7 - CRUD Category với Thymeleaf
- **Mã bài tập:** 23110321_LETHITHAO_BT7
- **Giảng viên:** ThS. Nguyễn Hữu Trung
- **Ngày nộp:** 18/09/2025
- **Trạng thái:** ✅ Hoàn thành

---

## 🚀 HƯỚNG DẪN CHẠY ỨNG DỤNG (CHO GIẢNG VIÊN)

### Cách 1: Chạy trong IDE (Spring Tool Suite/Eclipse)
1. **Import project:**
   - File → Import → Existing Maven Projects
   - Browse đến thư mục `demo`
   - Import project

2. **Chạy ứng dụng:**
   - Right-click project `demo`
   - Run As → Spring Boot App
   - Hoặc chạy file `CategoryManagementApplication.java`

3. **Truy cập ứng dụng:**
   - Ứng dụng sẽ tự động chọn port available
   - Xem console để biết port (ví dụ: `Tomcat started on port 63575`)
   - Truy cập: `http://localhost:[PORT]`


---

## 🎯 CHỨC NĂNG ĐÃ HOÀN THÀNH

### ✅ CRUD Operations
- **CREATE**: Thêm danh mục mới với validation
- **READ**: Hiển thị danh sách, xem chi tiết danh mục
- **UPDATE**: Cập nhật thông tin danh mục
- **DELETE**: Xóa danh mục với xác nhận

### ✅ Tính năng nâng cao
- **SEARCH**: Tìm kiếm theo tên danh mục
- **PAGINATION**: Phân trang với size tùy chỉnh (5, 10, 15, 20)
- **RESPONSIVE DESIGN**: Giao diện đẹp với Bootstrap 5
- **INTERNATIONALIZATION**: Đa ngôn ngữ (Việt Nam ⇄ English)
- **LAYOUT DIALECT**: Sử dụng Thymeleaf Layout cho template

### ✅ Giao diện
- **Header**: Logo, thông tin sinh viên, chuyển đổi ngôn ngữ
- **Navigation**: Menu điều hướng các chức năng
- **Content**: Nội dung chính với các form và table
- **Footer**: Thông tin sinh viên và bài tập đầy đủ

---

## 🌐 CÁC URL CHÍNH

| Chức năng | URL | Mô tả |
|-----------|-----|--------|
| Trang chủ | `/` | Giới thiệu hệ thống |
| Danh sách | `/admin/categories` | Hiển thị tất cả categories |
| Thêm mới | `/admin/categories/add` | Form thêm category |
| Chỉnh sửa | `/admin/categories/edit/{id}` | Form sửa category |
| Xem chi tiết | `/admin/categories/view/{id}` | Hiển thị chi tiết |
| Xóa | `/admin/categories/delete/{id}` | Xóa category |
| Tìm kiếm | `/admin/categories/searchpaginated` | Tìm kiếm & phân trang |
| Database Console | `/h2-console` | Xem database H2 |


## 🎓 ĐÁNH GIÁ BÀI TẬP

### Yêu cầu đã hoàn thành:
- ✅ **CRUD đầy đủ** cho Category
- ✅ **Thymeleaf Template Engine**
- ✅ **Thymeleaf Layout Dialect**
- ✅ **Tìm kiếm và phân trang**
- ✅ **Giao diện responsive**
- ✅ **Header, Content, Footer** theo yêu cầu
- ✅ **Thông tin sinh viên đầy đủ**
- ✅ **Database tự động**


**Ghi chú:** Ứng dụng sử dụng H2 in-memory database nên không cần cài đặt database server. Tất cả dữ liệu sẽ được tạo tự động khi khởi động ứng dụng.

