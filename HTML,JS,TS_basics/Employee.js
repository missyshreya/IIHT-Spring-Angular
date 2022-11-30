class AllEmployees{  //parent class
    constructor(compName){
       this.compName="CTS";
}
}

class Developers extends AllEmployees{ 
constructor(name,YOE,pos,DOJ,loc,eid,empid,sal){
   super();
   this.name=name;
   this.YOE=YOE;
   this.dept="DEV"; 
   this.pos=pos;
   this.DOJ=DOJ;
   this.loc=loc; 
   this.eid=eid;
   this.empid=empid;
   this.sal=sal; 
}
}

class HumanResource extends AllEmployees{ 
    constructor(name,YOE,pos,DOJ,loc,eid,empid,sal){
       super();
       this.name=name;
       this.YOE=YOE;
       this.dept="HR"; 
       this.pos=pos;
       this.DOJ=DOJ;
       this.loc=loc; 
       this.eid=eid;
       this.empid=empid;
       this.sal=sal; 
    }
    }

    class Finance extends AllEmployees{ 
        constructor(name,YOE,pos,DOJ,loc,eid,empid,sal){
           super();
           this.name=name;
           this.YOE=YOE;
           this.dept="FIN"; 
           this.pos=pos;
           this.DOJ=DOJ;
           this.loc=loc; 
           this.eid=eid;
           this.empid=empid;
           this.sal=sal; 
        }
        }

        class Sales extends AllEmployees{ 
            constructor(name,YOE,pos,DOJ,loc,eid,empid,sal){
               super();
               this.name=name;
               this.YOE=YOE;
               this.dept="SLS"; 
               this.pos=pos;
               this.DOJ=DOJ;
               this.loc=loc; 
               this.eid=eid;
               this.empid=empid;
               this.sal=sal; 
            }
            }

            class Marketing extends AllEmployees{ 
                constructor(name,YOE,pos,DOJ,loc,eid,empid,sal){
                   super();
                   this.name=name;
                   this.YOE=YOE;
                   this.dept="MAR"; 
                   this.pos=pos;
                   this.DOJ=DOJ;
                   this.loc=loc; 
                   this.eid=eid;
                   this.empid=empid;
                   this.sal=sal; 
                }
                }

             class QualityAnalyst extends AllEmployees{ 
                    constructor(name,YOE,pos,DOJ,loc,eid,empid,sal){
                       super();
                       this.name=name;
                       this.YOE=YOE;
                       this.dept="QA"; 
                       this.pos=pos;
                       this.DOJ=DOJ;
                       this.loc=loc; 
                       this.eid=eid;
                       this.empid=empid;
                       this.sal=sal; 
                    }
                    }

let e1=new Developers("Ankit","3","manager", "12nov","Mumbai","a@gmail.com","998","90K")
let e2=new HumanResource("Shrija","4","associate", "1nov","Kolkata","ss@gmail.com","9238","70K")
let e3=new Finance("Ram","3","associate", "12nov","Mumbai","a@gmail.com","346","75K")
let e4=new Sales("Rita","3","associate", "12nov","Mumbai","a@gmail.com","978","50K")
let e5=new Marketing("Priya","3","sr. associate", "12nov","Mumbai","a@gmail.com","125","90K")
let e6=new QualityAnalyst("Ana","3","sr. analyst", "12nov","Mumbai","a@gmail.com","087","50K")
console.log(e1.compName+" "+e1.name+" "+e1.YOE+" "+e1.dept+" "+e1.pos+" "+e1.DOJ+" "+e1.loc+" "+e1.eid+" "+e1.empid+" "+e1.sal);
console.log(e2.compName+" "+e2.name+" "+e2.YOE+" "+e2.dept+" "+e2.pos+" "+e2.DOJ+" "+e2.loc+" "+e2.eid+" "+e1.empid+" "+e1.sal);
console.log(e1.compName+" "+e1.name+" "+e1.YOE+" "+e1.dept+" "+e1.pos+" "+e1.DOJ+" "+e1.loc+" "+e1.eid+" "+e1.empid+" "+e1.sal);
console.log(e1.compName+" "+e1.name+" "+e1.YOE+" "+e1.dept+" "+e1.pos+" "+e1.DOJ+" "+e1.loc+" "+e1.eid+" "+e1.empid+" "+e1.sal);
console.log(e1.compName+" "+e1.name+" "+e1.YOE+" "+e1.dept+" "+e1.pos+" "+e1.DOJ+" "+e1.loc+" "+e1.eid+" "+e1.empid+" "+e1.sal);

