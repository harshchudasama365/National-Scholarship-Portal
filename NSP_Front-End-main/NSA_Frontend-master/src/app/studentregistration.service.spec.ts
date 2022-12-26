import { TestBed } from '@angular/core/testing';

import { StudentregistrationService } from './studentregistration.service';

describe('StudentregistrationService', () => {
  let service: StudentregistrationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StudentregistrationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
