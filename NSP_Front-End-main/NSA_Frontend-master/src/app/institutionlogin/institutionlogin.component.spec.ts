import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InstitutionloginComponent } from './institutionlogin.component';

describe('InstitutionloginComponent', () => {
  let component: InstitutionloginComponent;
  let fixture: ComponentFixture<InstitutionloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InstitutionloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InstitutionloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
