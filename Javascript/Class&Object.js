// const student={
//     fullName:"sharadha khapra",
//     marks:94.4,
//     printMarks:function(){
//         console.log("marks =",this.marks);// this.marks means student.marks
//     },
// };
// console.log(student);
// we can also make the protoptye of own object.
// const employee={
//     calcTax(){
//         console.log("tax rate is 10%");
//     },
// };
// employee.calcTax();
// const KaranArjun={
//      salary:500000,
//      calcTax(){
//         console.log("tax rate is 20%");// if tax rate is different.
//      }
// };
// console.log(KaranArjun);
// KaranArjun.__proto__=employee;
// KaranArjun.calcTax();// If object & prototype have same method, object's method will be used.bez obj jyada specific hai is case me.
// Classes in JS
// class ToyotaCar{
//     start (){
//         console.log("start");
//     }
//     stop (){
//         console.log("stop");
//     }// inside the class hm any variable ko bhi define kr skte hai
//     setBrand(brand){
//         this.brandName=brand;// jis bhi class k liye ye set brand call hoga to this me vhi obj k liye setbrand ki value aayegi.Generall var and proprty ko same name dete hai brand=brandName. brandName not equal to brand 2nd wala brand function parameter hai.this.brandName class se banne wali object ki sari propety hogi.
//     }
// }
// let Fortuner=new ToyotaCar();
// console.log(Fortuner);
// console.log(typeof Fortuner);
// Fortuner.start();// hmne is car ko propety nhi di hai but ise start and stop car skte hai by this method.
// Fortuner.stop();
// // similarly for the another object.
// let lexus=new ToyotaCar();
// console.log(lexus);
// console.log(typeof lexus);
// lexus.start();
// Fortuner.setBrand("Fortuner");// for this method
// console.log("Fortuner");//Fortuner.  this means the obj jiske liye function call kiya ja rha hai.
// // for the lexus
// lexus.setBrand("lexus");
// console.log("lexus");
// CONSTRUCTOR KEYWORD IN JS
// class ToyotaCar{
//     constructor(){
//         console.log("creating new object");
//     }
//     start (){
//         console.log("start");
//     }
//     stop(){
//         console.log("stop");
//     }
//     setBrand(brand){
//         this.brand=brand;
//     }
// }
// let Fortuner=new ToyotaCar();// constructor invoke
// let lexus=new ToyotaCar();// constructor invoke

const { extend } = require("lodash");

// we can also pass the arguments in constructor as a normal function
// class ToyotaCar{
//     constructor(brand,mileage){ // if there is no argument then this.brand k place pe undefined aa jayega and ye undefind brand pe jakar set ho jayega
//         console.log("creating new object");
//         this.brand=brand;
//         this.mileage=mileage;
//     }
//     start (){
//         console.log("start");
//     }
//     stop(){
//         console.log("stop");
//     }
// }
// let Fortuner=new ToyotaCar("Fortuner",10);
// let lexus=new ToyotaCar();// if we are not passing the parameter for lexus then brand name is undefined.
// console.log(Fortuner);// ToyotaCar { brand: 'Fortuner', mileage: 10 }
// console.log(lexus);//ToyotaCar { brand: undefined, mileage: undefined }
// INHERITANCE IN JS
// class Parent{
//     hello(){
//         console.log("hello");
//     }
// }
// class child extends Parent{

// }
// let obj=new child();
// console.log(obj.hello());// hello  // undefined
// // 2nd EXAMPLE
// class Person{ // we can also create a constructor inside the person class
//     constructor(){
//         this.species="homo sapiens";
//     }
//     eat(){
//         console.log("eat");
//     }
//     sleep(){
//         console.log("sleep");
//     }
//     work(){
//         console.log("do nothing");
//     }
// }
// class Engineer extends Person{
//     work(){
//         console.log("solve problems,build something");
//     }
// }
// class Doctor extends Person{
//     work(){
//         console.log("treat Patients");
//     }
// }
// let PrinceObj=new Engineer();
// console.log(PrinceObj);
// PrinceObj.work();// Engineer {}
// //solve problems,build something without using extends keyword.// yha pr child class wala function invoke hota hai.Parent class ka function invoke nhi hota hai. 
// PrinceObj.eat();
// let P1=new Person();
// console.log(P1);// Person { species: 'homo sapiens' }
// let e1=new Engineer();// jo properties person ke pas hongi vo engineer k pas bhi hongi.
// console.log(e1);// after using constructor e1 k andar bhi species wali properties aayegi.Engineer { species: 'homo sapiens' }.
// hm parent ki properties & method inherit kr rhe hai 
// SUPER KEYWPORD IN JS
// class Person{
//     constructor(){
//         this.species="homo sapiens";
//         console.log("enter parent constructor");
//     }
//     eat(){
//         console.log("eat");
//     }
// }
// class Engineer extends Person{
//     constructor(branch){
//         console.log("enter child constructor");
//         super();// to invoke parent class constructor
//         this.branch=branch;
//         console.log("exit child constructor");
//     }
//     work(){
//         console.log("solve problems,build something");
//     }
// }
// let engObj=new Engineer("CSE engineer");
// console.log(engObj);
// // 2nd example
// class Person{
//     constructor(name){
//         this.species="homo sapiens";
//         this.name=name;
//     }
//     eat(){
//         console.log("eat");
//     }
// }
// class Engineer extends Person{
//     constructor(name){
//         super(name);// to invoke parent class constructor
//     }
//     work(){
//         super.eat();
//         console.log("solve problems,build something")
//     }
// }
// let engObj=new Engineer("Prince");
// console.log(engObj);//Engineer { species: 'homo sapiens', name: 'Prince' }
// engObj.work();// eat, solve problems,build something
// ERROR HANDLING IN JS.With (try,catch)
let a=5;
let b=10;
console.log("a=",a);
console.log("b=",b);
console.log("a+b=",a+b);
try{
    console.log("a+b=",a+c);// error
}catch(err){
    console.log(err);
}
console.log("a+b=",a+b);
console.log("a+b=",a+b);
console.log("a+b=",a+b);
console.log("a+b=",a+b);
console.log("a+b=",a+b);// we can handel our error with the help of try & catch method, jis bhi pe code glat lg rha hai vha try me put krke catch me err dal k next line ko execute kra skte hai.
