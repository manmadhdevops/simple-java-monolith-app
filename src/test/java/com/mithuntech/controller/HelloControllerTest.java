package com.mithuntech.controller;

import com.mithuntech.service.GreetingService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    void greetReturnsMessage() {
        GreetingService service = new GreetingService();
        HelloController controller = new HelloController(service);
        String response = controller.greet("Mithun").getBody();
        assertThat(response).contains("Mithun");
    }
}
