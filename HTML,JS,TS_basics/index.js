var name="Shreya"
        var age=25
        var isGraduate=true;
        var laptop;
        laptop="lg";
        console.log(name);

        // function alertUser(){
        //         var favChips="Lays Blue"  //this variable is defined & destroyed inside the function itself
        //         //hence it cant be acccesed outside this function
        //         alert("This user has logged in "+name)
        // }

        // alertUser();
        // //console.log(favChips);  thrwos an error

        function operators(num){
            // = is assigner
            //+=,-=
            //if, else, else if
            if(num>20){
                console.log("Number is greater than 20");
            }else if(num==20){
                console.log("Number is equal to 20");
            }else{
                console.log("Number is smaller than 20");
            }
        }
        operators(38);

        function creditScore(score){
            var creditLimit;
            switch(score){
                case 800: creditLimit:"Above 1 lac";
                break;
                case 700: creditLimit:"50,000 to 1,00,000";
                break;
                case 600: creditLimit:"10,000 to 25,000";
                break;
                default: creditLimit:"not eligible";
            }
            console.log(creditLimit);
        }

        //creditScore(800);

        // function counting(){
        //     for(let i = 1; i < 10; i++){
        //         console.log(i);
        //     }
        // }
        //counting();

        var car= new Object();  //object created
        car.brand="Mercedes"
        car.model="C class"
        car.price=6000000

        console.log(car);

        var names=["nishant","abhishek","varun"]   //array
        console.log(names);
        
        class Car{  // can use the syntax-> let Car= class   its the same
            //initialize any object
            constructor(brand,modelName,price){    //mentioning constructor is enough
                this.brand=brand;
                this.modelName=modelName;
                this.price=price;
            }

            print(){   //just a method
                console.log("this is a : "+this.brand+" "+this.modelName+"which costs : "+ this.price);
            }
        }
        var C1=new Car("Mercedes","A class",4000000)
        var C2=new Car("BMW","3-series",5000000)
        C1.print();    //c1 c2 are objects of car class
        C2.print();


        class TodaysDate extends Date{  //Date is an inbuld class in JS
            //we made a child class todaysdate of the inbuild class Date
            constructor(){
                super(); //parent class constructor
            }
            printDate(){   //method
                console.log(this.getDate());
            }
        }
        let today=new TodaysDate();  // today an object of todaysdate class
        today.printDate();

        
        class AppleLaptops{  //parent class
            constructor(brand){
               this.brand="Apple";
      }
    }

        class MacBookPro extends AppleLaptops{ //child class
        constructor(model,processor,ram){
           super();
           this.model=model;
           this.processor=processor;
           this.ram=ram; 
        }

    }

    let l1=new MacBookPro("2021 15' Macbook pro", "i7", 16)
    console.log(l1.brand+" "+l1.model+" "+l1.processor+" "+l1.ram);


    let fruits=["Apple","Banana","Pinapple"]
    let seasonalFruits=["Mango","Litchi"]
    let allFruits=[...fruits, ...seasonalFruits]; // ... is a SPREAD OPERATOR 
    //it copies all the elements of the array named after ...

    console.log(allFruits);

    let counting = () => { // inline/arrow function is defined this way
        for(let i = 1; i < 10; i++){
            console.log(i);
        }
    }

    // there are 3 keywords thats used in declaring variables in JS
    //var -> this has a scope of a func, it can be redeclared
    var n1=1000;
    var n1=2000;
    console.log(n1);

    // let -> it has a block scope and it was announce in ES6, variable can be redefined
    let b=200
    function addNumbers(){
        let a=100
        
        console.log(a+b);
    }
    addNumbers();
    console.log(a+200); //throws error as the scope is wh=ithin the func block
    console.log(b+200); //wont throw erro as its a global variable now

    //const -> stands for constant so value cant be chnaged directly, scope of a block as well

    function addNumbers1(){
        const n3=200;
        //const n3=200; throws error as it cant be redefined
    }

    function dogs(){
        this.dogname="Lab"
        throw new error("This is not a wild dog")
    }
    
    dogs.prototype.display=function()
    {
        return "this dogs breed is :"+this.dogname;

    }
    //constructor func
    function Animal(dogname)
    {
        this.dogname=dogname
    }
    //create an object without  using the cosntructor 
    let tommy= new Animal("German shephard")
    console.log(Animal.display());

    function Greet(){
        alert("Greetings fellow developer!!")
    }