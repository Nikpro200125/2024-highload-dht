package ru.vk.itmo.test.nikitaprokopev;

import ru.vk.itmo.ServiceConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ServerStarter {
    public static void main(String[] args) throws IOException {
        MyServer server = new MyServer(
                new ServiceConfig(
                        8080,
                        "http://localhost",
                        List.of("http://localhost"),
                        Files.createTempDirectory("dao")
                )
        );

        server.start();
    }
}
