function fun() {

    
    const sw = (code)=> {

        switch (code) {
            case 1:
                return "Permanent Address";
            case 2:
                return "Residence Address";
            case 3:
                return "Office Address";
            case 4:
                return "Not Categorized";
            default:
                return null;
        }
    

}

for(let i = 0;i<99;++i) {
    //assertEquals("Salaried", getOccupation(1));
    let type = "getAddress"
    let value = sw(i)
    if(value != null) {
        str = `assertEquals("${value}", ${type}(${i}));`
        console.log(str);
    }

}
    

}

fun()