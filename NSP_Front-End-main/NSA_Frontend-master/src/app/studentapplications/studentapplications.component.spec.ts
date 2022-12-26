import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentapplicationsComponent } from './studentapplications.component';

describe('StudentapplicationsComponent', () => {
  let component: StudentapplicationsComponent;
  let fixture: ComponentFixture<StudentapplicationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentapplicationsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentapplicationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
