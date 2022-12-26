import { TestBed } from '@angular/core/testing';

import { StudentapplicationsService } from './studentapplications.service';

describe('StudentapplicationsService', () => {
  let service: StudentapplicationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StudentapplicationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
