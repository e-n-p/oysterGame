import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SplashIconComponent } from './pages/splash-icon/splash-icon.component';

const routes: Routes = [
  {
    path: '',
    component: SplashIconComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SplashRoutingModule { }
