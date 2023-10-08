const form = document.querySelector("form");
pField = form.querySelector(".password"),
pInput = pField.querySelector("input");

form.onsubmit = (e)=>{
  e.preventDefault(); //preventing from form submitting

  (pInput.value == "") ? pField.classList.add("shake", "error") : checkPass();

  setTimeout(()=>{ //remove shake class after 500ms
    pField.classList.remove("shake");
  }, 500);

  pInput.onkeyup = ()=>{checkPass();} //calling checkPassword function on pass input keyup

  function checkPass(){
    let pat = /acro@1234/; //pattern for validation
    if(!pInput.value.match(pat)){
      pField.classList.add("error");
      pField.classList.remove("valid");
      let errorTxt = pField.querySelector(".error-txt");

      (pInput.value != "") ? errorTxt.innerText = "Enter a valid Password" : errorTxt.innerText = "Password can't be blank";
    }else{ //if pattern matched then remove error and add valid class
      pField.classList.remove("error");
      pField.classList.add("valid");
    }
    // if(pInput.value == ""){ //if pass is empty then add error and remove valid class
    //   pField.classList.add("error");
    //   pField.classList.remove("valid");
    // }else{ //if pass is empty then remove error and add valid class
    //   pField.classList.remove("error");
    //   pField.classList.add("valid");
    // }
  }

  //if eField and pField doesn't contains error class that mean user filled details properly
  if(!pField.classList.contains("error")){
    window.location.href = form.getAttribute("action"); //redirecting user to the specified url which is inside action attribute of form tag
  }
}