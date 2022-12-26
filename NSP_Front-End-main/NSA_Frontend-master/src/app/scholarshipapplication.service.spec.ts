import { TestBed } from '@angular/core/testing';

import { ScholarshipapplicationService } from './scholarshipapplication.service';

describe('ScholarshipapplicationService', () => {
  let service: ScholarshipapplicationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ScholarshipapplicationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
