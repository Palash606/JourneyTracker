// const form = document.querySelector("form");
// eField = form.querySelector(".scholar"),
// eInput = eField.querySelector("input"),
// pField = form.querySelector(".password"),
// pInput = pField.querySelector("input");
//
// form.onsubmit = (e)=>{
//   e.preventDefault(); //preventing from form submitting
//
//   (eInput.value == "") ? eField.classList.add("shake", "error") : checkScholar();
//   (pInput.value == "") ? pField.classList.add("shake", "error") : checkPass();
//
//   setTimeout(()=>{ //remove shake class after 500ms
//     eField.classList.remove("shake");
//     pField.classList.remove("shake");
//   }, 500);
//
//   eInput.onkeyup = ()=>{checkScholar();} //calling checkScholar function on scholar input keyup
//   pInput.onkeyup = ()=>{checkPass();} //calling checkPassword function on pass input keyup
//
//   function checkScholar(){
//     let pattern = /[A-Z]{2}[0-9]{5}/; //pattern for validation
//     if(!eInput.value.match(pattern)){
//       eField.classList.add("error");
//       eField.classList.remove("valid");
//       let errorTxt = eField.querySelector(".error-txt");
//
//       (eInput.value != "") ? errorTxt.innerText = "Enter a valid Username" : errorTxt.innerText = "Username can't be blank";
//     }else{
//       eField.classList.remove("error");
//       eField.classList.add("valid");
//     }
//   }
//
//   function checkPass(){
//     let pat = /acro@1234/; //pattern for validation
//     if(!pInput.value.match(pat)){
//       pField.classList.add("error");
//       pField.classList.remove("valid");
//       let errorTxt = pField.querySelector(".error-txt");
//
//       (pInput.value != "") ? errorTxt.innerText = "Enter a valid Password" : errorTxt.innerText = "Password can't be blank";
//     }else{ //if pattern matched then remove error and add valid class
//       pField.classList.remove("error");
//       pField.classList.add("valid");
//     }
//     // if(pInput.value == ""){ //if pass is empty then add error and remove valid class
//     //   pField.classList.add("error");
//     //   pField.classList.remove("valid");
//     // }else{ //if pass is empty then remove error and add valid class
//     //   pField.classList.remove("error");
//     //   pField.classList.add("valid");
//     // }
//   }
//
//   //if eField and pField doesn't contains error class that mean user filled details properly
//   if(!eField.classList.contains("error") && !pField.classList.contains("error")){
//     window.location.href = form.getAttribute("action"); //redirecting user to the specified url which is inside action attribute of form tag
//   }
// }