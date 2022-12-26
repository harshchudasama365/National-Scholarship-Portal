import { TestBed } from '@angular/core/testing';

import { InstituteapplicationService } from './instituteapplication.service';

describe('InstituteapplicationService', () => {
  let service: InstituteapplicationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InstituteapplicationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
