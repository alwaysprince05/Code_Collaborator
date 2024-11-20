// function countVowels(str){
//     let count=0;
//     for(const char of str){
//         if(
//             char==="a"||
//             char==="e"||
//             char==="i"||
//             char==="o"||
//             char==="u"
//         ){
//             count++;
//         }
//     }
//     console.log(count); // or return count;   
    
// }
// countVowels("apnacollege");// 5
// question2) create an arrow function to perform the same task.
// const countVow=(str)=>{
//     let count=0;
//     for(const char of str){
//         if(
//             char==="a"||
//             char==="e"||
//             char==="i"||
//             char==="o"||
//             char==="u"
//         ){
//             count++;
//         }
//     }
//     console.log(count);   
// }
// countVow("aeio");// 4.
// Question3) print the square of array
// let nums=[67,52,39];
// nums.forEach((num)=>{
//      console.log(num*num);  //num**2
// })
// 2nd method to write the callback
// let nums=[67,52,39];
// let calcSquare=(num)=>{
//     console.log(num*num);
// };
// nums.forEach(calcSquare);// same output.
// Question4) print the largest element in the array
// let arr=[55,56,80,95,90];
// const output=arr.reduce((prev,curr)=>{
//     return prev>curr?prev:curr;
// });
// console.log(output);//95.
// Question5)
// let marks=[97,64,32,49,99,96,86];
// let toppers=marks.filter((val)=>{
//     return val>90;
// });
// console.log(toppers);// [ 97, 99, 96 ]
// Question6)
// let n=prompt("enter a number:");
// let arr=[];
// for(let i=1;i<=n;i++){
//     arr[i-1]=i;
// }
// console.log(arr);
// let sum=arr.reduce((res,curr)=>{
//     return res+curr;
// });
// console.log("sum",sum);
// let factorial=arr.reduce((res,curr)=>{
//     return res*curr;
// });
// console.log("factorial",factorial);// prompt wale code browser me run honge.


