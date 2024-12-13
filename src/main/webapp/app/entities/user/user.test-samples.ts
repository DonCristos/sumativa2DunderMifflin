import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 26297,
  login: 'USM@wJ\\MoBFwC',
};

export const sampleWithPartialData: IUser = {
  id: 4167,
  login: 'kA',
};

export const sampleWithFullData: IUser = {
  id: 15441,
  login: '.2+k@5mdtwT\\AMut',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
