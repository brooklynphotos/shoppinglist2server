package photos.brooklyn.shoppinglist.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class ShopControllerTest {
    private MockMvc mockMVc;

    @InjectMocks
    private ShopController shopController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        this.mockMVc = MockMvcBuilders.standaloneSetup(shopController).build();
    }

    @Test
    public void testListShoppingItems() throws Exception {
        this.mockMVc.perform(
            get("/shop/list")
        ).andExpect(status().isOk());
    }

}