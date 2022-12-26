import { TestBed } from '@angular/core/testing';

import { InstituteapplicationsService } from './instituteapplications.service';

describe('InstituteapplicationsService', () => {
  let service: InstituteapplicationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InstituteapplicationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
