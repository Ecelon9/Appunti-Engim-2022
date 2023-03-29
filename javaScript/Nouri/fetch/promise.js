import { students, randomNumbers } from "../data.js";

// resolve and reject are functions that are passed to the promise
const firstResolvedPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve({ status: 200, data: students });
  }, 3000);
});

const secondResolvedPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve({ status: 200, data: randomNumbers });
  }, 1000);
});

const rejectedPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    reject({ status: 404, data: "Not found" });
  }, 1000);
});

// firstResolvedPromise
//   .then(result => console.log(result))
//   .catch(error => console.log(error))
//   .finally(() => console.log("close connection with DB in firstResolvedPromise"));

const fetchData = async () => {
    const response = await firstResolvedPromise;
    console.log(response);
  }

// secondResolvedPromise
//   .then(result => console.log(result))
//   .catch(error => console.log(error))
//   .finally(() => console.log("close connection with DB in secondResolvedPromise"));

// rejectedPromise
//   .then(result => console.log(result))
//   .catch(error => console.log(error))
//   .finally(() => console.log("close connection with DB in rejectedPromise"));

// Promise.all([firstResolvedPromise, rejectedPromise])
//   .then(result => console.log(result))
//   .catch(error => console.log(error))
//   .finally(() => console.log("close connection with DB in Promise.all with rejectedPromise"));

// Promise.all([firstResolvedPromise, secondResolvedPromise])
//   .then(result => console.log(result))
//   .catch(error => console.log(error))
//   .finally(() => console.log("close connection with DB in Promise.all with secondResolvedPromise"));


  fetchData();