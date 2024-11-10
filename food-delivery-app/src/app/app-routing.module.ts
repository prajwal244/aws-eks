import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FoodCatalogueComponent } from './food-catalogue/component/food-catalogue/food-catalogue.component';
import { OrderSummaryComponent } from './order-summary/component/order-summary/order-summary.component';
import { RestaurantListingComponent } from './restaurant-listing/component/restaurant-listing/restaurant-listing.component';

const routes: Routes = [
   { path: '', component: RestaurantListingComponent, pathMatch: 'full' },
   { path: 'food-catalogue/:id', component: FoodCatalogueComponent },
     { path: 'orderSummary', component: OrderSummaryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
