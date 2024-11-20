// let foodItems=["potato","apple","tomato","litchi"];
// foodItems.push("chips","burger");//5. bez this method returns the updated length of an array.
// console.log(foodItems);// push method used to add something at the end off an array.
// let foodItems=["potato","apple","tomato","litchi"];
// console.log(foodItems);// original array
// let deletedItem=foodItems.pop();// used to del the element from the last.
// console.log(foodItems);
// console.log("deleted",deletedItem);// print deleted item i.e., tomato.
//ntoString method
// let marks=[10,12,13,14,50,97];
// console.log(marks.toString());// here marks is no. but print as a form of string.
// console.log(marks);// means ye original array me change nhi krta hai. 
// Concat method
// let marvelHeroes=["thor","spiderman","ironman"];
// let dcHeroes=["superman","batman"];
// let indianHeroes=["shaktiman","krish"];
// let heroes=marvelHeroes.concat(dcHeroes,indianHeroes);
// console.log(heroes);// cancat method used to print all the element inside an array.& original array me effect nhi krta hai ye new array return kr k deta hai.
// console.log(dcHeroes);// we are getting the original array.
// unshift method
// let marvelHeroes=["thor","spiderman","ironman"];
// marvelHeroes.unshift("antman");
// console.log(marvelHeroes);// add new element at start
// let marvelHeroes=["thor","spiderman","ironman"];
// let val=marvelHeroes.shift("antman");
// console.log("deleted",val);// used to delete the element from the start.
// slice method
// let marvelHeroes=["thor","spiderman","ironman","antman","dr. Strange"]
// console.log(marvelHeroes);// original array
// console.log(marvelHeroes.slice(1,3));// so it returns a piece of an array.
// splice method
// let arr=[1,2,3,4,5,6,7];
// arr.splice(2,2,101,102);
//  console.log(arr);
// // let we have to add the element
// arr.splice(2,0,101);
// console.log(arr);
// // Delete element ex 4 element from the array
// arr.splice(3,1)
// console.log(arr);
// // replace element
// let z=arr.splice(3,1,101);
// console.log(z);
// forEach function
// let arr=[1,2,3,4,5];
// arr.forEach(function printVal(val){
//     console.log(val);
// })
// generally forEach me callback function arrow function ke form me pass krte hai
// let arr=[1,2,3,4,5];
// arr.forEach((val)=>{// generally callback ko arrow function ki form me pass karte hai.
//     console.log(val);
// })// same output as above.
// let arr=["pune","delhi","mumbai"];
// arr.forEach((val)=>{
//     console.log(val.toUpperCase());
// })// PUNE
// DELHI
// MUMBAI
// let arr=["pune","delhi","mumbai"];
// arr.forEach((val,idx,arr)=>{
//     console.log(val.toUpperCase(),idx,arr);
// })// we can give the three parameters in forEach val,idx,arr.
// MAP ARRAY
// let nums=[67,52,39];
// let newArr=nums.map((val)=>{
//     return val*val;
// });
// console.log(newArr);//[ 4489, 2704, 1521 ]
// FILTER ARRAY METHOD
// let arr=[1,2,3,4,5,6,7,8];
// let evenArr=arr.filter((val)=>{
//     return val%2===0;
// });
// console.log(evenArr);//[ 2, 4, 6, 8 ]
// REDUCE ARRAY METHOD
// let arr=[1,2,3,4];
// const output=arr.reduce((res,curr)=>{
//     return res+curr;
// });
// console.log(output);//10.






