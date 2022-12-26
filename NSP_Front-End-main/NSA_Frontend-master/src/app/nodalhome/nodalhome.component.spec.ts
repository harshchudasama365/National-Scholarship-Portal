import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NodalhomeComponent } from './nodalhome.component';

describe('NodalhomeComponent', () => {
  let component: NodalhomeComponent;
  let fixture: ComponentFixture<NodalhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NodalhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NodalhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
