const axios = require('axios');

axios.post('https://jsonplaceholder.typicode.com/posts', {
  title: 'foo',
  body: 'bar',
  userId: 1

})
.then((response) => {
  console.log(response.data);
})
.catch((error) => {
  console.error(error);
}); 

// how to use 