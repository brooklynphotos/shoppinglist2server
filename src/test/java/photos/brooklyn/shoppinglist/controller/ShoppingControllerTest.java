package photos.brooklyn.shoppinglist.controller;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("Shopping Controller Test")
class ShoppingControllerTest {
    private MockMvc mockMVc;

    @InjectMocks
    private ShoppingController shoppingController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        this.mockMVc = MockMvcBuilders.standaloneSetup(shoppingController).build();
    }

    @Test
    public void testListShoppingItems() throws Exception {
        this.mockMVc.perform(
            get("/shopping/list")
        ).andExpect(status().isOk());
    }

    @Nested
    @DisplayName("Create tests")
    class Create{
        @Test
        public void testAddVoidB() throws Exception {
            mockMVc.perform(
              put("/shopping/create")
                .accept(MediaType.APPLICATION_JSON)
                .content("")
            ).andExpect(status().is4xxClientError());
        }
    }

    @Nested
    @DisplayName("Update tests")
    class Update{
        @Test
        @Disabled("controller end point not implemented yet")
        public void testUpdate() throws Exception{
            mockMVc.perform(
                    post("/shopping/update")
                    .content("")
            ).andExpect(status().is4xxClientError());
        }
    }
}