

function getValue(){
       
    let op= new Set();

    op.add(document.getElementById('name').value);
    op.add(document.getElementById('name').value);
    op.add(document.getElementById('DOB').value);
    op.add(document.getElementById('email').value);
    op.add(document.getElementById('mob').value);
    op.add(document.getElementById('gen').value);
    op.add(document.getElementById('occ').value);
    op.add(document.getElementById('idtyp').value);
    op.add(document.getElementById('idno').value);
    op.add(document.getElementById('iauth').value);
    op.add(document.getElementById('idate').value);
    op.add(document.getElementById('istate').value);
    op.add(document.getElementById('idexp').value);

    console.log("User inputs as below:");
    console.log([...op].join(' , ')); //spread syntax used

   
    window.open("http://127.0.0.1:5500/thankyou.html","_self");
    
    
}