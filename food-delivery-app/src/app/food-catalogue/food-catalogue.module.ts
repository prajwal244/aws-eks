import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FoodCatalogueComponent } from './component/food-catalogue/food-catalogue.component';



@NgModule({
  declarations: [
    FoodCatalogueComponent
  ],
  imports: [
    CommonModule
  ],
  exports:
  [FoodCatalogueComponent]
})
export class FoodCatalogueModule { }
