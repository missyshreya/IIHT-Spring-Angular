function Car(color, model, cost, fueltype) {
    this.color=color;
    this.model=model;
    this.cost=cost;
    this.fueltype=fueltype;
    this.runningCostPerYear=20000;

    getCarDetails= function(){
        console.log("Color:" +this.color);
        console.log("Model:" +this.model);
        console.log("Cost:" +this.cost);
        console.log("Fuel Type:" +this.fueltype);
        console.log("Running cost of the car per year: " +this.runningCostPerYear);
    }

    this.TotalCostOfOwnership=function(){
        console.log(runningCostPerYear + cost);
    }

    let MercedesCclass= new Car("Black", "C class", "5000000", "Petrol");
    MercedesCclass.getCarDetails();
    
}