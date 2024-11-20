// question1)
// let DATA = "secret information";
// class user{
//     constructor(name,email){
//         this.name=name;
//         this.email=email;
//     }
//     viewData(){
//         console.log("data =",DATA);
//     }
// }
// let student1=new user("shradha","abc@gamil.com");
// let student2=new user("aman","aman@gamil.com");
// console.log(student1);//user { name: 'shradha', email: 'abc@gamil.com' }
// student1.viewData();//data = secret information
// let teacher1=new user("Dean","dean@collage.com");
// console.log(teacher1);//user { name: 'Dean', email: 'dean@collage.com' }
// teacher1.viewData();//data = secret information
// Question2)
let DATA = "secret information";
class user{
    constructor(name,email){
        this.name=name;
        this.email=email;
    }
    viewData(){
        console.log("data =",DATA);
    }
}
class Admin extends user{
    constructor(name,email){
        super(name,email);
    }
    editData(){
        DATA="some new value";
    }
}
let student1=new user("shradha","abc@gamil.com");
let student2=new user("aman","aman@gamil.com");
let teacher1=new user("Dean","dean@collage.com");
let admin1=new Admin("admin","admin@collage.com");
console.log(admit1);//Admin { name: 'admin', email: 'admin@collage.com' }
// DATA// go to browser for the below code information.
// admin1.editData();
// DATA
// to is trah se classes and object kaam karti hai js k ander.
