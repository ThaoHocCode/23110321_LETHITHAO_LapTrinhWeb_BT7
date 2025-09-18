package vn.iostar.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vn.iostar.Entity.CategoryEntity;
import vn.iostar.Service.ICategoryService;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ICategoryService categoryService;

    @Override
    public void run(String... args) throws Exception {
        // Kiểm tra nếu chưa có dữ liệu thì tạo dữ liệu mẫu
        if (categoryService.count() == 0) {
            createSampleData();
        }
    }

    private void createSampleData() {
        // Tạo dữ liệu mẫu cho categories
        
        CategoryEntity laptop = new CategoryEntity();
        laptop.setName("Laptop");
        laptop.setDescription("High-performance laptops for work and gaming");
        laptop.setStatus(true);
        categoryService.save(laptop);

        CategoryEntity smartphone = new CategoryEntity();
        smartphone.setName("Smartphone");
        smartphone.setDescription("Latest smartphones with advanced features");
        smartphone.setStatus(true);
        categoryService.save(smartphone);

        CategoryEntity tablet = new CategoryEntity();
        tablet.setName("Tablet");
        tablet.setDescription("Portable tablets for entertainment and productivity");
        tablet.setStatus(true);
        categoryService.save(tablet);

        CategoryEntity accessories = new CategoryEntity();
        accessories.setName("Accessories");
        accessories.setDescription("Tech accessories including headphones, chargers, cases");
        accessories.setStatus(true);
        categoryService.save(accessories);

        CategoryEntity gaming = new CategoryEntity();
        gaming.setName("Gaming");
        gaming.setDescription("Gaming consoles, controllers and gaming equipment");
        gaming.setStatus(true);
        categoryService.save(gaming);

        CategoryEntity wearables = new CategoryEntity();
        wearables.setName("Wearables");
        wearables.setDescription("Smartwatches, fitness trackers and wearable technology");
        wearables.setStatus(true);
        categoryService.save(wearables);

        CategoryEntity cameras = new CategoryEntity();
        cameras.setName("Cameras");
        cameras.setDescription("Digital cameras, action cameras and photography equipment");
        cameras.setStatus(true);
        categoryService.save(cameras);

        CategoryEntity audio = new CategoryEntity();
        audio.setName("Audio");
        audio.setDescription("Speakers, headphones, earbuds and audio equipment");
        audio.setStatus(true);
        categoryService.save(audio);

        CategoryEntity networking = new CategoryEntity();
        networking.setName("Networking");
        networking.setDescription("Routers, modems, network switches and connectivity devices");
        networking.setStatus(true);
        categoryService.save(networking);

        CategoryEntity storage = new CategoryEntity();
        storage.setName("Storage");
        storage.setDescription("Hard drives, SSDs, USB drives and storage solutions");
        storage.setStatus(true);
        categoryService.save(storage);

        CategoryEntity monitors = new CategoryEntity();
        monitors.setName("Monitors");
        monitors.setDescription("Computer monitors, displays and screen accessories");
        monitors.setStatus(true);
        categoryService.save(monitors);

        CategoryEntity software = new CategoryEntity();
        software.setName("Software");
        software.setDescription("Applications, operating systems and digital licenses");
        software.setStatus(false); // Inactive category
        categoryService.save(software);

        System.out.println("✅ Sample data has been created successfully!");
        System.out.println("📊 Total categories: " + categoryService.count());
    }
}
