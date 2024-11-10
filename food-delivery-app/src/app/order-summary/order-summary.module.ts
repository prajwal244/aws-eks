import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OrderSummaryComponent } from './component/order-summary/order-summary.component';



@NgModule({
  declarations: [
    OrderSummaryComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[OrderSummaryComponent]
})
export class OrderSummaryModule { }
