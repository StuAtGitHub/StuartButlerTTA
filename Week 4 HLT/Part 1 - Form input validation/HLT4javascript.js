function IsNameValid()
{
    var valid=true;
    var temp=document.getElementById("FnameText").value;
//alert(temp);// for testing
    if ( temp=="" || temp==null){
        valid=false;
       // alert(temp); // for testing
        document.getElementById("ValidateName").innerText="Please enter a valid name";
    }
    else
    {
        document.getElementById("ValidateName").innerText="";
        //alert(temp); // for testing
    }
    return valid;
}
function IsEmailValid()
{
    var valid=true;
    var temp=document.getElementById("EmailText").value;
    //alert(temp);// for testing
        if ( temp=="" || temp==null){
            valid=false;
           // alert(temp); // for testing
            document.getElementById("ValidateEmail").innerText="Please enter a valid email";
        }
        else if (!(temp.includes("@") && (temp.includes(".co"))))
        {
               // alert("includes @ and .co"); //for testing
               document.getElementById("ValidateEmail").innerText="Please check format of address";
            valid=false;
        }
        else
        {
            document.getElementById("ValidateEmail").innerText="";

        }
      
    return valid;
}
function IsMobileValid()
{
    var valid=true;
    var temp=document.getElementById("MobileNum").value;
    
    var phoneno = /^\d{5} \d{6}$/; //regex is pattern 5 6 numbers
    //alert(temp);// for testing
        if ( temp=="" || temp==null || !(temp.match(phoneno)))
        {
            valid=false;
           // alert(temp); // for testing
            document.getElementById("ValidateMobile").innerText="Please enter a phone number (5 digit code,space and 6 digit number)";
        }
        else
        {
            document.getElementById("ValidateMobile").innerText="";
            //alert(temp); // for testing
        }
    return valid;
}
function IsCountryValid()
{
    var valid=true;
    var temp=document.getElementById("Country").value;
    if (temp==""||temp==null||temp=="Select Country")
    {
        document.getElementById("ValidateCountry").innerText="Please select a country";
        valid=false;
    }
    else{
        document.getElementById("ValidateCountry").innerText="";
    }
    //alert(temp); //just for testing
    return valid;
}
function IsGenderValid()
{
    var valid=true;
    var temp1=document.getElementById("Male").checked;
    var temp2=document.getElementById("Female").checked;
    var temp3=document.getElementById("Other").checked;
    //alert(temp1+temp2+temp3);//for testing
    valid=temp1||temp2||temp3;
    if (!(valid))
    {
        document.getElementById("ValidateGender").innerText="Please Select a Gender";
    }
    else
    {
        document.getElementById("ValidateGender").innerText="";
    }
    return valid;
}

function IsAllValid()
{
    var testname= IsNameValid();
    var testemail= IsEmailValid();
    var testmobile= IsMobileValid();
    var testcountry= IsCountryValid();
    var testgender= IsGenderValid();

    if
    (testname&&testemail&&testmobile&&testcountry&&testgender)
    {
    alert("At this point we would submit info as front end validation complete");    
    }
    else
    {
    alert("Cannot submit as some information invalid - will be highlighted for user");   
    }
    
}