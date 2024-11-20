// for(let count=1; count<=5; count++){ // here we can also write count=count+1
//     console.log("Rolex Sir");// 5 times Rolex Sir executed.
// }
// console.log("loop has ended"); 
// Calculate sum of 1 to n.
// let sum=0;
// let n=5;
// for(let i=1;i<=n;i++){
//     sum=sum+i;
// }
// console.log("sum =",sum);
// console.log("loop has ended"); 
// for(let i=1;i<=5;i++){
//     console.log("i =",i);
// }// i ki value block scope tk hi define hai.bez hmne let ka use kiya hai var ka nhi.var globally define hai.
// console.log(i);// yha i ka use krna hai to i ko redeclare krna pdega.loop me jo variable initilize hote hai vo loop tk hi rhte hai baad me hm un variable ko excess nhi kr skte hai.
// Infinite loop in notebook. This code Never try on your system.
// Q) Print 1 to 5. Using while loop.
// let i=1;
// while(i<=5){
//     console.log("i =",i);
//     i++;
// }// i=1 to 5.
// do while loop.
// let i=20;
// do{
//     console.log("Apna Collage");
//     i++;
// }while(i<=10);// isme code atleast one time to execute hoga hi hoga.
// Print 1 to 5 using do while loop.
// let i=1;
// do{
//     console.log("i=",i);
//     i++;
// }while(i<=5);
// for-of loop
// let str="JavaScript";// Gap is also aliowed inside the string.
// let size=0;
// for(let i of str){ // generally i k place pr val ka use krte hai.
//     // iterator -> characters.
//     console.log("i=",i);
//     size++;
// }
// console.log("string size =",size);//10
// for in loop 
// let student={
//     name:"Prince kr. maurya",
//     age:20,
//     cgpa:10,
//     isPass:true,
// };
// for(let key in student){
//     console.log("key=",key,"value =",student[key]);// student[key] ka use karne se hr key k liye uski value bhi print hokar aa rhi hai.
// }