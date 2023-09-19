import { GreetingsPipePipe } from './greetings-pipe.pipe';

describe('GreetingsPipePipe', () => {
  it('create an instance', () => {
    const pipe = new GreetingsPipePipe();
    expect(pipe).toBeTruthy();
  });
});
