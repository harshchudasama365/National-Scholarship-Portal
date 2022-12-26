import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InstituteapplicationsComponent } from './instituteapplications.component';

describe('InstituteapplicationsComponent', () => {
  let component: InstituteapplicationsComponent;
  let fixture: ComponentFixture<InstituteapplicationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InstituteapplicationsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InstituteapplicationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
