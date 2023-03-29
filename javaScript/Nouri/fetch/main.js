const fetchData = () => {
  const url = "https://dummyjson.com/products";
  const promise = fetch(url);
  console.log(promise);
  const jsonPromise = promise
  .then(response => response.json())
  .catch(err => console.log(err))

  jsonPromise
    .then(data => {
      console.log(data);
    })
    .catch(error => {
      console.log(jsonPromise);
      console.log(error);
    });
};

const AsyncFetchData = async () => {
  const url = "https://dummyjson.com/products";
  try {
    const response = await fetch(url);
    console.log(response);
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log(error);
  }
};

const createProduct = async product => {
  const url = "https://dummyjson.com/products/add";
  const response = await fetch(url, {
    method: "POST",
    body: JSON.stringify(product),
    headers: {
      "Content-Type": "application/json"
    }
  });
  const status = response.status;
  if (status === 200) {
    const data = await response.json();
    console.log(data);
  } else {
    console.log("Error");
  }
};

const updateProduct = async (id, product) => {
  const url = `https://dummyjson.com/products/${id}`;
  const response = await fetch(url, {
    method: "PUT",
    body: JSON.stringify(product),
    headers: {
      "Content-Type": "application/json"
    }
  });
  const status = response.status;
  if (status === 200) {
    const data = await response.json();
    console.log(data);
  } else {
    console.log("Error");
  }
};

const deleteProduct = async id => {
  const url = `https://dummyjson.com/products/${id}`;
  const response = await fetch(url, {
    method: "DELETE"
  });
  const status = response.status;
  if (status === 200) {
    console.log("Product deleted");
  } else {
    console.log("Error");
  }
};

// fetchData();
// AsyncFetchData();
// createProduct({ name: 'test', price: 100 });
// updateProduct(1, { name: 'test', title: 'Iphone 14' ,price: 1000000 });
// deleteProduct(1);
