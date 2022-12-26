import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentapplicationinstComponent } from './studentapplicationinst.component';

describe('StudentapplicationinstComponent', () => {
  let component: StudentapplicationinstComponent;
  let fixture: ComponentFixture<StudentapplicationinstComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentapplicationinstComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentapplicationinstComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
