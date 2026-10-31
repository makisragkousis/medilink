package gr.aueb.cf.medilink;

import org.springframework.boot.SpringApplication;

public class TestMedilinkApplication {

    public static void main(String[] args) {
        SpringApplication.from(MedilinkApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
