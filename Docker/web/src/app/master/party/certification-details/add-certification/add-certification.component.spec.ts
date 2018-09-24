import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCertificationComponent } from './add-certification.component';

describe('AddCertificationComponent', () => {
  let component: AddCertificationComponent;
  let fixture: ComponentFixture<AddCertificationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddCertificationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddCertificationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
