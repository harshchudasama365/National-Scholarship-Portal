import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentapplicationministryComponent } from './studentapplicationministry.component';

describe('StudentapplicationministryComponent', () => {
  let component: StudentapplicationministryComponent;
  let fixture: ComponentFixture<StudentapplicationministryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentapplicationministryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentapplicationministryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
