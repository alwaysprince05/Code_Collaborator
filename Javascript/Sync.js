// console.log("one");// one
// console.log("two");// two
// console.log("three");// three, means isme code sync me chal rhi hai.Yani code line by line hi execute ho rhi hai.abhi tk ki sari code sync me hi thi.
// setTimeout example of async
// function hello(){
//     console.log("hello");
// }
// setTimeout(hello,2000);// timeout,millisecond, 2s=2000ms.
// 2nd method using arrow function
// console.log("one");
// console.log("two");
// setTimeout(()=>{
//     console.log("hello");
// },4000);// timeout
// console.log("three");// in js this code is not waiting for the above code.after a four sec hello will print that is called async programming.
// console.log("four");
// EXAmple of syncronous programming callback
// function sum(a,b){
//     console.log(a+b);
// }
// function calculator(a,b,sumCallback){
//     sumCallback(a,b);
// }
// // calculator(1,2,(a,b)=>{// using arrow function
// //     console.log(a+b);
// // })
// // 2nd method
// calculator(1,2,sum);//3. don't use sum in parenthesis.
// EXAMPLE of ASYNCRONOUS programming callback
// const hello=()=>{
//     console.log("hello");
// }
// setTimeout(hello,3000);// in this way callback setTimeout ke andar asyncronous way e kaam karte hai.
// EXAMPLE OF CALLBACK HELL FUNCTION
// function getData(dataId,getNextData){// 2s
//   setTimeout(()=>{
//     console.log("data",dataId);
//    if(getNextData){
//     getNextData();
//    }
//   },2000);
// }
// // callback Hell it is difficult to understand and make a nested callback i.e., not a good way of writing a code for programmers.
// // this type of code is difficult to understand and manage.
// getData(1,()=>{
//     console.log("getting data2....");
//     getData(2,()=>{
//         console.log("getting data3...."); 
//         getData(3,()=>{
//             console.log("getting data4....");
//             getData(4);
//     });
//    });//data 1,data 2, after 2 second delay.
// }); /*data 1
// getting data2....
// data 2
// getting data3....
// data 3
// getting data4....
// data 4 *\ // output.
// Promises in JS
// let promise=new Promise((resolve,reject)=>{
//   console.log("I am a promise");
//   resolve("success");
// })//I am a promise
// let promise=new Promise((resolve,reject)=>{
//   console.log("I am a promise");
//    reject("some error occured");
// });// some error occured
// USE OF PROMISES IN GENERAL PROGRAM
// function getData(dataId,getNextData){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data",dataId);
//       resolve("success");
//       if(getNextData){
//         getNextData();
//       }
//     },5000);
//   });
// }
// let promise=getData(123);//data 123
// function getData(dataId,getNextData){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       reject("error");
//       if(getNextData){
//         getNextData();
//       }
//     },5000);
//   });
// }
// let promise=getData(123);// for error
// USE OF PROMISE BY .then & .catch METHOD
// const getPromise=()=>{
//   return new Promise((resolve,reject)=>{
//     console.log("I am a promise");
//     resolve("success");
//   });// I am a promise
// };
// let promise=getPromise();
// promise.then(()=>{
//   console.log("promise fulfilled");
// });//promise fulfilled
// const getPromise=()=>{
//   return new Promise((resolve,reject)=>{
//     console.log("I am a promise");
//     reject("network error");
//   });// I am a promise
// };
// let promise=getPromise();
// promise.then((res)=>{// then k andar automatically ek parameter hota hai i.e, res & ise print bhi kra skte hai
//   console.log("promise fulfilled",res);
// });// getting some error because promise is rejected.
// // for catch an error 
// promise.catch((err)=>{// catch k andar automatically ek parameter hota hai i.e, error & ise print bhi kra skte hai
//   console.log("rejected",err);
// });// rejected network error
// PROMISE CHAIN IN JS
// function asyncFunc(){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data1");//data1
//       resolve("success");
//     },4000);
//   });
// }// this work is generally done by api
// console.log("fetching data1....");//fetching data1....
// let p1=asyncFunc();
// p1.then((res)=>{
//   console.log(res);// hm bs promise k upar .then or .catch method ka use krte hai.
// });//success
// let suppose we have diff diff apis
// function asyncFunc1(){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data1");//data1
//       resolve("success");
//     },4000);
//   });
// }
// function asyncFunc2(){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data2");//data1
//       resolve("success");
//     },4000);
//   });
// }// hme phle data1 & then data2 ki value chahiye.
// console.log("fetching data1....");
// let p1=asyncFunc1();
// p1.then((res)=>{
//   console.log(res);
// });
// console.log("fetching data2....");
// let p2=asyncFunc2();
// p1.then((res)=>{
//   console.log(res);
// });// in this case hme dono data 4s me hi print hokar aayenge.but hm chahte hai ki phle data1 & then data2 print ho to uske liye hm chaining kr skte hai Promises ki.code
// function asyncFunc1(){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data1");//data1
//       resolve("success");
//     },4000);
//   });
// }
// function asyncFunc2(){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data2");
//       resolve("success");
//     },4000);
//   });
// }
// console.log("fetching data1....");
// let p1=asyncFunc1();
// p1.then((res)=>{
//   console.log("fetching data2....");
//   let p2=asyncFunc2();
//   p2.then((res)=>{});
// });// here both the data will print after a 4s.//fetching data1....//data1//fetching data2....//data2
// // or same output as a simpler method
// console.log("fetching data1....");
// asyncFunc1().then((res)=>{
//   console.log("fetching data2....");
//   asyncFunc2().then((res)=>{});
// });//fetching data1....//data1//fetching data2....//data2.
// so that's how our promise chaining works.
// 2nd Example of Promise chain
// function getData(dataId){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("data",dataId);
//       resolve("success");
//     },5000);
//   });
// }// ab hme callback ki jarurat nhi hai.
// Promise chain
// getData(1).then((res)=>{
//   console.log(res);
//   getData(2).then(()=>{
//     console.log(res);
//   });
// });//data 1,success//data 2,success
// another way to write the above code 
// Promise chain 
// getData(1)
// .then((res)=>{
//   return getData(2);
// })
// .then((res)=>{// here we make the chain of .then or promises.
//   return getData(3);
// })
// .then((res)=>{
//   console.log(res);
// });// used to get the final success of all the data
// ASYNC-AWAIT IN JS
// async function hello(){
//   console.log("hello");
// }
// function api(){
//   return new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//       console.log("weather data");
//       resolve(200);
//     },2000);
//   });
// }
// async function getWeatherData() {
//   await api();//1st
//   await api();//2nd
// }
// getWeatherData();// 2 times weathere data will print bez await api is 2 times here.
// async await method in previous example
function getData(dataId){
  return new Promise((resolve,reject)=>{
    setTimeout(()=>{
      console.log("data",dataId);
      resolve("success");
    },2000);
  });
}
async function getAllData() {
  console.log("getting data1....");
  await getData(1);
  console.log("getting data2....");
  await getData(2);
  console.log("getting data3....");
  await getData(3);
  console.log("getting data4....");
  await getData(4);
  console.log("getting data5....");
  await getData(5);
  console.log("getting data6....");
  await getData(6);
}// async-await is easy and best way of writing a code in comparision to callback hell & Promise.it code is very easy to understand.
getAllData();// here we get the data upto data 6.
// IIFE IN JS
function getData(dataId){
  return new Promise((resolve,reject)=>{
    setTimeout(()=>{
      console.log("data",dataId);
      resolve("success");
    },2000);
  });
}
(async function () {
  console.log("getting data1....");
  await getData(1);
  console.log("getting data2....");
  await getData(2);
  console.log("getting data3....");
  await getData(3);
  console.log("getting data4....");
  await getData(4);
  console.log("getting data5....");
  await getData(5);
  console.log("getting data6....");
  await getData(6);
})();// similar output will print.But iska nukasan ye hai ki hm code ko dubara print nhi kr payenge.IIFE ka use ek hi baar kr skte hai.
