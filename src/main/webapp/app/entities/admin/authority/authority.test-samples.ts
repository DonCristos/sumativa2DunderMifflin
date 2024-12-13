import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '9be45837-929a-4c9e-be9d-c2bb20f5dbfd',
};

export const sampleWithPartialData: IAuthority = {
  name: 'ba805b5d-41a8-480d-b7f4-3f52c3f121c5',
};

export const sampleWithFullData: IAuthority = {
  name: '9530c75e-751b-4ef3-b935-8ec6dc86b0a4',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
