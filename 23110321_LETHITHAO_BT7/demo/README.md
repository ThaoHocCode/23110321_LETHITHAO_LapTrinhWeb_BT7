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

### Cách 2: Chạy từ Command Line
```bash
cd demo
mvn spring-boot:run
```

### Cách 3: Chạy file JAR (nếu đã build)
```bash
cd demo
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

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

---

## 🛠️ CÔNG NGHỆ SỬ DỤNG

### Backend Framework
- **Java 17**
- **Spring Boot 3.3.13**
- **Spring Data JPA** (ORM)
- **Spring Security** (Authentication)
- **Hibernate** (Database mapping)
- **Maven** (Build tool)

### Frontend Template
- **Thymeleaf Template Engine**
- **Thymeleaf Layout Dialect**
- **Bootstrap 5** (CSS Framework)
- **FontAwesome Icons**
- **Responsive Design**

### Database
- **H2 Database** (In-memory) - Mặc định
- **SQL Server** (Tùy chọn)
- **MySQL** (Tùy chọn)

---

## 📁 CẤU TRÚC PROJECT

```
demo/
├── src/main/java/vn/iostar/
│   ├── CategoryManagementApplication.java    # Main class
│   ├── Config/
│   │   └── LocaleConfig.java                 # Cấu hình đa ngôn ngữ
│   ├── Controller/
│   │   ├── HomeController.java               # Trang chủ
│   │   └── admin/CategoryController.java     # CRUD Controller
│   ├── Entity/
│   │   └── CategoryEntity.java               # JPA Entity
│   ├── Model/
│   │   └── CategoryModel.java                # Form binding model
│   ├── Repository/
│   │   └── CategoryRepository.java           # Data access layer
│   └── Service/
│       ├── ICategoryService.java             # Service interface
│       └── Impl/CategoryServiceImpl.java     # Service implementation
├── src/main/resources/
│   ├── application.properties                # Cấu hình ứng dụng
│   ├── i18n/                                # Đa ngôn ngữ
│   │   ├── messages.properties              # Tiếng Việt (mặc định)
│   │   ├── messages_vi.properties           # Tiếng Việt
│   │   └── messages_en.properties           # Tiếng Anh
│   ├── static/                              # Static resources
│   │   ├── css/style.css                    # Custom CSS
│   │   ├── js/script.js                     # Custom JavaScript
│   │   └── images/                          # Hình ảnh
│   └── templates/                           # Thymeleaf templates
│       ├── layouts/admin.html               # Layout chính
│       ├── index.html                       # Trang chủ
│       └── admin/categories/                # Category templates
│           ├── list.html                    # Danh sách
│           ├── addOrEdit.html              # Thêm/Sửa
│           ├── view.html                    # Chi tiết
│           └── searchpaging.html            # Tìm kiếm & phân trang
└── pom.xml                                  # Maven dependencies
```

---

## 🎓 ĐÁNH GIÁ BÀI TẬP

### Yêu cầu đã hoàn thành:
- ✅ **CRUD đầy đủ** cho Category
- ✅ **Thymeleaf Template Engine**
- ✅ **Thymeleaf Layout Dialect**
- ✅ **Tìm kiếm và phân trang**
- ✅ **Giao diện responsive**
- ✅ **Header, Content, Footer** theo yêu cầu
- ✅ **Thông tin sinh viên đầy đủ**
- ✅ **Đa ngôn ngữ (i18n)**
- ✅ **Database tự động**

### Điểm nổi bật:
- 🌟 **Giao diện đẹp** với Bootstrap 5
- 🌟 **UX/UI tốt** với icons và animations
- 🌟 **Code structure rõ ràng** theo mô hình MVC
- 🌟 **Responsive design** hoạt động tốt trên mobile
- 🌟 **Validation và error handling**
- 🌟 **Auto port selection** tránh conflict

---

## 📞 LIÊN HỆ HỖ TRỢ

**Sinh viên:** Lê Thị Thảo  
**Email:** [student-email]  
**Phone:** [phone-number]  

**Ghi chú:** Ứng dụng sử dụng H2 in-memory database nên không cần cài đặt database server. Tất cả dữ liệu sẽ được tạo tự động khi khởi động ứng dụng.
