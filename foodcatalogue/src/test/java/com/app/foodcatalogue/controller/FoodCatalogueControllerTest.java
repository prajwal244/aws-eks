package com.app.foodcatalogue.controller;

import com.app.foodcatalogue.dto.FoodCataloguePage;
import com.app.foodcatalogue.dto.FoodItemDTO;
import com.app.foodcatalogue.service.FoodCatalogueService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class FoodCatalogueControllerTest {
    @Mock
    FoodCatalogueService foodCatalogueService;
    @InjectMocks
    FoodCatalogueController foodCatalogueController;

    @BeforeEach
    public void setUpdate(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testAddFoodItem(){
        FoodItemDTO foodItemDTO = new FoodItemDTO();
        when(foodCatalogueService.addFoodItem(any(FoodItemDTO.class))).thenReturn(foodItemDTO);

        // Act
        ResponseEntity<FoodItemDTO> response = foodCatalogueController.addFoodItem(foodItemDTO);

        // Assert
        verify(foodCatalogueService,times(1)).addFoodItem(foodItemDTO);
        assert response.getStatusCode() == HttpStatus.CREATED;
        assert response.getBody() == foodItemDTO;
    }

    @Test
    void fetchRestauDetailsWithFoodMenu_ShouldReturnOkStatus() {
        // Arrange
        int restaurantId = 123;
        FoodCataloguePage foodCataloguePage = new FoodCataloguePage();
        when(foodCatalogueService.fetchFoodCataloguePageDetails(restaurantId)).thenReturn(foodCataloguePage);

        // Act
        ResponseEntity<FoodCataloguePage> response = foodCatalogueController.fetchRestauDetailsWithFoodMenu(restaurantId);

        // Assert
        verify(foodCatalogueService, times(1)).fetchFoodCataloguePageDetails(restaurantId);
        assert response.getStatusCode() == HttpStatus.OK;
        assert response.getBody() == foodCataloguePage;
    }
}
